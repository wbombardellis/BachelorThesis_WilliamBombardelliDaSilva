/**
 */
package de.silvawb.java;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hex Long Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.HexLongLiteral#getHexValue <em>Hex Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getHexLongLiteral()
 * @model
 * @generated
 */
public interface HexLongLiteral extends LongLiteral {
	/**
	 * Returns the value of the '<em><b>Hex Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hex Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex Value</em>' attribute.
	 * @see #setHexValue(BigInteger)
	 * @see de.silvawb.java.JavaPackage#getHexLongLiteral_HexValue()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getHexValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.HexLongLiteral#getHexValue <em>Hex Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex Value</em>' attribute.
	 * @see #getHexValue()
	 * @generated
	 */
	void setHexValue(BigInteger value);

} // HexLongLiteral
