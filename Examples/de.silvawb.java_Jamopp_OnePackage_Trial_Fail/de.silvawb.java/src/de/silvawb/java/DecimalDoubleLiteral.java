/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Double Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.DecimalDoubleLiteral#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getDecimalDoubleLiteral()
 * @model
 * @generated
 */
public interface DecimalDoubleLiteral extends DoubleLiteral {
	/**
	 * Returns the value of the '<em><b>Decimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Value</em>' attribute.
	 * @see #setDecimalValue(double)
	 * @see de.silvawb.java.JavaPackage#getDecimalDoubleLiteral_DecimalValue()
	 * @model required="true"
	 * @generated
	 */
	double getDecimalValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.DecimalDoubleLiteral#getDecimalValue <em>Decimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Value</em>' attribute.
	 * @see #getDecimalValue()
	 * @generated
	 */
	void setDecimalValue(double value);

} // DecimalDoubleLiteral
