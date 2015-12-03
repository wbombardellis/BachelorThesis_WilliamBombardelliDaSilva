/**
 */
package de.silvawb.java;

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
 *   <li>{@link de.silvawb.java.Interface#getExtends <em>Extends</em>}</li>
 *   <li>{@link de.silvawb.java.Interface#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends ConcreteClassifier {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getInterface_Extends()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getExtends();

	/**
	 * Returns the value of the '<em><b>Default Extends</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Extends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Extends</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getInterface_DefaultExtends()
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();\n\nfor ( de.silvawb.java.TypeReference typeArg : this.getExtends()) {\n\t//use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface\n\tde.silvawb.java.ConcreteClassifier superInterface = ( de.silvawb.java.ConcreteClassifier) typeArg.getTarget();\n\tif (superInterface != null) {\n\t\tresult.add(superInterface);\n\t\tif (superInterface instanceof de.silvawb.java.Interface) {\n\t\t\tresult.addAll((( de.silvawb.java.Interface)superInterface).getAllSuperClassifiers());\n\t\t}\n\t}\n}\n\nfor ( de.silvawb.java.TypeReference typeArg : this.getDefaultExtends()) {\n\t//use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface\n\tde.silvawb.java.ConcreteClassifier superInterface = ( de.silvawb.java.ConcreteClassifier) typeArg.getTarget();\n\tif (superInterface != null) {\n\t\tresult.add(superInterface);\n\t\tif (superInterface instanceof de.silvawb.java.Interface) {\n\t\t\tresult.addAll((( de.silvawb.java.Interface)superInterface).getAllSuperClassifiers());\n\t\t}\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getAllSuperClassifiers();

} // Interface
