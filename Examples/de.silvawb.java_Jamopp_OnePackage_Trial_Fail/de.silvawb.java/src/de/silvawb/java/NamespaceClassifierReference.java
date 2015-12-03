/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.NamespaceClassifierReference#getClassifierReferences <em>Classifier References</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getNamespaceClassifierReference()
 * @model
 * @generated
 */
public interface NamespaceClassifierReference extends TypeReference, NamespaceAwareElement {
	/**
	 * Returns the value of the '<em><b>Classifier References</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.ClassifierReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier References</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getNamespaceClassifierReference_ClassifierReferences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClassifierReference> getClassifierReferences();

} // NamespaceClassifierReference
