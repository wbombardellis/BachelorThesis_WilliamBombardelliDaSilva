/**
 */
package de.silvawb.java.generics.impl;

import de.silvawb.java.commons.impl.CommentableImpl;

import de.silvawb.java.generics.CallTypeArgumentable;
import de.silvawb.java.generics.GenericsPackage;
import de.silvawb.java.generics.TypeArgument;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Type Argumentable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.generics.impl.CallTypeArgumentableImpl#getCallTypeArguments <em>Call Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallTypeArgumentableImpl extends CommentableImpl implements CallTypeArgumentable {
	/**
	 * The cached value of the '{@link #getCallTypeArguments() <em>Call Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeArgument> callTypeArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallTypeArgumentableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericsPackage.Literals.CALL_TYPE_ARGUMENTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeArgument> getCallTypeArguments() {
		if (callTypeArguments == null) {
			callTypeArguments = new EObjectContainmentEList<TypeArgument>(TypeArgument.class, this, GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS);
		}
		return callTypeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS:
				return ((InternalEList<?>)getCallTypeArguments()).basicRemove(otherEnd, msgs);
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
			case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS:
				return getCallTypeArguments();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS:
				getCallTypeArguments().clear();
				getCallTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
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
			case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS:
				getCallTypeArguments().clear();
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
			case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS:
				return callTypeArguments != null && !callTypeArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallTypeArgumentableImpl
