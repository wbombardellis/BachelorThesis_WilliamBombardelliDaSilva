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
 *   <li>{@link de.silvawb.java.Class#getExtendedClass <em>Extended Class</em>}</li>
 *   <li>{@link de.silvawb.java.Class#getExtendingClasses <em>Extending Classes</em>}</li>
 *   <li>{@link de.silvawb.java.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link de.silvawb.java.Class#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.silvawb.java.Class#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.silvawb.java.Class#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {

	/**
	 * Returns the value of the '<em><b>Extended Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Class#getExtendingClasses <em>Extending Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Class</em>' reference.
	 * @see #setExtendedClass(Class)
	 * @see de.silvawb.java.JavaPackage#getClass_ExtendedClass()
	 * @see de.silvawb.java.Class#getExtendingClasses
	 * @model opposite="extendingClasses" ordered="false"
	 * @generated
	 */
	Class getExtendedClass();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Class#getExtendedClass <em>Extended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Class</em>' reference.
	 * @see #getExtendedClass()
	 * @generated
	 */
	void setExtendedClass(Class value);

	/**
	 * Returns the value of the '<em><b>Extending Classes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Class#getExtendedClass <em>Extended Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extending Classes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extending Classes</em>' reference.
	 * @see #setExtendingClasses(Class)
	 * @see de.silvawb.java.JavaPackage#getClass_ExtendingClasses()
	 * @see de.silvawb.java.Class#getExtendedClass
	 * @model opposite="extendedClass" ordered="false"
	 * @generated
	 */
	Class getExtendingClasses();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Class#getExtendingClasses <em>Extending Classes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extending Classes</em>' reference.
	 * @see #getExtendingClasses()
	 * @generated
	 */
	void setExtendingClasses(Class value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see de.silvawb.java.JavaPackage#getClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see de.silvawb.java.JavaPackage#getClass_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Class#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see de.silvawb.java.JavaPackage#getClass_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Class#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Contained}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Contained#getImportingClasses <em>Importing Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getClass_Imports()
	 * @see de.silvawb.java.Contained#getImportingClasses
	 * @model opposite="importingClasses" ordered="false"
	 * @generated
	 */
	EList<Contained> getImports();
} // Class
