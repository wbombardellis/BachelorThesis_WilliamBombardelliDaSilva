/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.JavaPackage#getLiteral()
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//Overrides implementation in Expression\nde.silvawb.java.Class javaClass = null;\n\nif (this instanceof de.silvawb.java.NullLiteral) {\n\tjavaClass = getLibClass(\"Void\");\n}\nelse if (this instanceof de.silvawb.java.BooleanLiteral) {\n\tjavaClass = getLibClass(\"Boolean\");\n}\nelse if (this instanceof de.silvawb.java.DoubleLiteral) {\n\tjavaClass = getLibClass(\"Double\");\n}\nelse if (this instanceof de.silvawb.java.FloatLiteral) {\n\tjavaClass = getLibClass(\"Float\");\n}\nelse if (this instanceof de.silvawb.java.IntegerLiteral) {\n\tjavaClass = getLibClass(\"Integer\");\n}\nelse if (this instanceof de.silvawb.java.LongLiteral) {\n\tjavaClass = getLibClass(\"Long\");\n}\nelse if (this instanceof de.silvawb.java.CharacterLiteral) {\n\tjavaClass = getLibClass(\"Character\");\n}\n\nreturn javaClass;'"
	 * @generated
	 */
	Type getOneType(boolean alternative);

} // Literal
