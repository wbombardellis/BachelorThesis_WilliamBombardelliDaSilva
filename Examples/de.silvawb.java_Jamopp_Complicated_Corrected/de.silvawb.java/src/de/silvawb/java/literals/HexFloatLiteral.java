/**
 */
package de.silvawb.java.literals;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hex Float Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.literals.HexFloatLiteral#getHexValue <em>Hex Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.literals.LiteralsPackage#getHexFloatLiteral()
 * @model
 * @generated
 */
public interface HexFloatLiteral extends FloatLiteral {
	/**
	 * Returns the value of the '<em><b>Hex Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hex Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex Value</em>' attribute.
	 * @see #setHexValue(float)
	 * @see de.silvawb.java.literals.LiteralsPackage#getHexFloatLiteral_HexValue()
	 * @model required="true"
	 * @generated
	 */
	float getHexValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.literals.HexFloatLiteral#getHexValue <em>Hex Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex Value</em>' attribute.
	 * @see #getHexValue()
	 * @generated
	 */
	void setHexValue(float value);

} // HexFloatLiteral
