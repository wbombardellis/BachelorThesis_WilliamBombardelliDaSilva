/**
 */
package de.silvawb.java.literals;

import de.silvawb.java.expressions.PrimaryExpression;

import de.silvawb.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.literals.LiteralsPackage#getLiteral()
 * @model abstract="true"
 * @generated
 */
public interface Literal extends PrimaryExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return type of the literal
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//Overrides implementation in Expression\nde.silvawb.java.classifiers.Class javaClass = null;\n\nif (this instanceof de.silvawb.java.literals.NullLiteral) {\n\tjavaClass = getLibClass(\"Void\");\n}\nelse if (this instanceof de.silvawb.java.literals.BooleanLiteral) {\n\tjavaClass = getLibClass(\"Boolean\");\n}\nelse if (this instanceof de.silvawb.java.literals.DoubleLiteral) {\n\tjavaClass = getLibClass(\"Double\");\n}\nelse if (this instanceof de.silvawb.java.literals.FloatLiteral) {\n\tjavaClass = getLibClass(\"Float\");\n}\nelse if (this instanceof de.silvawb.java.literals.IntegerLiteral) {\n\tjavaClass = getLibClass(\"Integer\");\n}\nelse if (this instanceof de.silvawb.java.literals.LongLiteral) {\n\tjavaClass = getLibClass(\"Long\");\n}\nelse if (this instanceof de.silvawb.java.literals.CharacterLiteral) {\n\tjavaClass = getLibClass(\"Character\");\n}\n\nreturn javaClass;'"
	 * @generated
	 */
	Type getOneType(boolean alternative);

} // Literal
