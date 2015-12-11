/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Interface;
import de.silvawb.java.JavaPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getExtendedInterfaces <em>Extended Interfaces</em>}</li>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getExtendingInterfaces <em>Extending Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends ClassifierImpl implements Interface {
	/**
	 * The cached value of the '{@link #getExtendedInterfaces() <em>Extended Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> extendedInterfaces;

	/**
	 * The cached value of the '{@link #getExtendingInterfaces() <em>Extending Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendingInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> extendingInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getExtendedInterfaces() {
		if (extendedInterfaces == null) {
			extendedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, JavaPackage.INTERFACE__EXTENDED_INTERFACES, JavaPackage.INTERFACE__EXTENDING_INTERFACES);
		}
		return extendedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getExtendingInterfaces() {
		if (extendingInterfaces == null) {
			extendingInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, JavaPackage.INTERFACE__EXTENDING_INTERFACES, JavaPackage.INTERFACE__EXTENDED_INTERFACES);
		}
		return extendingInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendedInterfaces()).basicAdd(otherEnd, msgs);
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendingInterfaces()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				return ((InternalEList<?>)getExtendedInterfaces()).basicRemove(otherEnd, msgs);
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				return ((InternalEList<?>)getExtendingInterfaces()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				return getExtendedInterfaces();
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				return getExtendingInterfaces();
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
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				getExtendedInterfaces().clear();
				getExtendedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				getExtendingInterfaces().clear();
				getExtendingInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				getExtendedInterfaces().clear();
				return;
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				getExtendingInterfaces().clear();
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
			case JavaPackage.INTERFACE__EXTENDED_INTERFACES:
				return extendedInterfaces != null && !extendedInterfaces.isEmpty();
			case JavaPackage.INTERFACE__EXTENDING_INTERFACES:
				return extendingInterfaces != null && !extendingInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
