/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.ConditionalAndExpression#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getConditionalAndExpression()
 * @model
 * @generated
 */
public interface ConditionalAndExpression extends ConditionalOrExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.ConditionalAndExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getConditionalAndExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConditionalAndExpressionChild> getChildren();

} // ConditionalAndExpression
