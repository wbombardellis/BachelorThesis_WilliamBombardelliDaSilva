/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.NewConstructorCall#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getNewConstructorCall()
 * @model
 * @generated
 */
public interface NewConstructorCall extends TypedElement, Instantiation, CallTypeArgumentable {
	/**
	 * Returns the value of the '<em><b>Anonymous Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class</em>' containment reference.
	 * @see #setAnonymousClass(AnonymousClass)
	 * @see de.silvawb.java.JavaPackage#getNewConstructorCall_AnonymousClass()
	 * @model containment="true"
	 * @generated
	 */
	AnonymousClass getAnonymousClass();

	/**
	 * Sets the value of the '{@link de.silvawb.java.NewConstructorCall#getAnonymousClass <em>Anonymous Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Class</em>' containment reference.
	 * @see #getAnonymousClass()
	 * @generated
	 */
	void setAnonymousClass(AnonymousClass value);

} // NewConstructorCall
