/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.AdditiveExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link de.silvawb.java.AdditiveExpression#getAdditiveOperators <em>Additive Operators</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAdditiveExpression()
 * @model
 * @generated
 */
public interface AdditiveExpression extends ShiftExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.AdditiveExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getAdditiveExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AdditiveExpressionChild> getChildren();

	/**
	 * Returns the value of the '<em><b>Additive Operators</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.AdditiveOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Operators</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getAdditiveExpression_AdditiveOperators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AdditiveOperator> getAdditiveOperators();

} // AdditiveExpression
