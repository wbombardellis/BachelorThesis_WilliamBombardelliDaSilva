/**
 */
package de.silvawb.java;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Octal Long Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.OctalLongLiteral#getOctalValue <em>Octal Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getOctalLongLiteral()
 * @model
 * @generated
 */
public interface OctalLongLiteral extends LongLiteral {
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
	 * @see de.silvawb.java.JavaPackage#getOctalLongLiteral_OctalValue()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getOctalValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.OctalLongLiteral#getOctalValue <em>Octal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Octal Value</em>' attribute.
	 * @see #getOctalValue()
	 * @generated
	 */
	void setOctalValue(BigInteger value);

} // OctalLongLiteral
