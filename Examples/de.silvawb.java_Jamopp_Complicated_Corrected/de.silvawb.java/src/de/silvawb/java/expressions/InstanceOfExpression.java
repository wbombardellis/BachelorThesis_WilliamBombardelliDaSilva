/**
 */
package de.silvawb.java.expressions;

import de.silvawb.java.arrays.ArrayTypeable;

import de.silvawb.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Of Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.expressions.InstanceOfExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.expressions.ExpressionsPackage#getInstanceOfExpression()
 * @model
 * @generated
 */
public interface InstanceOfExpression extends ArrayTypeable, TypedElement, EqualityExpressionChild {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(InstanceOfExpressionChild)
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getInstanceOfExpression_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InstanceOfExpressionChild getChild();

	/**
	 * Sets the value of the '{@link de.silvawb.java.expressions.InstanceOfExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(InstanceOfExpressionChild value);

} // InstanceOfExpression
