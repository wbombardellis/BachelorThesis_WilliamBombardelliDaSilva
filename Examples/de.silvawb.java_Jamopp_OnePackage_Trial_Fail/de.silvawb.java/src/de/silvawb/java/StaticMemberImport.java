/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Member Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.StaticMemberImport#getStaticMembers <em>Static Members</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getStaticMemberImport()
 * @model
 * @generated
 */
public interface StaticMemberImport extends StaticImport {
	/**
	 * Returns the value of the '<em><b>Static Members</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.ReferenceableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Members</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getStaticMemberImport_StaticMembers()
	 * @model required="true"
	 * @generated
	 */
	EList<ReferenceableElement> getStaticMembers();

} // StaticMemberImport
