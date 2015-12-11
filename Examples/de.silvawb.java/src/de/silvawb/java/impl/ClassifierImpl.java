/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Argument;
import de.silvawb.java.Classifier;
import de.silvawb.java.Contained;
import de.silvawb.java.Field;
import de.silvawb.java.InterfaceImplementation;
import de.silvawb.java.JavaPackage;

import de.silvawb.java.Method;
import de.silvawb.java.TemplateBinding;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getTemplateBindings <em>Template Bindings</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getUnderTemplateBindings <em>Under Template Bindings</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getTypingFields <em>Typing Fields</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getTypingMethods <em>Typing Methods</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getTypingArguments <em>Typing Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getInterfaceImplementations <em>Interface Implementations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl extends ContainedImpl implements Classifier {
	/**
	 * The cached value of the '{@link #getContainedElements() <em>Contained Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Contained> containedElements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplateBindings() <em>Template Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBindings;

	/**
	 * The cached value of the '{@link #getUnderTemplateBindings() <em>Under Template Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> underTemplateBindings;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getTypingFields() <em>Typing Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypingFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> typingFields;

	/**
	 * The cached value of the '{@link #getTypingMethods() <em>Typing Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypingMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> typingMethods;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getTypingArguments() <em>Typing Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypingArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> typingArguments;

	/**
	 * The cached value of the '{@link #getInterfaceImplementations() <em>Interface Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceImplementation> interfaceImplementations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contained> getContainedElements() {
		if (containedElements == null) {
			containedElements = new EObjectContainmentWithInverseEList<Contained>(Contained.class, this, JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS, JavaPackage.CONTAINED__CONTAINER);
		}
		return containedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASSIFIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBindings() {
		if (templateBindings == null) {
			templateBindings = new EObjectResolvingEList<TemplateBinding>(TemplateBinding.class, this, JavaPackage.CLASSIFIER__TEMPLATE_BINDINGS);
		}
		return templateBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getUnderTemplateBindings() {
		if (underTemplateBindings == null) {
			underTemplateBindings = new EObjectWithInverseResolvingEList<TemplateBinding>(TemplateBinding.class, this, JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS, JavaPackage.TEMPLATE_BINDING__OVER_CLASSIFIER);
		}
		return underTemplateBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<Field>(Field.class, this, JavaPackage.CLASSIFIER__FIELDS, JavaPackage.FIELD__CONTAINING_CLASSIFIER);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getTypingFields() {
		if (typingFields == null) {
			typingFields = new EObjectWithInverseResolvingEList<Field>(Field.class, this, JavaPackage.CLASSIFIER__TYPING_FIELDS, JavaPackage.FIELD__TYPE);
		}
		return typingFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getTypingMethods() {
		if (typingMethods == null) {
			typingMethods = new EObjectWithInverseResolvingEList<Method>(Method.class, this, JavaPackage.CLASSIFIER__TYPING_METHODS, JavaPackage.METHOD__RETURN_TYPE);
		}
		return typingMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<Method>(Method.class, this, JavaPackage.CLASSIFIER__METHODS, JavaPackage.METHOD__CONTAINING_CLASSIFIER);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getTypingArguments() {
		if (typingArguments == null) {
			typingArguments = new EObjectWithInverseResolvingEList<Argument>(Argument.class, this, JavaPackage.CLASSIFIER__TYPING_ARGUMENTS, JavaPackage.ARGUMENT__TYPE);
		}
		return typingArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceImplementation> getInterfaceImplementations() {
		if (interfaceImplementations == null) {
			interfaceImplementations = new EObjectContainmentWithInverseEList<InterfaceImplementation>(InterfaceImplementation.class, this, JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS, JavaPackage.INTERFACE_IMPLEMENTATION__IMPLEMENTER);
		}
		return interfaceImplementations;
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
			case JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedElements()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnderTemplateBindings()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__TYPING_FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypingFields()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__TYPING_METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypingMethods()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__TYPING_ARGUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypingArguments()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceImplementations()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS:
				return ((InternalEList<?>)getContainedElements()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS:
				return ((InternalEList<?>)getUnderTemplateBindings()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__TYPING_FIELDS:
				return ((InternalEList<?>)getTypingFields()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__TYPING_METHODS:
				return ((InternalEList<?>)getTypingMethods()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__TYPING_ARGUMENTS:
				return ((InternalEList<?>)getTypingArguments()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				return ((InternalEList<?>)getInterfaceImplementations()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS:
				return getContainedElements();
			case JavaPackage.CLASSIFIER__NAME:
				return getName();
			case JavaPackage.CLASSIFIER__TEMPLATE_BINDINGS:
				return getTemplateBindings();
			case JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS:
				return getUnderTemplateBindings();
			case JavaPackage.CLASSIFIER__FIELDS:
				return getFields();
			case JavaPackage.CLASSIFIER__TYPING_FIELDS:
				return getTypingFields();
			case JavaPackage.CLASSIFIER__TYPING_METHODS:
				return getTypingMethods();
			case JavaPackage.CLASSIFIER__METHODS:
				return getMethods();
			case JavaPackage.CLASSIFIER__TYPING_ARGUMENTS:
				return getTypingArguments();
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				return getInterfaceImplementations();
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
			case JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				getContainedElements().addAll((Collection<? extends Contained>)newValue);
				return;
			case JavaPackage.CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.CLASSIFIER__TEMPLATE_BINDINGS:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS:
				getUnderTemplateBindings().clear();
				getUnderTemplateBindings().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case JavaPackage.CLASSIFIER__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case JavaPackage.CLASSIFIER__TYPING_FIELDS:
				getTypingFields().clear();
				getTypingFields().addAll((Collection<? extends Field>)newValue);
				return;
			case JavaPackage.CLASSIFIER__TYPING_METHODS:
				getTypingMethods().clear();
				getTypingMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case JavaPackage.CLASSIFIER__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case JavaPackage.CLASSIFIER__TYPING_ARGUMENTS:
				getTypingArguments().clear();
				getTypingArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				getInterfaceImplementations().clear();
				getInterfaceImplementations().addAll((Collection<? extends InterfaceImplementation>)newValue);
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
			case JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				return;
			case JavaPackage.CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.CLASSIFIER__TEMPLATE_BINDINGS:
				getTemplateBindings().clear();
				return;
			case JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS:
				getUnderTemplateBindings().clear();
				return;
			case JavaPackage.CLASSIFIER__FIELDS:
				getFields().clear();
				return;
			case JavaPackage.CLASSIFIER__TYPING_FIELDS:
				getTypingFields().clear();
				return;
			case JavaPackage.CLASSIFIER__TYPING_METHODS:
				getTypingMethods().clear();
				return;
			case JavaPackage.CLASSIFIER__METHODS:
				getMethods().clear();
				return;
			case JavaPackage.CLASSIFIER__TYPING_ARGUMENTS:
				getTypingArguments().clear();
				return;
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				getInterfaceImplementations().clear();
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
			case JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS:
				return containedElements != null && !containedElements.isEmpty();
			case JavaPackage.CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaPackage.CLASSIFIER__TEMPLATE_BINDINGS:
				return templateBindings != null && !templateBindings.isEmpty();
			case JavaPackage.CLASSIFIER__UNDER_TEMPLATE_BINDINGS:
				return underTemplateBindings != null && !underTemplateBindings.isEmpty();
			case JavaPackage.CLASSIFIER__FIELDS:
				return fields != null && !fields.isEmpty();
			case JavaPackage.CLASSIFIER__TYPING_FIELDS:
				return typingFields != null && !typingFields.isEmpty();
			case JavaPackage.CLASSIFIER__TYPING_METHODS:
				return typingMethods != null && !typingMethods.isEmpty();
			case JavaPackage.CLASSIFIER__METHODS:
				return methods != null && !methods.isEmpty();
			case JavaPackage.CLASSIFIER__TYPING_ARGUMENTS:
				return typingArguments != null && !typingArguments.isEmpty();
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				return interfaceImplementations != null && !interfaceImplementations.isEmpty();
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
		if (baseClass == de.silvawb.java.Container.class) {
			switch (derivedFeatureID) {
				case JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS: return JavaPackage.CONTAINER__CONTAINED_ELEMENTS;
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
		if (baseClass == de.silvawb.java.Container.class) {
			switch (baseFeatureID) {
				case JavaPackage.CONTAINER__CONTAINED_ELEMENTS: return JavaPackage.CLASSIFIER__CONTAINED_ELEMENTS;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
