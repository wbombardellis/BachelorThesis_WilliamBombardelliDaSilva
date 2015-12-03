/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.EqualityExpression#getEqualityOperators <em>Equality Operators</em>}</li>
 *   <li>{@link de.silvawb.java.EqualityExpression#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getEqualityExpression()
 * @model
 * @generated
 */
public interface EqualityExpression extends AndExpressionChild {
	/**
	 * Returns the value of the '<em><b>Equality Operators</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.EqualityOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equality Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equality Operators</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getEqualityExpression_EqualityOperators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EqualityOperator> getEqualityOperators();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.EqualityExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getEqualityExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EqualityExpressionChild> getChildren();

} // EqualityExpression
