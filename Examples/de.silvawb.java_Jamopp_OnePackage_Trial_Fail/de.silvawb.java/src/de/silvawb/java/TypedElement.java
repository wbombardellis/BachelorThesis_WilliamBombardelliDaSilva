/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.TypedElement#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends Commentable {
	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference.
	 * @see #setTypeReference(TypeReference)
	 * @see de.silvawb.java.JavaPackage#getTypedElement_TypeReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getTypeReference();

	/**
	 * Sets the value of the '{@link de.silvawb.java.TypedElement#getTypeReference <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Reference</em>' containment reference.
	 * @see #getTypeReference()
	 * @generated
	 */
	void setTypeReference(TypeReference value);

} // TypedElement
