/**
 */
package de.silvawb.java.classifiers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.classifiers.ClassifiersPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends ConcreteClassifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return <code>java.lang.annotation.Annotation</code> 
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\nresult.add(getAnnotationInterface());\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getAllSuperClassifiers();

} // Annotation
