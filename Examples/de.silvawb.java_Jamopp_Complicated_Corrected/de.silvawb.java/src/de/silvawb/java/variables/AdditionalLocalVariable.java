/**
 */
package de.silvawb.java.variables;

import de.silvawb.java.arrays.ArrayTypeable;

import de.silvawb.java.instantiations.Initializable;

import de.silvawb.java.references.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.variables.VariablesPackage#getAdditionalLocalVariable()
 * @model
 * @generated
 */
public interface AdditionalLocalVariable extends ReferenceableElement, ArrayTypeable, Initializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long size = this.getArrayDimensionsBefore().size() + this.getArrayDimensionsAfter().size();\nreturn size;'"
	 * @generated
	 */
	long getArrayDimension();

} // AdditionalLocalVariable
