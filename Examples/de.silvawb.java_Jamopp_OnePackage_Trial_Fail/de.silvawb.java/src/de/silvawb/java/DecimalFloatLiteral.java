/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Float Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.DecimalFloatLiteral#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getDecimalFloatLiteral()
 * @model
 * @generated
 */
public interface DecimalFloatLiteral extends FloatLiteral {
	/**
	 * Returns the value of the '<em><b>Decimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Value</em>' attribute.
	 * @see #setDecimalValue(float)
	 * @see de.silvawb.java.JavaPackage#getDecimalFloatLiteral_DecimalValue()
	 * @model required="true"
	 * @generated
	 */
	float getDecimalValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.DecimalFloatLiteral#getDecimalValue <em>Decimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Value</em>' attribute.
	 * @see #getDecimalValue()
	 * @generated
	 */
	void setDecimalValue(float value);

} // DecimalFloatLiteral
