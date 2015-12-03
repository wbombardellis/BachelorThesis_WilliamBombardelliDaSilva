/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Field</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.JavaPackage#getAdditionalField()
 * @model
 * @generated
 */
public interface AdditionalField extends ReferenceableElement, ArrayTypeable, Initializable {
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

} // AdditionalField
