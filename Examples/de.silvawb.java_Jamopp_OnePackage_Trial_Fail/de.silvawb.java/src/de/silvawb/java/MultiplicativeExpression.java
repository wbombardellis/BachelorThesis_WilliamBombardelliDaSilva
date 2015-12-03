/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.MultiplicativeExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link de.silvawb.java.MultiplicativeExpression#getMultiplicativeOperators <em>Multiplicative Operators</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getMultiplicativeExpression()
 * @model
 * @generated
 */
public interface MultiplicativeExpression extends AdditiveExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.MultiplicativeExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getMultiplicativeExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MultiplicativeExpressionChild> getChildren();

	/**
	 * Returns the value of the '<em><b>Multiplicative Operators</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.MultiplicativeOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicative Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicative Operators</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getMultiplicativeExpression_MultiplicativeOperators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MultiplicativeOperator> getMultiplicativeOperators();

} // MultiplicativeExpression
