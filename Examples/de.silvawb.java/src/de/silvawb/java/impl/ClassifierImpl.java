/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Annotable;
import de.silvawb.java.AnnotationInstance;
import de.silvawb.java.Classifier;
import de.silvawb.java.Contained;
import de.silvawb.java.Field;
import de.silvawb.java.Generalization;
import de.silvawb.java.GenericBinding;
import de.silvawb.java.Import;
import de.silvawb.java.InterfaceImplementation;
import de.silvawb.java.JavaPackage;

import de.silvawb.java.Method;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getAnnotationInstances <em>Annotation Instances</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getGenericBindings <em>Generic Bindings</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getInterfaceImplementations <em>Interface Implementations</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link de.silvawb.java.impl.ClassifierImpl#getImports <em>Imports</em>}</li>
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
	 * The cached value of the '{@link #getAnnotationInstances() <em>Annotation Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationInstance> annotationInstances;

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
	 * The cached value of the '{@link #getGenericBindings() <em>Generic Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericBinding> genericBindings;

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
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

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
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected Generalization generalization;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

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
	public EList<AnnotationInstance> getAnnotationInstances() {
		if (annotationInstances == null) {
			annotationInstances = new EObjectContainmentWithInverseEList<AnnotationInstance>(AnnotationInstance.class, this, JavaPackage.CLASSIFIER__ANNOTATION_INSTANCES, JavaPackage.ANNOTATION_INSTANCE__ANNOTABLE);
		}
		return annotationInstances;
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
	public EList<GenericBinding> getGenericBindings() {
		if (genericBindings == null) {
			genericBindings = new EObjectContainmentWithInverseEList<GenericBinding>(GenericBinding.class, this, JavaPackage.CLASSIFIER__GENERIC_BINDINGS, JavaPackage.GENERIC_BINDING__USING_CLASSIFIER);
		}
		return genericBindings;
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
	public Generalization getGeneralization() {
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralization(Generalization newGeneralization, NotificationChain msgs) {
		Generalization oldGeneralization = generalization;
		generalization = newGeneralization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CLASSIFIER__GENERALIZATION, oldGeneralization, newGeneralization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralization(Generalization newGeneralization) {
		if (newGeneralization != generalization) {
			NotificationChain msgs = null;
			if (generalization != null)
				msgs = ((InternalEObject)generalization).eInverseRemove(this, JavaPackage.GENERALIZATION__GENERALIZATOR, Generalization.class, msgs);
			if (newGeneralization != null)
				msgs = ((InternalEObject)newGeneralization).eInverseAdd(this, JavaPackage.GENERALIZATION__GENERALIZATOR, Generalization.class, msgs);
			msgs = basicSetGeneralization(newGeneralization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASSIFIER__GENERALIZATION, newGeneralization, newGeneralization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentWithInverseEList<Import>(Import.class, this, JavaPackage.CLASSIFIER__IMPORTS, JavaPackage.IMPORT__IMPORTING);
		}
		return imports;
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
			case JavaPackage.CLASSIFIER__ANNOTATION_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotationInstances()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__GENERIC_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenericBindings()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceImplementations()).basicAdd(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__GENERALIZATION:
				if (generalization != null)
					msgs = ((InternalEObject)generalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CLASSIFIER__GENERALIZATION, null, msgs);
				return basicSetGeneralization((Generalization)otherEnd, msgs);
			case JavaPackage.CLASSIFIER__IMPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImports()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.CLASSIFIER__ANNOTATION_INSTANCES:
				return ((InternalEList<?>)getAnnotationInstances()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__GENERIC_BINDINGS:
				return ((InternalEList<?>)getGenericBindings()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				return ((InternalEList<?>)getInterfaceImplementations()).basicRemove(otherEnd, msgs);
			case JavaPackage.CLASSIFIER__GENERALIZATION:
				return basicSetGeneralization(null, msgs);
			case JavaPackage.CLASSIFIER__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.CLASSIFIER__ANNOTATION_INSTANCES:
				return getAnnotationInstances();
			case JavaPackage.CLASSIFIER__NAME:
				return getName();
			case JavaPackage.CLASSIFIER__GENERIC_BINDINGS:
				return getGenericBindings();
			case JavaPackage.CLASSIFIER__FIELDS:
				return getFields();
			case JavaPackage.CLASSIFIER__METHODS:
				return getMethods();
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				return getInterfaceImplementations();
			case JavaPackage.CLASSIFIER__GENERALIZATION:
				return getGeneralization();
			case JavaPackage.CLASSIFIER__IMPORTS:
				return getImports();
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
			case JavaPackage.CLASSIFIER__ANNOTATION_INSTANCES:
				getAnnotationInstances().clear();
				getAnnotationInstances().addAll((Collection<? extends AnnotationInstance>)newValue);
				return;
			case JavaPackage.CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.CLASSIFIER__GENERIC_BINDINGS:
				getGenericBindings().clear();
				getGenericBindings().addAll((Collection<? extends GenericBinding>)newValue);
				return;
			case JavaPackage.CLASSIFIER__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case JavaPackage.CLASSIFIER__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				getInterfaceImplementations().clear();
				getInterfaceImplementations().addAll((Collection<? extends InterfaceImplementation>)newValue);
				return;
			case JavaPackage.CLASSIFIER__GENERALIZATION:
				setGeneralization((Generalization)newValue);
				return;
			case JavaPackage.CLASSIFIER__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
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
			case JavaPackage.CLASSIFIER__ANNOTATION_INSTANCES:
				getAnnotationInstances().clear();
				return;
			case JavaPackage.CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.CLASSIFIER__GENERIC_BINDINGS:
				getGenericBindings().clear();
				return;
			case JavaPackage.CLASSIFIER__FIELDS:
				getFields().clear();
				return;
			case JavaPackage.CLASSIFIER__METHODS:
				getMethods().clear();
				return;
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				getInterfaceImplementations().clear();
				return;
			case JavaPackage.CLASSIFIER__GENERALIZATION:
				setGeneralization((Generalization)null);
				return;
			case JavaPackage.CLASSIFIER__IMPORTS:
				getImports().clear();
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
			case JavaPackage.CLASSIFIER__ANNOTATION_INSTANCES:
				return annotationInstances != null && !annotationInstances.isEmpty();
			case JavaPackage.CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaPackage.CLASSIFIER__GENERIC_BINDINGS:
				return genericBindings != null && !genericBindings.isEmpty();
			case JavaPackage.CLASSIFIER__FIELDS:
				return fields != null && !fields.isEmpty();
			case JavaPackage.CLASSIFIER__METHODS:
				return methods != null && !methods.isEmpty();
			case JavaPackage.CLASSIFIER__INTERFACE_IMPLEMENTATIONS:
				return interfaceImplementations != null && !interfaceImplementations.isEmpty();
			case JavaPackage.CLASSIFIER__GENERALIZATION:
				return generalization != null;
			case JavaPackage.CLASSIFIER__IMPORTS:
				return imports != null && !imports.isEmpty();
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
		if (baseClass == Annotable.class) {
			switch (derivedFeatureID) {
				case JavaPackage.CLASSIFIER__ANNOTATION_INSTANCES: return JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES;
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
		if (baseClass == Annotable.class) {
			switch (baseFeatureID) {
				case JavaPackage.ANNOTABLE__ANNOTATION_INSTANCES: return JavaPackage.CLASSIFIER__ANNOTATION_INSTANCES;
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
