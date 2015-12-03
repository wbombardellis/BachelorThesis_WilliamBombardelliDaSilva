/**
 */
package de.silvawb.java.arrays;

import de.silvawb.java.annotations.AnnotationValue;

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
 *   <li>{@link de.silvawb.java.arrays.ArrayInitializer#getInitialValues <em>Initial Values</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.arrays.ArraysPackage#getArrayInitializer()
 * @model
 * @generated
 */
public interface ArrayInitializer extends ArrayInitializationValue, AnnotationValue {
	/**
	 * Returns the value of the '<em><b>Initial Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.arrays.ArrayInitializationValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Values</em>' containment reference list.
	 * @see de.silvawb.java.arrays.ArraysPackage#getArrayInitializer_InitialValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayInitializationValue> getInitialValues();

} // ArrayInitializer
