/**
 */
package de.silvawb.java.annotations.impl;

import de.silvawb.java.annotations.AnnotationInstance;
import de.silvawb.java.annotations.AnnotationParameter;
import de.silvawb.java.annotations.AnnotationsPackage;

import de.silvawb.java.classifiers.Classifier;
import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.CommonsPackage;
import de.silvawb.java.commons.NamespaceAwareElement;

import de.silvawb.java.modifiers.AnnotationInstanceOrModifier;

import de.silvawb.java.references.impl.ReferenceImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.annotations.impl.AnnotationInstanceImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link de.silvawb.java.annotations.impl.AnnotationInstanceImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.silvawb.java.annotations.impl.AnnotationInstanceImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationInstanceImpl extends ReferenceImpl implements AnnotationInstance {
	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> namespaces;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Classifier annotation;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected AnnotationParameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.ANNOTATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EDataTypeEList<String>(String.class, this, AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getAnnotation() {
		if (annotation != null && annotation.eIsProxy()) {
			InternalEObject oldAnnotation = (InternalEObject)annotation;
			annotation = (Classifier)eResolveProxy(oldAnnotation);
			if (annotation != oldAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION, oldAnnotation, annotation));
			}
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(Classifier newAnnotation) {
		Classifier oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationParameter getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(AnnotationParameter newParameter, NotificationChain msgs) {
		AnnotationParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, oldParameter, newParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(AnnotationParameter newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespacesAsString() {
		java.lang.String containerName = ""; 
		for( java.util.Iterator< java.lang.String> it = getNamespaces().iterator(); it.hasNext(); ) {
			java.lang.String namespaceFragment = it.next();
			//does it point at a classifier or a package as container?
			java.lang.String assumedPackageName    = containerName + namespaceFragment + org.emftext.language.java.JavaUniquePathConstructor.PACKAGE_SEPARATOR;
			java.lang.String assumedClassifierName = containerName + namespaceFragment + org.emftext.language.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR;
			
			if (it.hasNext()) {
				if ( org.emftext.language.java.JavaClasspath.get(this).existsPackage(assumedClassifierName)) {
					containerName = assumedClassifierName;
				}
				else {
					//assume package
					containerName = assumedPackageName;
				}
			}
			else {
				if ( org.emftext.language.java.JavaClasspath.get(this).existsPackage(assumedPackageName)) {
					//a package is always available as key
					containerName = assumedPackageName;
				}
				else {
					//assume classifier that is not key, but value in the map
					containerName = assumedClassifierName;
				}
			}
		}
		
		return containerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifier getClassifierAtNamespaces() {
		java.lang.String fullQualifiedName = getNamespacesAsString();
		if (fullQualifiedName == null || fullQualifiedName.endsWith( org.emftext.language.java.JavaUniquePathConstructor.PACKAGE_SEPARATOR)) {
			return null;
		}
		//cut the trailing separator
		fullQualifiedName = fullQualifiedName.substring(0,fullQualifiedName.length() - 1);
		
		return ( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
				getConcreteClassifierProxy(fullQualifiedName), this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				return basicSetParameter(null, msgs);
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
			case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
				return getNamespaces();
			case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
				if (resolve) return getAnnotation();
				return basicGetAnnotation();
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				return getParameter();
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
			case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends String>)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
				setAnnotation((Classifier)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				setParameter((AnnotationParameter)newValue);
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
			case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
				getNamespaces().clear();
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
				setAnnotation((Classifier)null);
				return;
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				setParameter((AnnotationParameter)null);
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
			case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION:
				return annotation != null;
			case AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER:
				return parameter != null;
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
		if (baseClass == AnnotationInstanceOrModifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamespaceAwareElement.class) {
			switch (derivedFeatureID) {
				case AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES: return CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;
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
		if (baseClass == AnnotationInstanceOrModifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamespaceAwareElement.class) {
			switch (baseFeatureID) {
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES: return AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES;
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
		if (baseClass == AnnotationInstanceOrModifier.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == NamespaceAwareElement.class) {
			switch (baseOperationID) {
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING: return AnnotationsPackage.ANNOTATION_INSTANCE___GET_NAMESPACES_AS_STRING;
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES: return AnnotationsPackage.ANNOTATION_INSTANCE___GET_CLASSIFIER_AT_NAMESPACES;
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
			case AnnotationsPackage.ANNOTATION_INSTANCE___GET_NAMESPACES_AS_STRING:
				return getNamespacesAsString();
			case AnnotationsPackage.ANNOTATION_INSTANCE___GET_CLASSIFIER_AT_NAMESPACES:
				return getClassifierAtNamespaces();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (namespaces: ");
		result.append(namespaces);
		result.append(')');
		return result.toString();
	}

} //AnnotationInstanceImpl
