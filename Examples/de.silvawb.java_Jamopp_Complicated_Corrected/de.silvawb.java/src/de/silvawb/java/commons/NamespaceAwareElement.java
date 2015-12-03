/**
 */
package de.silvawb.java.commons;

import de.silvawb.java.classifiers.ConcreteClassifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Aware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.commons.NamespaceAwareElement#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.commons.CommonsPackage#getNamespaceAwareElement()
 * @model abstract="true"
 * @generated
 */
public interface NamespaceAwareElement extends Commentable {
	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespaces</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' attribute list.
	 * @see de.silvawb.java.commons.CommonsPackage#getNamespaceAwareElement_Namespaces()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getNamespaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Converts the namespaces array of the given namespace aware element into
	 *  a String representation using package (.) and class ($) delimiters. The method
	 *  uses the classpath to determine for each element of the namespace if it 
	 *  identifies a package or a class.
	 *  
	 *  @param naElement
	 *  @return single string representation of namespace
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String containerName = \"\"; \nfor( java.util.Iterator< java.lang.String> it = getNamespaces().iterator(); it.hasNext(); ) {\n\tjava.lang.String namespaceFragment = it.next();\n\t//does it point at a classifier or a package as container?\n\tjava.lang.String assumedPackageName    = containerName + namespaceFragment + de.silvawb.java.JavaUniquePathConstructor.PACKAGE_SEPARATOR;\n\tjava.lang.String assumedClassifierName = containerName + namespaceFragment + de.silvawb.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR;\n\t\n\tif (it.hasNext()) {\n\t\tif ( de.silvawb.java.JavaClasspath.get(this).existsPackage(assumedClassifierName)) {\n\t\t\tcontainerName = assumedClassifierName;\n\t\t}\n\t\telse {\n\t\t\t//assume package\n\t\t\tcontainerName = assumedPackageName;\n\t\t}\n\t}\n\telse {\n\t\tif ( de.silvawb.java.JavaClasspath.get(this).existsPackage(assumedPackageName)) {\n\t\t\t//a package is always available as key\n\t\t\tcontainerName = assumedPackageName;\n\t\t}\n\t\telse {\n\t\t\t//assume classifier that is not key, but value in the map\n\t\t\tcontainerName = assumedClassifierName;\n\t\t}\n\t}\n}\n\nreturn containerName;'"
	 * @generated
	 */
	String getNamespacesAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Assuming the namespace
	 *  identifies a classifier, that classifier is returned.
	 *  
	 *  @return classifier at namespace
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String fullQualifiedName = getNamespacesAsString();\nif (fullQualifiedName == null || fullQualifiedName.endsWith( de.silvawb.java.JavaUniquePathConstructor.PACKAGE_SEPARATOR)) {\n\treturn null;\n}\n//cut the trailing separator\nfullQualifiedName = fullQualifiedName.substring(0,fullQualifiedName.length() - 1);\n\nreturn ( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(\n\t\tgetConcreteClassifierProxy(fullQualifiedName), this);'"
	 * @generated
	 */
	ConcreteClassifier getClassifierAtNamespaces();

} // NamespaceAwareElement
