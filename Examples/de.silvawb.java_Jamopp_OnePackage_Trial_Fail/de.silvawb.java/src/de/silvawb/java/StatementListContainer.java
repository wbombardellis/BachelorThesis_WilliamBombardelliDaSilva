/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement List Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.StatementListContainer#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getStatementListContainer()
 * @model abstract="true"
 * @generated
 */
public interface StatementListContainer extends Commentable {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getStatementListContainer_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model required="true" nameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.LocalVariable> localVariables = getChildrenByType( de.silvawb.java.LocalVariable.class);\nfor ( de.silvawb.java.LocalVariable localVariable : localVariables) {\n\tif (localVariable.getName().equals(name)) {\n\t\treturn localVariable;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	LocalVariable getLocalVariable(String name);

} // StatementListContainer
