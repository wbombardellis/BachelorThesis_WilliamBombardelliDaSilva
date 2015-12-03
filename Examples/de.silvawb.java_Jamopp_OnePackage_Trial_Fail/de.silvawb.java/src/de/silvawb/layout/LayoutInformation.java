/**
 */
package de.silvawb.layout;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.layout.LayoutInformation#getStartOffset <em>Start Offset</em>}</li>
 *   <li>{@link de.silvawb.layout.LayoutInformation#getHiddenTokenText <em>Hidden Token Text</em>}</li>
 *   <li>{@link de.silvawb.layout.LayoutInformation#getVisibleTokenText <em>Visible Token Text</em>}</li>
 *   <li>{@link de.silvawb.layout.LayoutInformation#getSyntaxElementID <em>Syntax Element ID</em>}</li>
 * </ul>
 *
 * @see de.silvawb.layout.LayoutPackage#getLayoutInformation()
 * @model abstract="true"
 * @generated
 */
public interface LayoutInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Offset</em>' attribute.
	 * @see #setStartOffset(int)
	 * @see de.silvawb.layout.LayoutPackage#getLayoutInformation_StartOffset()
	 * @model required="true"
	 * @generated
	 */
	int getStartOffset();

	/**
	 * Sets the value of the '{@link de.silvawb.layout.LayoutInformation#getStartOffset <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Offset</em>' attribute.
	 * @see #getStartOffset()
	 * @generated
	 */
	void setStartOffset(int value);

	/**
	 * Returns the value of the '<em><b>Hidden Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden Token Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Token Text</em>' attribute.
	 * @see #setHiddenTokenText(String)
	 * @see de.silvawb.layout.LayoutPackage#getLayoutInformation_HiddenTokenText()
	 * @model required="true"
	 * @generated
	 */
	String getHiddenTokenText();

	/**
	 * Sets the value of the '{@link de.silvawb.layout.LayoutInformation#getHiddenTokenText <em>Hidden Token Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden Token Text</em>' attribute.
	 * @see #getHiddenTokenText()
	 * @generated
	 */
	void setHiddenTokenText(String value);

	/**
	 * Returns the value of the '<em><b>Visible Token Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Token Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Token Text</em>' attribute.
	 * @see #setVisibleTokenText(String)
	 * @see de.silvawb.layout.LayoutPackage#getLayoutInformation_VisibleTokenText()
	 * @model required="true"
	 * @generated
	 */
	String getVisibleTokenText();

	/**
	 * Sets the value of the '{@link de.silvawb.layout.LayoutInformation#getVisibleTokenText <em>Visible Token Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Token Text</em>' attribute.
	 * @see #getVisibleTokenText()
	 * @generated
	 */
	void setVisibleTokenText(String value);

	/**
	 * Returns the value of the '<em><b>Syntax Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syntax Element ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax Element ID</em>' attribute.
	 * @see #setSyntaxElementID(String)
	 * @see de.silvawb.layout.LayoutPackage#getLayoutInformation_SyntaxElementID()
	 * @model required="true"
	 * @generated
	 */
	String getSyntaxElementID();

	/**
	 * Sets the value of the '{@link de.silvawb.layout.LayoutInformation#getSyntaxElementID <em>Syntax Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax Element ID</em>' attribute.
	 * @see #getSyntaxElementID()
	 * @generated
	 */
	void setSyntaxElementID(String value);

} // LayoutInformation
