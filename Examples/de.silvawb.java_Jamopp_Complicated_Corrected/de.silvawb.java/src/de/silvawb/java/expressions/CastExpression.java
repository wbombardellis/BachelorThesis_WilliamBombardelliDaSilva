/**
 */
package de.silvawb.java.expressions;

import de.silvawb.java.arrays.ArrayTypeable;

import de.silvawb.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.expressions.CastExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.expressions.ExpressionsPackage#getCastExpression()
 * @model
 * @generated
 */
public interface CastExpression extends TypedElement, ArrayTypeable, UnaryModificationExpressionChild {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(MultiplicativeExpressionChild)
	 * @see de.silvawb.java.expressions.ExpressionsPackage#getCastExpression_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiplicativeExpressionChild getChild();

	/**
	 * Sets the value of the '{@link de.silvawb.java.expressions.CastExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(MultiplicativeExpressionChild value);

} // CastExpression
