/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.AssertStatement;
import de.silvawb.java.GETExpression;
import de.silvawb.java.JavaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GET Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.GETExpressionImpl#getRightSide <em>Right Side</em>}</li>
 *   <li>{@link de.silvawb.java.impl.GETExpressionImpl#getContainerStatement <em>Container Statement</em>}</li>
 *   <li>{@link de.silvawb.java.impl.GETExpressionImpl#getLeftSide <em>Left Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GETExpressionImpl extends MinimalEObjectImpl.Container implements GETExpression {
	/**
	 * The default value of the '{@link #getRightSide() <em>Right Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSide()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHT_SIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSide()
	 * @generated
	 * @ordered
	 */
	protected String rightSide = RIGHT_SIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeftSide() <em>Left Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSide()
	 * @generated
	 * @ordered
	 */
	protected static final String LEFT_SIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSide()
	 * @generated
	 * @ordered
	 */
	protected String leftSide = LEFT_SIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GETExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.GET_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRightSide() {
		return rightSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSide(String newRightSide) {
		String oldRightSide = rightSide;
		rightSide = newRightSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.GET_EXPRESSION__RIGHT_SIDE, oldRightSide, rightSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertStatement getContainerStatement() {
		if (eContainerFeatureID() != JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT) return null;
		return (AssertStatement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerStatement(AssertStatement newContainerStatement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainerStatement, JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerStatement(AssertStatement newContainerStatement) {
		if (newContainerStatement != eInternalContainer() || (eContainerFeatureID() != JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT && newContainerStatement != null)) {
			if (EcoreUtil.isAncestor(this, newContainerStatement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerStatement != null)
				msgs = ((InternalEObject)newContainerStatement).eInverseAdd(this, JavaPackage.ASSERT_STATEMENT__ASSERTION, AssertStatement.class, msgs);
			msgs = basicSetContainerStatement(newContainerStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT, newContainerStatement, newContainerStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeftSide() {
		return leftSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSide(String newLeftSide) {
		String oldLeftSide = leftSide;
		leftSide = newLeftSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.GET_EXPRESSION__LEFT_SIDE, oldLeftSide, leftSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainerStatement((AssertStatement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT:
				return basicSetContainerStatement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT:
				return eInternalContainer().eInverseRemove(this, JavaPackage.ASSERT_STATEMENT__ASSERTION, AssertStatement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.GET_EXPRESSION__RIGHT_SIDE:
				return getRightSide();
			case JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT:
				return getContainerStatement();
			case JavaPackage.GET_EXPRESSION__LEFT_SIDE:
				return getLeftSide();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.GET_EXPRESSION__RIGHT_SIDE:
				setRightSide((String)newValue);
				return;
			case JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT:
				setContainerStatement((AssertStatement)newValue);
				return;
			case JavaPackage.GET_EXPRESSION__LEFT_SIDE:
				setLeftSide((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaPackage.GET_EXPRESSION__RIGHT_SIDE:
				setRightSide(RIGHT_SIDE_EDEFAULT);
				return;
			case JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT:
				setContainerStatement((AssertStatement)null);
				return;
			case JavaPackage.GET_EXPRESSION__LEFT_SIDE:
				setLeftSide(LEFT_SIDE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaPackage.GET_EXPRESSION__RIGHT_SIDE:
				return RIGHT_SIDE_EDEFAULT == null ? rightSide != null : !RIGHT_SIDE_EDEFAULT.equals(rightSide);
			case JavaPackage.GET_EXPRESSION__CONTAINER_STATEMENT:
				return getContainerStatement() != null;
			case JavaPackage.GET_EXPRESSION__LEFT_SIDE:
				return LEFT_SIDE_EDEFAULT == null ? leftSide != null : !LEFT_SIDE_EDEFAULT.equals(leftSide);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rightSide: ");
		result.append(rightSide);
		result.append(", leftSide: ");
		result.append(leftSide);
		result.append(')');
		return result.toString();
	}

} //GETExpressionImpl
