/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extends Type Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.ExtendsTypeArgument#getExtendTypes <em>Extend Types</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getExtendsTypeArgument()
 * @model
 * @generated
 */
public interface ExtendsTypeArgument extends TypeArgument {
	/**
	 * Returns the value of the '<em><b>Extend Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend Types</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getExtendsTypeArgument_ExtendTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TypeReference> getExtendTypes();

} // ExtendsTypeArgument
