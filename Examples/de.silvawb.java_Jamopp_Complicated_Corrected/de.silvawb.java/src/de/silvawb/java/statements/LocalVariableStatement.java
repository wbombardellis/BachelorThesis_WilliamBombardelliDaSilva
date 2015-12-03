/**
 */
package de.silvawb.java.statements;

import de.silvawb.java.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.statements.LocalVariableStatement#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.statements.StatementsPackage#getLocalVariableStatement()
 * @model
 * @generated
 */
public interface LocalVariableStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(LocalVariable)
	 * @see de.silvawb.java.statements.StatementsPackage#getLocalVariableStatement_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LocalVariable getVariable();

	/**
	 * Sets the value of the '{@link de.silvawb.java.statements.LocalVariableStatement#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(LocalVariable value);

} // LocalVariableStatement
