/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Import#getImported <em>Imported</em>}</li>
 *   <li>{@link de.silvawb.java.Import#getImporting <em>Importing</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported</em>' reference.
	 * @see #setImported(Classifier)
	 * @see de.silvawb.java.JavaPackage#getImport_Imported()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getImported();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Import#getImported <em>Imported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported</em>' reference.
	 * @see #getImported()
	 * @generated
	 */
	void setImported(Classifier value);

	/**
	 * Returns the value of the '<em><b>Importing</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Classifier#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing</em>' container reference.
	 * @see #setImporting(Classifier)
	 * @see de.silvawb.java.JavaPackage#getImport_Importing()
	 * @see de.silvawb.java.Classifier#getImports
	 * @model opposite="imports" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getImporting();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Import#getImporting <em>Importing</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing</em>' container reference.
	 * @see #getImporting()
	 * @generated
	 */
	void setImporting(Classifier value);

} // Import
