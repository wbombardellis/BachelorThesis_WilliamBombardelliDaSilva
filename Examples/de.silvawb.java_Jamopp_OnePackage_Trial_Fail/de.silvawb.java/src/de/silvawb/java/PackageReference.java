/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.PackageReference#getSubpackages <em>Subpackages</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getPackageReference()
 * @model
 * @generated
 */
public interface PackageReference extends ReferenceableElement {
	/**
	 * Returns the value of the '<em><b>Subpackages</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.PackageReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpackages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackages</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getPackageReference_Subpackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageReference> getSubpackages();

} // PackageReference
