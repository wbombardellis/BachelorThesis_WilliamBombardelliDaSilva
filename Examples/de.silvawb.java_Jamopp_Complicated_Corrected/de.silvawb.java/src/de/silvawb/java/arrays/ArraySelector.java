/**
 */
package de.silvawb.java.arrays;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.arrays.ArraySelector#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.arrays.ArraysPackage#getArraySelector()
 * @model
 * @generated
 */
public interface ArraySelector extends Commentable {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Expression)
	 * @see de.silvawb.java.arrays.ArraysPackage#getArraySelector_Position()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPosition();

	/**
	 * Sets the value of the '{@link de.silvawb.java.arrays.ArraySelector#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Expression value);

} // ArraySelector
