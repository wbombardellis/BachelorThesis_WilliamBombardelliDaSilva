/**
 */
package de.silvawb.java.classifiers.impl;

import de.silvawb.java.classifiers.Classifier;
import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.ConcreteClassifier;
import de.silvawb.java.classifiers.Interface;

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
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.classifiers.impl.InterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link de.silvawb.java.classifiers.impl.InterfaceImpl#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends ConcreteClassifierImpl implements Interface {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> extends_;

	/**
	 * The cached value of the '{@link #getDefaultExtends() <em>Default Extends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> defaultExtends;

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
		return ClassifiersPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReference> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectContainmentEList<TypeReference>(TypeReference.class, this, ClassifiersPackage.INTERFACE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReference> getDefaultExtends() {
		if (defaultExtends == null) {
			defaultExtends = new EObjectContainmentEList<TypeReference>(TypeReference.class, this, ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS);
		}
		return defaultExtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getAllSuperClassifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		
		for ( de.silvawb.java.types.TypeReference typeArg : this.getExtends()) {
			//use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface
			de.silvawb.java.classifiers.ConcreteClassifier superInterface = ( de.silvawb.java.classifiers.ConcreteClassifier) typeArg.getTarget();
			if (superInterface != null) {
				result.add(superInterface);
				if (superInterface instanceof de.silvawb.java.classifiers.Interface) {
					result.addAll((( de.silvawb.java.classifiers.Interface)superInterface).getAllSuperClassifiers());
				}
			}
		}
		
		for ( de.silvawb.java.types.TypeReference typeArg : this.getDefaultExtends()) {
			//use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassifiersPackage.INTERFACE__EXTENDS:
				return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
			case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
				return ((InternalEList<?>)getDefaultExtends()).basicRemove(otherEnd, msgs);
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
			case ClassifiersPackage.INTERFACE__EXTENDS:
				return getExtends();
			case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
				return getDefaultExtends();
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
			case ClassifiersPackage.INTERFACE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends TypeReference>)newValue);
				return;
			case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
				getDefaultExtends().clear();
				getDefaultExtends().addAll((Collection<? extends TypeReference>)newValue);
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
			case ClassifiersPackage.INTERFACE__EXTENDS:
				getExtends().clear();
				return;
			case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
				getDefaultExtends().clear();
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
			case ClassifiersPackage.INTERFACE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
				return defaultExtends != null && !defaultExtends.isEmpty();
		}
		return super.eIsSet(featureID);
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
				case ClassifiersPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS: return ClassifiersPackage.INTERFACE___GET_ALL_SUPER_CLASSIFIERS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case ClassifiersPackage.INTERFACE___GET_ALL_SUPER_CLASSIFIERS:
				return getAllSuperClassifiers();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterfaceImpl
