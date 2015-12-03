/**
 */
package de.silvawb.java.modifiers;

import de.silvawb.java.commons.Commentable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.modifiers.Modifiable#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.modifiers.ModifiersPackage#getModifiable()
 * @model abstract="true"
 * @generated
 */
public interface Modifiable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.modifiers.Modifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see de.silvawb.java.modifiers.ModifiersPackage#getModifiable_Modifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modifier> getModifiers();

} // Modifiable
