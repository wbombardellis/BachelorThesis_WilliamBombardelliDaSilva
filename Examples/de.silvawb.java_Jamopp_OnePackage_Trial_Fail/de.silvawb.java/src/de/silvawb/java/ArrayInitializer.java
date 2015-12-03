/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.ArrayInitializer#getInitialValues <em>Initial Values</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getArrayInitializer()
 * @model
 * @generated
 */
public interface ArrayInitializer extends ArrayInitializationValue, AnnotationValue {
	/**
	 * Returns the value of the '<em><b>Initial Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.ArrayInitializationValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Values</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getArrayInitializer_InitialValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayInitializationValue> getInitialValues();

} // ArrayInitializer
