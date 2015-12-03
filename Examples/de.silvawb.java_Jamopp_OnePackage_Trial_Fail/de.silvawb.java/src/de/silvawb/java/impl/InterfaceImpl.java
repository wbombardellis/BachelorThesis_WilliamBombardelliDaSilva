/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Classifier;
import de.silvawb.java.ConcreteClassifier;
import de.silvawb.java.Interface;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.TypeReference;

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
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link de.silvawb.java.impl.InterfaceImpl#getDefaultExtends <em>Default Extends</em>}</li>
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
		return JavaPackage.eINSTANCE.getInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReference> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectContainmentEList<TypeReference>(TypeReference.class, this, JavaPackage.INTERFACE__EXTENDS);
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
			defaultExtends = new EObjectContainmentEList<TypeReference>(TypeReference.class, this, JavaPackage.INTERFACE__DEFAULT_EXTENDS);
		}
		return defaultExtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getAllSuperClassifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();
		
		for ( de.silvawb.java.TypeReference typeArg : this.getExtends()) {
			//use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface
			de.silvawb.java.ConcreteClassifier superInterface = ( de.silvawb.java.ConcreteClassifier) typeArg.getTarget();
			if (superInterface != null) {
				result.add(superInterface);
				if (superInterface instanceof de.silvawb.java.Interface) {
					result.addAll((( de.silvawb.java.Interface)superInterface).getAllSuperClassifiers());
				}
			}
		}
		
		for ( de.silvawb.java.TypeReference typeArg : this.getDefaultExtends()) {
			//use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface
			de.silvawb.java.ConcreteClassifier superInterface = ( de.silvawb.java.ConcreteClassifier) typeArg.getTarget();
			if (superInterface != null) {
				result.add(superInterface);
				if (superInterface instanceof de.silvawb.java.Interface) {
					result.addAll((( de.silvawb.java.Interface)superInterface).getAllSuperClassifiers());
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
			case JavaPackage.INTERFACE__EXTENDS:
				return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
			case JavaPackage.INTERFACE__DEFAULT_EXTENDS:
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
			case JavaPackage.INTERFACE__EXTENDS:
				return getExtends();
			case JavaPackage.INTERFACE__DEFAULT_EXTENDS:
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
			case JavaPackage.INTERFACE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends TypeReference>)newValue);
				return;
			case JavaPackage.INTERFACE__DEFAULT_EXTENDS:
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
			case JavaPackage.INTERFACE__EXTENDS:
				getExtends().clear();
				return;
			case JavaPackage.INTERFACE__DEFAULT_EXTENDS:
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
			case JavaPackage.INTERFACE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case JavaPackage.INTERFACE__DEFAULT_EXTENDS:
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
				case JavaPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS: return JavaPackage.INTERFACE___GET_ALL_SUPER_CLASSIFIERS;
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
			case JavaPackage.INTERFACE___GET_ALL_SUPER_CLASSIFIERS:
				return getAllSuperClassifiers();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterfaceImpl
