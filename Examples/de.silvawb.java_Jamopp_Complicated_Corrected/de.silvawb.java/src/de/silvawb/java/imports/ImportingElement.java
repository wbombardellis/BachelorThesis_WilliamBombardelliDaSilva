/**
 */
package de.silvawb.java.imports;

import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.commons.Commentable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Importing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.imports.ImportingElement#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.imports.ImportsPackage#getImportingElement()
 * @model abstract="true"
 * @generated
 */
public interface ImportingElement extends Commentable {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.imports.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see de.silvawb.java.imports.ImportsPackage#getImportingElement_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\nfor( org.eclipse.emf.ecore.EObject classifier : de.silvawb.java.JavaClasspath.get(this).getDefaultImports()) {\n\tresult.add(( de.silvawb.java.classifiers.ConcreteClassifier)classifier);\n}\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getDefaultImports();

} // ImportingElement
