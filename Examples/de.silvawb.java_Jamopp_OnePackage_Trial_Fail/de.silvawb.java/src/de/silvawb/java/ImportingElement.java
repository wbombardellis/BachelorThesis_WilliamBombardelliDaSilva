/**
 */
package de.silvawb.java;

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
 *   <li>{@link de.silvawb.java.ImportingElement#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getImportingElement()
 * @model abstract="true"
 * @generated
 */
public interface ImportingElement extends Commentable {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getImportingElement_Imports()
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();\nfor( org.eclipse.emf.ecore.EObject classifier : de.silvawb.java.get(this).getDefaultImports()) {\n\tresult.add(( de.silvawb.java.ConcreteClassifier)classifier);\n}\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getDefaultImports();

} // ImportingElement
