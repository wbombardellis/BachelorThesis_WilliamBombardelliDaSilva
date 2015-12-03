/**
 */
package de.silvawb.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.silvawb.java.JavaPackage#getExpression()
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='de.silvawb.java.Class stringClass = getStringClass();\n\nde.silvawb.java.Type type = null;\n\nif (this instanceof de.silvawb.java.Reference) {\n\tde.silvawb.java.Reference reference = ( de.silvawb.java.Reference) this;\n\t//navigate down references\n\twhile(reference.getNext() != null) {\n\t\treference = reference.getNext();\n\t}\n\ttype = reference.getReferencedType();\n}\nelse if (this instanceof de.silvawb.java.Literal) {\n\ttype = (( de.silvawb.java.Literal) this).getType();\n}\nelse if (this instanceof de.silvawb.java.CastExpression) {\n\ttype = (( de.silvawb.java.CastExpression)this).getTypeReference().getTarget();\n}\nelse if (this instanceof de.silvawb.java.AssignmentExpression) {\n\ttype = (( de.silvawb.java.AssignmentExpression) this).getChild().getOneType(alternative);\n}\nelse if (this instanceof de.silvawb.java.ConditionalExpression &&\n\t\t(( de.silvawb.java.ConditionalExpression)this).getExpressionIf() != null) {\n\tif (alternative) {\n\t\ttype = (( de.silvawb.java.ConditionalExpression)this).getExpressionElse().getOneType(alternative);\n\t}\n\telse {\n\t\ttype = (( de.silvawb.java.ConditionalExpression)this).getExpressionIf().getOneType(alternative);\n\t}\n\t\n}\nelse if (this instanceof de.silvawb.java.EqualityExpression ||\n\t\tthis instanceof de.silvawb.java.RelationExpression ||\n\t\tthis instanceof de.silvawb.java.ConditionalOrExpression ||\n\t\tthis instanceof de.silvawb.java.ConditionalAndExpression ||\n\t\tthis instanceof de.silvawb.java.InstanceOfExpression ) {\n\ttype = getLibClass(\"Boolean\");\n}\nelse if (this instanceof de.silvawb.java.AdditiveExpression ||\n\t\tthis instanceof de.silvawb.java.MultiplicativeExpression ||\n\t\tthis instanceof de.silvawb.java.InclusiveOrExpression ||\n\t\tthis instanceof de.silvawb.java.ExclusiveOrExpression ||\n\t\tthis instanceof de.silvawb.java.AndExpression ||\n\t\tthis instanceof de.silvawb.java.ShiftExpression ) {\n\t\n\tif (this instanceof de.silvawb.java.AdditiveExpression) {\n\t\tde.silvawb.java.AdditiveExpression additiveExpression = ( de.silvawb.java.AdditiveExpression) this;\n\t\tfor( de.silvawb.java.Expression subExp : additiveExpression.getChildren()) {\n\t\t\tif (stringClass.equals(subExp.getOneType(alternative))) {\n\t\t\t\t//special case: string concatenation\n\t\t\t\treturn stringClass;\n\t\t\t}\n\t\t}\n\t}\n\t\n\t@SuppressWarnings(\"unchecked\")\n\tde.silvawb.java.Expression subExp = (( org.eclipse.emf.common.util.EList< de.silvawb.java.Expression>) \n\t\t\tthis.eGet(this.eClass().getEStructuralFeature(\"children\"))).get(0);\n\t\n\treturn subExp.getOneType(alternative);\n}\nelse if (this instanceof de.silvawb.java.UnaryExpression) {\n\tde.silvawb.java.Expression subExp = (( de.silvawb.java.UnaryExpression)this).getChild();\n\t\n\treturn subExp.getOneType(alternative);\n}\nelse for( org.eclipse.emf.common.util.TreeIterator< org.eclipse.emf.ecore.EObject> i = this.eAllContents(); i.hasNext(); ) {\n\torg.eclipse.emf.ecore.EObject next = i.next();\n\tde.silvawb.java.Type nextType = null;\n\n\tif (next instanceof de.silvawb.java.PrimaryExpression) {\n\n\t\tif (next instanceof de.silvawb.java.Reference) {\n\t\t\tde.silvawb.java.Reference ref = ( de.silvawb.java.Reference) next;\n\t\t\t//navigate down references\n\t\t\twhile(ref.getNext() != null) {\n\t\t\t\tref = ref.getNext();\n\t\t\t}\n\t\t\tnext = ref;\n\t\t}\n\t\tif (next instanceof de.silvawb.java.Literal) {\n\t\t\tnextType = (( de.silvawb.java.Literal) next).getType();\n\t\t}\n\t\telse if (next instanceof de.silvawb.java.CastExpression) {\n\t\t\tnextType = (( de.silvawb.java.CastExpression)next).getTypeReference().getTarget();\n\t\t}\n\t\telse {\n\t\t\tnextType = (( de.silvawb.java.Reference) next).getReferencedType();\n\t\t}\n\t\ti.prune();\n\n\t}\n\tif (nextType != null) {\n\t\ttype = nextType;\n\t\t//in the special case that this is an expression with\n\t\t//some string included, everything is converted to string\n\t\tif (stringClass.equals(type)) {\n\t\t\tbreak;\n\t\t}\n\t}\n}\n//type can be null in cases of unresolved/unresolvable proxies\nreturn type;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long size = 0;\nde.silvawb.java.ArrayTypeable arrayType = null;\nif (this instanceof de.silvawb.java.NestedExpression && \n\t\t(( de.silvawb.java.NestedExpression)this).getNext() == null) {\n\treturn (( de.silvawb.java.NestedExpression) this).getExpression().getArrayDimension()\n\t\t- (( de.silvawb.java.NestedExpression)this).getArraySelectors().size();\n}\nif (this instanceof de.silvawb.java.ConditionalExpression &&\n\t\t(( de.silvawb.java.ConditionalExpression)this).getExpressionIf() != null) {\t\t\n\treturn (( de.silvawb.java.ConditionalExpression)this).getExpressionIf().getArrayDimension();\n}\nif (this instanceof de.silvawb.java.AssignmentExpression) {\n\tde.silvawb.java.Expression value = (( de.silvawb.java.AssignmentExpression) this).getValue();\n\tif (value == null) {\n\t\treturn 0;\n\t}\n\treturn value.getArrayDimension();\n}\nif (this instanceof de.silvawb.java.InstanceOfExpression) {\n\treturn 0;\n}\nif (this instanceof de.silvawb.java.Reference) {\n\tde.silvawb.java.Reference reference = ( de.silvawb.java.Reference) this;\n\twhile (reference.getNext() != null) {\n\t\treference = reference.getNext();\n\t}\n\t//an array clone? -> dimension defined by cloned array\n\tif (reference instanceof de.silvawb.java.ElementReference && \n\t\t\treference.getPrevious() != null) {\n\t\tde.silvawb.java.ReferenceableElement target = (( de.silvawb.java.ElementReference)reference).getTarget();\n\t\tif (target instanceof de.silvawb.java.Method) {\n\t\t\tif(\"clone\".equals((( de.silvawb.java.Method)target).getName())) {\n\t\t\t\treference = ( de.silvawb.java.Reference) reference.eContainer();\n\t\t\t}\n\t\t}\n\t}\n\t\n\tif (reference instanceof de.silvawb.java.ElementReference) {\n\t\tde.silvawb.java.ElementReference elementReference = ( de.silvawb.java.ElementReference) reference;\n\t\tif (elementReference.getTarget() instanceof de.silvawb.java.ArrayTypeable) {\n\t\t\tarrayType = ( de.silvawb.java.ArrayTypeable) elementReference.getTarget();\n\t\t}\n\t\tif (elementReference.getTarget() instanceof de.silvawb.java.AdditionalLocalVariable) {\n\t\t\tde.silvawb.java.AdditionalLocalVariable additionalLocalVariable = ( de.silvawb.java.AdditionalLocalVariable) elementReference.getTarget();\n\t\t\tarrayType = ( de.silvawb.java.LocalVariable) additionalLocalVariable.eContainer();\n\t\t\tsize += additionalLocalVariable.getArrayDimensionsAfter().size();\n\t\t\tsize -= arrayType.getArrayDimensionsAfter().size();\n\t\t}\n\t\tif (elementReference.getTarget() instanceof de.silvawb.java.AdditionalField) {\n\t\t\tde.silvawb.java.AdditionalField additionalField = ( de.silvawb.java.AdditionalField) elementReference.getTarget();\n\t\t\tarrayType = ( de.silvawb.java.Field) additionalField.eContainer();\n\t\t\tsize += additionalField.getArrayDimensionsAfter().size();\n\t\t\tsize -= arrayType.getArrayDimensionsAfter().size();\n\t\t}\n\t}\n\telse if (this instanceof de.silvawb.java.ArrayTypeable) {\n\t\tsize += (( de.silvawb.java.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( de.silvawb.java.ArrayTypeable)this).getArrayDimensionsAfter().size();\n\t\tif (this instanceof de.silvawb.java.VariableLengthParameter) {\n\t\t\tsize++;\n\t\t}\n\t}\n\tsize -= reference.getArraySelectors().size();\n}\nelse if (this instanceof de.silvawb.java.ArrayTypeable) {\n\tsize += (( de.silvawb.java.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( de.silvawb.java.ArrayTypeable)this).getArrayDimensionsAfter().size();\n\tif (this instanceof de.silvawb.java.VariableLengthParameter) {\n\t\tsize++;\n\t}\n}\n\nif(this instanceof de.silvawb.java.ArrayInstantiationBySize) {\n\tsize += (( de.silvawb.java.ArrayInstantiationBySize)this).getSizes().size();\n}\n\nif(arrayType != null) {\n\tsize += arrayType.getArrayDimension();\n}\n\nreturn size;'"
	 * @generated
	 */
	long getArrayDimension();

} // Expression
