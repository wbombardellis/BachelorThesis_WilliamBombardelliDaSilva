/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Implementor#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getImplementor()
 * @model abstract="true"
 * @generated
 */
public interface Implementor extends Commentable {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getImplementor_Implements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getImplements();

} // Implementor
