/**
 */
package de.silvawb.java.expressions;

import de.silvawb.java.operators.AssignmentOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.expressions.AssignmentExpression#getChild <em>Child</em>}</li>
 *   <li>{@link de.silvawb.java.expressions.AssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}</li>
 *   <li>{@link de.silvawb.java.expressions.AssignmentExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.expressions.ExpressionsPackage#getAssignmentExpression()
 * @model
 * @generated
 */
public interface AssignmentExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(AssignmentExpressionChild)
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getAssignmentExpression_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssignmentExpressionChild getChild();

	/**
	 * Sets the value of the '{@link de.silvawb.java.expressions.AssignmentExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(AssignmentExpressionChild value);

	/**
	 * Returns the value of the '<em><b>Assignment Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Operator</em>' containment reference.
	 * @see #setAssignmentOperator(AssignmentOperator)
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getAssignmentExpression_AssignmentOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssignmentOperator getAssignmentOperator();

	/**
	 * Sets the value of the '{@link de.silvawb.java.expressions.AssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Operator</em>' containment reference.
	 * @see #getAssignmentOperator()
	 * @generated
	 */
	void setAssignmentOperator(AssignmentOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getAssignmentExpression_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.expressions.AssignmentExpression#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // AssignmentExpression
