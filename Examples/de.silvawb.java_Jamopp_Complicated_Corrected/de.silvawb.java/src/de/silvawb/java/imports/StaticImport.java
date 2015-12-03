/**
 */
package de.silvawb.java.imports;

import de.silvawb.java.modifiers.Static;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.imports.StaticImport#getStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.imports.ImportsPackage#getStaticImport()
 * @model abstract="true"
 * @generated
 */
public interface StaticImport extends Import {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' containment reference.
	 * @see #setStatic(Static)
	 * @see de.silvawb.java.imports.ImportsPackage#getStaticImport_Static()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Static getStatic();

	/**
	 * Sets the value of the '{@link de.silvawb.java.imports.StaticImport#getStatic <em>Static</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' containment reference.
	 * @see #getStatic()
	 * @generated
	 */
	void setStatic(Static value);

} // StaticImport
