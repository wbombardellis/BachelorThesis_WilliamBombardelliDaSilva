/**
 */
package de.silvawb.java;

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
 *   <li>{@link de.silvawb.java.Argumentable#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getArgumentable()
 * @model abstract="true"
 * @generated
 */
public interface Argumentable extends Commentable {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getArgumentable_Arguments()
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.Type> resultList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Type>();\n\nfor( de.silvawb.java.Expression exp : getArguments()) {\n\tde.silvawb.java.Type type = exp.getType();\n\tresultList.add(type);\n}\nreturn resultList;'"
	 * @generated
	 */
	EList<Type> getArgumentTypes();

} // Argumentable
