/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Modification Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.UnaryModificationExpression#getChild <em>Child</em>}</li>
 *   <li>{@link de.silvawb.java.UnaryModificationExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getUnaryModificationExpression()
 * @model abstract="true"
 * @generated
 */
public interface UnaryModificationExpression extends UnaryExpressionChild {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(UnaryModificationExpressionChild)
	 * @see de.silvawb.java.JavaPackage#getUnaryModificationExpression_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnaryModificationExpressionChild getChild();

	/**
	 * Sets the value of the '{@link de.silvawb.java.UnaryModificationExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(UnaryModificationExpressionChild value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(UnaryModificationOperator)
	 * @see de.silvawb.java.JavaPackage#getUnaryModificationExpression_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnaryModificationOperator getOperator();

	/**
	 * Sets the value of the '{@link de.silvawb.java.UnaryModificationExpression#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryModificationOperator value);

} // UnaryModificationExpression
