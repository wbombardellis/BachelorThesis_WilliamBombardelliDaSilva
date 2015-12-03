/**
 */
package de.silvawb.java.arrays;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Instantiation By Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.arrays.ArrayInstantiationByValues#getArrayInitializer <em>Array Initializer</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.arrays.ArraysPackage#getArrayInstantiationByValues()
 * @model abstract="true"
 * @generated
 */
public interface ArrayInstantiationByValues extends ArrayInstantiation {
	/**
	 * Returns the value of the '<em><b>Array Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Initializer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Initializer</em>' containment reference.
	 * @see #setArrayInitializer(ArrayInitializer)
	 * @see de.silvawb.java.arrays.ArraysPackage#getArrayInstantiationByValues_ArrayInitializer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArrayInitializer getArrayInitializer();

	/**
	 * Sets the value of the '{@link de.silvawb.java.arrays.ArrayInstantiationByValues#getArrayInitializer <em>Array Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Initializer</em>' containment reference.
	 * @see #getArrayInitializer()
	 * @generated
	 */
	void setArrayInitializer(ArrayInitializer value);

} // ArrayInstantiationByValues
