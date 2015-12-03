/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Type Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.SuperTypeArgument#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getSuperTypeArgument()
 * @model
 * @generated
 */
public interface SuperTypeArgument extends TypeArgument {
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' containment reference.
	 * @see #setSuperType(TypeReference)
	 * @see de.silvawb.java.JavaPackage#getSuperTypeArgument_SuperType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getSuperType();

	/**
	 * Sets the value of the '{@link de.silvawb.java.SuperTypeArgument#getSuperType <em>Super Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' containment reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(TypeReference value);

} // SuperTypeArgument
