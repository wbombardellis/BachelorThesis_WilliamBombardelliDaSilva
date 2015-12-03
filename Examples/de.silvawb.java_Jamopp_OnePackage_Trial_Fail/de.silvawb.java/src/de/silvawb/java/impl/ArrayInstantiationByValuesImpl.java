/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.ArrayInitializer;
import de.silvawb.java.ArrayInstantiationByValues;
import de.silvawb.java.JavaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Instantiation By Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ArrayInstantiationByValuesImpl#getArrayInitializer <em>Array Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArrayInstantiationByValuesImpl extends ArrayInstantiationImpl implements ArrayInstantiationByValues {
	/**
	 * The cached value of the '{@link #getArrayInitializer() <em>Array Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayInitializer()
	 * @generated
	 * @ordered
	 */
	protected ArrayInitializer arrayInitializer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayInstantiationByValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getArrayInstantiationByValues();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer getArrayInitializer() {
		return arrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayInitializer(ArrayInitializer newArrayInitializer, NotificationChain msgs) {
		ArrayInitializer oldArrayInitializer = arrayInitializer;
		arrayInitializer = newArrayInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, oldArrayInitializer, newArrayInitializer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayInitializer(ArrayInitializer newArrayInitializer) {
		if (newArrayInitializer != arrayInitializer) {
			NotificationChain msgs = null;
			if (arrayInitializer != null)
				msgs = ((InternalEObject)arrayInitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, null, msgs);
			if (newArrayInitializer != null)
				msgs = ((InternalEObject)newArrayInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, null, msgs);
			msgs = basicSetArrayInitializer(newArrayInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, newArrayInitializer, newArrayInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
				return basicSetArrayInitializer(null, msgs);
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
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
				return getArrayInitializer();
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
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
				setArrayInitializer((ArrayInitializer)newValue);
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
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
				setArrayInitializer((ArrayInitializer)null);
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
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
				return arrayInitializer != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayInstantiationByValuesImpl
