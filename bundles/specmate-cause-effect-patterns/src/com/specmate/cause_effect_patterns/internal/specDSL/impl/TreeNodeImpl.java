/**
 * generated by Xtext 2.17.1
 */
package com.specmate.cause_effect_patterns.internal.specDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.specmate.cause_effect_patterns.internal.specDSL.POSTag;
import com.specmate.cause_effect_patterns.internal.specDSL.SpecDSLPackage;
import com.specmate.cause_effect_patterns.internal.specDSL.Subtree;
import com.specmate.cause_effect_patterns.internal.specDSL.TreeNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.impl.TreeNodeImpl#getPTag <em>PTag</em>}</li>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.impl.TreeNodeImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.impl.TreeNodeImpl#isAnyMatch <em>Any Match</em>}</li>
 *   <li>{@link com.specmate.cause_effect_patterns.specDSL.impl.TreeNodeImpl#getTree <em>Tree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeNodeImpl extends NodeImpl implements TreeNode
{
  /**
   * The cached value of the '{@link #getPTag() <em>PTag</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPTag()
   * @generated
   * @ordered
   */
  protected POSTag pTag;

  /**
   * The default value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected static final String EXPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected String expr = EXPR_EDEFAULT;

  /**
   * The default value of the '{@link #isAnyMatch() <em>Any Match</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnyMatch()
   * @generated
   * @ordered
   */
  protected static final boolean ANY_MATCH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnyMatch() <em>Any Match</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnyMatch()
   * @generated
   * @ordered
   */
  protected boolean anyMatch = ANY_MATCH_EDEFAULT;

  /**
   * The cached value of the '{@link #getTree() <em>Tree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTree()
   * @generated
   * @ordered
   */
  protected Subtree tree;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TreeNodeImpl()
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
    return SpecDSLPackage.Literals.TREE_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POSTag getPTag()
  {
    if (pTag != null && pTag.eIsProxy())
    {
      InternalEObject oldPTag = (InternalEObject)pTag;
      pTag = (POSTag)eResolveProxy(oldPTag);
      if (pTag != oldPTag)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecDSLPackage.TREE_NODE__PTAG, oldPTag, pTag));
      }
    }
    return pTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POSTag basicGetPTag()
  {
    return pTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPTag(POSTag newPTag)
  {
    POSTag oldPTag = pTag;
    pTag = newPTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDSLPackage.TREE_NODE__PTAG, oldPTag, pTag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(String newExpr)
  {
    String oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDSLPackage.TREE_NODE__EXPR, oldExpr, expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnyMatch()
  {
    return anyMatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnyMatch(boolean newAnyMatch)
  {
    boolean oldAnyMatch = anyMatch;
    anyMatch = newAnyMatch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDSLPackage.TREE_NODE__ANY_MATCH, oldAnyMatch, anyMatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subtree getTree()
  {
    return tree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTree(Subtree newTree, NotificationChain msgs)
  {
    Subtree oldTree = tree;
    tree = newTree;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecDSLPackage.TREE_NODE__TREE, oldTree, newTree);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTree(Subtree newTree)
  {
    if (newTree != tree)
    {
      NotificationChain msgs = null;
      if (tree != null)
        msgs = ((InternalEObject)tree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecDSLPackage.TREE_NODE__TREE, null, msgs);
      if (newTree != null)
        msgs = ((InternalEObject)newTree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecDSLPackage.TREE_NODE__TREE, null, msgs);
      msgs = basicSetTree(newTree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDSLPackage.TREE_NODE__TREE, newTree, newTree));
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
      case SpecDSLPackage.TREE_NODE__TREE:
        return basicSetTree(null, msgs);
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
      case SpecDSLPackage.TREE_NODE__PTAG:
        if (resolve) return getPTag();
        return basicGetPTag();
      case SpecDSLPackage.TREE_NODE__EXPR:
        return getExpr();
      case SpecDSLPackage.TREE_NODE__ANY_MATCH:
        return isAnyMatch();
      case SpecDSLPackage.TREE_NODE__TREE:
        return getTree();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpecDSLPackage.TREE_NODE__PTAG:
        setPTag((POSTag)newValue);
        return;
      case SpecDSLPackage.TREE_NODE__EXPR:
        setExpr((String)newValue);
        return;
      case SpecDSLPackage.TREE_NODE__ANY_MATCH:
        setAnyMatch((Boolean)newValue);
        return;
      case SpecDSLPackage.TREE_NODE__TREE:
        setTree((Subtree)newValue);
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
      case SpecDSLPackage.TREE_NODE__PTAG:
        setPTag((POSTag)null);
        return;
      case SpecDSLPackage.TREE_NODE__EXPR:
        setExpr(EXPR_EDEFAULT);
        return;
      case SpecDSLPackage.TREE_NODE__ANY_MATCH:
        setAnyMatch(ANY_MATCH_EDEFAULT);
        return;
      case SpecDSLPackage.TREE_NODE__TREE:
        setTree((Subtree)null);
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
      case SpecDSLPackage.TREE_NODE__PTAG:
        return pTag != null;
      case SpecDSLPackage.TREE_NODE__EXPR:
        return EXPR_EDEFAULT == null ? expr != null : !EXPR_EDEFAULT.equals(expr);
      case SpecDSLPackage.TREE_NODE__ANY_MATCH:
        return anyMatch != ANY_MATCH_EDEFAULT;
      case SpecDSLPackage.TREE_NODE__TREE:
        return tree != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (expr: ");
    result.append(expr);
    result.append(", anyMatch: ");
    result.append(anyMatch);
    result.append(')');
    return result.toString();
  }

} //TreeNodeImpl
