/**
 */
package de.silvawb.java.classifiers.impl;

import de.silvawb.java.classifiers.Classifier;
import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.ConcreteClassifier;
import de.silvawb.java.classifiers.Enumeration;
import de.silvawb.java.classifiers.Implementor;

import de.silvawb.java.members.EnumConstant;

import de.silvawb.java.types.TypeReference;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.classifiers.impl.EnumerationImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link de.silvawb.java.classifiers.impl.EnumerationImpl#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends ConcreteClassifierImpl implements Enumeration {
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> implements_;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumConstant> constants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassifiersPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReference> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectContainmentEList<TypeReference>(TypeReference.class, this, ClassifiersPackage.ENUMERATION__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumConstant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList<EnumConstant>(EnumConstant.class, this, ClassifiersPackage.ENUMERATION__CONSTANTS);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getAllSuperClassifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		
		//enumerations inherit from java.lang.Enum
		de.silvawb.java.classifiers.Class enumClass = getLibClass("Enum");
		result.add(enumClass);
		result.addAll(enumClass.getAllSuperClassifiers());
		
		//collect all implemented interfaces
		for ( de.silvawb.java.types.TypeReference typeArg : this.getImplements()) {
			de.silvawb.java.classifiers.ConcreteClassifier superInterface = ( de.silvawb.java.classifiers.ConcreteClassifier) typeArg.getTarget();
			if (superInterface != null) {
				result.add(superInterface);
				if (superInterface instanceof de.silvawb.java.classifiers.Interface) {
					result.addAll((( de.silvawb.java.classifiers.Interface)superInterface).getAllSuperClassifiers());
				}
			}
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstant getContainedConstant(final String name) {
		for( de.silvawb.java.members.EnumConstant constant : getConstants()) {
			if (name.equals(constant.getName())) {
				return constant;
			}
		 		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
				return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
			case ClassifiersPackage.ENUMERATION__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
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
			case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
				return getImplements();
			case ClassifiersPackage.ENUMERATION__CONSTANTS:
				return getConstants();
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
			case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends TypeReference>)newValue);
				return;
			case ClassifiersPackage.ENUMERATION__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends EnumConstant>)newValue);
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
			case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
				getImplements().clear();
				return;
			case ClassifiersPackage.ENUMERATION__CONSTANTS:
				getConstants().clear();
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
			case ClassifiersPackage.ENUMERATION__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case ClassifiersPackage.ENUMERATION__CONSTANTS:
				return constants != null && !constants.isEmpty();
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
		if (baseClass == Implementor.class) {
			switch (derivedFeatureID) {
				case ClassifiersPackage.ENUMERATION__IMPLEMENTS: return ClassifiersPackage.IMPLEMENTOR__IMPLEMENTS;
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
		if (baseClass == Implementor.class) {
			switch (baseFeatureID) {
				case ClassifiersPackage.IMPLEMENTOR__IMPLEMENTS: return ClassifiersPackage.ENUMERATION__IMPLEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Classifier.class) {
			switch (baseOperationID) {
				case ClassifiersPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS: return ClassifiersPackage.ENUMERATION___GET_ALL_SUPER_CLASSIFIERS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Implementor.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassifiersPackage.ENUMERATION___GET_ALL_SUPER_CLASSIFIERS:
				return getAllSuperClassifiers();
			case ClassifiersPackage.ENUMERATION___GET_CONTAINED_CONSTANT__STRING:
				return getContainedConstant((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnumerationImpl
