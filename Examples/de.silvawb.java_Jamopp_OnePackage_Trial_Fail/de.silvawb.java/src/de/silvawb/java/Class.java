/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Class#getExtends <em>Extends</em>}</li>
 *   <li>{@link de.silvawb.java.Class#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ConcreteClassifier, Implementor {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(TypeReference)
	 * @see de.silvawb.java.JavaPackage#getClass_Extends()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getExtends();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Class#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' containment reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Default Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Extends</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Extends</em>' containment reference.
	 * @see #setDefaultExtends(TypeReference)
	 * @see de.silvawb.java.JavaPackage#getClass_DefaultExtends()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getDefaultExtends();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Class#getDefaultExtends <em>Default Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Extends</em>' containment reference.
	 * @see #getDefaultExtends()
	 * @generated
	 */
	void setDefaultExtends(TypeReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Recursively collects all super types (extended classes and implemented interfaces)
	 *  of the given class.
	 *  
	 *  @param classifierList the list for the result
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = \n\tnew org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();\n\t\t\t\n//collects all superclasses first\nde.silvawb.java.Class superClass = this;\nwhile (superClass != null && !superClass.eIsProxy() && \n\t\t!superClass.equals(getObjectClass())) {\n\tsuperClass = superClass.getSuperClass();\n\tif (superClass != null) {\n\t\tresult.add(superClass);\n\t}\n}\n\n//collect all implemented interfaces\nfor ( de.silvawb.java.TypeReference typeArg : this.getImplements()) {\n\tde.silvawb.java.ConcreteClassifier superInterface = ( de.silvawb.java.ConcreteClassifier) typeArg.getTarget();\n\tif (superInterface != null) {\n\t\tresult.add(superInterface);\n\t\tif (superInterface instanceof de.silvawb.java.Interface) {\n\t\t\tresult.addAll((( de.silvawb.java.Interface)superInterface).getAllSuperClassifiers());\n\t\t}\n\t}\n}\n\n//collect all implemented interfaces of super classes\nsuperClass = this.getSuperClass();\t\nif (superClass != null && !superClass.eIsProxy() && \n\t\t!superClass.equals(getObjectClass())) {\n\tresult.addAll(superClass.getAllSuperClassifiers());\n}\t\n\nreturn result;'"
	 * @generated
	 */
	EList<ConcreteClassifier> getAllSuperClassifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param this
	 *  @return the direct super class
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.TypeReference superClassReference = this.getExtends();\nif (superClassReference == null) {\n\tsuperClassReference = this.getDefaultExtends();\n}\nif (superClassReference == null) {\n\treturn null;\n}\nde.silvawb.java.Type result = superClassReference.getTarget();\nif (result instanceof de.silvawb.java.Class) {\n\treturn ( de.silvawb.java.Class) result;\n}\nreturn null;'"
	 * @generated
	 */
	Class getSuperClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param this
	 *  @return primitive type, if the class can be wrapped
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getLibClass(\"Boolean\").equals(this)) {\n\treturn de.silvawb.java.TypesFactory.eINSTANCE.createBoolean();\n}\nif (getLibClass(\"Byte\").equals(this)) {\n\treturn de.silvawb.java.TypesFactory.eINSTANCE.createByte();\n}\nif (getLibClass(\"Character\").equals(this)) {\n\treturn de.silvawb.java.TypesFactory.eINSTANCE.createChar();\n}\nif (getLibClass(\"Float\").equals(this)) {\n\treturn de.silvawb.java.TypesFactory.eINSTANCE.createFloat();\n}\nif (getLibClass(\"Double\").equals(this)) {\n\treturn de.silvawb.java.TypesFactory.eINSTANCE.createDouble();\n}\nif (getLibClass(\"Integer\").equals(this)) {\n\treturn de.silvawb.java.TypesFactory.eINSTANCE.createInt();\n}\nif (getLibClass(\"Long\").equals(this)) {\n\treturn de.silvawb.java.TypesFactory.eINSTANCE.createLong();\n}\nif (getLibClass(\"Short\").equals(this)) {\n\treturn de.silvawb.java.TypesFactory.eINSTANCE.createShort();\n}\nif (getLibClass(\"Void\").equals(this)) {\n\treturn de.silvawb.java.TypesFactory.eINSTANCE.createVoid();\n}\nreturn null;'"
	 * @generated
	 */
	PrimitiveType unWrapPrimitiveType();

} // Class
