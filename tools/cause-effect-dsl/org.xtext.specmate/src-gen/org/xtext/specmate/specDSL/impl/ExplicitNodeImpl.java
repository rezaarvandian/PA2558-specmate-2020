/**
 * generated by Xtext 2.17.1
 */
package org.xtext.specmate.specDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.specmate.specDSL.ExplicitNode;
import org.xtext.specmate.specDSL.POSTag;
import org.xtext.specmate.specDSL.SpecDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.specmate.specDSL.impl.ExplicitNodeImpl#getPTag <em>PTag</em>}</li>
 *   <li>{@link org.xtext.specmate.specDSL.impl.ExplicitNodeImpl#isCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.xtext.specmate.specDSL.impl.ExplicitNodeImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.specmate.specDSL.impl.ExplicitNodeImpl#isAnyMatch <em>Any Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplicitNodeImpl extends NodeImpl implements ExplicitNode
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
   * The default value of the '{@link #isCaseSensitive() <em>Case Sensitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCaseSensitive()
   * @generated
   * @ordered
   */
  protected static final boolean CASE_SENSITIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCaseSensitive() <em>Case Sensitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCaseSensitive()
   * @generated
   * @ordered
   */
  protected boolean caseSensitive = CASE_SENSITIVE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExplicitNodeImpl()
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
    return SpecDSLPackage.Literals.EXPLICIT_NODE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecDSLPackage.EXPLICIT_NODE__PTAG, oldPTag, pTag));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDSLPackage.EXPLICIT_NODE__PTAG, oldPTag, pTag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCaseSensitive()
  {
    return caseSensitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseSensitive(boolean newCaseSensitive)
  {
    boolean oldCaseSensitive = caseSensitive;
    caseSensitive = newCaseSensitive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDSLPackage.EXPLICIT_NODE__CASE_SENSITIVE, oldCaseSensitive, caseSensitive));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDSLPackage.EXPLICIT_NODE__EXPR, oldExpr, expr));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDSLPackage.EXPLICIT_NODE__ANY_MATCH, oldAnyMatch, anyMatch));
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
      case SpecDSLPackage.EXPLICIT_NODE__PTAG:
        if (resolve) return getPTag();
        return basicGetPTag();
      case SpecDSLPackage.EXPLICIT_NODE__CASE_SENSITIVE:
        return isCaseSensitive();
      case SpecDSLPackage.EXPLICIT_NODE__EXPR:
        return getExpr();
      case SpecDSLPackage.EXPLICIT_NODE__ANY_MATCH:
        return isAnyMatch();
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
      case SpecDSLPackage.EXPLICIT_NODE__PTAG:
        setPTag((POSTag)newValue);
        return;
      case SpecDSLPackage.EXPLICIT_NODE__CASE_SENSITIVE:
        setCaseSensitive((Boolean)newValue);
        return;
      case SpecDSLPackage.EXPLICIT_NODE__EXPR:
        setExpr((String)newValue);
        return;
      case SpecDSLPackage.EXPLICIT_NODE__ANY_MATCH:
        setAnyMatch((Boolean)newValue);
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
      case SpecDSLPackage.EXPLICIT_NODE__PTAG:
        setPTag((POSTag)null);
        return;
      case SpecDSLPackage.EXPLICIT_NODE__CASE_SENSITIVE:
        setCaseSensitive(CASE_SENSITIVE_EDEFAULT);
        return;
      case SpecDSLPackage.EXPLICIT_NODE__EXPR:
        setExpr(EXPR_EDEFAULT);
        return;
      case SpecDSLPackage.EXPLICIT_NODE__ANY_MATCH:
        setAnyMatch(ANY_MATCH_EDEFAULT);
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
      case SpecDSLPackage.EXPLICIT_NODE__PTAG:
        return pTag != null;
      case SpecDSLPackage.EXPLICIT_NODE__CASE_SENSITIVE:
        return caseSensitive != CASE_SENSITIVE_EDEFAULT;
      case SpecDSLPackage.EXPLICIT_NODE__EXPR:
        return EXPR_EDEFAULT == null ? expr != null : !EXPR_EDEFAULT.equals(expr);
      case SpecDSLPackage.EXPLICIT_NODE__ANY_MATCH:
        return anyMatch != ANY_MATCH_EDEFAULT;
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
    result.append(" (caseSensitive: ");
    result.append(caseSensitive);
    result.append(", expr: ");
    result.append(expr);
    result.append(", anyMatch: ");
    result.append(anyMatch);
    result.append(')');
    return result.toString();
  }

} //ExplicitNodeImpl
