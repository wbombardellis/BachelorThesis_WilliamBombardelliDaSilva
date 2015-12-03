/**
 */
package de.silvawb.java.expressions;

import de.silvawb.java.operators.ShiftOperator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.expressions.ShiftExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link de.silvawb.java.expressions.ShiftExpression#getShiftOperators <em>Shift Operators</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.expressions.ExpressionsPackage#getShiftExpression()
 * @model
 * @generated
 */
public interface ShiftExpression extends RelationExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.expressions.ShiftExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getShiftExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ShiftExpressionChild> getChildren();

	/**
	 * Returns the value of the '<em><b>Shift Operators</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.operators.ShiftOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Operators</em>' containment reference list.
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getShiftExpression_ShiftOperators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ShiftOperator> getShiftOperators();

} // ShiftExpression
