/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Annotation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.SingleAnnotationParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getSingleAnnotationParameter()
 * @model
 * @generated
 */
public interface SingleAnnotationParameter extends AnnotationParameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AnnotationValue)
	 * @see de.silvawb.java.JavaPackage#getSingleAnnotationParameter_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AnnotationValue getValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.SingleAnnotationParameter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AnnotationValue value);

} // SingleAnnotationParameter
