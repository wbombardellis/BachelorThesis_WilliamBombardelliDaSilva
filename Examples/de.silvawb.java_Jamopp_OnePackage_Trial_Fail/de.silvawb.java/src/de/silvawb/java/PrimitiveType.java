/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.JavaPackage#getPrimitiveType()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveType extends Type, TypeReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param context to check protected visibility
	 *  @return all members (including super type members)
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.Class javaClass = wrapPrimitiveType();\t\nreturn javaClass.getAllMembers(context);'"
	 * @generated
	 */
	EList<Member> getAllMembers(Commentable context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @return primitive type as a class representation
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.Class javaClass = null;\n\nif (this instanceof de.silvawb.java.Boolean) {\n\tjavaClass = getLibClass(\"Boolean\");\n}\nif (this instanceof de.silvawb.java.Byte) {\n\tjavaClass = getLibClass(\"Byte\");\n}\nif (this instanceof de.silvawb.java.Char) {\n\tjavaClass = getLibClass(\"Character\");\n}\nif (this instanceof de.silvawb.java.Double) {\n\tjavaClass = getLibClass(\"Double\");\n}\nif (this instanceof de.silvawb.java.Float) {\n\tjavaClass = getLibClass(\"Float\");\n}\nif (this instanceof de.silvawb.java.Int) {\n\tjavaClass = getLibClass(\"Integer\");\n}\nif (this instanceof de.silvawb.java.Long) {\n\tjavaClass = getLibClass(\"Long\");\n}\nif (this instanceof de.silvawb.java.Short) {\n\tjavaClass = getLibClass(\"Short\");\n}\nif (this instanceof de.silvawb.java.Void) {\n\tjavaClass = getLibClass(\"Void\");\n}\nreturn javaClass;'"
	 * @generated
	 */
	de.silvawb.java.Class wrapPrimitiveType();

} // PrimitiveType
