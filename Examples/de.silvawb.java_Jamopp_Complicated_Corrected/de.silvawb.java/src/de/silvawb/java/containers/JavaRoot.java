/**
 */
package de.silvawb.java.containers;

import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.NamedElement;
import de.silvawb.java.commons.NamespaceAwareElement;

import de.silvawb.java.imports.ImportingElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Root</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.containers.ContainersPackage#getJavaRoot()
 * @model abstract="true"
 * @generated
 */
public interface JavaRoot extends NamedElement, NamespaceAwareElement, ImportingElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return all classes in the same package imports
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> defaultImportList = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\n\njava.lang.String packageName = getNamespacesAsString();\n\ndefaultImportList.addAll(getConcreteClassifierProxies(\n\t\tpackageName, \"*\"));\n\nreturn defaultImportList;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getClassifiersInSamePackage();

} // JavaRoot
