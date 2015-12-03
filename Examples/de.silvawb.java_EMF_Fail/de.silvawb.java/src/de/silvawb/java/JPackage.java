/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.JPackage#getJavaPackage <em>Java Package</em>}</li>
 *   <li>{@link de.silvawb.java.JPackage#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getJPackage()
 * @model
 * @generated
 */
public interface JPackage extends JModelElement {
	/**
	 * Returns the value of the '<em><b>Java Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Package</em>' attribute.
	 * @see #setJavaPackage(Package)
	 * @see de.silvawb.java.JavaPackage#getJPackage_JavaPackage()
	 * @model dataType="de.silvawb.java.JavaPackage"
	 * @generated
	 */
	Package getJavaPackage();

	/**
	 * Sets the value of the '{@link de.silvawb.java.JPackage#getJavaPackage <em>Java Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Package</em>' attribute.
	 * @see #getJavaPackage()
	 * @generated
	 */
	void setJavaPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.JClass}.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.JClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getJPackage_Types()
	 * @see de.silvawb.java.JClass#getPackage
	 * @model opposite="package"
	 * @generated
	 */
	EList<JClass> getTypes();

} // JPackage
