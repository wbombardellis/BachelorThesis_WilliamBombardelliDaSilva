/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.JParameter#isFinal <em>Final</em>}</li>
 *   <li>{@link de.silvawb.java.JParameter#getMethod <em>Method</em>}</li>
 *   <li>{@link de.silvawb.java.JParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getJParameter()
 * @model
 * @generated
 */
public interface JParameter extends JModelElement {
	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see de.silvawb.java.JavaPackage#getJParameter_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JParameter#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.JMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(JMethod)
	 * @see de.silvawb.java.JavaPackage#getJParameter_Method()
	 * @see de.silvawb.java.JMethod#getParameters
	 * @model opposite="parameters"
	 * @generated
	 */
	JMethod getMethod();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JParameter#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(JMethod value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(JClass)
	 * @see de.silvawb.java.JavaPackage#getJParameter_Type()
	 * @model
	 * @generated
	 */
	JClass getType();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JClass value);

} // JParameter
