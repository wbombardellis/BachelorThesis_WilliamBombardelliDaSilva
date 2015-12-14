/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.AnnotationInstance#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.silvawb.java.AnnotationInstance#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.silvawb.java.AnnotationInstance#getAnnotable <em>Annotable</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAnnotationInstance()
 * @model
 * @generated
 */
public interface AnnotationInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' reference.
	 * @see #setAnnotation(Annotation)
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstance_Annotation()
	 * @model
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationInstance#getAnnotation <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.AnnotationInstanceParameter}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.AnnotationInstanceParameter#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstance_Parameters()
	 * @see de.silvawb.java.AnnotationInstanceParameter#getInstance
	 * @model opposite="instance" containment="true"
	 * @generated
	 */
	EList<AnnotationInstanceParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Annotable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Annotable#getAnnotationInstances <em>Annotation Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotable</em>' container reference.
	 * @see #setAnnotable(Annotable)
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstance_Annotable()
	 * @see de.silvawb.java.Annotable#getAnnotationInstances
	 * @model opposite="annotationInstances" transient="false" ordered="false"
	 * @generated
	 */
	Annotable getAnnotable();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationInstance#getAnnotable <em>Annotable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotable</em>' container reference.
	 * @see #getAnnotable()
	 * @generated
	 */
	void setAnnotable(Annotable value);

} // AnnotationInstance
