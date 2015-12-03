/**
 */
package de.silvawb.java.statements;

import de.silvawb.java.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.statements.Throw#getThrowable <em>Throwable</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.statements.StatementsPackage#getThrow()
 * @model
 * @generated
 */
public interface Throw extends Statement {
	/**
	 * Returns the value of the '<em><b>Throwable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throwable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throwable</em>' containment reference.
	 * @see #setThrowable(Expression)
	 * @see de.silvawb.java.statements.StatementsPackage#getThrow_Throwable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getThrowable();

	/**
	 * Sets the value of the '{@link de.silvawb.java.statements.Throw#getThrowable <em>Throwable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throwable</em>' containment reference.
	 * @see #getThrowable()
	 * @generated
	 */
	void setThrowable(Expression value);

} // Throw
