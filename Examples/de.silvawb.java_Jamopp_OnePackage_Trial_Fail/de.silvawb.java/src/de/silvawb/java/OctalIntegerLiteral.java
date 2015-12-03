/**
 */
package de.silvawb.java;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Octal Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.OctalIntegerLiteral#getOctalValue <em>Octal Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getOctalIntegerLiteral()
 * @model
 * @generated
 */
public interface OctalIntegerLiteral extends IntegerLiteral {
	/**
	 * Returns the value of the '<em><b>Octal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Octal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Octal Value</em>' attribute.
	 * @see #setOctalValue(BigInteger)
	 * @see de.silvawb.java.JavaPackage#getOctalIntegerLiteral_OctalValue()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getOctalValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.OctalIntegerLiteral#getOctalValue <em>Octal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Octal Value</em>' attribute.
	 * @see #getOctalValue()
	 * @generated
	 */
	void setOctalValue(BigInteger value);

} // OctalIntegerLiteral
