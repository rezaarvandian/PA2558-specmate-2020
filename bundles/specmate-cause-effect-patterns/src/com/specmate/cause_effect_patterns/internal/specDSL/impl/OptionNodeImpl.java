/**
 * generated by Xtext 2.17.1
 */
package com.specmate.cause_effect_patterns.internal.specDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.specmate.cause_effect_patterns.internal.specDSL.ExplicitNode;
import com.specmate.cause_effect_patterns.internal.specDSL.OptionNode;
import com.specmate.cause_effect_patterns.internal.specDSL.SpecDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.impl.OptionNodeImpl#getLeftNode <em>Left Node</em>}</li>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.impl.OptionNodeImpl#getRightNodes <em>Right Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionNodeImpl extends NodeImpl implements OptionNode
{
  /**
   * The cached value of the '{@link #getLeftNode() <em>Left Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftNode()
   * @generated
   * @ordered
   */
  protected ExplicitNode leftNode;

  /**
   * The cached value of the '{@link #getRightNodes() <em>Right Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightNodes()
   * @generated
   * @ordered
   */
  protected EList<ExplicitNode> rightNodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionNodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpecDSLPackage.Literals.OPTION_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitNode getLeftNode()
  {
    return leftNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftNode(ExplicitNode newLeftNode, NotificationChain msgs)
  {
    ExplicitNode oldLeftNode = leftNode;
    leftNode = newLeftNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecDSLPackage.OPTION_NODE__LEFT_NODE, oldLeftNode, newLeftNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftNode(ExplicitNode newLeftNode)
  {
    if (newLeftNode != leftNode)
    {
      NotificationChain msgs = null;
      if (leftNode != null)
        msgs = ((InternalEObject)leftNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecDSLPackage.OPTION_NODE__LEFT_NODE, null, msgs);
      if (newLeftNode != null)
        msgs = ((InternalEObject)newLeftNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecDSLPackage.OPTION_NODE__LEFT_NODE, null, msgs);
      msgs = basicSetLeftNode(newLeftNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDSLPackage.OPTION_NODE__LEFT_NODE, newLeftNode, newLeftNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExplicitNode> getRightNodes()
  {
    if (rightNodes == null)
    {
      rightNodes = new EObjectContainmentEList<ExplicitNode>(ExplicitNode.class, this, SpecDSLPackage.OPTION_NODE__RIGHT_NODES);
    }
    return rightNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpecDSLPackage.OPTION_NODE__LEFT_NODE:
        return basicSetLeftNode(null, msgs);
      case SpecDSLPackage.OPTION_NODE__RIGHT_NODES:
        return ((InternalEList<?>)getRightNodes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpecDSLPackage.OPTION_NODE__LEFT_NODE:
        return getLeftNode();
      case SpecDSLPackage.OPTION_NODE__RIGHT_NODES:
        return getRightNodes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpecDSLPackage.OPTION_NODE__LEFT_NODE:
        setLeftNode((ExplicitNode)newValue);
        return;
      case SpecDSLPackage.OPTION_NODE__RIGHT_NODES:
        getRightNodes().clear();
        getRightNodes().addAll((Collection<? extends ExplicitNode>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpecDSLPackage.OPTION_NODE__LEFT_NODE:
        setLeftNode((ExplicitNode)null);
        return;
      case SpecDSLPackage.OPTION_NODE__RIGHT_NODES:
        getRightNodes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpecDSLPackage.OPTION_NODE__LEFT_NODE:
        return leftNode != null;
      case SpecDSLPackage.OPTION_NODE__RIGHT_NODES:
        return rightNodes != null && !rightNodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OptionNodeImpl
