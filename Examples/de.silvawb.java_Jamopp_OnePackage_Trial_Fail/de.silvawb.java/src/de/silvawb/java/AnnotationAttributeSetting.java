/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Attribute Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.AnnotationAttributeSetting#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.silvawb.java.AnnotationAttributeSetting#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAnnotationAttributeSetting()
 * @model
 * @generated
 */
public interface AnnotationAttributeSetting extends Commentable {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(InterfaceMethod)
	 * @see de.silvawb.java.JavaPackage#getAnnotationAttributeSetting_Attribute()
	 * @model required="true"
	 * @generated
	 */
	InterfaceMethod getAttribute();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationAttributeSetting#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(InterfaceMethod value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AnnotationValue)
	 * @see de.silvawb.java.JavaPackage#getAnnotationAttributeSetting_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AnnotationValue getValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationAttributeSetting#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AnnotationValue value);

} // AnnotationAttributeSetting
