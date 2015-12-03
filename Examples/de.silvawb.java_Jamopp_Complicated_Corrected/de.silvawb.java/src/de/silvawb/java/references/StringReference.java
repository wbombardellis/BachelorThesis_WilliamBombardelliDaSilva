/**
 */
package de.silvawb.java.references;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.references.StringReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.references.ReferencesPackage#getStringReference()
 * @model
 * @generated
 */
public interface StringReference extends Reference {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.silvawb.java.references.ReferencesPackage#getStringReference_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.references.StringReference#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringReference
