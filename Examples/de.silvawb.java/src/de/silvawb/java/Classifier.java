/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Classifier#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getTemplateBindings <em>Template Bindings</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getUnderTemplateBindings <em>Under Template Bindings</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getFields <em>Fields</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getTypingFields <em>Typing Fields</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getTypingMethods <em>Typing Methods</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getTypingArguments <em>Typing Arguments</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.silvawb.java.JavaPackage#getClassifier_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Classifier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Template Bindings</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.TemplateBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Bindings</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_TemplateBindings()
	 * @model
	 * @generated
	 */
	EList<TemplateBinding> getTemplateBindings();

	/**
	 * Returns the value of the '<em><b>Under Template Bindings</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.TemplateBinding}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.TemplateBinding#getOverClassifier <em>Over Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under Template Bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under Template Bindings</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_UnderTemplateBindings()
	 * @see de.silvawb.java.TemplateBinding#getOverClassifier
	 * @model opposite="overClassifier" ordered="false"
	 * @generated
	 */
	EList<TemplateBinding> getUnderTemplateBindings();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.Field}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Field#getContainingClassifier <em>Containing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_Fields()
	 * @see de.silvawb.java.Field#getContainingClassifier
	 * @model opposite="containingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Typing Fields</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Field}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typing Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typing Fields</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_TypingFields()
	 * @see de.silvawb.java.Field#getType
	 * @model opposite="type" ordered="false"
	 * @generated
	 */
	EList<Field> getTypingFields();

	/**
	 * Returns the value of the '<em><b>Typing Methods</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Method}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typing Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typing Methods</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_TypingMethods()
	 * @see de.silvawb.java.Method#getReturnType
	 * @model opposite="returnType" ordered="false"
	 * @generated
	 */
	EList<Method> getTypingMethods();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.Method}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Method#getContainingClassifier <em>Containing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_Methods()
	 * @see de.silvawb.java.Method#getContainingClassifier
	 * @model opposite="containingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Typing Arguments</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Argument}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Argument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typing Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typing Arguments</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_TypingArguments()
	 * @see de.silvawb.java.Argument#getType
	 * @model opposite="type" ordered="false"
	 * @generated
	 */
	EList<Argument> getTypingArguments();

} // Classifier
