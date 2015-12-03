/**
 */
package de.silvawb.java.statements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.statements.Condition#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.statements.StatementsPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Statement, StatementContainer, Conditional {
	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' containment reference.
	 * @see #setElseStatement(Statement)
	 * @see de.silvawb.java.statements.StatementsPackage#getCondition_ElseStatement()
	 * @model containment="true"
	 * @generated
	 */
	Statement getElseStatement();

	/**
	 * Sets the value of the '{@link de.silvawb.java.statements.Condition#getElseStatement <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Statement</em>' containment reference.
	 * @see #getElseStatement()
	 * @generated
	 */
	void setElseStatement(Statement value);

} // Condition
