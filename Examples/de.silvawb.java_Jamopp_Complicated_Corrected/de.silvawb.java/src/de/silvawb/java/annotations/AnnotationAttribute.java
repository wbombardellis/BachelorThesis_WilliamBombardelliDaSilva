/**
 */
package de.silvawb.java.annotations;

import de.silvawb.java.expressions.Expression;

import de.silvawb.java.members.InterfaceMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.annotations.AnnotationAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.annotations.AnnotationsPackage#getAnnotationAttribute()
 * @model
 * @generated
 */
public interface AnnotationAttribute extends InterfaceMethod {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Expression)
	 * @see de.silvawb.java.annotations.AnnotationsPackage#getAnnotationAttribute_DefaultValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link de.silvawb.java.annotations.AnnotationAttribute#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);

} // AnnotationAttribute
