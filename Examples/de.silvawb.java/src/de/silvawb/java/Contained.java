/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Contained#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.silvawb.java.Contained#getContainer <em>Container</em>}</li>
 *   <li>{@link de.silvawb.java.Contained#getImportingClasses <em>Importing Classes</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getContained()
 * @model
 * @generated
 */
public interface Contained extends EObject {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see de.silvawb.java.JavaPackage#getContained_Visibility()
	 * @model
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Contained#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Container#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Container)
	 * @see de.silvawb.java.JavaPackage#getContained_Container()
	 * @see de.silvawb.java.Container#getContainedElements
	 * @model opposite="containedElements" transient="false" ordered="false"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Contained#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Importing Classes</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Classes</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getContained_ImportingClasses()
	 * @model ordered="false"
	 * @generated
	 */
	EList<de.silvawb.java.Class> getImportingClasses();

} // Contained
