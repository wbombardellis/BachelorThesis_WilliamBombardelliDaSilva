/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.ArrayDimension;
import de.silvawb.java.ArrayInstantiationByValuesTyped;
import de.silvawb.java.ArrayTypeable;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.TypeReference;
import de.silvawb.java.TypedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Instantiation By Values Typed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ArrayInstantiationByValuesTypedImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ArrayInstantiationByValuesTypedImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ArrayInstantiationByValuesTypedImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayInstantiationByValuesTypedImpl extends ArrayInstantiationByValuesImpl implements ArrayInstantiationByValuesTyped {
	/**
	 * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReference()
	 * @generated
	 * @ordered
	 */
	protected TypeReference typeReference;

	/**
	 * The cached value of the '{@link #getArrayDimensionsBefore() <em>Array Dimensions Before</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimensionsBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> arrayDimensionsBefore;

	/**
	 * The cached value of the '{@link #getArrayDimensionsAfter() <em>Array Dimensions After</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimensionsAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> arrayDimensionsAfter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayInstantiationByValuesTypedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getArrayInstantiationByValuesTyped();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getTypeReference() {
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeReference(TypeReference newTypeReference, NotificationChain msgs) {
		TypeReference oldTypeReference = typeReference;
		typeReference = newTypeReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE, oldTypeReference, newTypeReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeReference(TypeReference newTypeReference) {
		if (newTypeReference != typeReference) {
			NotificationChain msgs = null;
			if (typeReference != null)
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE, newTypeReference, newTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayDimension> getArrayDimensionsBefore() {
		if (arrayDimensionsBefore == null) {
			arrayDimensionsBefore = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE);
		}
		return arrayDimensionsBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayDimension> getArrayDimensionsAfter() {
		if (arrayDimensionsAfter == null) {
			arrayDimensionsAfter = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER);
		}
		return arrayDimensionsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE:
				return ((InternalEList<?>)getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER:
				return ((InternalEList<?>)getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE:
				return getTypeReference();
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE:
				return getArrayDimensionsBefore();
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER:
				return getArrayDimensionsAfter();
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
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE:
				setTypeReference((TypeReference)newValue);
				return;
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
				getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>)newValue);
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
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE:
				setTypeReference((TypeReference)null);
				return;
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE:
				getArrayDimensionsBefore().clear();
				return;
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER:
				getArrayDimensionsAfter().clear();
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
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE:
				return typeReference != null;
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE:
				return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
			case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER:
				return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE: return JavaPackage.TYPED_ELEMENT__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE: return JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
				case JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER: return JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case JavaPackage.TYPED_ELEMENT__TYPE_REFERENCE: return JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ArrayTypeable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE: return JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE;
				case JavaPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER: return JavaPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ArrayInstantiationByValuesTypedImpl
