/**
 */
package de.silvawb.java.imports;

import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.NamedElement;
import de.silvawb.java.commons.NamespaceAwareElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.imports.ImportsPackage#getImport()
 * @model abstract="true"
 * @generated
 */
public interface Import extends NamespaceAwareElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns the classifier with the given name 
	 *  located in the namespace defined by the import.
	 *  
	 *  @param name the name of the classifier
	 *  @return imported classifier (proxy)
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String containerName = getNamespacesAsString();\nif (containerName == null) {\n\treturn null;\n}\n\njava.lang.String fullQualifiedName = containerName + name;\nreturn getConcreteClassifierProxy(fullQualifiedName);'"
	 * @generated
	 */
	ConcreteClassifier getImportedClassifier(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns a list of imported classifiers assuming the import's namespace
	 *  identifies a package.
	 *  
	 *  @param _this 
	 *  @return imported classifier (proxy)
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String containerName = getNamespacesAsString();\nif (containerName == null) {\n\treturn org.eclipse.emf.common.util.ECollections.emptyEList();\n}\n\nreturn getConcreteClassifierProxies(containerName, \"*\");'"
	 * @generated
	 */
	EList<ConcreteClassifier> getImportedClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns all imported members assuming the import's namespace
	 *  identifies a classifier.
	 *  
	 *  @param _this 
	 *  @return list of imported classifiers (proxies)
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.classifiers.ConcreteClassifier concreteClassifier = getClassifierAtNamespaces();\n\nif(concreteClassifier == null || concreteClassifier.eIsProxy()) {\n\treturn org.eclipse.emf.common.util.ECollections.emptyEList();\n}\n\norg.eclipse.emf.common.util.EList< de.silvawb.java.commons.NamedElement> result = new de.silvawb.java.util.UniqueEList< de.silvawb.java.commons.NamedElement>();\nresult.addAll(concreteClassifier.getAllMembers(this));\nif (concreteClassifier instanceof de.silvawb.java.classifiers.Enumeration) {\n\tresult.addAll((( de.silvawb.java.classifiers.Enumeration)concreteClassifier).getConstants());\n}\n\nreturn result;'"
	 * @generated
	 */
	EList<NamedElement> getImportedMembers();

} // Import
