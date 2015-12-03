/**
 */
package de.silvawb.java.annotations;

import de.silvawb.java.commons.Commentable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.annotations.Annotable#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.annotations.AnnotationsPackage#getAnnotable()
 * @model abstract="true"
 * @generated
 */
public interface Annotable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.annotations.AnnotationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see de.silvawb.java.annotations.AnnotationsPackage#getAnnotable_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotationInstance> getAnnotations();

} // Annotable
