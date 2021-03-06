/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Classifier;
import de.silvawb.java.ConcreteClassifier;
import de.silvawb.java.Implementor;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.PrimitiveType;
import de.silvawb.java.TypeReference;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassImpl#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ConcreteClassifierImpl implements de.silvawb.java.Class {
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
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected TypeReference extends_;

	/**
	 * The cached value of the '{@link #getDefaultExtends() <em>Default Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExtends()
	 * @generated
	 * @ordered
	 */
	protected TypeReference defaultExtends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getClass_();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReference> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectContainmentEList<TypeReference>(TypeReference.class, this, JavaPackage.CLASS__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(TypeReference newExtends, NotificationChain msgs) {
		TypeReference oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(TypeReference newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CLASS__EXTENDS, null, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CLASS__EXTENDS, null, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getDefaultExtends() {
		return defaultExtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultExtends(TypeReference newDefaultExtends, NotificationChain msgs) {
		TypeReference oldDefaultExtends = defaultExtends;
		defaultExtends = newDefaultExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__DEFAULT_EXTENDS, oldDefaultExtends, newDefaultExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultExtends(TypeReference newDefaultExtends) {
		if (newDefaultExtends != defaultExtends) {
			NotificationChain msgs = null;
			if (defaultExtends != null)
				msgs = ((InternalEObject)defaultExtends).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CLASS__DEFAULT_EXTENDS, null, msgs);
			if (newDefaultExtends != null)
				msgs = ((InternalEObject)newDefaultExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CLASS__DEFAULT_EXTENDS, null, msgs);
			msgs = basicSetDefaultExtends(newDefaultExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS__DEFAULT_EXTENDS, newDefaultExtends, newDefaultExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getAllSuperClassifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = 
			new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();
					
		//collects all superclasses first
		de.silvawb.java.Class superClass = this;
		while (superClass != null && !superClass.eIsProxy() && 
				!superClass.equals(getObjectClass())) {
			superClass = superClass.getSuperClass();
			if (superClass != null) {
				result.add(superClass);
			}
		}
		
		//collect all implemented interfaces
		for ( de.silvawb.java.TypeReference typeArg : this.getImplements()) {
			de.silvawb.java.ConcreteClassifier superInterface = ( de.silvawb.java.ConcreteClassifier) typeArg.getTarget();
			if (superInterface != null) {
				result.add(superInterface);
				if (superInterface instanceof de.silvawb.java.Interface) {
					result.addAll((( de.silvawb.java.Interface)superInterface).getAllSuperClassifiers());
				}
			}
		}
		
		//collect all implemented interfaces of super classes
		superClass = this.getSuperClass();	
		if (superClass != null && !superClass.eIsProxy() && 
				!superClass.equals(getObjectClass())) {
			result.addAll(superClass.getAllSuperClassifiers());
		}	
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.silvawb.java.Class getSuperClass() {
		de.silvawb.java.TypeReference superClassReference = this.getExtends();
		if (superClassReference == null) {
			superClassReference = this.getDefaultExtends();
		}
		if (superClassReference == null) {
			return null;
		}
		de.silvawb.java.Type result = superClassReference.getTarget();
		if (result instanceof de.silvawb.java.Class) {
			return ( de.silvawb.java.Class) result;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType unWrapPrimitiveType() {
		if (getLibClass("Boolean").equals(this)) {
			return de.silvawb.java.TypesFactory.eINSTANCE.createBoolean();
		}
		if (getLibClass("Byte").equals(this)) {
			return de.silvawb.java.TypesFactory.eINSTANCE.createByte();
		}
		if (getLibClass("Character").equals(this)) {
			return de.silvawb.java.TypesFactory.eINSTANCE.createChar();
		}
		if (getLibClass("Float").equals(this)) {
			return de.silvawb.java.TypesFactory.eINSTANCE.createFloat();
		}
		if (getLibClass("Double").equals(this)) {
			return de.silvawb.java.TypesFactory.eINSTANCE.createDouble();
		}
		if (getLibClass("Integer").equals(this)) {
			return de.silvawb.java.TypesFactory.eINSTANCE.createInt();
		}
		if (getLibClass("Long").equals(this)) {
			return de.silvawb.java.TypesFactory.eINSTANCE.createLong();
		}
		if (getLibClass("Short").equals(this)) {
			return de.silvawb.java.TypesFactory.eINSTANCE.createShort();
		}
		if (getLibClass("Void").equals(this)) {
			return de.silvawb.java.TypesFactory.eINSTANCE.createVoid();
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
			case JavaPackage.CLASS__IMPLEMENTS:
				return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASS__EXTENDS:
				return basicSetExtends(null, msgs);
			case JavaPackage.CLASS__DEFAULT_EXTENDS:
				return basicSetDefaultExtends(null, msgs);
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
			case JavaPackage.CLASS__IMPLEMENTS:
				return getImplements();
			case JavaPackage.CLASS__EXTENDS:
				return getExtends();
			case JavaPackage.CLASS__DEFAULT_EXTENDS:
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
			case JavaPackage.CLASS__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends TypeReference>)newValue);
				return;
			case JavaPackage.CLASS__EXTENDS:
				setExtends((TypeReference)newValue);
				return;
			case JavaPackage.CLASS__DEFAULT_EXTENDS:
				setDefaultExtends((TypeReference)newValue);
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
			case JavaPackage.CLASS__IMPLEMENTS:
				getImplements().clear();
				return;
			case JavaPackage.CLASS__EXTENDS:
				setExtends((TypeReference)null);
				return;
			case JavaPackage.CLASS__DEFAULT_EXTENDS:
				setDefaultExtends((TypeReference)null);
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
			case JavaPackage.CLASS__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case JavaPackage.CLASS__EXTENDS:
				return extends_ != null;
			case JavaPackage.CLASS__DEFAULT_EXTENDS:
				return defaultExtends != null;
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
				case JavaPackage.CLASS__IMPLEMENTS: return JavaPackage.IMPLEMENTOR__IMPLEMENTS;
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
				case JavaPackage.IMPLEMENTOR__IMPLEMENTS: return JavaPackage.CLASS__IMPLEMENTS;
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
				case JavaPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS: return JavaPackage.CLASS___GET_ALL_SUPER_CLASSIFIERS;
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
			case JavaPackage.CLASS___GET_ALL_SUPER_CLASSIFIERS:
				return getAllSuperClassifiers();
			case JavaPackage.CLASS___GET_SUPER_CLASS:
				return getSuperClass();
			case JavaPackage.CLASS___UN_WRAP_PRIMITIVE_TYPE:
				return unWrapPrimitiveType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClassImpl
