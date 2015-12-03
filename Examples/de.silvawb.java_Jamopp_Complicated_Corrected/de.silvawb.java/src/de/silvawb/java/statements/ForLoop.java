/**
 */
package de.silvawb.java.statements;

import de.silvawb.java.expressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.statements.ForLoop#getInit <em>Init</em>}</li>
 *   <li>{@link de.silvawb.java.statements.ForLoop#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.statements.StatementsPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends Statement, StatementContainer, Conditional {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(ForLoopInitializer)
	 * @see de.silvawb.java.statements.StatementsPackage#getForLoop_Init()
	 * @model containment="true"
	 * @generated
	 */
	ForLoopInitializer getInit();

	/**
	 * Sets the value of the '{@link de.silvawb.java.statements.ForLoop#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(ForLoopInitializer value);

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' containment reference list.
	 * @see de.silvawb.java.statements.StatementsPackage#getForLoop_Updates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getUpdates();

} // ForLoop
