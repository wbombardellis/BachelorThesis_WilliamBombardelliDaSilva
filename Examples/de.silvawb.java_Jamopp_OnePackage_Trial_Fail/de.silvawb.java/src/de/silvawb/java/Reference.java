/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.Reference#getNext <em>Next</em>}</li>
 *   <li>{@link de.silvawb.java.Reference#getArraySelectors <em>Array Selectors</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.JavaPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends PrimaryExpression, TypeArgumentable {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Reference)
	 * @see de.silvawb.java.JavaPackage#getReference_Next()
	 * @model containment="true"
	 * @generated
	 */
	Reference getNext();

	/**
	 * Sets the value of the '{@link de.silvawb.java.Reference#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Reference value);

	/**
	 * Returns the value of the '<em><b>Array Selectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.ArraySelector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Selectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Selectors</em>' containment reference list.
	 * @see de.silvawb.java.JavaPackage#getReference_ArraySelectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArraySelector> getArraySelectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Determines the <code>Type</code> of the reference. That is,
	 *  either the type to which the reference points directly, or the
	 *  type of the element to which the reference points.
	 *  
	 *  @return the determined type
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this instanceof de.silvawb.java.Literal) {\n\treturn (( de.silvawb.java.Literal) this).getType();\n}\n\nde.silvawb.java.Type type = null;\n\n//referenced element point to a type\nif (this instanceof de.silvawb.java.TypedElement) {\n\tde.silvawb.java.TypeReference typeRef = (( de.silvawb.java.TypedElement) this).getTypeReference();\n\ttype = typeRef.getBoundTarget(this);\n}\n//element points to this or super\nelse if (this instanceof de.silvawb.java.SelfReference) {\n\tde.silvawb.java.Type thisClass = null;\n\tif (this.getPrevious() != null) {\n\t\tthisClass = this.getPrevious().getReferencedType();\n\t}\n\telse {\n\t\tde.silvawb.java.AnonymousClass anonymousContainer = getContainingAnonymousClass();\n\t\tif (anonymousContainer != null) {\n\t\t\tthisClass = anonymousContainer;\n\t\t}\n\t\telse {\n\t\t\tthisClass = getContainingConcreteClassifier();\t\n\t\t}\n\t}\n\t\n\t//find super class if \"self\" is \"super\"\n\tif ((( de.silvawb.java.SelfReference) this).getSelf() instanceof de.silvawb.java.Super) {\n\t\tif (thisClass instanceof de.silvawb.java.Class) {\n\t\t\treturn (( de.silvawb.java.Class)thisClass).getSuperClass();\n\t\t}\n\t\tif (thisClass instanceof de.silvawb.java.AnonymousClass) {\n\t\t\treturn (( de.silvawb.java.AnonymousClass)thisClass).getSuperClassifier();\n\t\t}\n\t}\n\t\n\treturn thisClass;\n}\n//element points to the object\'s class object\nelse if(this instanceof de.silvawb.java.ReflectiveClassReference) {\n\treturn getClassClass();\n}\n//referenced element points to an element with a type\nelse if (this instanceof de.silvawb.java.ElementReference) {\n\tde.silvawb.java.ReferenceableElement target = \n\t\t( de.silvawb.java.ReferenceableElement) (( de.silvawb.java.ElementReference) this).getTarget();\n\tif (target.eIsProxy()) {\n\t\ttype = null;\n\t}\n\t\n\t//Navigate through AdditionalLocalVariable or Field\n\tif(target instanceof de.silvawb.java.AdditionalLocalVariable) {\n\t\ttarget = ( de.silvawb.java.ReferenceableElement) target.eContainer();\n\t}\n\tif(target instanceof de.silvawb.java.AdditionalField) {\n\t\ttarget = ( de.silvawb.java.ReferenceableElement) target.eContainer();\n\t}\n\tif (target instanceof de.silvawb.java.TypedElement) {\n\t\tde.silvawb.java.TypeReference typeRef = (( de.silvawb.java.TypedElement) target).getTypeReference();\n\t\tif (typeRef != null) {\n\t\t\ttype = typeRef.getBoundTarget(this);\n\t\t}\n\t}\n\telse if (target instanceof de.silvawb.java.Type /*e.g. Annotation\052/ ) {\n\t\treturn ( de.silvawb.java.Type) target;\n\t}\n\telse if(target instanceof de.silvawb.java.EnumConstant) {\n\t\ttype = ( de.silvawb.java.Enumeration)target.eContainer();\n\t}\t\n}\n//Strings may also appear as reference\nelse if (this instanceof de.silvawb.java.StringReference) {\n\treturn getStringClass();\n}\nelse if (this instanceof de.silvawb.java.NestedExpression) {\n\ttype = (( de.silvawb.java.NestedExpression) this).getExpression().getType();\n}\nelse if (this instanceof de.silvawb.java.PrimitiveTypeReference) {\n\ttype = (( de.silvawb.java.PrimitiveTypeReference)this).getPrimitiveType();\n}\nelse {\n\tassert(false);\n}\nreturn type;'"
	 * @generated
	 */
	Type getReferencedType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eContainer() instanceof de.silvawb.java.Reference) { \n\t de.silvawb.java.Reference container = ( de.silvawb.java.Reference) eContainer( ) ; \n\t  if (this.equals(container.getNext())) {\n\t\t return container;\n\t }\n}\nreturn null;'"
	 * @generated
	 */
	Reference getPrevious();

} // Reference
