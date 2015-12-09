/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Argument#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.Argument#getType <em>Type</em>}</li>
 *   <li>{@link de.silvawb.java.Argument#getUsingMethods <em>Using Methods</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.silvawb.java.JavaPackage#getArgument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Classifier#getTypingArguments <em>Typing Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see de.silvawb.java.JavaPackage#getArgument_Type()
	 * @see de.silvawb.java.Classifier#getTypingArguments
	 * @model opposite="typingArguments"
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Argument#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

	/**
	 * Returns the value of the '<em><b>Using Methods</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Method}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Method#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Methods</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getArgument_UsingMethods()
	 * @see de.silvawb.java.Method#getArguments
	 * @model opposite="arguments" ordered="false"
	 * @generated
	 */
	EList<Method> getUsingMethods();

} // Argument
