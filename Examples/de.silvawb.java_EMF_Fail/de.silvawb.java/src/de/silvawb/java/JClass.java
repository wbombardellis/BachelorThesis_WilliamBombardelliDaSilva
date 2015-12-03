/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.JClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#isFinal <em>Final</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#isThrowable <em>Throwable</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getFields <em>Fields</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getAllSuperTypes <em>All Super Types</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getMembers <em>Members</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getAllMethods <em>All Methods</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getAllFields <em>All Fields</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getPackage <em>Package</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getTypes <em>Types</em>}</li>
 *   <li>{@link de.silvawb.java.JClass#getAllTypes <em>All Types</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getJClass()
 * @model
 * @generated
 */
public interface JClass extends JMember {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see de.silvawb.java.JavaPackage#getJClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see de.silvawb.java.JavaPackage#getJClass_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JClass#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see de.silvawb.java.JavaPackage#getJClass_Interface()
	 * @model
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JClass#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Throwable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throwable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throwable</em>' attribute.
	 * @see #setThrowable(boolean)
	 * @see de.silvawb.java.JavaPackage#getJClass_Throwable()
	 * @model
	 * @generated
	 */
	boolean isThrowable();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JClass#isThrowable <em>Throwable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throwable</em>' attribute.
	 * @see #isThrowable()
	 * @generated
	 */
	void setThrowable(boolean value);

	/**
	 * Returns the value of the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class</em>' attribute.
	 * @see #setJavaClass(Class)
	 * @see de.silvawb.java.JavaPackage#getJClass_JavaClass()
	 * @model dataType="de.silvawb.java.JavaClass<?>" transient="true"
	 * @generated
	 */
	Class<?> getJavaClass();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JClass#getJavaClass <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class</em>' attribute.
	 * @see #getJavaClass()
	 * @generated
	 */
	void setJavaClass(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJClass_Fields()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	EList<JField> getFields();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJClass_Methods()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	EList<JMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJClass_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<JClass> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>All Super Types</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Super Types</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJClass_AllSuperTypes()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	EList<JClass> getAllSuperTypes();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.JMember}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.JMember#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getJClass_Members()
	 * @see de.silvawb.java.JMember#getContainingType
	 * @model opposite="containingType" containment="true"
	 * @generated
	 */
	EList<JMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.JClass#getArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' container reference.
	 * @see #setComponentType(JClass)
	 * @see de.silvawb.java.JavaPackage#getJClass_ComponentType()
	 * @see de.silvawb.java.JClass#getArrayType
	 * @model opposite="arrayType"
	 * @generated
	 */
	JClass getComponentType();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JClass#getComponentType <em>Component Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' container reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(JClass value);

	/**
	 * Returns the value of the '<em><b>Array Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.JClass#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Type</em>' containment reference.
	 * @see #setArrayType(JClass)
	 * @see de.silvawb.java.JavaPackage#getJClass_ArrayType()
	 * @see de.silvawb.java.JClass#getComponentType
	 * @model opposite="componentType" containment="true" transient="true"
	 * @generated
	 */
	JClass getArrayType();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JClass#getArrayType <em>Array Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Type</em>' containment reference.
	 * @see #getArrayType()
	 * @generated
	 */
	void setArrayType(JClass value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.JCompilationUnit#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' container reference.
	 * @see #setUnit(JCompilationUnit)
	 * @see de.silvawb.java.JavaPackage#getJClass_Unit()
	 * @see de.silvawb.java.JCompilationUnit#getTypes
	 * @model opposite="types"
	 * @generated
	 */
	JCompilationUnit getUnit();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JClass#getUnit <em>Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' container reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(JCompilationUnit value);

	/**
	 * Returns the value of the '<em><b>All Methods</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Methods</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJClass_AllMethods()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	EList<JMethod> getAllMethods();

	/**
	 * Returns the value of the '<em><b>All Fields</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Fields</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJClass_AllFields()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	EList<JField> getAllFields();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.JPackage#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(JPackage)
	 * @see de.silvawb.java.JavaPackage#getJClass_Package()
	 * @see de.silvawb.java.JPackage#getTypes
	 * @model opposite="types"
	 * @generated
	 */
	JPackage getPackage();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JClass#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(JPackage value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJClass_Types()
	 * @model
	 * @generated
	 */
	EList<JClass> getTypes();

	/**
	 * Returns the value of the '<em><b>All Types</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Types</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJClass_AllTypes()
	 * @model
	 * @generated
	 */
	EList<JClass> getAllTypes();

} // JClass
