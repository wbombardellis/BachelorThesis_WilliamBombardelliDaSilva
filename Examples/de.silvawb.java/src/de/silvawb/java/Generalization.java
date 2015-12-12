/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link de.silvawb.java.Generalization#getGeneralizator <em>Generalizator</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends EObject {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Classifier)
	 * @see de.silvawb.java.JavaPackage#getGeneralization_General()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Classifier value);

	/**
	 * Returns the value of the '<em><b>Generalizator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Classifier#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizator</em>' container reference.
	 * @see #setGeneralizator(Classifier)
	 * @see de.silvawb.java.JavaPackage#getGeneralization_Generalizator()
	 * @see de.silvawb.java.Classifier#getGeneralizations
	 * @model opposite="generalizations" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getGeneralizator();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Generalization#getGeneralizator <em>Generalizator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalizator</em>' container reference.
	 * @see #getGeneralizator()
	 * @generated
	 */
	void setGeneralizator(Classifier value);

} // Generalization
