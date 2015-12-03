/**
 */
package de.silvawb.java.expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inclusive Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.expressions.InclusiveOrExpression#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.expressions.ExpressionsPackage#getInclusiveOrExpression()
 * @model
 * @generated
 */
public interface InclusiveOrExpression extends ConditionalAndExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.expressions.InclusiveOrExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getInclusiveOrExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InclusiveOrExpressionChild> getChildren();

} // InclusiveOrExpression
