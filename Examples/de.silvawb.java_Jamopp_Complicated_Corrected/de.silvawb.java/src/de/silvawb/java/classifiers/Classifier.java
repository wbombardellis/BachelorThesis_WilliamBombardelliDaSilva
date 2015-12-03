/**
 */
package de.silvawb.java.classifiers;

import de.silvawb.java.references.ReferenceableElement;

import de.silvawb.java.types.Type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.classifiers.ClassifiersPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Type, ReferenceableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='//method has to be specified in subclasses\nthrow new java.lang.UnsupportedOperationException();'"
	 * @generated
	 */
	EList<ConcreteClassifier> getAllSuperClassifiers();

} // Classifier
