/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Annotable;
import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.AnonymousClass;
import de.silvawb.java.Argumentable;
import de.silvawb.java.EnumConstant;
import de.silvawb.java.Expression;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Type;

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
 * An implementation of the model object '<em><b>Enum Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.EnumConstantImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.impl.EnumConstantImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.silvawb.java.impl.EnumConstantImpl#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumConstantImpl extends ReferenceableElementImpl implements EnumConstant {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstance> annotations;

	/**
	 * The cached value of the '{@link #getAnonymousClass() <em>Anonymous Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClass()
	 * @generated
	 * @ordered
	 */
	protected AnonymousClass anonymousClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getEnumConstant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, JavaPackage.ENUM_CONSTANT__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationInstance> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<AnnotationInstance>(AnnotationInstance.class, this, JavaPackage.ENUM_CONSTANT__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClass getAnonymousClass() {
		return anonymousClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousClass(AnonymousClass newAnonymousClass, NotificationChain msgs) {
		AnonymousClass oldAnonymousClass = anonymousClass;
		anonymousClass = newAnonymousClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, oldAnonymousClass, newAnonymousClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousClass(AnonymousClass newAnonymousClass) {
		if (newAnonymousClass != anonymousClass) {
			NotificationChain msgs = null;
			if (anonymousClass != null)
				msgs = ((InternalEObject)anonymousClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, null, msgs);
			if (newAnonymousClass != null)
				msgs = ((InternalEObject)newAnonymousClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, null, msgs);
			msgs = basicSetAnonymousClass(newAnonymousClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, newAnonymousClass, newAnonymousClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getArgumentTypes() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.Type> resultList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Type>();
		
		for( de.silvawb.java.Expression exp : getArguments()) {
			de.silvawb.java.Type type = exp.getType();
			resultList.add(type);
		}
		return resultList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ENUM_CONSTANT__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case JavaPackage.ENUM_CONSTANT__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case JavaPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
				return basicSetAnonymousClass(null, msgs);
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
			case JavaPackage.ENUM_CONSTANT__ARGUMENTS:
				return getArguments();
			case JavaPackage.ENUM_CONSTANT__ANNOTATIONS:
				return getAnnotations();
			case JavaPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
				return getAnonymousClass();
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
			case JavaPackage.ENUM_CONSTANT__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case JavaPackage.ENUM_CONSTANT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends AnnotationInstance>)newValue);
				return;
			case JavaPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
				setAnonymousClass((AnonymousClass)newValue);
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
			case JavaPackage.ENUM_CONSTANT__ARGUMENTS:
				getArguments().clear();
				return;
			case JavaPackage.ENUM_CONSTANT__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case JavaPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
				setAnonymousClass((AnonymousClass)null);
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
			case JavaPackage.ENUM_CONSTANT__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case JavaPackage.ENUM_CONSTANT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case JavaPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
				return anonymousClass != null;
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
		if (baseClass == Argumentable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ENUM_CONSTANT__ARGUMENTS: return JavaPackage.ARGUMENTABLE__ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Annotable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.ENUM_CONSTANT__ANNOTATIONS: return JavaPackage.ANNOTABLE__ANNOTATIONS;
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
		if (baseClass == Argumentable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ARGUMENTABLE__ARGUMENTS: return JavaPackage.ENUM_CONSTANT__ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == Annotable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ANNOTABLE__ANNOTATIONS: return JavaPackage.ENUM_CONSTANT__ANNOTATIONS;
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
		if (baseClass == Argumentable.class) {
			switch (baseOperationID) {
				case JavaPackage.ARGUMENTABLE___GET_ARGUMENT_TYPES: return JavaPackage.ENUM_CONSTANT___GET_ARGUMENT_TYPES;
				default: return -1;
			}
		}
		if (baseClass == Annotable.class) {
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
			case JavaPackage.ENUM_CONSTANT___GET_ARGUMENT_TYPES:
				return getArgumentTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnumConstantImpl
