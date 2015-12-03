/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parametrizable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.TypeParametrizable#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getTypeParametrizable()
 * @model abstract="true"
 * @generated
 */
public interface TypeParametrizable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getTypeParametrizable_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

} // TypeParametrizable
