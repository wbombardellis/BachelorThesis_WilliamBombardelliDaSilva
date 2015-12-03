/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCompilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.JCompilationUnit#getImports <em>Imports</em>}</li>
 *   <li>{@link de.silvawb.java.JCompilationUnit#getComment <em>Comment</em>}</li>
 *   <li>{@link de.silvawb.java.JCompilationUnit#getTypes <em>Types</em>}</li>
 *   <li>{@link de.silvawb.java.JCompilationUnit#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link de.silvawb.java.JCompilationUnit#getImportedTypes <em>Imported Types</em>}</li>
 *   <li>{@link de.silvawb.java.JCompilationUnit#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getJCompilationUnit()
 * @model
 * @generated
 */
public interface JCompilationUnit extends JModelElement {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see de.silvawb.java.JavaPackage#getJCompilationUnit_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see de.silvawb.java.JavaPackage#getJCompilationUnit_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JCompilationUnit#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.JClass}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.JClass#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getJCompilationUnit_Types()
	 * @see de.silvawb.java.JClass#getUnit
	 * @model opposite="unit" containment="true"
	 * @generated
	 */
	EList<JClass> getTypes();

	/**
	 * Returns the value of the '<em><b>Imported Packages</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Packages</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJCompilationUnit_ImportedPackages()
	 * @model
	 * @generated
	 */
	EList<JPackage> getImportedPackages();

	/**
	 * Returns the value of the '<em><b>Imported Types</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Types</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJCompilationUnit_ImportedTypes()
	 * @model
	 * @generated
	 */
	EList<JClass> getImportedTypes();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(JPackage)
	 * @see de.silvawb.java.JavaPackage#getJCompilationUnit_Package()
	 * @model
	 * @generated
	 */
	JPackage getPackage();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JCompilationUnit#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(JPackage value);

} // JCompilationUnit
