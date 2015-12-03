/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.JavaPackage#getMethod()
 * @model abstract="true"
 * @generated
 */
public interface Method extends Member, TypedElement, ArrayTypeable, TypeParametrizable, Parametrizable, ReferenceableElement, ExceptionThrower, AnnotableAndModifiable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< de.silvawb.java.Type> argumentTypeList = methodCall.getArgumentTypes();\norg.eclipse.emf.common.util.EList< de.silvawb.java.Parameter> parameterList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Parameter>(this.getParameters());\n\norg.eclipse.emf.common.util.EList< de.silvawb.java.Type> parameterTypeList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Type>();\nfor( de.silvawb.java.Parameter parameter : parameterList)  {\n\t//determine types before messing with the parameters\n\tparameterTypeList.add(\n\t\t\tparameter.getTypeReference().getBoundTarget(methodCall));\n}\n\nif (!parameterList.isEmpty()) {\n\tde.silvawb.java.Parameter lastParameter = parameterList.get(parameterList.size() - 1);\n\tde.silvawb.java.Type lastParameterType  = parameterTypeList.get(parameterTypeList.size() - 1);;\n\tif (lastParameter instanceof de.silvawb.java.VariableLengthParameter) {\n\t\t//in case of variable length add/remove some parameters\n\t\twhile(parameterList.size() < argumentTypeList.size()) {\n\t\t\tif (needsPerfectMatch) return false;\n\t\t\tparameterList.add(lastParameter);\n\t\t\tparameterTypeList.add(lastParameterType);\n\t\t}\n\t\tif(parameterList.size() > argumentTypeList.size()) {\n\t\t\tif (needsPerfectMatch) return false;\n\t\t\tparameterList.remove(lastParameter);\n\t\t\tparameterTypeList.remove(parameterTypeList.size() - 1);\n\t\t}\n\t\t\n\t}\n}\n\nif (parameterList.size() == argumentTypeList.size()) { \n\tboolean parametersMatch = true;\n\tfor (int i = 0; i < argumentTypeList.size(); i++) {\n\t\tde.silvawb.java.Parameter  parameter = parameterList.get(i);\n\t\tde.silvawb.java.Expression argument = methodCall.getArguments().get(i);\n\n\t\tde.silvawb.java.Type parameterType = parameterTypeList.get(i);\n\t\tde.silvawb.java.Type argumentType  = argumentTypeList.get(i);\n\t\t\n\t\tif (argumentType == null || parameterType == null) {\n\t\t\treturn false;\n\t\t}\n\t\t\n\t\tif (parameterType != null && argumentType != null) {\n\t\t\tif (!parameterType.eIsProxy() || !argumentType.eIsProxy()) {\n\t\t\t\tif (needsPerfectMatch) {\n\t\t\t\t\tparametersMatch = parametersMatch\n\t\t\t\t\t\t&& argumentType.equalsType(argument.getArrayDimension(),\n\t\t\t\t\t\t\t\tparameterType, parameter.getArrayDimension());\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tparametersMatch = parametersMatch \n\t\t\t\t\t\t&& argumentType.isSuperType(argument.getArrayDimension(),\n\t\t\t\t\t\t\t\tparameterType, parameter);\n\t\t\t\t}\n\t\t\t}\n\t\t\telse {\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t\telse {\n\t\t\treturn false;\n\t\t}\n\t}\n\treturn parametersMatch; \n} \nreturn false;'"
	 * @generated
	 */
	boolean isMethodForCall(MethodCall methodCall, boolean needsPerfectMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Decides if the given method matches the given call. 
	 *  
	 *  @param methodCall
	 *  @return
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return isMethodForCall(methodCall, false);'"
	 * @generated
	 */
	boolean isSomeMethodForCall(MethodCall methodCall);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Only returns true if the given Method is a better match for the given calls than the
	 *  otherMethod given.
	 *  
	 *  @param otherMethod
	 *  @param methodCall
	 *  @return
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (!isMethodForCall(methodCall, false)) {\n\treturn false;\n}\nif (otherMethod.isMethodForCall(methodCall, true)) {\n\tif (isMethodForCall(methodCall, true)) {\n\t\t//we both match perfectly; lets compare our return types\n\t\tde.silvawb.java.Type target = getTypeReference().getTarget();\n\t\tif (target instanceof de.silvawb.java.ConcreteClassifier) {\n\t\t\tif ((( de.silvawb.java.ConcreteClassifier) target).getAllSuperClassifiers().contains(\n\t\t\t\t\totherMethod.getTypeReference().getTarget())) {\n\t\t\t\t// I am the more concrete type\n\t\t\t\treturn true;\n\t\t\t}\n\t\t}\n\t}\n\t//the other already matches perfectly; I am not better\n\treturn false;\n}\nif (!otherMethod.isMethodForCall(methodCall, false)) {\n\t//I match, but the other does not\n\treturn true;\n}\n//we both match, I am only better if I match perfectly <- \n//TODO #763: this is not enough: we need to check for \"nearest subtype\" here\nreturn isMethodForCall(methodCall, true);'"
	 * @generated
	 */
	boolean isBetterMethodForCall(Method otherMethod, MethodCall methodCall);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long size = this.getArrayDimensionsBefore().size() + this.getArrayDimensionsAfter().size();\nif (this instanceof de.silvawb.java.VariableLengthParameter) {\n\tsize++;\n}\nreturn size;'"
	 * @generated
	 */
	long getArrayDimension();

} // Method
