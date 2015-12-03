/**
 */
package de.silvawb.java;

import java.lang.reflect.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.JField#isFinal <em>Final</em>}</li>
 *   <li>{@link de.silvawb.java.JField#isTransient <em>Transient</em>}</li>
 *   <li>{@link de.silvawb.java.JField#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.silvawb.java.JField#getJavaField <em>Java Field</em>}</li>
 *   <li>{@link de.silvawb.java.JField#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link de.silvawb.java.JField#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getJField()
 * @model
 * @generated
 */
public interface JField extends JMember {
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
	 * @see de.silvawb.java.JavaPackage#getJField_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JField#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see de.silvawb.java.JavaPackage#getJField_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JField#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see de.silvawb.java.JavaPackage#getJField_Volatile()
	 * @model
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JField#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Java Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Field</em>' attribute.
	 * @see #setJavaField(Field)
	 * @see de.silvawb.java.JavaPackage#getJField_JavaField()
	 * @model dataType="de.silvawb.java.JavaField" transient="true"
	 * @generated
	 */
	Field getJavaField();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JField#getJavaField <em>Java Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Field</em>' attribute.
	 * @see #getJavaField()
	 * @generated
	 */
	void setJavaField(Field value);

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' attribute.
	 * @see #setInitializer(String)
	 * @see de.silvawb.java.JavaPackage#getJField_Initializer()
	 * @model
	 * @generated
	 */
	String getInitializer();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JField#getInitializer <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' attribute.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(String value);

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
	 * @see de.silvawb.java.JavaPackage#getJField_Type()
	 * @model
	 * @generated
	 */
	JClass getType();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JField#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JClass value);

} // JField
