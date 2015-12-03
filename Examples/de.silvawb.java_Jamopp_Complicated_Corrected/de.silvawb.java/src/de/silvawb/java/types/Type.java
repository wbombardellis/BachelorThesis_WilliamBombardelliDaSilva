/**
 */
package de.silvawb.java.types;

import de.silvawb.java.arrays.ArrayTypeable;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.members.Member;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.types.TypesPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Commentable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param arrayDimension
	 *  @param otherType
	 *  @param otherArrayDimension
	 *  @return if both type are equal
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.types.Type _this = this;\n//comparison for type parameters\nif (_this instanceof de.silvawb.java.generics.TypeParameter) {\n\tde.silvawb.java.generics.TypeParameter typeParameter = ( de.silvawb.java.generics.TypeParameter) _this;\n\tfor ( de.silvawb.java.types.TypeReference referencedType : typeParameter.getExtendTypes()) {\n\t\tif (referencedType.getTarget() != null && !referencedType.getTarget().eIsProxy() && referencedType.getTarget().equalsType(arrayDimension, otherType, otherArrayDimension)) {\n\t\t\treturn true;\n\t\t}\n\t}\n\tif (typeParameter.getExtendTypes().isEmpty()) {\n\t\tif (getObjectClass().equalsType(arrayDimension, otherType, otherArrayDimension)) {\n\t\t\treturn true;\n\t\t}\n\t}\n} \nif (otherType instanceof de.silvawb.java.generics.TypeParameter) {\n\tde.silvawb.java.generics.TypeParameter typeParameter = ( de.silvawb.java.generics.TypeParameter) otherType;\n\tfor ( de.silvawb.java.types.TypeReference referencedType : typeParameter.getExtendTypes()) {\n\t\tif (referencedType.getTarget() != null && !referencedType.getTarget().eIsProxy() && equalsType(arrayDimension, referencedType.getTarget(), otherArrayDimension)) {\n\t\t\treturn true;\n\t\t}\n\t}\n\tif (typeParameter.getExtendTypes().isEmpty()) {\n\t\tif (equalsType(arrayDimension, getObjectClass(), otherArrayDimension)) {\n\t\t\treturn true;\n\t\t}\n\t}\n}\n\n//do comparison on the classifier level\nif (_this instanceof de.silvawb.java.types.PrimitiveType) {\n\t_this = (( de.silvawb.java.types.PrimitiveType)_this).wrapPrimitiveType();\n}\nif (otherType instanceof de.silvawb.java.types.PrimitiveType) {\n\totherType = (( de.silvawb.java.types.PrimitiveType) otherType).wrapPrimitiveType();\n}\n\nif (arrayDimension == otherArrayDimension &&\n\t\totherType instanceof de.silvawb.java.classifiers.Classifier && _this instanceof de.silvawb.java.classifiers.Classifier &&\n\t\t(otherType.equals(_this))) {\t\n\treturn true;\n}\n\nreturn false;'"
	 * @generated
	 */
	boolean equalsType(long arrayDimension, Type otherType, long otherArrayDimension);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  @param arrayDimension
	 *  @param otherType
	 *  @param otherArrayType
	 *  @return if the other type is equal to me or a super type of me
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(otherType == null) {\n\treturn false;\n}\n\nde.silvawb.java.types.Type _this = this;\n\nif (_this instanceof de.silvawb.java.util.TemporalCompositeClassifier || otherType instanceof de.silvawb.java.util.TemporalCompositeClassifier) {\n\torg.eclipse.emf.common.util.EList< de.silvawb.java.types.Type> _thisTypeList = new de.silvawb.java.util.UniqueEList< de.silvawb.java.types.Type>();\n\torg.eclipse.emf.common.util.EList< de.silvawb.java.types.Type> otherTypeList = new de.silvawb.java.util.UniqueEList< de.silvawb.java.types.Type>();\n\tif (_this instanceof de.silvawb.java.util.TemporalCompositeClassifier) {\n\t\tfor( org.eclipse.emf.ecore.EObject aType : (( de.silvawb.java.util.TemporalCompositeClassifier)_this).getSuperTypes()) {\n\t\t\t_thisTypeList.add(( de.silvawb.java.types.Type)aType);\n\t\t}\n\t}\n\telse {\n\t\t_thisTypeList.add(_this);\n\t}\n\tif (otherType instanceof de.silvawb.java.util.TemporalCompositeClassifier) {\n\t\tfor( org.eclipse.emf.ecore.EObject aType : (( de.silvawb.java.util.TemporalCompositeClassifier)otherType).getSuperTypes()) {\n\t\t\totherTypeList.add(( de.silvawb.java.types.Type)aType);\n\t\t}\n\t}\n\telse {\n\t\totherTypeList.add(_this);\n\t}\n\t\n\t\n\tfor( de.silvawb.java.types.Type one_thisType : _thisTypeList) {\n\t\tfor( de.silvawb.java.types.Type oneOtherType : otherTypeList) {\n\t\t\tboolean result = one_thisType.isSuperType(arrayDimension, oneOtherType, otherArrayType);\n\t\t\tif (result) {\n\t\t\t\treturn true;\n\t\t\t}\t\n\t\t}\n\t}\n\treturn false;\n}\n\n//if I am a void, I am of every type\nif (_this.equals(getLibClass(\"Void\"))) {\n\treturn true;\n}\n\n//if the other is Object I am a subtype in any case (also array dimensions do not matter)\nif (otherType.equals(getObjectClass())) {\n\treturn true;\n}\n\n//String, primitives, and arrays are serializable\nde.silvawb.java.classifiers.ConcreteClassifier serializableClass = ( de.silvawb.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(\n\t\tgetConcreteClassifierProxy(\"java.io.Serializable\"), _this);\nif (otherType.equals(serializableClass)) {\n\tif (_this.equals(serializableClass)) {\n\t \t\t\treturn true;\n\t}\n\telse if (_this.equals(getStringClass())) {\n\t \t\t\treturn true;\n\t}\n\telse if (_this instanceof de.silvawb.java.types.PrimitiveType) {\n\t\treturn true;\n\t}\n\telse if (arrayDimension > 0) {\n\t\t//all arrays are serializable\n\t\treturn true;\n\t}\n}\n\n//if one of us is a parameter to the best of my knowledge, we might match\nif(_this instanceof de.silvawb.java.generics.TypeParameter) {\n\treturn true;\n}\nif(otherType instanceof de.silvawb.java.generics.TypeParameter ) {\n\treturn true;\n}\n\n//if array dimensions do not match, I am no subtype\nboolean isTypeParameter = false;\t\t\nif (otherArrayType instanceof de.silvawb.java.types.TypedElement) {\n\tde.silvawb.java.types.Type type = (( de.silvawb.java.types.TypedElement)otherArrayType).getTypeReference().getTarget();\n\tisTypeParameter = type instanceof de.silvawb.java.generics.TypeParameter;\n}\nboolean isVariableLengthParameter = otherArrayType instanceof de.silvawb.java.parameters.VariableLengthParameter;\n\nlong otherArrayDim = 0;\nif(otherArrayType != null) {\n\totherArrayDim = otherArrayType.getArrayDimension();\n}\n\nif (isTypeParameter && isVariableLengthParameter) {\n\tif(arrayDimension != otherArrayDim && \n\t\tarrayDimension != otherArrayDim- 1 && \n\t\tarrayDimension < otherArrayDim) {\n\t\t\n\t\treturn false;\n\t}\n}\nelse if (isTypeParameter) {\n\tif(arrayDimension < otherArrayDim) {\n\t\treturn false;\n\t}\n}\nelse if (isVariableLengthParameter) {\n\tif(arrayDimension != otherArrayDim && arrayDimension != otherArrayDim- 1) {\n\t\treturn false;\n\t}\n}\nelse {\n\tif(arrayDimension != otherArrayDim) {\n\t\treturn false;\n\t}\n}\n\n//annotations\nif(_this instanceof de.silvawb.java.classifiers.Annotation && \n\t\t(otherType.equals(getAnnotationInterface()) ||\n\t\t\t\t(( de.silvawb.java.classifiers.ConcreteClassifier)_this).getAllSuperClassifiers(\n\t\t\t\t\t).contains(getAnnotationInterface()))) {\n\treturn true;\n}\n\n//do comparison on the classifier level\nif (_this instanceof de.silvawb.java.types.PrimitiveType) {\n\t_this = (( de.silvawb.java.types.PrimitiveType) _this).wrapPrimitiveType();\n}\nif (otherType instanceof de.silvawb.java.types.PrimitiveType) {\n\totherType = (( de.silvawb.java.types.PrimitiveType) otherType).wrapPrimitiveType();\n}\n\n//compare in type hierarchy\nif (otherType instanceof de.silvawb.java.classifiers.ConcreteClassifier && _this instanceof de.silvawb.java.classifiers.ConcreteClassifier &&\n\t\t(otherType.equals(_this) || \n\t\t\t\t(( de.silvawb.java.classifiers.ConcreteClassifier)_this).getAllSuperClassifiers(\n\t\t\t\t\t\t).contains(otherType))) {\n\treturn true;\n}\n\nif (otherType instanceof de.silvawb.java.classifiers.ConcreteClassifier && _this instanceof de.silvawb.java.classifiers.AnonymousClass &&\n\t\t(( de.silvawb.java.classifiers.AnonymousClass)_this).getAllSuperClassifiers(\n\t\t\t\t).contains(otherType)) {\n\t\n\treturn true;\n}\n\n//everything can be implicitly casted to CharSequence, so I match when the other type is a CharSequence\nde.silvawb.java.classifiers.Interface charSequenceClass = getLibInterface(\"CharSequence\");\n\nif (otherType instanceof de.silvawb.java.classifiers.ConcreteClassifier) {\n\tif(otherType.equals(charSequenceClass) ||\n\t\t\t(( de.silvawb.java.classifiers.ConcreteClassifier)otherType).getAllSuperClassifiers(\n\t\t\t\t\t).contains(charSequenceClass)) {\n\t\treturn true;\n\t}\n}\n\n//there are some specifics for primitive types not reflected in the type hierarchy\nif (otherType instanceof de.silvawb.java.classifiers.Class) {\n\tde.silvawb.java.types.PrimitiveType primitiveType = (( de.silvawb.java.classifiers.Class) otherType).unWrapPrimitiveType();\n\tif(primitiveType == null) {\n\t\treturn false;\n\t}\n\totherType = primitiveType;\n}\n\nif (_this instanceof de.silvawb.java.classifiers.Class) {\n\tde.silvawb.java.types.PrimitiveType primitiveType = (( de.silvawb.java.classifiers.Class) _this).unWrapPrimitiveType();\n\tif(primitiveType == null) {\n\t\treturn false;\n\t}\n\t_this = primitiveType;\n}\n\nif (_this instanceof de.silvawb.java.types.Boolean) {\n\tif (otherType instanceof de.silvawb.java.types.Boolean) {\n\t\treturn true;\n\t}\n\telse {\n\t\treturn false;\n\t}\n}\nif (_this instanceof de.silvawb.java.types.Byte ||\n\t\t_this instanceof de.silvawb.java.types.Int ||\n\t\t_this instanceof de.silvawb.java.types.Short ||\n\t\t_this instanceof de.silvawb.java.types.Long ||\n\t\t_this instanceof de.silvawb.java.types.Char) {\n\tif (otherType instanceof de.silvawb.java.types.Byte ||\n\t\t\totherType instanceof de.silvawb.java.types.Int ||\n\t\t\totherType instanceof de.silvawb.java.types.Short ||\n\t\t\totherType instanceof de.silvawb.java.types.Long ||\n\t\t\totherType instanceof de.silvawb.java.types.Char ||\n\t\t\totherType instanceof de.silvawb.java.types.Float ||\n\t\t\totherType instanceof de.silvawb.java.types.Double) {\n\t\treturn true;\n\t}\n\telse {\n\t\treturn false;\n\t}\n}\nif (_this instanceof de.silvawb.java.types.Float ||\n\t\t_this instanceof de.silvawb.java.types.Double) {\n\tif (otherType instanceof de.silvawb.java.types.Float ||\n\t\t\totherType instanceof de.silvawb.java.types.Double) {\n\t\treturn true;\n\t}\n\telse {\n\t\treturn false;\n\t}\n}\n\nreturn false;'"
	 * @generated
	 */
	boolean isSuperType(long arrayDimension, Type otherType, ArrayTypeable otherArrayType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//method has to be specified in subclasses\nthrow new java.lang.UnsupportedOperationException();'"
	 * @generated
	 */
	EList<Member> getAllMembers(Commentable context);

} // Type
