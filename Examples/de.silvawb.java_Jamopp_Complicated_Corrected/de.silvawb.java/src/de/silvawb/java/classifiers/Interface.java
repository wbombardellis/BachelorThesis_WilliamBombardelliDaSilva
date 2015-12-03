/**
 */
package de.silvawb.java.classifiers;

import de.silvawb.java.types.TypeReference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.classifiers.Interface#getExtends <em>Extends</em>}</li>
 *   <li>{@link de.silvawb.java.classifiers.Interface#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.classifiers.ClassifiersPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends ConcreteClassifier {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.types.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference list.
	 * @see de.silvawb.java.classifiers.ClassifiersPackage#getInterface_Extends()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getExtends();

	/**
	 * Returns the value of the '<em><b>Default Extends</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.types.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Extends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Extends</em>' containment reference list.
	 * @see de.silvawb.java.classifiers.ClassifiersPackage#getInterface_DefaultExtends()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getDefaultExtends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return all interfaces extended by this interface. The type is 
	 *  ConcreteClassifier, because java.lang.Object is also extended although
	 *  it is a Class.
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\n\nfor ( de.silvawb.java.types.TypeReference typeArg : this.getExtends()) {\n\t//use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface\n\tde.silvawb.java.classifiers.ConcreteClassifier superInterface = ( de.silvawb.java.classifiers.ConcreteClassifier) typeArg.getTarget();\n\tif (superInterface != null) {\n\t\tresult.add(superInterface);\n\t\tif (superInterface instanceof de.silvawb.java.classifiers.Interface) {\n\t\t\tresult.addAll((( de.silvawb.java.classifiers.Interface)superInterface).getAllSuperClassifiers());\n\t\t}\n\t}\n}\n\nfor ( de.silvawb.java.types.TypeReference typeArg : this.getDefaultExtends()) {\n\t//use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface\n\tde.silvawb.java.classifiers.ConcreteClassifier superInterface = ( de.silvawb.java.classifiers.ConcreteClassifier) typeArg.getTarget();\n\tif (superInterface != null) {\n\t\tresult.add(superInterface);\n\t\tif (superInterface instanceof de.silvawb.java.classifiers.Interface) {\n\t\t\tresult.addAll((( de.silvawb.java.classifiers.Interface)superInterface).getAllSuperClassifiers());\n\t\t}\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getAllSuperClassifiers();

} // Interface
