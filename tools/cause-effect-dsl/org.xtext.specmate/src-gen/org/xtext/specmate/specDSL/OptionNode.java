/**
 * generated by Xtext 2.17.1
 */
package org.xtext.specmate.specDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.specmate.specDSL.OptionNode#getLeftNode <em>Left Node</em>}</li>
 *   <li>{@link org.xtext.specmate.specDSL.OptionNode#getRightNodes <em>Right Nodes</em>}</li>
 * </ul>
 *
 * @see org.xtext.specmate.specDSL.SpecDSLPackage#getOptionNode()
 * @model
 * @generated
 */
public interface OptionNode extends Node
{
  /**
   * Returns the value of the '<em><b>Left Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Node</em>' containment reference.
   * @see #setLeftNode(ExplicitNode)
   * @see org.xtext.specmate.specDSL.SpecDSLPackage#getOptionNode_LeftNode()
   * @model containment="true"
   * @generated
   */
  ExplicitNode getLeftNode();

  /**
   * Sets the value of the '{@link org.xtext.specmate.specDSL.OptionNode#getLeftNode <em>Left Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Node</em>' containment reference.
   * @see #getLeftNode()
   * @generated
   */
  void setLeftNode(ExplicitNode value);

  /**
   * Returns the value of the '<em><b>Right Nodes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.specmate.specDSL.ExplicitNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Nodes</em>' containment reference list.
   * @see org.xtext.specmate.specDSL.SpecDSLPackage#getOptionNode_RightNodes()
   * @model containment="true"
   * @generated
   */
  EList<ExplicitNode> getRightNodes();

} // OptionNode