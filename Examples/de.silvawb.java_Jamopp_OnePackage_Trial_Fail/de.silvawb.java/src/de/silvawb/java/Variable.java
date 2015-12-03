/**
 */
package de.silvawb.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.JavaPackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends NamedElement, TypedElement, ArrayTypeable, ReferenceableElement, TypeArgumentable {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Creates a statement that calls the method with the given name on this
	 *  variable. If the variable's type does not offer such a method, null is
	 *  returned.
	 * 
	 * <!-- end-model-doc -->
	 * @model methodNameRequired="true" argumentsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.ExpressionStatement callStatement = de.silvawb.java.StatementsFactory.eINSTANCE.createExpressionStatement();\ncallStatement.setExpression(createMethodCall(methodName, arguments));\nreturn callStatement;'"
	 * @generated
	 */
	Statement createMethodCallStatement(String methodName, EList<Expression> arguments);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Creates an expression that calls the method with the given name on this
	 *  variable. If the variable's type does not offer such a method, null is
	 *  returned.
	 * 
	 * <!-- end-model-doc -->
	 * @model methodNameRequired="true" argumentsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.IdentifierReference thisRef = de.silvawb.java.ReferencesFactory.eINSTANCE.createIdentifierReference();\nthisRef.setTarget(this);\nde.silvawb.java.MethodCall methodCall = de.silvawb.java.ReferencesFactory.eINSTANCE.createMethodCall();\nde.silvawb.java.Type thisType = getTypeReference().getTarget();\nif (thisType instanceof de.silvawb.java.MemberContainer) {\n\tde.silvawb.java.MemberContainer castedType = ( de.silvawb.java.MemberContainer) thisType;\n\tde.silvawb.java.Method method = castedType.getContainedMethod(methodName);\n\tif (method == null) {\n\t\treturn null;\n\t}\n\tmethodCall.setTarget(method);\n\t// add arguments\n\tmethodCall.getArguments().addAll(arguments);\n\tthisRef.setNext(methodCall);\n\treturn thisRef;\n} else {\n\treturn null;\n}'"
	 * @generated
	 */
	Expression createMethodCall(String methodName, EList<Expression> arguments);

} // Variable
