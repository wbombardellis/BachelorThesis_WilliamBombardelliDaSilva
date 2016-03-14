/**
 */
package de.silvawb.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.TemplateBinding#getName <em>Name</em>}</li>
 *   <li>{@link de.silvawb.java.TemplateBinding#getTypeOverClassifier <em>Type Over Classifier</em>}</li>
 *   <li>{@link de.silvawb.java.TemplateBinding#getOverClassifier <em>Over Classifier</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends EObject {
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
	 * @see de.silvawb.java.JavaPackage#getTemplateBinding_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.silvawb.java.TemplateBinding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Over Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Over Classifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Over Classifier</em>' attribute.
	 * @see #setTypeOverClassifier(String)
	 * @see de.silvawb.java.JavaPackage#getTemplateBinding_TypeOverClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	String getTypeOverClassifier();

	/**
	 * Sets the value of the '{@link de.silvawb.java.TemplateBinding#getTypeOverClassifier <em>Type Over Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Over Classifier</em>' attribute.
	 * @see #getTypeOverClassifier()
	 * @generated
	 */
	void setTypeOverClassifier(String value);

	/**
	 * Returns the value of the '<em><b>Over Classifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.silvawb.java.Classifier#getUnderTemplateBindings <em>Under Template Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Over Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over Classifier</em>' reference.
	 * @see #setOverClassifier(Classifier)
	 * @see de.silvawb.java.JavaPackage#getTemplateBinding_OverClassifier()
	 * @see de.silvawb.java.Classifier#getUnderTemplateBindings
	 * @model opposite="underTemplateBindings" ordered="false"
	 * @generated
	 */
	Classifier getOverClassifier();

	/**
	 * Sets the value of the '{@link de.silvawb.java.TemplateBinding#getOverClassifier <em>Over Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over Classifier</em>' reference.
	 * @see #getOverClassifier()
	 * @generated
	 */
	void setOverClassifier(Classifier value);

} // TemplateBinding
