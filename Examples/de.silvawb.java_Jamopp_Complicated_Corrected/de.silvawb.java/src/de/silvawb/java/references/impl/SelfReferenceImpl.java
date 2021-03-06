/**
 */
package de.silvawb.java.references.impl;

import de.silvawb.java.literals.Self;

import de.silvawb.java.references.ReferencesPackage;
import de.silvawb.java.references.SelfReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.references.impl.SelfReferenceImpl#getSelf <em>Self</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelfReferenceImpl extends ReferenceImpl implements SelfReference {
	/**
	 * The cached value of the '{@link #getSelf() <em>Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelf()
	 * @generated
	 * @ordered
	 */
	protected Self self;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.SELF_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Self getSelf() {
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelf(Self newSelf, NotificationChain msgs) {
		Self oldSelf = self;
		self = newSelf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferencesPackage.SELF_REFERENCE__SELF, oldSelf, newSelf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelf(Self newSelf) {
		if (newSelf != self) {
			NotificationChain msgs = null;
			if (self != null)
				msgs = ((InternalEObject)self).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.SELF_REFERENCE__SELF, null, msgs);
			if (newSelf != null)
				msgs = ((InternalEObject)newSelf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.SELF_REFERENCE__SELF, null, msgs);
			msgs = basicSetSelf(newSelf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.SELF_REFERENCE__SELF, newSelf, newSelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferencesPackage.SELF_REFERENCE__SELF:
				return basicSetSelf(null, msgs);
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
			case ReferencesPackage.SELF_REFERENCE__SELF:
				return getSelf();
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
			case ReferencesPackage.SELF_REFERENCE__SELF:
				setSelf((Self)newValue);
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
			case ReferencesPackage.SELF_REFERENCE__SELF:
				setSelf((Self)null);
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
			case ReferencesPackage.SELF_REFERENCE__SELF:
				return self != null;
		}
		return super.eIsSet(featureID);
	}

} //SelfReferenceImpl
