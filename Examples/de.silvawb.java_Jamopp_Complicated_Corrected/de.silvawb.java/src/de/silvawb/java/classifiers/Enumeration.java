/**
 */
package de.silvawb.java.classifiers;

import de.silvawb.java.members.EnumConstant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.classifiers.Enumeration#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.classifiers.ClassifiersPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends ConcreteClassifier, Implementor {
	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.members.EnumConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see de.silvawb.java.classifiers.ClassifiersPackage#getEnumeration_Constants()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumConstant> getConstants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return all interfaces extended by this enumeration.
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new de.silvawb.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();\n\n//enumerations inherit from java.lang.Enum\nde.silvawb.java.classifiers.Class enumClass = getLibClass(\"Enum\");\nresult.add(enumClass);\nresult.addAll(enumClass.getAllSuperClassifiers());\n\n//collect all implemented interfaces\nfor ( de.silvawb.java.types.TypeReference typeArg : this.getImplements()) {\n\tde.silvawb.java.classifiers.ConcreteClassifier superInterface = ( de.silvawb.java.classifiers.ConcreteClassifier) typeArg.getTarget();\n\tif (superInterface != null) {\n\t\tresult.add(superInterface);\n\t\tif (superInterface instanceof de.silvawb.java.classifiers.Interface) {\n\t\t\tresult.addAll((( de.silvawb.java.classifiers.Interface)superInterface).getAllSuperClassifiers());\n\t\t}\n\t}\n}\n\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getAllSuperClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for( de.silvawb.java.members.EnumConstant constant : getConstants()) {\n\tif (name.equals(constant.getName())) {\n\t\treturn constant;\n\t}\n \t\t}\nreturn null;'"
	 * @generated
	 */
	EnumConstant getContainedConstant(String name);

} // Enumeration
