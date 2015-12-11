/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.InterfaceImplementation#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.silvawb.java.InterfaceImplementation#getImplementer <em>Implementer</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getInterfaceImplementation()
 * @model
 * @generated
 */
public interface InterfaceImplementation extends EObject {
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
	 * @see de.silvawb.java.JavaPackage#getInterfaceImplementation_Interface()
	 * @model ordered="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link de.silvawb.java.InterfaceImplementation#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Implementer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Classifier#getInterfaceImplementations <em>Interface Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementer</em>' container reference.
	 * @see #setImplementer(Classifier)
	 * @see de.silvawb.java.JavaPackage#getInterfaceImplementation_Implementer()
	 * @see de.silvawb.java.Classifier#getInterfaceImplementations
	 * @model opposite="interfaceImplementations" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getImplementer();

	/**
	 * Sets the value of the '{@link de.silvawb.java.InterfaceImplementation#getImplementer <em>Implementer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementer</em>' container reference.
	 * @see #getImplementer()
	 * @generated
	 */
	void setImplementer(Classifier value);

} // InterfaceImplementation
