/**
 */
package de.silvawb.java.arrays;

import de.silvawb.java.expressions.Expression;

import de.silvawb.java.types.TypedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Instantiation By Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.arrays.ArrayInstantiationBySize#getSizes <em>Sizes</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.arrays.ArraysPackage#getArrayInstantiationBySize()
 * @model
 * @generated
 */
public interface ArrayInstantiationBySize extends ArrayInstantiation, TypedElement, ArrayTypeable {
	/**
	 * Returns the value of the '<em><b>Sizes</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sizes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizes</em>' containment reference list.
	 * @see de.silvawb.java.arrays.ArraysPackage#getArrayInstantiationBySize_Sizes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getSizes();

} // ArrayInstantiationBySize
