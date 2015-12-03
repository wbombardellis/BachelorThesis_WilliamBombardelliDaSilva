/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.AnnotationInstance#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link de.silvawb.java.AnnotationInstance#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getAnnotationInstance()
 * @model
 * @generated
 */
public interface AnnotationInstance extends Reference, AnnotationInstanceOrModifier, NamespaceAwareElement {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' reference.
	 * @see #setAnnotation(Classifier)
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstance_Annotation()
	 * @model required="true"
	 * @generated
	 */
	Classifier getAnnotation();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationInstance#getAnnotation <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Classifier value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(AnnotationParameter)
	 * @see de.silvawb.java.JavaPackage#getAnnotationInstance_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	AnnotationParameter getParameter();

	/**
	 * Sets the value of the '{@link de.silvawb.java.AnnotationInstance#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(AnnotationParameter value);

} // AnnotationInstance
