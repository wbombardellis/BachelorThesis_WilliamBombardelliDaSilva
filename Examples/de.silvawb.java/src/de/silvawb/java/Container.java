/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Container#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.Contained}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Contained#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Elements</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getContainer_ContainedElements()
	 * @see de.silvawb.java.Contained#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Contained> getContainedElements();

} // Container
