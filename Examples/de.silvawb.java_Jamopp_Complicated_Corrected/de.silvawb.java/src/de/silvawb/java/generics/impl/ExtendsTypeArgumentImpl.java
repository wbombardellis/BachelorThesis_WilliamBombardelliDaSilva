/**
 */
package de.silvawb.java.generics.impl;

import de.silvawb.java.generics.ExtendsTypeArgument;
import de.silvawb.java.generics.GenericsPackage;

import de.silvawb.java.types.TypeReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extends Type Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.generics.impl.ExtendsTypeArgumentImpl#getExtendTypes <em>Extend Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendsTypeArgumentImpl extends TypeArgumentImpl implements ExtendsTypeArgument {
	/**
	 * The cached value of the '{@link #getExtendTypes() <em>Extend Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> extendTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendsTypeArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericsPackage.Literals.EXTENDS_TYPE_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReference> getExtendTypes() {
		if (extendTypes == null) {
			extendTypes = new EObjectContainmentEList<TypeReference>(TypeReference.class, this, GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES);
		}
		return extendTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
				return ((InternalEList<?>)getExtendTypes()).basicRemove(otherEnd, msgs);
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
			case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
				return getExtendTypes();
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
			case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
				getExtendTypes().clear();
				getExtendTypes().addAll((Collection<? extends TypeReference>)newValue);
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
			case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
				getExtendTypes().clear();
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
			case GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES:
				return extendTypes != null && !extendTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExtendsTypeArgumentImpl
