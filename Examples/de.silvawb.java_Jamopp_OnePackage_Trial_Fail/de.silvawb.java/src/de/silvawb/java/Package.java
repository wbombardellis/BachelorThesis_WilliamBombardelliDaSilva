/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Package#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends JavaRoot, Annotable {
	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getPackage_CompilationUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompilationUnit> getCompilationUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String packageName = \"\"; \nfor( java.util.Iterator< java.lang.String> it = getNamespaces().iterator(); it.hasNext(); ) {\n\tjava.lang.String namespaceFragment = it.next();\n\tpackageName = packageName + namespaceFragment + de.silvawb.java.PACKAGE_SEPARATOR;\n}\nreturn packageName;'"
	 * @generated
	 */
	String getNamespacesAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return all classes in the same package
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> defaultImportList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();\n\njava.lang.String packageName = getNamespacesAsString();\n\ndefaultImportList.addAll(getConcreteClassifierProxies(\n\t\tpackageName + getName(), \"*\"));\n\nreturn defaultImportList;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getClassifiersInSamePackage();

} // Package
