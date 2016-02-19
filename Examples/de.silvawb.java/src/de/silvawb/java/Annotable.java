/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Annotable#getAnnotationInstances <em>Annotation Instances</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAnnotable()
 * @model abstract="true"
 * @generated
 */
public interface Annotable extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.AnnotationInstance}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.AnnotationInstance#getAnnotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Instances</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getAnnotable_AnnotationInstances()
	 * @see de.silvawb.java.AnnotationInstance#getAnnotable
	 * @model opposite="annotable" containment="true"
	 * @generated
	 */
	EList<AnnotationInstance> getAnnotationInstances();

} // Annotable
