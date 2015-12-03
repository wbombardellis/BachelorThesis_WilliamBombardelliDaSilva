/**
 */
package de.silvawb.layout;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Layout Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.layout.ReferenceLayoutInformation#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see de.silvawb.layout.LayoutPackage#getReferenceLayoutInformation()
 * @model
 * @generated
 */
public interface ReferenceLayoutInformation extends LayoutInformation {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(EObject)
	 * @see de.silvawb.layout.LayoutPackage#getReferenceLayoutInformation_Object()
	 * @model required="true"
	 * @generated
	 */
	EObject getObject();

	/**
	 * Sets the value of the '{@link de.silvawb.layout.ReferenceLayoutInformation#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(EObject value);

} // ReferenceLayoutInformation
