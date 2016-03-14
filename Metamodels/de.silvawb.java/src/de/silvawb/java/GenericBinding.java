/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.GenericBinding#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.GenericBinding#getUpperBoundings <em>Upper Boundings</em>}</li>
 *   <li>{@link de.silvawb.java.GenericBinding#getLowerBounding <em>Lower Bounding</em>}</li>
 *   <li>{@link de.silvawb.java.GenericBinding#getUsingClassifier <em>Using Classifier</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getGenericBinding()
 * @model
 * @generated
 */
public interface GenericBinding extends EObject {
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
	 * @see de.silvawb.java.JavaPackage#getGenericBinding_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.silvawb.java.GenericBinding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Upper Boundings</b></em>' reference list.
	 * The list contents are of type {@link de.silvawb.java.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Boundings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Boundings</em>' reference list.
	 * @see de.silvawb.java.JavaPackage#getGenericBinding_UpperBoundings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getUpperBoundings();

	/**
	 * Returns the value of the '<em><b>Lower Bounding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bounding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bounding</em>' reference.
	 * @see #setLowerBounding(Classifier)
	 * @see de.silvawb.java.JavaPackage#getGenericBinding_LowerBounding()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getLowerBounding();

	/**
	 * Sets the value of the '{@link de.silvawb.java.GenericBinding#getLowerBounding <em>Lower Bounding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bounding</em>' reference.
	 * @see #getLowerBounding()
	 * @generated
	 */
	void setLowerBounding(Classifier value);

	/**
	 * Returns the value of the '<em><b>Using Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Classifier#getGenericBindings <em>Generic Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Classifier</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Classifier</em>' container reference.
	 * @see #setUsingClassifier(Classifier)
	 * @see de.silvawb.java.JavaPackage#getGenericBinding_UsingClassifier()
	 * @see de.silvawb.java.Classifier#getGenericBindings
	 * @model opposite="genericBindings" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getUsingClassifier();

	/**
	 * Sets the value of the '{@link de.silvawb.java.GenericBinding#getUsingClassifier <em>Using Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using Classifier</em>' container reference.
	 * @see #getUsingClassifier()
	 * @generated
	 */
	void setUsingClassifier(Classifier value);

} // GenericBinding
