/**
 */
package de.silvawb.java.members;

import de.silvawb.java.instantiations.Initializable;

import de.silvawb.java.modifiers.AnnotableAndModifiable;

import de.silvawb.java.references.ReferenceableElement;

import de.silvawb.java.variables.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.members.Field#getAdditionalFields <em>Additional Fields</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.members.MembersPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Member, Initializable, Variable, ReferenceableElement, AnnotableAndModifiable {
	/**
	 * Returns the value of the '<em><b>Additional Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.members.AdditionalField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Fields</em>' containment reference list.
	 * @see de.silvawb.java.members.MembersPackage#getField_AdditionalFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionalField> getAdditionalFields();

} // Field
