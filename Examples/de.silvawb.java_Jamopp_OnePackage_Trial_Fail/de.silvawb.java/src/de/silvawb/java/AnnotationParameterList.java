/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.AnnotationParameterList#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAnnotationParameterList()
 * @model
 * @generated
 */
public interface AnnotationParameterList extends AnnotationParameter {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.AnnotationAttributeSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getAnnotationParameterList_Settings()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotationAttributeSetting> getSettings();

} // AnnotationParameterList
