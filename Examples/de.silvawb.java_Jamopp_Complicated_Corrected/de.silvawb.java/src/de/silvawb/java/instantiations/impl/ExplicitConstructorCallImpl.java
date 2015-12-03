/**
 */
package de.silvawb.java.instantiations.impl;

import de.silvawb.java.instantiations.ExplicitConstructorCall;
import de.silvawb.java.instantiations.InstantiationsPackage;

import de.silvawb.java.literals.Self;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.instantiations.impl.ExplicitConstructorCallImpl#getCallTarget <em>Call Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplicitConstructorCallImpl extends InstantiationImpl implements ExplicitConstructorCall {
	/**
	 * The cached value of the '{@link #getCallTarget() <em>Call Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTarget()
	 * @generated
	 * @ordered
	 */
	protected Self callTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplicitConstructorCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstantiationsPackage.Literals.EXPLICIT_CONSTRUCTOR_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Self getCallTarget() {
		return callTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallTarget(Self newCallTarget, NotificationChain msgs) {
		Self oldCallTarget = callTarget;
		callTarget = newCallTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, oldCallTarget, newCallTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallTarget(Self newCallTarget) {
		if (newCallTarget != callTarget) {
			NotificationChain msgs = null;
			if (callTarget != null)
				msgs = ((InternalEObject)callTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, null, msgs);
			if (newCallTarget != null)
				msgs = ((InternalEObject)newCallTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, null, msgs);
			msgs = basicSetCallTarget(newCallTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, newCallTarget, newCallTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
				return basicSetCallTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
				return getCallTarget();
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
			case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
				setCallTarget((Self)newValue);
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
			case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
				setCallTarget((Self)null);
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
			case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
				return callTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplicitConstructorCallImpl
