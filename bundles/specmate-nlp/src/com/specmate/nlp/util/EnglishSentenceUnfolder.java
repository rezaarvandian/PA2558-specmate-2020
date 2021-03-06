package com.specmate.nlp.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Pattern;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import com.specmate.nlp.api.ELanguage;
import com.specmate.nlp.api.INLPService;
import com.specmate.nlp.util.NLPUtil.ConstituentType;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.chunk.Chunk;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency.Dependency;

public class EnglishSentenceUnfolder extends SentenceUnfolderBase {

	/** The dependency types for a cunjunction depenendenc (and, or) */
	private static final String DEPENDENCY_TYPE_CONJUNCTION = "conj";
	private static final String DEPENDENCY_TYPE_CC = "cc";

	/** The dependency type for a subject dependency */
	private static final String DEPENDENCY_TYPE_SUBJECT = "nsubj";
	/** The dependency type for a passive subject dependency */
	private static final String DEPENDENCY_TYPE_SUBJECT_PASS = "nsubjpass";

	/** The dependency type for accusative (direct) objets */
	private static final String DEPENDENCY_TYPE_ACCUSATIVE_OBJECT = "dobj";
	private static final String DEPENDENCY_TYPE_ADJECTIVE_MODIFIER = "amod";

	private static final Pattern CONJ_PATTERN = Pattern.compile("(?<!,)(\\s+(and|or))");

	public EnglishSentenceUnfolder(INLPService nlpService) {
		super(nlpService, ELanguage.EN);
	}

	@Override
	protected Optional<Dependency> findSubjectDependency(JCas jCas, Annotation vp, boolean isGovernor) {
		Optional<Dependency> result = NLPUtil.findDependency(jCas, vp, DEPENDENCY_TYPE_SUBJECT, isGovernor);
		if (result.isPresent()) {
			return result;
		}
		return NLPUtil.findDependency(jCas, vp, DEPENDENCY_TYPE_SUBJECT_PASS, isGovernor);
	}

	@Override
	protected Optional<Pair<Annotation, EWordOrder>> findImplicitVerbSubjectByConjunction(JCas jCas, Chunk vp) {
		List<Pair<Token, Token>> relatedPairs = followConjunctionFromAnnotation(jCas, vp);
		for (Pair<Token, Token> relatedPair : relatedPairs) {
			Token relatedVerb = relatedPair.getLeft();
			Optional<Dependency> subj = NLPUtil.findDependency(jCas, relatedVerb, DEPENDENCY_TYPE_SUBJECT, true);
			if (subj.isPresent()) {
				Token subjToken = subj.get().getDependent();
				List<Chunk> chunk = JCasUtil.selectCovering(jCas, Chunk.class, subjToken);
				Chunk np = chunk.get(0);
				if (np.getChunkValue().equals(ConstituentType.NP.getName())) {
					return Optional.of(Pair.of(np, EWordOrder.SOV));
				}
			}
		}
		return Optional.empty();
	}

	@Override
	protected List<Pair<Annotation, Annotation>> completeSubjectsByConjunction(JCas jCas, Annotation subj) {
		Collection<Dependency> dependencies = JCasUtil.select(jCas, Dependency.class);
		List<Pair<Annotation, Annotation>> result = new ArrayList<>();
		result.add(Pair.of(null, subj));
		Optional<Dependency> conjDep;
		Optional<Dependency> ccDep;
		do {
			conjDep = NLPUtil.findDependency(dependencies, subj, DEPENDENCY_TYPE_CONJUNCTION, true);
			ccDep = NLPUtil.findDependency(dependencies, subj, DEPENDENCY_TYPE_CC, true);
			if (conjDep.isPresent() && ccDep.isPresent()) {
				Token govConjToken = conjDep.get().getDependent();
				Token govCcToken = ccDep.get().getDependent();
				Annotation conSubj = NLPUtil.selectIfCovering(Chunk.class, govConjToken);
				Annotation cc = NLPUtil.selectIfCovering(Chunk.class, govCcToken);
				result.add(Pair.of(cc, conSubj));
				subj = conSubj;
			}
		} while (conjDep.isPresent());
		return result;
	}

	@Override
	protected int determineSubjectInsertionPoint(JCas jcas, Chunk vp, EWordOrder order) {
		return vp.getBegin();
	}

	/** {@inheritDoc} */
	@Override
	protected Optional<Dependency> findVerbForNounPhrase(JCas jCas, Annotation np) {
		Optional<Dependency> subjDep = findSubjectDependency(jCas, np, false);
		if (subjDep.isPresent()) {
			return subjDep;
		}
		return findObjectDependency(jCas, np, false);
	}

	/** {@inheritDoc} */
	@Override
	protected Optional<Triple<Annotation, EWordOrder, ENounRole>> findImplicitVerbByConjunction(JCas jCas,
			Annotation np) {
		List<Pair<Token, Token>> conjTokens = followConjunctionFromAnnotation(jCas, np);
		if (conjTokens.isEmpty()) {
			return Optional.empty();
		}

		for (Pair<Token, Token> conjToken : conjTokens) {
			Token conjNounToken = conjToken.getLeft();

			ENounRole role = ENounRole.OBJ;
			Optional<Dependency> verbDependency = findObjectDependency(jCas, conjNounToken, false);
			if (!verbDependency.isPresent()) {
				role = ENounRole.SUBJ;
				verbDependency = findSubjectDependency(jCas, conjNounToken, false);
			}

			if (verbDependency.isPresent()) {
				Token verbToken = verbDependency.get().getGovernor();
				List<Chunk> verbChunk = JCasUtil.selectCovering(jCas, Chunk.class, verbToken);
				Annotation conjuctVpOrToken;
				if (verbChunk.size() > 0
						&& verbChunk.get(0).getChunkValue().equals(NLPUtil.ConstituentType.VP.getName())) {
					conjuctVpOrToken = verbChunk.get(0);
				} else {
					conjuctVpOrToken = verbToken;
				}
				if (conjuctVpOrToken != null) {
					return Optional.of(Triple.of(conjuctVpOrToken, EWordOrder.SVO, role));
				}
			}
		}

		return Optional.empty();
	}

	@Override
	protected int determineVerbInsertionPoint(JCas jCas, Annotation np, Annotation verb, EWordOrder order,
			ENounRole role) {

		Annotation base = np;
		Token origObjToken = null;
		if (role == ENounRole.OBJ) {
			Optional<Dependency> optObjDep = findObjectDependency(jCas, verb, true);
			if (optObjDep.isPresent()) {
				origObjToken = optObjDep.get().getDependent();
			}
		} else if (role == ENounRole.SUBJ) {
			Optional<Dependency> optObjDep = findSubjectDependency(jCas, verb, true);
			if (optObjDep.isPresent()) {
				origObjToken = optObjDep.get().getDependent();
			}
		}
		if (origObjToken != null && origObjToken.getEnd() < np.getBegin() && np.getEnd() < verb.getBegin()) {
			base = NLPUtil.selectIfCovering(Chunk.class, origObjToken);
		}
		if (role == ENounRole.OBJ) {
			return base.getBegin();
		} else {
			return base.getEnd() + 1;
		}
	}

	/** Determines either an accusative or dative object dependency */
	@Override
	protected Optional<Dependency> findObjectDependency(JCas jCas, Annotation anno, boolean isGovernor) {
		Optional<Dependency> obj = NLPUtil.findDependency(jCas, anno, DEPENDENCY_TYPE_ACCUSATIVE_OBJECT, isGovernor);
		return obj;
	}

	/** Follows a conjunction to the related Token */
	private List<Pair<Token, Token>> followConjunctionFromAnnotation(JCas jCas, Annotation startAnno) {
		List<Token> relatedTokens = new ArrayList<>();
		List<Annotation> workList = new ArrayList<>();
		workList.add(startAnno);
		Set<Annotation> doneSet = new HashSet<>();
		List<Pair<Token, Token>> result = new ArrayList<>();

		while (!workList.isEmpty()) {
			Annotation currentAnno = workList.remove(0);
			relatedTokens.clear();

			List<Dependency> conjDeps = NLPUtil.findDependencies(jCas, currentAnno, DEPENDENCY_TYPE_CONJUNCTION, false);
			conjDeps.stream().map(d -> d.getGovernor()).forEach(t -> relatedTokens.add(t));

			conjDeps = NLPUtil.findDependencies(jCas, currentAnno, DEPENDENCY_TYPE_CONJUNCTION, false);
			conjDeps.stream().map(d -> d.getDependent()).forEach(t -> relatedTokens.add(t));

			doneSet.add(currentAnno);

			relatedTokens.stream().filter(t -> !doneSet.contains(t)).forEach(t -> workList.add(t));

			Optional<Dependency> optCcDep = NLPUtil.findDependency(jCas, currentAnno, DEPENDENCY_TYPE_CC, true);
			Token conjunctionToken = null;
			if (optCcDep.isPresent()) {
				conjunctionToken = optCcDep.get().getGovernor();
			}

			for (Token relatedToken : relatedTokens) {
				result.add(Pair.of(relatedToken, conjunctionToken));
			}
		}
		return result;
	}

	@Override
	protected List<Dependency> getConjunctiveAdjectiveModifyers(JCas jCas, Annotation np) {
		Collection<Dependency> dependencies = JCasUtil.select(jCas, Dependency.class);
		List<Dependency> modifyers = NLPUtil.findDependencies(dependencies, np, DEPENDENCY_TYPE_ADJECTIVE_MODIFIER,
				true);

		Vector<Dependency> result = new Vector<Dependency>();

		for (Dependency modifyer : modifyers) {
			Token firstModifyer = modifyer.getDependent();
			Optional<Dependency> ccDep = NLPUtil.findDependency(dependencies, firstModifyer, DEPENDENCY_TYPE_CC, true);
			Optional<Dependency> secondModifyerDep = NLPUtil.findDependency(dependencies, firstModifyer,
					DEPENDENCY_TYPE_CONJUNCTION, true);

			if (ccDep.isPresent() && secondModifyerDep.isPresent()) {
				result.add(modifyer);
			}
		}
		return result;
	}

	@Override
	protected List<Pair<Integer, String>> completeConjunctiveAdjectiveNounPhrase(JCas jCas, Annotation np,
			List<Dependency> modifyers) {
		Collection<Dependency> dependencies = JCasUtil.select(jCas, Dependency.class);
		Vector<Pair<Integer, String>> result = new Vector<Pair<Integer, String>>();

		for (Dependency modifyer : modifyers) {
			Token noun = modifyer.getGovernor();
			Token firstModifyer = modifyer.getDependent();
			Token conjunction = NLPUtil.findDependency(dependencies, firstModifyer, DEPENDENCY_TYPE_CC, true).get()
					.getDependent();
			result.add(Pair.of(conjunction.getBegin(), noun.getCoveredText()));
		}
		return result;
	}

	@Override
	protected String insertCommasBeforeConjunctions(String text) {
		return CONJ_PATTERN.matcher(text).replaceAll(r -> "," + r.group(1));
	}

	@Override
	protected Optional<Annotation> getAssociatedSubjectConditional(JCas jCas, Annotation implicitSubject) {
		return Optional.empty();
	}

	@Override
	protected Optional<Annotation> getNearestForwardConnective(JCas jCas, Annotation annotation) {
		Annotation source = annotation;
		while (true) {
			Optional<Dependency> optCCDep = NLPUtil.findDependency(jCas, source, DEPENDENCY_TYPE_CC, true);
			if (optCCDep.isPresent()) {
				return Optional.of(optCCDep.get().getDependent());
			} else {
				Optional<Dependency> optConjDep = NLPUtil.findDependency(jCas, source, DEPENDENCY_TYPE_CONJUNCTION,
						true);
				if (optConjDep.isPresent()) {
					source = optConjDep.get().getDependent();
				} else {
					return Optional.empty();
				}
			}
		}
	}

	@Override
	protected List<Annotation> identifyConjunctionsWithoutConnectives(JCas jCas) {
		List<Annotation> result = new ArrayList<Annotation>();
		Collection<Dependency> dependencies = JCasUtil.select(jCas, Dependency.class);
		for (Dependency dependency : dependencies) {
			if (dependency.getDependencyType().contentEquals(DEPENDENCY_TYPE_CONJUNCTION)) {
				Token conjSource = dependency.getGovernor();
				Optional<Dependency> optCCDeps = NLPUtil.findDependency(jCas, conjSource, DEPENDENCY_TYPE_CC, true);
				if (optCCDeps.isEmpty()) {
					result.add(dependency.getDependent());
				}
			}
		}
		return result;
	}
}
