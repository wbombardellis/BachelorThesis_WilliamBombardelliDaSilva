/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getPrimitiveTypeReference()
 * @model
 * @generated
 */
public interface PrimitiveTypeReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' containment reference.
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see de.silvawb.java.JavaPackage#getPrimitiveTypeReference_PrimitiveType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link de.silvawb.java.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' containment reference.
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

} // PrimitiveTypeReference
