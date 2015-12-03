/**
 */
package de.silvawb.java;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.DecimalIntegerLiteral#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getDecimalIntegerLiteral()
 * @model
 * @generated
 */
public interface DecimalIntegerLiteral extends IntegerLiteral {
	/**
	 * Returns the value of the '<em><b>Decimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Value</em>' attribute.
	 * @see #setDecimalValue(BigInteger)
	 * @see de.silvawb.java.JavaPackage#getDecimalIntegerLiteral_DecimalValue()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getDecimalValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.DecimalIntegerLiteral#getDecimalValue <em>Decimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Value</em>' attribute.
	 * @see #getDecimalValue()
	 * @generated
	 */
	void setDecimalValue(BigInteger value);

} // DecimalIntegerLiteral
