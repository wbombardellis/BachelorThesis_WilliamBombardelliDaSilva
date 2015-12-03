/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.JMember#isStatic <em>Static</em>}</li>
 *   <li>{@link de.silvawb.java.JMember#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.silvawb.java.JMember#getComment <em>Comment</em>}</li>
 *   <li>{@link de.silvawb.java.JMember#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getJMember()
 * @model abstract="true"
 * @generated
 */
public interface JMember extends JModelElement {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see de.silvawb.java.JavaPackage#getJMember_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JMember#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link de.silvawb.java.JVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see de.silvawb.java.JVisibility
	 * @see #setVisibility(JVisibility)
	 * @see de.silvawb.java.JavaPackage#getJMember_Visibility()
	 * @model
	 * @generated
	 */
	JVisibility getVisibility();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JMember#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see de.silvawb.java.JVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(JVisibility value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see de.silvawb.java.JavaPackage#getJMember_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JMember#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.JClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Type</em>' container reference.
	 * @see #setContainingType(JClass)
	 * @see de.silvawb.java.JavaPackage#getJMember_ContainingType()
	 * @see de.silvawb.java.JClass#getMembers
	 * @model opposite="members"
	 * @generated
	 */
	JClass getContainingType();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JMember#getContainingType <em>Containing Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Type</em>' container reference.
	 * @see #getContainingType()
	 * @generated
	 */
	void setContainingType(JClass value);

} // JMember
