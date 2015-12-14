/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Instance Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.AnnotationInstanceParameter#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.AnnotationInstanceParameter#getValues <em>Values</em>}</li>
 *   <li>{@link de.silvawb.java.AnnotationInstanceParameter#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAnnotationInstanceParameter()
 * @model
 * @generated
 */
public interface AnnotationInstanceParameter extends EObject {
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
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstanceParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationInstanceParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.AnnotationInstanceValue}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.AnnotationInstanceValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstanceParameter_Values()
	 * @see de.silvawb.java.AnnotationInstanceValue#getParameter
	 * @model opposite="parameter" containment="true"
	 * @generated
	 */
	EList<AnnotationInstanceValue> getValues();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.AnnotationInstance#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' container reference.
	 * @see #setInstance(AnnotationInstance)
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstanceParameter_Instance()
	 * @see de.silvawb.java.AnnotationInstance#getParameters
	 * @model opposite="parameters" transient="false" ordered="false"
	 * @generated
	 */
	AnnotationInstance getInstance();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationInstanceParameter#getInstance <em>Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' container reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(AnnotationInstance value);

} // AnnotationInstanceParameter
