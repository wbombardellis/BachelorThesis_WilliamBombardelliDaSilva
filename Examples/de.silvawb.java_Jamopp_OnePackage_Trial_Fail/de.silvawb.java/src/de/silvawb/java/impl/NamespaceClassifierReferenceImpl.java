/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.ClassifierReference;
import de.silvawb.java.ConcreteClassifier;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.NamespaceAwareElement;
import de.silvawb.java.NamespaceClassifierReference;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.NamespaceClassifierReferenceImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link de.silvawb.java.impl.NamespaceClassifierReferenceImpl#getClassifierReferences <em>Classifier References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceClassifierReferenceImpl extends TypeReferenceImpl implements NamespaceClassifierReference {
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
	 * The cached value of the '{@link #getClassifierReferences() <em>Classifier References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassifierReference> classifierReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceClassifierReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getNamespaceClassifierReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EDataTypeEList<String>(String.class, this, JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassifierReference> getClassifierReferences() {
		if (classifierReferences == null) {
			classifierReferences = new EObjectContainmentEList<ClassifierReference>(ClassifierReference.class, this, JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES);
		}
		return classifierReferences;
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
			java.lang.String assumedPackageName    = containerName + namespaceFragment + de.silvawb.java.PACKAGE_SEPARATOR;
			java.lang.String assumedClassifierName = containerName + namespaceFragment + de.silvawb.java.CLASSIFIER_SEPARATOR;
			
			if (it.hasNext()) {
				if ( de.silvawb.java.get(this).existsPackage(assumedClassifierName)) {
					containerName = assumedClassifierName;
				}
				else {
					//assume package
					containerName = assumedPackageName;
				}
			}
			else {
				if ( de.silvawb.java.get(this).existsPackage(assumedPackageName)) {
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
		if (fullQualifiedName == null || fullQualifiedName.endsWith( de.silvawb.java.PACKAGE_SEPARATOR)) {
			return null;
		}
		//cut the trailing separator
		fullQualifiedName = fullQualifiedName.substring(0,fullQualifiedName.length() - 1);
		
		return ( de.silvawb.java.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
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
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
				return ((InternalEList<?>)getClassifierReferences()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES:
				return getNamespaces();
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
				return getClassifierReferences();
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
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends String>)newValue);
				return;
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
				getClassifierReferences().clear();
				getClassifierReferences().addAll((Collection<? extends ClassifierReference>)newValue);
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
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES:
				getNamespaces().clear();
				return;
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
				getClassifierReferences().clear();
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
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES:
				return classifierReferences != null && !classifierReferences.isEmpty();
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
		if (baseClass == NamespaceAwareElement.class) {
			switch (derivedFeatureID) {
				case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES: return JavaPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;
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
		if (baseClass == NamespaceAwareElement.class) {
			switch (baseFeatureID) {
				case JavaPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES: return JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES;
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
		if (baseClass == NamespaceAwareElement.class) {
			switch (baseOperationID) {
				case JavaPackage.NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING: return JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE___GET_NAMESPACES_AS_STRING;
				case JavaPackage.NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES: return JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE___GET_CLASSIFIER_AT_NAMESPACES;
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
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE___GET_NAMESPACES_AS_STRING:
				return getNamespacesAsString();
			case JavaPackage.NAMESPACE_CLASSIFIER_REFERENCE___GET_CLASSIFIER_AT_NAMESPACES:
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

} //NamespaceClassifierReferenceImpl
