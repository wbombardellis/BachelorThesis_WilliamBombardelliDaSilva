/**
 */
package de.silvawb.java.instantiations;

import de.silvawb.java.literals.Self;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.instantiations.ExplicitConstructorCall#getCallTarget <em>Call Target</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.instantiations.InstantiationsPackage#getExplicitConstructorCall()
 * @model
 * @generated
 */
public interface ExplicitConstructorCall extends Instantiation {
	/**
	 * Returns the value of the '<em><b>Call Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Target</em>' containment reference.
	 * @see #setCallTarget(Self)
	 * @see de.silvawb.java.instantiations.InstantiationsPackage#getExplicitConstructorCall_CallTarget()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Self getCallTarget();

	/**
	 * Sets the value of the '{@link de.silvawb.java.instantiations.ExplicitConstructorCall#getCallTarget <em>Call Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Target</em>' containment reference.
	 * @see #getCallTarget()
	 * @generated
	 */
	void setCallTarget(Self value);

} // ExplicitConstructorCall
