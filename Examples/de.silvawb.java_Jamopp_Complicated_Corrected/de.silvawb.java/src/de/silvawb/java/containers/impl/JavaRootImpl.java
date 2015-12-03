/**
 */
package de.silvawb.java.containers.impl;

import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.CommonsPackage;
import de.silvawb.java.commons.NamespaceAwareElement;

import de.silvawb.java.commons.impl.NamedElementImpl;

import de.silvawb.java.containers.ContainersPackage;
import de.silvawb.java.containers.JavaRoot;

import de.silvawb.java.imports.Import;
import de.silvawb.java.imports.ImportingElement;
import de.silvawb.java.imports.ImportsPackage;

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
 * An implementation of the model object '<em><b>Java Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.containers.impl.JavaRootImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link de.silvawb.java.containers.impl.JavaRootImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JavaRootImpl extends NamedElementImpl implements JavaRoot {
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
	protected JavaRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.JAVA_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EDataTypeEList<String>(String.class, this, ContainersPackage.JAVA_ROOT__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, ContainersPackage.JAVA_ROOT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getClassifiersInSamePackage() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> defaultImportList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		
		java.lang.String packageName = getNamespacesAsString();
		
		defaultImportList.addAll(getConcreteClassifierProxies(
				packageName, "*"));
		
		return defaultImportList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getDefaultImports() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		for( org.eclipse.emf.ecore.EObject classifier : org.emftext.language.java.JavaClasspath.get(this).getDefaultImports()) {
			result.add(( de.silvawb.java.classifiers.ConcreteClassifier)classifier);
		}
		return result;
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
			case ContainersPackage.JAVA_ROOT__IMPORTS:
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
			case ContainersPackage.JAVA_ROOT__NAMESPACES:
				return getNamespaces();
			case ContainersPackage.JAVA_ROOT__IMPORTS:
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
			case ContainersPackage.JAVA_ROOT__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends String>)newValue);
				return;
			case ContainersPackage.JAVA_ROOT__IMPORTS:
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
			case ContainersPackage.JAVA_ROOT__NAMESPACES:
				getNamespaces().clear();
				return;
			case ContainersPackage.JAVA_ROOT__IMPORTS:
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
			case ContainersPackage.JAVA_ROOT__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case ContainersPackage.JAVA_ROOT__IMPORTS:
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
		if (baseClass == NamespaceAwareElement.class) {
			switch (derivedFeatureID) {
				case ContainersPackage.JAVA_ROOT__NAMESPACES: return CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;
				default: return -1;
			}
		}
		if (baseClass == ImportingElement.class) {
			switch (derivedFeatureID) {
				case ContainersPackage.JAVA_ROOT__IMPORTS: return ImportsPackage.IMPORTING_ELEMENT__IMPORTS;
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
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES: return ContainersPackage.JAVA_ROOT__NAMESPACES;
				default: return -1;
			}
		}
		if (baseClass == ImportingElement.class) {
			switch (baseFeatureID) {
				case ImportsPackage.IMPORTING_ELEMENT__IMPORTS: return ContainersPackage.JAVA_ROOT__IMPORTS;
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
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_NAMESPACES_AS_STRING: return ContainersPackage.JAVA_ROOT___GET_NAMESPACES_AS_STRING;
				case CommonsPackage.NAMESPACE_AWARE_ELEMENT___GET_CLASSIFIER_AT_NAMESPACES: return ContainersPackage.JAVA_ROOT___GET_CLASSIFIER_AT_NAMESPACES;
				default: return -1;
			}
		}
		if (baseClass == ImportingElement.class) {
			switch (baseOperationID) {
				case ImportsPackage.IMPORTING_ELEMENT___GET_DEFAULT_IMPORTS: return ContainersPackage.JAVA_ROOT___GET_DEFAULT_IMPORTS;
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
			case ContainersPackage.JAVA_ROOT___GET_CLASSIFIERS_IN_SAME_PACKAGE:
				return getClassifiersInSamePackage();
			case ContainersPackage.JAVA_ROOT___GET_DEFAULT_IMPORTS:
				return getDefaultImports();
			case ContainersPackage.JAVA_ROOT___GET_NAMESPACES_AS_STRING:
				return getNamespacesAsString();
			case ContainersPackage.JAVA_ROOT___GET_CLASSIFIER_AT_NAMESPACES:
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

} //JavaRootImpl
