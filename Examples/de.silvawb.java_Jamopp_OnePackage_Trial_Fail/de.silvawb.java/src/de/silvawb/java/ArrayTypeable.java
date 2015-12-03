/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Typeable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.ArrayTypeable#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link de.silvawb.java.ArrayTypeable#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getArrayTypeable()
 * @model abstract="true"
 * @generated
 */
public interface ArrayTypeable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Array Dimensions Before</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.ArrayDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Dimensions Before</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimensions Before</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getArrayTypeable_ArrayDimensionsBefore()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayDimension> getArrayDimensionsBefore();

	/**
	 * Returns the value of the '<em><b>Array Dimensions After</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.ArrayDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Dimensions After</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimensions After</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getArrayTypeable_ArrayDimensionsAfter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayDimension> getArrayDimensionsAfter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	long getArrayDimension();

} // ArrayTypeable
