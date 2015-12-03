/**
 */
package de.silvawb.java.statements;

import de.silvawb.java.expressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.statements.Switch#getCases <em>Cases</em>}</li>
 *   <li>{@link de.silvawb.java.statements.Switch#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.statements.StatementsPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends Statement {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.statements.SwitchCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see de.silvawb.java.statements.StatementsPackage#getSwitch_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchCase> getCases();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Expression)
	 * @see de.silvawb.java.statements.StatementsPackage#getSwitch_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getVariable();

	/**
	 * Sets the value of the '{@link de.silvawb.java.statements.Switch#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Expression value);

} // Switch
