/*
 * generated by Xtext 2.17.1
 */
package org.xtext.specmate.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.specmate.parser.antlr.internal.InternalSpecDSLParser;
import org.xtext.specmate.services.SpecDSLGrammarAccess;

public class SpecDSLParser extends AbstractAntlrParser {

	@Inject
	private SpecDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSpecDSLParser createParser(XtextTokenStream stream) {
		return new InternalSpecDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public SpecDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SpecDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
