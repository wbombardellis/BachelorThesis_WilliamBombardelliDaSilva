/**
 */
package de.silvawb.java.references;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.expressions.Expression;

import de.silvawb.java.types.Type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argumentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.references.Argumentable#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.references.ReferencesPackage#getArgumentable()
 * @model abstract="true"
 * @generated
 */
public interface Argumentable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see de.silvawb.java.references.ReferencesPackage#getArgumentable_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return list of types of my arguments
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.types.Type> resultList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.types.Type>();\n\nfor( de.silvawb.java.expressions.Expression exp : getArguments()) {\n\tde.silvawb.java.types.Type type = exp.getType();\n\tresultList.add(type);\n}\nreturn resultList;'"
	 * @generated
	 */
	EList<Type> getArgumentTypes();

} // Argumentable
