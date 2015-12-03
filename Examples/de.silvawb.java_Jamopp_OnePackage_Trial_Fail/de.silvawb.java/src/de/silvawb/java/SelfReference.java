/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.SelfReference#getSelf <em>Self</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getSelfReference()
 * @model
 * @generated
 */
public interface SelfReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self</em>' containment reference.
	 * @see #setSelf(Self)
	 * @see de.silvawb.java.JavaPackage#getSelfReference_Self()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Self getSelf();

	/**
	 * Sets the value of the '{@link de.silvawb.java.SelfReference#getSelf <em>Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self</em>' containment reference.
	 * @see #getSelf()
	 * @generated
	 */
	void setSelf(Self value);

} // SelfReference
