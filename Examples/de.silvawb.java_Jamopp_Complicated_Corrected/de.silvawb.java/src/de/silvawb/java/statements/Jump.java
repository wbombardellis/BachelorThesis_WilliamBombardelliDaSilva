/**
 */
package de.silvawb.java.statements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.statements.Jump#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.statements.StatementsPackage#getJump()
 * @model abstract="true"
 * @generated
 */
public interface Jump extends Statement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(JumpLabel)
	 * @see de.silvawb.java.statements.StatementsPackage#getJump_Target()
	 * @model
	 * @generated
	 */
	JumpLabel getTarget();

	/**
	 * Sets the value of the '{@link de.silvawb.java.statements.Jump#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JumpLabel value);

} // Jump
