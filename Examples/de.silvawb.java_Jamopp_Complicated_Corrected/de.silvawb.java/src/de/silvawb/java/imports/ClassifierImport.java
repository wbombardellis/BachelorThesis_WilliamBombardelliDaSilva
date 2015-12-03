/**
 */
package de.silvawb.java.imports;

import de.silvawb.java.classifiers.ConcreteClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.imports.ClassifierImport#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.imports.ImportsPackage#getClassifierImport()
 * @model
 * @generated
 */
public interface ClassifierImport extends Import {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(ConcreteClassifier)
	 * @see de.silvawb.java.imports.ImportsPackage#getClassifierImport_Classifier()
	 * @model required="true"
	 * @generated
	 */
	ConcreteClassifier getClassifier();

	/**
	 * Sets the value of the '{@link de.silvawb.java.imports.ClassifierImport#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(ConcreteClassifier value);

} // ClassifierImport
