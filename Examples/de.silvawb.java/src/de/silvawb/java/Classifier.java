/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.silvawb.java.Classifier#getGenericBindings <em>Generic Bindings</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getFields <em>Fields</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getInterfaceImplementations <em>Interface Implementations</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link de.silvawb.java.Classifier#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Contained, Container, Annotable {
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
	 * Returns the value of the '<em><b>Generic Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.GenericBinding}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.GenericBinding#getUsingClassifier <em>Using Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Bindings</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_GenericBindings()
	 * @see de.silvawb.java.GenericBinding#getUsingClassifier
	 * @model opposite="usingClassifier" containment="true"
	 * @generated
	 */
	EList<GenericBinding> getGenericBindings();

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
	 * Returns the value of the '<em><b>Interface Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.InterfaceImplementation}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.InterfaceImplementation#getImplementer <em>Implementer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Implementations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Implementations</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_InterfaceImplementations()
	 * @see de.silvawb.java.InterfaceImplementation#getImplementer
	 * @model opposite="implementer" containment="true" ordered="false"
	 * @generated
	 */
	EList<InterfaceImplementation> getInterfaceImplementations();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Generalization#getGeneralizator <em>Generalizator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference.
	 * @see #setGeneralization(Generalization)
	 * @see de.silvawb.java.JavaPackage#getClassifier_Generalization()
	 * @see de.silvawb.java.Generalization#getGeneralizator
	 * @model opposite="generalizator" containment="true" ordered="false"
	 * @generated
	 */
	Generalization getGeneralization();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Classifier#getGeneralization <em>Generalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization</em>' containment reference.
	 * @see #getGeneralization()
	 * @generated
	 */
	void setGeneralization(Generalization value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.Import}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Import#getImporting <em>Importing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getClassifier_Imports()
	 * @see de.silvawb.java.Import#getImporting
	 * @model opposite="importing" containment="true" ordered="false"
	 * @generated
	 */
	EList<Import> getImports();

} // Classifier
