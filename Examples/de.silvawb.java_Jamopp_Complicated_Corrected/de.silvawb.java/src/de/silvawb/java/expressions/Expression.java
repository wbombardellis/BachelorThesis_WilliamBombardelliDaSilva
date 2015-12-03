/**
 */
package de.silvawb.java.expressions;

import de.silvawb.java.annotations.AnnotationValue;

import de.silvawb.java.arrays.ArrayInitializationValue;

import de.silvawb.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.expressions.ExpressionsPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends ArrayInitializationValue, AnnotationValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  Returns the type of the expression considering all concrete
	 *  subtypes of Expression.
	 *  
	 *  @return type of expression
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getOneType(false);'"
	 * @generated
	 */
	Type getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getOneType(true);'"
	 * @generated
	 */
	Type getAlternativeType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.classifiers.Class stringClass = getStringClass();\n\nde.silvawb.java.types.Type type = null;\n\nif (this instanceof de.silvawb.java.references.Reference) {\n\tde.silvawb.java.references.Reference reference = ( de.silvawb.java.references.Reference) this;\n\t//navigate down references\n\twhile(reference.getNext() != null) {\n\t\treference = reference.getNext();\n\t}\n\ttype = reference.getReferencedType();\n}\nelse if (this instanceof de.silvawb.java.literals.Literal) {\n\ttype = (( de.silvawb.java.literals.Literal) this).getType();\n}\nelse if (this instanceof de.silvawb.java.expressions.CastExpression) {\n\ttype = (( de.silvawb.java.expressions.CastExpression)this).getTypeReference().getTarget();\n}\nelse if (this instanceof de.silvawb.java.expressions.AssignmentExpression) {\n\ttype = (( de.silvawb.java.expressions.AssignmentExpression) this).getChild().getOneType(alternative);\n}\nelse if (this instanceof de.silvawb.java.expressions.ConditionalExpression &&\n\t\t(( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionIf() != null) {\n\tif (alternative) {\n\t\ttype = (( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionElse().getOneType(alternative);\n\t}\n\telse {\n\t\ttype = (( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionIf().getOneType(alternative);\n\t}\n\t\n}\nelse if (this instanceof de.silvawb.java.expressions.EqualityExpression ||\n\t\tthis instanceof de.silvawb.java.expressions.RelationExpression ||\n\t\tthis instanceof de.silvawb.java.expressions.ConditionalOrExpression ||\n\t\tthis instanceof de.silvawb.java.expressions.ConditionalAndExpression ||\n\t\tthis instanceof de.silvawb.java.expressions.InstanceOfExpression ) {\n\ttype = getLibClass(\"Boolean\");\n}\nelse if (this instanceof de.silvawb.java.expressions.AdditiveExpression ||\n\t\tthis instanceof de.silvawb.java.expressions.MultiplicativeExpression ||\n\t\tthis instanceof de.silvawb.java.expressions.InclusiveOrExpression ||\n\t\tthis instanceof de.silvawb.java.expressions.ExclusiveOrExpression ||\n\t\tthis instanceof de.silvawb.java.expressions.AndExpression ||\n\t\tthis instanceof de.silvawb.java.expressions.ShiftExpression ) {\n\t\n\tif (this instanceof de.silvawb.java.expressions.AdditiveExpression) {\n\t\tde.silvawb.java.expressions.AdditiveExpression additiveExpression = ( de.silvawb.java.expressions.AdditiveExpression) this;\n\t\tfor( de.silvawb.java.expressions.Expression subExp : additiveExpression.getChildren()) {\n\t\t\tif (stringClass.equals(subExp.getOneType(alternative))) {\n\t\t\t\t//special case: string concatenation\n\t\t\t\treturn stringClass;\n\t\t\t}\n\t\t}\n\t}\n\t\n\t@SuppressWarnings(\"unchecked\")\n\tde.silvawb.java.expressions.Expression subExp = (( org.eclipse.emf.common.util.EList< de.silvawb.java.expressions.Expression>) \n\t\t\tthis.eGet(this.eClass().getEStructuralFeature(\"children\"))).get(0);\n\t\n\treturn subExp.getOneType(alternative);\n}\nelse if (this instanceof de.silvawb.java.expressions.UnaryExpression) {\n\tde.silvawb.java.expressions.Expression subExp = (( de.silvawb.java.expressions.UnaryExpression)this).getChild();\n\t\n\treturn subExp.getOneType(alternative);\n}\nelse for( org.eclipse.emf.common.util.TreeIterator< org.eclipse.emf.ecore.EObject> i = this.eAllContents(); i.hasNext(); ) {\n\torg.eclipse.emf.ecore.EObject next = i.next();\n\tde.silvawb.java.types.Type nextType = null;\n\n\tif (next instanceof de.silvawb.java.expressions.PrimaryExpression) {\n\n\t\tif (next instanceof de.silvawb.java.references.Reference) {\n\t\t\tde.silvawb.java.references.Reference ref = ( de.silvawb.java.references.Reference) next;\n\t\t\t//navigate down references\n\t\t\twhile(ref.getNext() != null) {\n\t\t\t\tref = ref.getNext();\n\t\t\t}\n\t\t\tnext = ref;\n\t\t}\n\t\tif (next instanceof de.silvawb.java.literals.Literal) {\n\t\t\tnextType = (( de.silvawb.java.literals.Literal) next).getType();\n\t\t}\n\t\telse if (next instanceof de.silvawb.java.expressions.CastExpression) {\n\t\t\tnextType = (( de.silvawb.java.expressions.CastExpression)next).getTypeReference().getTarget();\n\t\t}\n\t\telse {\n\t\t\tnextType = (( de.silvawb.java.references.Reference) next).getReferencedType();\n\t\t}\n\t\ti.prune();\n\n\t}\n\tif (nextType != null) {\n\t\ttype = nextType;\n\t\t//in the special case that this is an expression with\n\t\t//some string included, everything is converted to string\n\t\tif (stringClass.equals(type)) {\n\t\t\tbreak;\n\t\t}\n\t}\n}\n//type can be null in cases of unresolved/unresolvable proxies\nreturn type;'"
	 * @generated
	 */
	Type getOneType(boolean alternative);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long size = 0;\nde.silvawb.java.arrays.ArrayTypeable arrayType = null;\nif (this instanceof de.silvawb.java.expressions.NestedExpression && \n\t\t(( de.silvawb.java.expressions.NestedExpression)this).getNext() == null) {\n\treturn (( de.silvawb.java.expressions.NestedExpression) this).getExpression().getArrayDimension()\n\t\t- (( de.silvawb.java.expressions.NestedExpression)this).getArraySelectors().size();\n}\nif (this instanceof de.silvawb.java.expressions.ConditionalExpression &&\n\t\t(( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionIf() != null) {\t\t\n\treturn (( de.silvawb.java.expressions.ConditionalExpression)this).getExpressionIf().getArrayDimension();\n}\nif (this instanceof de.silvawb.java.expressions.AssignmentExpression) {\n\tde.silvawb.java.expressions.Expression value = (( de.silvawb.java.expressions.AssignmentExpression) this).getValue();\n\tif (value == null) {\n\t\treturn 0;\n\t}\n\treturn value.getArrayDimension();\n}\nif (this instanceof de.silvawb.java.expressions.InstanceOfExpression) {\n\treturn 0;\n}\nif (this instanceof de.silvawb.java.references.Reference) {\n\tde.silvawb.java.references.Reference reference = ( de.silvawb.java.references.Reference) this;\n\twhile (reference.getNext() != null) {\n\t\treference = reference.getNext();\n\t}\n\t//an array clone? -> dimension defined by cloned array\n\tif (reference instanceof de.silvawb.java.references.ElementReference && \n\t\t\treference.getPrevious() != null) {\n\t\tde.silvawb.java.references.ReferenceableElement target = (( de.silvawb.java.references.ElementReference)reference).getTarget();\n\t\tif (target instanceof de.silvawb.java.members.Method) {\n\t\t\tif(\"clone\".equals((( de.silvawb.java.members.Method)target).getName())) {\n\t\t\t\treference = ( de.silvawb.java.references.Reference) reference.eContainer();\n\t\t\t}\n\t\t}\n\t}\n\t\n\tif (reference instanceof de.silvawb.java.references.ElementReference) {\n\t\tde.silvawb.java.references.ElementReference elementReference = ( de.silvawb.java.references.ElementReference) reference;\n\t\tif (elementReference.getTarget() instanceof de.silvawb.java.arrays.ArrayTypeable) {\n\t\t\tarrayType = ( de.silvawb.java.arrays.ArrayTypeable) elementReference.getTarget();\n\t\t}\n\t\tif (elementReference.getTarget() instanceof de.silvawb.java.variables.AdditionalLocalVariable) {\n\t\t\tde.silvawb.java.variables.AdditionalLocalVariable additionalLocalVariable = ( de.silvawb.java.variables.AdditionalLocalVariable) elementReference.getTarget();\n\t\t\tarrayType = ( de.silvawb.java.variables.LocalVariable) additionalLocalVariable.eContainer();\n\t\t\tsize += additionalLocalVariable.getArrayDimensionsAfter().size();\n\t\t\tsize -= arrayType.getArrayDimensionsAfter().size();\n\t\t}\n\t\tif (elementReference.getTarget() instanceof de.silvawb.java.members.AdditionalField) {\n\t\t\tde.silvawb.java.members.AdditionalField additionalField = ( de.silvawb.java.members.AdditionalField) elementReference.getTarget();\n\t\t\tarrayType = ( de.silvawb.java.members.Field) additionalField.eContainer();\n\t\t\tsize += additionalField.getArrayDimensionsAfter().size();\n\t\t\tsize -= arrayType.getArrayDimensionsAfter().size();\n\t\t}\n\t}\n\telse if (this instanceof de.silvawb.java.arrays.ArrayTypeable) {\n\t\tsize += (( de.silvawb.java.arrays.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( de.silvawb.java.arrays.ArrayTypeable)this).getArrayDimensionsAfter().size();\n\t\tif (this instanceof de.silvawb.java.parameters.VariableLengthParameter) {\n\t\t\tsize++;\n\t\t}\n\t}\n\tsize -= reference.getArraySelectors().size();\n}\nelse if (this instanceof de.silvawb.java.arrays.ArrayTypeable) {\n\tsize += (( de.silvawb.java.arrays.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( de.silvawb.java.arrays.ArrayTypeable)this).getArrayDimensionsAfter().size();\n\tif (this instanceof de.silvawb.java.parameters.VariableLengthParameter) {\n\t\tsize++;\n\t}\n}\n\nif(this instanceof de.silvawb.java.arrays.ArrayInstantiationBySize) {\n\tsize += (( de.silvawb.java.arrays.ArrayInstantiationBySize)this).getSizes().size();\n}\n\nif(arrayType != null) {\n\tsize += arrayType.getArrayDimension();\n}\n\nreturn size;'"
	 * @generated
	 */
	long getArrayDimension();

} // Expression
