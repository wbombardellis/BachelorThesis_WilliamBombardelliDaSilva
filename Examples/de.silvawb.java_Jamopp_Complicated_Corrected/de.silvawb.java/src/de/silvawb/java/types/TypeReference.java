/**
 */
package de.silvawb.java.types;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.references.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.types.TypesPackage#getTypeReference()
 * @model abstract="true"
 * @generated
 */
public interface TypeReference extends Commentable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns the type referenced by this <code>TypeReference</code>
	 *  considering all concrete subclasses of <code>TypeReference</code> used
	 *  by the Java metamodel. 
	 *  
	 *  @param _this 
	 *  @return the type
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getBoundTarget(null);'"
	 * @generated
	 */
	Type getTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns the type referenced by this <code>TypeReference</code>
	 *  considering all concrete subclasses of <code>TypeReference</code> used
	 *  by the Java metamodel. If type parameters are bound in the given reference,
	 *  the bound type will be returned instead of the parameter.
	 *  
	 *  @return the type
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.types.Type type = null;\nif (this instanceof de.silvawb.java.types.ClassifierReference || \n\t\tthis instanceof de.silvawb.java.types.NamespaceClassifierReference) {\n\tde.silvawb.java.types.ClassifierReference classifierRef = getPureClassifierReference();\n\tif (classifierRef != null) {\n\t\ttype = classifierRef.getTarget();\n\t}\n\t\n\tif (reference instanceof de.silvawb.java.references.MethodCall) {\n\t\tde.silvawb.java.references.MethodCall potentialCloneCall = ( de.silvawb.java.references.MethodCall) reference;\n\t\t//clone returns the type of the cloned in the case of arrays\n\t\tde.silvawb.java.references.ReferenceableElement potentialCloneCallTarget = potentialCloneCall.getTarget();\n\t\tif (potentialCloneCallTarget != null && \n\t\t\t\t!potentialCloneCallTarget.eIsProxy() && \n\t\t\t\t\"clone\".equals(potentialCloneCallTarget.getName()))  {\n\t\t\tif (potentialCloneCall.getPrevious() instanceof de.silvawb.java.references.ElementReference) {\n\t\t\t\tde.silvawb.java.references.ElementReference prevRef = ( de.silvawb.java.references.ElementReference) potentialCloneCall.getPrevious();\n\t\t\t\tif (prevRef.getTarget() instanceof de.silvawb.java.arrays.ArrayTypeable && \n\t\t\t\t\t\t(( de.silvawb.java.arrays.ArrayTypeable)prevRef.getTarget()).getArrayDimension() > 0) {\n\t\t\t\t\ttype = prevRef.getReferencedType();\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}\n\nelse if(this instanceof de.silvawb.java.types.PrimitiveType) {\n\treturn ( de.silvawb.java.types.PrimitiveType) this;\n}\n\n//resolve parameter to real type\nif (type instanceof de.silvawb.java.generics.TypeParameter) {\n\ttype = (( de.silvawb.java.generics.TypeParameter) type).getBoundType(this, reference);\n}\n\nif (type != null && type.eIsProxy()) {\n\t//this may happen, when e.g. a super type is resolved. It is ok.\n\treturn null;\n}\n\nreturn type;'"
	 * @generated
	 */
	Type getBoundTarget(Reference reference);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Extracts the (possibly nested) classifier reference (if any) 
	 *  from this type references.
	 *  
	 *  @return
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.types.ClassifierReference classifierReference = null;\nif (this instanceof de.silvawb.java.types.ClassifierReference) {\n\tclassifierReference = ( de.silvawb.java.types.ClassifierReference) this;\n}\nif (this instanceof de.silvawb.java.types.NamespaceClassifierReference) {\n\tde.silvawb.java.types.NamespaceClassifierReference nsClassifierReference = ( de.silvawb.java.types.NamespaceClassifierReference) this;\n\tif (!nsClassifierReference.getClassifierReferences().isEmpty()) {\n\t\tint lastIndex = nsClassifierReference.getClassifierReferences().size() - 1;\n\t\tclassifierReference = nsClassifierReference.getClassifierReferences().get(lastIndex);\n\t}\n}\nreturn classifierReference;'"
	 * @generated
	 */
	ClassifierReference getPureClassifierReference();

} // TypeReference
