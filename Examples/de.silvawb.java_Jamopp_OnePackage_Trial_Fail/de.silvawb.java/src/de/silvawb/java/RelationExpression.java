/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.RelationExpression#getChildren <em>Children</em>}</li>
 *   <li>{@link de.silvawb.java.RelationExpression#getRelationOperators <em>Relation Operators</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getRelationExpression()
 * @model
 * @generated
 */
public interface RelationExpression extends InstanceOfExpressionChild {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.RelationExpressionChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getRelationExpression_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelationExpressionChild> getChildren();

	/**
	 * Returns the value of the '<em><b>Relation Operators</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.RelationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Operators</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getRelationExpression_RelationOperators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelationOperator> getRelationOperators();

} // RelationExpression
