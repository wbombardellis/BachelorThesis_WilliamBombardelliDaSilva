/**
 */
package de.silvawb.java.statements;

import de.silvawb.java.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.statements.Assert#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.statements.StatementsPackage#getAssert()
 * @model
 * @generated
 */
public interface Assert extends Statement, Conditional {
	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' containment reference.
	 * @see #setErrorMessage(Expression)
	 * @see de.silvawb.java.statements.StatementsPackage#getAssert_ErrorMessage()
	 * @model containment="true"
	 * @generated
	 */
	Expression getErrorMessage();

	/**
	 * Sets the value of the '{@link de.silvawb.java.statements.Assert#getErrorMessage <em>Error Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' containment reference.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(Expression value);

} // Assert
