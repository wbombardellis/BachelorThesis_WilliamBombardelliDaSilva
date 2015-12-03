/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Return#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends Statement {
	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(Expression)
	 * @see de.silvawb.java.JavaPackage#getReturn_ReturnValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReturnValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Return#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(Expression value);

} // Return
