/**
 */
package de.silvawb.java.types;

import de.silvawb.java.classifiers.Classifier;

import de.silvawb.java.generics.TypeArgumentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.types.ClassifierReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.types.TypesPackage#getClassifierReference()
 * @model
 * @generated
 */
public interface ClassifierReference extends TypeReference, TypeArgumentable {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Classifier)
	 * @see de.silvawb.java.types.TypesPackage#getClassifierReference_Target()
	 * @model required="true"
	 * @generated
	 */
	Classifier getTarget();

	/**
	 * Sets the value of the '{@link de.silvawb.java.types.ClassifierReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Classifier value);

} // ClassifierReference
