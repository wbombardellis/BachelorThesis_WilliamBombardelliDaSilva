/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interface Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.interfaceImplementation#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.silvawb.java.interfaceImplementation#getImplementer <em>Implementer</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getinterfaceImplementation()
 * @model
 * @generated
 */
public interface interfaceImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see de.silvawb.java.JavaPackage#getinterfaceImplementation_Interface()
	 * @model ordered="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link de.silvawb.java.interfaceImplementation#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Implementer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Classifier#getInterfaceImplementations <em>Interface Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementer</em>' reference.
	 * @see #setImplementer(Classifier)
	 * @see de.silvawb.java.JavaPackage#getinterfaceImplementation_Implementer()
	 * @see de.silvawb.java.Classifier#getInterfaceImplementations
	 * @model opposite="interfaceImplementations" ordered="false"
	 * @generated
	 */
	Classifier getImplementer();

	/**
	 * Sets the value of the '{@link de.silvawb.java.interfaceImplementation#getImplementer <em>Implementer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementer</em>' reference.
	 * @see #getImplementer()
	 * @generated
	 */
	void setImplementer(Classifier value);

} // interfaceImplementation
