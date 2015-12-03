/**
 */
package de.silvawb.java.instantiations;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initializable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.instantiations.Initializable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.instantiations.InstantiationsPackage#getInitializable()
 * @model abstract="true"
 * @generated
 */
public interface Initializable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(Expression)
	 * @see de.silvawb.java.instantiations.InstantiationsPackage#getInitializable_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitialValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.instantiations.Initializable#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Expression value);

} // Initializable
