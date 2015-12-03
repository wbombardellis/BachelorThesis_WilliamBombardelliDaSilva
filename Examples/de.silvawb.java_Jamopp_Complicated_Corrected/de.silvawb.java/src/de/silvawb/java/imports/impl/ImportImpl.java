/**
 */
package de.silvawb.java.imports.impl;

import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.NamedElement;

import de.silvawb.java.commons.impl.NamespaceAwareElementImpl;

import de.silvawb.java.imports.Import;
import de.silvawb.java.imports.ImportsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ImportImpl extends NamespaceAwareElementImpl implements Import {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportsPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClassifier getImportedClassifier(final String name) {
		java.lang.String containerName = getNamespacesAsString();
		if (containerName == null) {
			return null;
		}
		
		java.lang.String fullQualifiedName = containerName + name;
		return getConcreteClassifierProxy(fullQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getImportedClassifiers() {
		java.lang.String containerName = getNamespacesAsString();
		if (containerName == null) {
			return org.eclipse.emf.common.util.ECollections.emptyEList();
		}
		
		return getConcreteClassifierProxies(containerName, "*");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getImportedMembers() {
		de.silvawb.java.classifiers.ConcreteClassifier concreteClassifier = getClassifierAtNamespaces();
		
		if(concreteClassifier == null || concreteClassifier.eIsProxy()) {
			return org.eclipse.emf.common.util.ECollections.emptyEList();
		}
		
		org.eclipse.emf.common.util.EList< de.silvawb.java.commons.NamedElement> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.commons.NamedElement>();
		result.addAll(concreteClassifier.getAllMembers(this));
		if (concreteClassifier instanceof de.silvawb.java.classifiers.Enumeration) {
			result.addAll((( de.silvawb.java.classifiers.Enumeration)concreteClassifier).getConstants());
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImportsPackage.IMPORT___GET_IMPORTED_CLASSIFIER__STRING:
				return getImportedClassifier((String)arguments.get(0));
			case ImportsPackage.IMPORT___GET_IMPORTED_CLASSIFIERS:
				return getImportedClassifiers();
			case ImportsPackage.IMPORT___GET_IMPORTED_MEMBERS:
				return getImportedMembers();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImportImpl
