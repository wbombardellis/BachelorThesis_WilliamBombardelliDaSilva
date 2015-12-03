/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.JavaPackage#getJavaRoot()
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> defaultImportList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();\n\njava.lang.String packageName = getNamespacesAsString();\n\ndefaultImportList.addAll(getConcreteClassifierProxies(\n\t\tpackageName, \"*\"));\n\nreturn defaultImportList;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getClassifiersInSamePackage();

} // JavaRoot
