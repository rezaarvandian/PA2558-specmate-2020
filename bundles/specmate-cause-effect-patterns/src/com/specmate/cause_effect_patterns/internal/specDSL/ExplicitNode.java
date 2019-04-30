/**
 * generated by Xtext 2.17.1
 */
package com.specmate.cause_effect_patterns.internal.specDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.ExplicitNode#getPTag <em>PTag</em>}</li>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.ExplicitNode#isCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.ExplicitNode#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.ExplicitNode#isAnyMatch <em>Any Match</em>}</li>
 * </ul>
 *
 * @see com.specmate.cause_effect_patterns.specDSL.SpecDSLPackage#getExplicitNode()
 * @model
 * @generated
 */
public interface ExplicitNode extends Node
{
  /**
   * Returns the value of the '<em><b>PTag</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PTag</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PTag</em>' reference.
   * @see #setPTag(POSTag)
   * @see com.specmate.cause_effect_patterns.specDSL.SpecDSLPackage#getExplicitNode_PTag()
   * @model
   * @generated
   */
  POSTag getPTag();

  /**
   * Sets the value of the '{@link com.specmate.cause_effect_patterns.specDSL.ExplicitNode#getPTag <em>PTag</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PTag</em>' reference.
   * @see #getPTag()
   * @generated
   */
  void setPTag(POSTag value);

  /**
   * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Sensitive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Sensitive</em>' attribute.
   * @see #setCaseSensitive(boolean)
   * @see com.specmate.cause_effect_patterns.specDSL.SpecDSLPackage#getExplicitNode_CaseSensitive()
   * @model
   * @generated
   */
  boolean isCaseSensitive();

  /**
   * Sets the value of the '{@link com.specmate.cause_effect_patterns.specDSL.ExplicitNode#isCaseSensitive <em>Case Sensitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Sensitive</em>' attribute.
   * @see #isCaseSensitive()
   * @generated
   */
  void setCaseSensitive(boolean value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' attribute.
   * @see #setExpr(String)
   * @see com.specmate.cause_effect_patterns.specDSL.SpecDSLPackage#getExplicitNode_Expr()
   * @model
   * @generated
   */
  String getExpr();

  /**
   * Sets the value of the '{@link com.specmate.cause_effect_patterns.specDSL.ExplicitNode#getExpr <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' attribute.
   * @see #getExpr()
   * @generated
   */
  void setExpr(String value);

  /**
   * Returns the value of the '<em><b>Any Match</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any Match</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any Match</em>' attribute.
   * @see #setAnyMatch(boolean)
   * @see com.specmate.cause_effect_patterns.specDSL.SpecDSLPackage#getExplicitNode_AnyMatch()
   * @model
   * @generated
   */
  boolean isAnyMatch();

  /**
   * Sets the value of the '{@link com.specmate.cause_effect_patterns.specDSL.ExplicitNode#isAnyMatch <em>Any Match</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Any Match</em>' attribute.
   * @see #isAnyMatch()
   * @generated
   */
  void setAnyMatch(boolean value);

} // ExplicitNode
