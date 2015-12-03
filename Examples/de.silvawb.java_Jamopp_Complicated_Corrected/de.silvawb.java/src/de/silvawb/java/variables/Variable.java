/**
 */
package de.silvawb.java.variables;

import de.silvawb.java.arrays.ArrayTypeable;

import de.silvawb.java.commons.NamedElement;

import de.silvawb.java.expressions.Expression;

import de.silvawb.java.generics.TypeArgumentable;

import de.silvawb.java.references.ReferenceableElement;

import de.silvawb.java.statements.Statement;

import de.silvawb.java.types.TypedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.variables.VariablesPackage#getVariable()
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long size = this.getArrayDimensionsBefore().size() + this.getArrayDimensionsAfter().size();\nif (this instanceof de.silvawb.java.parameters.VariableLengthParameter) {\n\tsize++;\n}\nreturn size;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.statements.ExpressionStatement callStatement = de.silvawb.java.statements.StatementsFactory.eINSTANCE.createExpressionStatement();\ncallStatement.setExpression(createMethodCall(methodName, arguments));\nreturn callStatement;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.references.IdentifierReference thisRef = de.silvawb.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();\nthisRef.setTarget(this);\nde.silvawb.java.references.MethodCall methodCall = de.silvawb.java.references.ReferencesFactory.eINSTANCE.createMethodCall();\nde.silvawb.java.types.Type thisType = getTypeReference().getTarget();\nif (thisType instanceof de.silvawb.java.members.MemberContainer) {\n\tde.silvawb.java.members.MemberContainer castedType = ( de.silvawb.java.members.MemberContainer) thisType;\n\tde.silvawb.java.members.Method method = castedType.getContainedMethod(methodName);\n\tif (method == null) {\n\t\treturn null;\n\t}\n\tmethodCall.setTarget(method);\n\t// add arguments\n\tmethodCall.getArguments().addAll(arguments);\n\tthisRef.setNext(methodCall);\n\treturn thisRef;\n} else {\n\treturn null;\n}'"
	 * @generated
	 */
	Expression createMethodCall(String methodName, EList<Expression> arguments);

} // Variable
