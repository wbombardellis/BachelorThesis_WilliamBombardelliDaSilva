/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JModel Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.JModelElement#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.JModelElement#getJNode <em>JNode</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getJModelElement()
 * @model abstract="true"
 * @generated
 */
public interface JModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.silvawb.java.JavaPackage#getJModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>JNode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JNode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JNode</em>' attribute.
	 * @see #setJNode(Object)
	 * @see de.silvawb.java.JavaPackage#getJModelElement_JNode()
	 * @model dataType="de.silvawb.java.JNode" transient="true"
	 * @generated
	 */
	Object getJNode();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JModelElement#getJNode <em>JNode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JNode</em>' attribute.
	 * @see #getJNode()
	 * @generated
	 */
	void setJNode(Object value);

} // JModelElement
