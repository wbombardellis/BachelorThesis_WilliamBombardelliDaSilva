/**
 */
package de.silvawb.java.expressions;

import de.silvawb.java.operators.UnaryOperator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.expressions.UnaryExpression#getOperators <em>Operators</em>}</li>
 *   <li>{@link de.silvawb.java.expressions.UnaryExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.expressions.ExpressionsPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends MultiplicativeExpressionChild {
	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.operators.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getUnaryExpression_Operators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UnaryOperator> getOperators();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(UnaryExpressionChild)
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getUnaryExpression_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnaryExpressionChild getChild();

	/**
	 * Sets the value of the '{@link de.silvawb.java.expressions.UnaryExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(UnaryExpressionChild value);

} // UnaryExpression
