/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JavaPackage;
import de.silvawb.java.Static;
import de.silvawb.java.StaticImport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.StaticImportImpl#getStatic <em>Static</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StaticImportImpl extends ImportImpl implements StaticImport {
	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected Static static_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getStaticImport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Static getStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatic(Static newStatic, NotificationChain msgs) {
		Static oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.STATIC_IMPORT__STATIC, oldStatic, newStatic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(Static newStatic) {
		if (newStatic != static_) {
			NotificationChain msgs = null;
			if (static_ != null)
				msgs = ((InternalEObject)static_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATIC_IMPORT__STATIC, null, msgs);
			if (newStatic != null)
				msgs = ((InternalEObject)newStatic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.STATIC_IMPORT__STATIC, null, msgs);
			msgs = basicSetStatic(newStatic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.STATIC_IMPORT__STATIC, newStatic, newStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.STATIC_IMPORT__STATIC:
				return basicSetStatic(null, msgs);
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
			case JavaPackage.STATIC_IMPORT__STATIC:
				return getStatic();
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
			case JavaPackage.STATIC_IMPORT__STATIC:
				setStatic((Static)newValue);
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
			case JavaPackage.STATIC_IMPORT__STATIC:
				setStatic((Static)null);
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
			case JavaPackage.STATIC_IMPORT__STATIC:
				return static_ != null;
		}
		return super.eIsSet(featureID);
	}

} //StaticImportImpl
