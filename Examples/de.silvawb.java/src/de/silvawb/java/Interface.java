/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Interface#getImplementingClasses <em>Implementing Classes</em>}</li>
 *   <li>{@link de.silvawb.java.Interface#getExtendedInterfaces <em>Extended Interfaces</em>}</li>
 *   <li>{@link de.silvawb.java.Interface#getExtendingInterfaces <em>Extending Interfaces</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Classifier, Contained, Container {
	/**
	 * Returns the value of the '<em><b>Implementing Classes</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Class}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Class#getImplementedInterfaces <em>Implemented Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementing Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementing Classes</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getInterface_ImplementingClasses()
	 * @see de.silvawb.java.Class#getImplementedInterfaces
	 * @model opposite="implementedInterfaces" ordered="false"
	 * @generated
	 */
	EList<de.silvawb.java.Class> getImplementingClasses();

	/**
	 * Returns the value of the '<em><b>Extended Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Interface}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Interface#getExtendingInterfaces <em>Extending Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Interfaces</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getInterface_ExtendedInterfaces()
	 * @see de.silvawb.java.Interface#getExtendingInterfaces
	 * @model opposite="extendingInterfaces" ordered="false"
	 * @generated
	 */
	EList<Interface> getExtendedInterfaces();

	/**
	 * Returns the value of the '<em><b>Extending Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Interface}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Interface#getExtendedInterfaces <em>Extended Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extending Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extending Interfaces</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getInterface_ExtendingInterfaces()
	 * @see de.silvawb.java.Interface#getExtendedInterfaces
	 * @model opposite="extendedInterfaces" ordered="false"
	 * @generated
	 */
	EList<Interface> getExtendingInterfaces();

} // Interface
