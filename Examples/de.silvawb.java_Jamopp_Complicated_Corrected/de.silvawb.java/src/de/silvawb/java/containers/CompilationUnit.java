/**
 */
package de.silvawb.java.containers;

import de.silvawb.java.classifiers.ConcreteClassifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.containers.CompilationUnit#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.containers.ContainersPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends JavaRoot {
	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.classifiers.ConcreteClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see de.silvawb.java.containers.ContainersPackage#getCompilationUnit_Classifiers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConcreteClassifier> getClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param name name of the contained Classifier
	 *  @return the Classifier
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (name == null) {\n\treturn null;\n}\nfor( de.silvawb.java.classifiers.ConcreteClassifier candidate : getClassifiers()) {\n\tif(name.equals(candidate.getName())) {\n\t\treturn candidate;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	ConcreteClassifier getContainedClassifier(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return all classes in the same package imports
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> defaultImportList = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\n\njava.lang.String packageName = getNamespacesAsString();\n\n//locally defined in this container\ndefaultImportList.addAll(getClassifiers());\n\ndefaultImportList.addAll(getConcreteClassifierProxies(\n\t\tpackageName, \"*\"));\n\nreturn defaultImportList;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getClassifiersInSamePackage();

} // CompilationUnit
