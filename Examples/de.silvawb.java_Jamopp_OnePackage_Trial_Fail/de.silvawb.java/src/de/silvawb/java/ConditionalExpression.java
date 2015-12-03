/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.ConditionalExpression#getChild <em>Child</em>}</li>
 *   <li>{@link de.silvawb.java.ConditionalExpression#getExpressionIf <em>Expression If</em>}</li>
 *   <li>{@link de.silvawb.java.ConditionalExpression#getExpressionElse <em>Expression Else</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends AssignmentExpressionChild {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ConditionalExpressionChild)
	 * @see de.silvawb.java.JavaPackage#getConditionalExpression_Child()
	 * @model containment="true"
	 * @generated
	 */
	ConditionalExpressionChild getChild();

	/**
	 * Sets the value of the '{@link de.silvawb.java.ConditionalExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ConditionalExpressionChild value);

	/**
	 * Returns the value of the '<em><b>Expression If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression If</em>' containment reference.
	 * @see #setExpressionIf(Expression)
	 * @see de.silvawb.java.JavaPackage#getConditionalExpression_ExpressionIf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpressionIf();

	/**
	 * Sets the value of the '{@link de.silvawb.java.ConditionalExpression#getExpressionIf <em>Expression If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression If</em>' containment reference.
	 * @see #getExpressionIf()
	 * @generated
	 */
	void setExpressionIf(Expression value);

	/**
	 * Returns the value of the '<em><b>Expression Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Else</em>' containment reference.
	 * @see #setExpressionElse(AssignmentExpressionChild)
	 * @see de.silvawb.java.JavaPackage#getConditionalExpression_ExpressionElse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssignmentExpressionChild getExpressionElse();

	/**
	 * Sets the value of the '{@link de.silvawb.java.ConditionalExpression#getExpressionElse <em>Expression Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Else</em>' containment reference.
	 * @see #getExpressionElse()
	 * @generated
	 */
	void setExpressionElse(AssignmentExpressionChild value);

} // ConditionalExpression
