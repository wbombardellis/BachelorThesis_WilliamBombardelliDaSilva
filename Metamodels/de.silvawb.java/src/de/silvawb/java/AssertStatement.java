/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.AssertStatement#getAssertion <em>Assertion</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAssertStatement()
 * @model
 * @generated
 */
public interface AssertStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.GETExpression#getContainerStatement <em>Container Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion</em>' containment reference.
	 * @see #setAssertion(GETExpression)
	 * @see de.silvawb.java.JavaPackage#getAssertStatement_Assertion()
	 * @see de.silvawb.java.GETExpression#getContainerStatement
	 * @model opposite="containerStatement" containment="true" ordered="false"
	 * @generated
	 */
	GETExpression getAssertion();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AssertStatement#getAssertion <em>Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' containment reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(GETExpression value);

} // AssertStatement
