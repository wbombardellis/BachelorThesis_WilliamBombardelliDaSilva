/**
 */
package de.silvawb.java.types;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.members.Member;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.types.TypesPackage#getPrimitiveType()
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.classifiers.Class javaClass = wrapPrimitiveType();\t\nreturn javaClass.getAllMembers(context);'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.classifiers.Class javaClass = null;\n\nif (this instanceof de.silvawb.java.types.Boolean) {\n\tjavaClass = getLibClass(\"Boolean\");\n}\nif (this instanceof de.silvawb.java.types.Byte) {\n\tjavaClass = getLibClass(\"Byte\");\n}\nif (this instanceof de.silvawb.java.types.Char) {\n\tjavaClass = getLibClass(\"Character\");\n}\nif (this instanceof de.silvawb.java.types.Double) {\n\tjavaClass = getLibClass(\"Double\");\n}\nif (this instanceof de.silvawb.java.types.Float) {\n\tjavaClass = getLibClass(\"Float\");\n}\nif (this instanceof de.silvawb.java.types.Int) {\n\tjavaClass = getLibClass(\"Integer\");\n}\nif (this instanceof de.silvawb.java.types.Long) {\n\tjavaClass = getLibClass(\"Long\");\n}\nif (this instanceof de.silvawb.java.types.Short) {\n\tjavaClass = getLibClass(\"Short\");\n}\nif (this instanceof de.silvawb.java.types.Void) {\n\tjavaClass = getLibClass(\"Void\");\n}\nreturn javaClass;'"
	 * @generated
	 */
	de.silvawb.java.classifiers.Class wrapPrimitiveType();

} // PrimitiveType
