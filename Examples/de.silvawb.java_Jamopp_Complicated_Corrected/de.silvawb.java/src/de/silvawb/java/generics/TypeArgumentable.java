/**
 */
package de.silvawb.java.generics;

import de.silvawb.java.commons.Commentable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Argumentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.generics.TypeArgumentable#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.generics.GenericsPackage#getTypeArgumentable()
 * @model abstract="true"
 * @generated
 */
public interface TypeArgumentable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.generics.TypeArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see de.silvawb.java.generics.GenericsPackage#getTypeArgumentable_TypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<de.silvawb.java.generics.TypeArgument> getTypeArguments();

} // TypeArgumentable
