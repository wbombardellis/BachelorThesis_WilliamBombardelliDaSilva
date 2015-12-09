/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Method#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.silvawb.java.Method#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.silvawb.java.Method#getContainingClassifier <em>Containing Classifier</em>}</li>
 *   <li>{@link de.silvawb.java.Method#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.silvawb.java.Method#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.silvawb.java.Method#getBody <em>Body</em>}</li>
 *   <li>{@link de.silvawb.java.Method#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link de.silvawb.java.Method#getRaisedExceptions <em>Raised Exceptions</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Contained {
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
	 * @see de.silvawb.java.JavaPackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Classifier#getTypingMethods <em>Typing Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Classifier)
	 * @see de.silvawb.java.JavaPackage#getMethod_ReturnType()
	 * @see de.silvawb.java.Classifier#getTypingMethods
	 * @model opposite="typingMethods"
	 * @generated
	 */
	Classifier getReturnType();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Method#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Classifier value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Argument}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Argument#getUsingMethods <em>Using Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getMethod_Arguments()
	 * @see de.silvawb.java.Argument#getUsingMethods
	 * @model opposite="usingMethods"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Containing Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Classifier#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Classifier</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Classifier</em>' container reference.
	 * @see #setContainingClassifier(Classifier)
	 * @see de.silvawb.java.JavaPackage#getMethod_ContainingClassifier()
	 * @see de.silvawb.java.Classifier#getMethods
	 * @model opposite="methods" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getContainingClassifier();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Method#getContainingClassifier <em>Containing Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Classifier</em>' container reference.
	 * @see #getContainingClassifier()
	 * @generated
	 */
	void setContainingClassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see de.silvawb.java.JavaPackage#getMethod_IsFinal()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Method#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see de.silvawb.java.JavaPackage#getMethod_IsStatic()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Method#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see de.silvawb.java.JavaPackage#getMethod_Body()
	 * @model ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Method#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see #setConcurrency(String)
	 * @see de.silvawb.java.JavaPackage#getMethod_Concurrency()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getConcurrency();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Method#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(String value);

	/**
	 * Returns the value of the '<em><b>Raised Exceptions</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exceptions</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getMethod_RaisedExceptions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getRaisedExceptions();

} // Method
