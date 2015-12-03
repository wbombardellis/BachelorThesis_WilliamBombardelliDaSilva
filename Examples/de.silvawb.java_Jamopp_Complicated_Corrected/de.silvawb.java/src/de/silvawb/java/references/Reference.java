/**
 */
package de.silvawb.java.references;

import de.silvawb.java.arrays.ArraySelector;

import de.silvawb.java.expressions.PrimaryExpression;

import de.silvawb.java.generics.TypeArgumentable;

import de.silvawb.java.types.Type;

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
 *   <li>{@link de.silvawb.java.references.Reference#getNext <em>Next</em>}</li>
 *   <li>{@link de.silvawb.java.references.Reference#getArraySelectors <em>Array Selectors</em>}</li>
 * </ul>
 *
 * @see de.silvawb.java.references.ReferencesPackage#getReference()
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
	 * @see de.silvawb.java.references.ReferencesPackage#getReference_Next()
	 * @model containment="true"
	 * @generated
	 */
	Reference getNext();

	/**
	 * Sets the value of the '{@link de.silvawb.java.references.Reference#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Reference value);

	/**
	 * Returns the value of the '<em><b>Array Selectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.silvawb.java.arrays.ArraySelector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Selectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Selectors</em>' containment reference list.
	 * @see de.silvawb.java.references.ReferencesPackage#getReference_ArraySelectors()
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this instanceof de.silvawb.java.literals.Literal) {\n\treturn (( de.silvawb.java.literals.Literal) this).getType();\n}\n\nde.silvawb.java.types.Type type = null;\n\n//referenced element point to a type\nif (this instanceof de.silvawb.java.types.TypedElement) {\n\tde.silvawb.java.types.TypeReference typeRef = (( de.silvawb.java.types.TypedElement) this).getTypeReference();\n\ttype = typeRef.getBoundTarget(this);\n}\n//element points to this or super\nelse if (this instanceof de.silvawb.java.references.SelfReference) {\n\tde.silvawb.java.types.Type thisClass = null;\n\tif (this.getPrevious() != null) {\n\t\tthisClass = this.getPrevious().getReferencedType();\n\t}\n\telse {\n\t\tde.silvawb.java.classifiers.AnonymousClass anonymousContainer = getContainingAnonymousClass();\n\t\tif (anonymousContainer != null) {\n\t\t\tthisClass = anonymousContainer;\n\t\t}\n\t\telse {\n\t\t\tthisClass = getContainingConcreteClassifier();\t\n\t\t}\n\t}\n\t\n\t//find super class if \"self\" is \"super\"\n\tif ((( de.silvawb.java.references.SelfReference) this).getSelf() instanceof de.silvawb.java.literals.Super) {\n\t\tif (thisClass instanceof de.silvawb.java.classifiers.Class) {\n\t\t\treturn (( de.silvawb.java.classifiers.Class)thisClass).getSuperClass();\n\t\t}\n\t\tif (thisClass instanceof de.silvawb.java.classifiers.AnonymousClass) {\n\t\t\treturn (( de.silvawb.java.classifiers.AnonymousClass)thisClass).getSuperClassifier();\n\t\t}\n\t}\n\t\n\treturn thisClass;\n}\n//element points to the object\'s class object\nelse if(this instanceof de.silvawb.java.references.ReflectiveClassReference) {\n\treturn getClassClass();\n}\n//referenced element points to an element with a type\nelse if (this instanceof de.silvawb.java.references.ElementReference) {\n\tde.silvawb.java.references.ReferenceableElement target = \n\t\t( de.silvawb.java.references.ReferenceableElement) (( de.silvawb.java.references.ElementReference) this).getTarget();\n\tif (target.eIsProxy()) {\n\t\ttype = null;\n\t}\n\t\n\t//Navigate through AdditionalLocalVariable or Field\n\tif(target instanceof de.silvawb.java.variables.AdditionalLocalVariable) {\n\t\ttarget = ( de.silvawb.java.references.ReferenceableElement) target.eContainer();\n\t}\n\tif(target instanceof de.silvawb.java.members.AdditionalField) {\n\t\ttarget = ( de.silvawb.java.references.ReferenceableElement) target.eContainer();\n\t}\n\tif (target instanceof de.silvawb.java.types.TypedElement) {\n\t\tde.silvawb.java.types.TypeReference typeRef = (( de.silvawb.java.types.TypedElement) target).getTypeReference();\n\t\tif (typeRef != null) {\n\t\t\ttype = typeRef.getBoundTarget(this);\n\t\t}\n\t}\n\telse if (target instanceof de.silvawb.java.types.Type /*e.g. Annotation\052/ ) {\n\t\treturn ( de.silvawb.java.types.Type) target;\n\t}\n\telse if(target instanceof de.silvawb.java.members.EnumConstant) {\n\t\ttype = ( de.silvawb.java.classifiers.Enumeration)target.eContainer();\n\t}\t\n}\n//Strings may also appear as reference\nelse if (this instanceof de.silvawb.java.references.StringReference) {\n\treturn getStringClass();\n}\nelse if (this instanceof de.silvawb.java.expressions.NestedExpression) {\n\ttype = (( de.silvawb.java.expressions.NestedExpression) this).getExpression().getType();\n}\nelse if (this instanceof de.silvawb.java.references.PrimitiveTypeReference) {\n\ttype = (( de.silvawb.java.references.PrimitiveTypeReference)this).getPrimitiveType();\n}\nelse {\n\tassert(false);\n}\nreturn type;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eContainer() instanceof de.silvawb.java.references.Reference) { \n\t de.silvawb.java.references.Reference container = ( de.silvawb.java.references.Reference) eContainer( ) ; \n\t  if (this.equals(container.getNext())) {\n\t\t return container;\n\t }\n}\nreturn null;'"
	 * @generated
	 */
	Reference getPrevious();

} // Reference
