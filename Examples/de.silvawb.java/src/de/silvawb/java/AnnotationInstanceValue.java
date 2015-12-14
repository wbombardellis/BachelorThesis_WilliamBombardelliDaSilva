/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Instance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.AnnotationInstanceValue#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.silvawb.java.AnnotationInstanceValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAnnotationInstanceValue()
 * @model
 * @generated
 */
public interface AnnotationInstanceValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.AnnotationInstanceParameter#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' container reference.
	 * @see #setParameter(AnnotationInstanceParameter)
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstanceValue_Parameter()
	 * @see de.silvawb.java.AnnotationInstanceParameter#getValues
	 * @model opposite="values" transient="false" ordered="false"
	 * @generated
	 */
	AnnotationInstanceParameter getParameter();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationInstanceValue#getParameter <em>Parameter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' container reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(AnnotationInstanceParameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstanceValue_Value()
	 * @model ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationInstanceValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // AnnotationInstanceValue
