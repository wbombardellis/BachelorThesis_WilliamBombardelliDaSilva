/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GET Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.GETExpression#getRightSide <em>Right Side</em>}</li>
 *   <li>{@link de.silvawb.java.GETExpression#getContainerStatement <em>Container Statement</em>}</li>
 *   <li>{@link de.silvawb.java.GETExpression#getLeftSide <em>Left Side</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getGETExpression()
 * @model
 * @generated
 */
public interface GETExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Right Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Side</em>' attribute.
	 * @see #setRightSide(String)
	 * @see de.silvawb.java.JavaPackage#getGETExpression_RightSide()
	 * @model ordered="false"
	 * @generated
	 */
	String getRightSide();

	/**
	 * Sets the value of the '{@link de.silvawb.java.GETExpression#getRightSide <em>Right Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Side</em>' attribute.
	 * @see #getRightSide()
	 * @generated
	 */
	void setRightSide(String value);

	/**
	 * Returns the value of the '<em><b>Container Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.AssertStatement#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Statement</em>' container reference.
	 * @see #setContainerStatement(AssertStatement)
	 * @see de.silvawb.java.JavaPackage#getGETExpression_ContainerStatement()
	 * @see de.silvawb.java.AssertStatement#getAssertion
	 * @model opposite="assertion" transient="false" ordered="false"
	 * @generated
	 */
	AssertStatement getContainerStatement();

	/**
	 * Sets the value of the '{@link de.silvawb.java.GETExpression#getContainerStatement <em>Container Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Statement</em>' container reference.
	 * @see #getContainerStatement()
	 * @generated
	 */
	void setContainerStatement(AssertStatement value);

	/**
	 * Returns the value of the '<em><b>Left Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Side</em>' attribute.
	 * @see #setLeftSide(String)
	 * @see de.silvawb.java.JavaPackage#getGETExpression_LeftSide()
	 * @model ordered="false"
	 * @generated
	 */
	String getLeftSide();

	/**
	 * Sets the value of the '{@link de.silvawb.java.GETExpression#getLeftSide <em>Left Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Side</em>' attribute.
	 * @see #getLeftSide()
	 * @generated
	 */
	void setLeftSide(String value);

} // GETExpression
