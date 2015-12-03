/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.JavaFactory;
import de.silvawb.java.JavaPackage;

import de.silvawb.layout.LayoutPackage;

import de.silvawb.layout.impl.LayoutPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaPackageImpl extends EPackageImpl implements JavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "java.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleAnnotationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationParameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAttributeSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationBySizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationByValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationByValuesUntypedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstantiationByValuesTypedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceAwareElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOrExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalAndExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalAndExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveOrExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveOrExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOfExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicativeExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryModificationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixUnaryModificationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suffixUnaryModificationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryModificationExpressionChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeArgumentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callTypeArgumentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParametrizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendsTypeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedTypeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superTypeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownTypeArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticClassifierImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticMemberImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newConstructorCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitConstructorCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalFloatLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexFloatLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalDoubleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexDoubleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass octalIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalLongLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexLongLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass octalLongLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionThrowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationInstanceOrModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotableAndModifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strictfpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volatileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicativeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryModificationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentDivisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExclusiveOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentMinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentModuloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentMultiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentLeftShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentRightShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentUnsignedRightShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remainderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusMinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedRightShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectiveClassReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametrizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinaryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableLengthParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementListContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultSwitchCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doWhileLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalSwitchCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizedBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceClassifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalLocalVariableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.silvawb.java.JavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaPackageImpl() {
		super(eNS_URI, JavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static JavaPackage init() {
		if (isInited) return (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Obtain or create and register package
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) : LayoutPackage.eINSTANCE);

		// Load packages
		theJavaPackage.loadPackage();

		// Create package meta-data objects
		theLayoutPackage.createPackageContents();

		// Initialize created meta-data
		theLayoutPackage.initializePackageContents();

		// Fix loaded packages
		theJavaPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, theJavaPackage);
		return theJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotable() {
		if (annotableEClass == null) {
			annotableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(0);
		}
		return annotableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotable_Annotations() {
        return (EReference)getAnnotable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationInstance() {
		if (annotationInstanceEClass == null) {
			annotationInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(1);
		}
		return annotationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationInstance_Annotation() {
        return (EReference)getAnnotationInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationInstance_Parameter() {
        return (EReference)getAnnotationInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationParameter() {
		if (annotationParameterEClass == null) {
			annotationParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(2);
		}
		return annotationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleAnnotationParameter() {
		if (singleAnnotationParameterEClass == null) {
			singleAnnotationParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(3);
		}
		return singleAnnotationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleAnnotationParameter_Value() {
        return (EReference)getSingleAnnotationParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationParameterList() {
		if (annotationParameterListEClass == null) {
			annotationParameterListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(4);
		}
		return annotationParameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationParameterList_Settings() {
        return (EReference)getAnnotationParameterList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAttributeSetting() {
		if (annotationAttributeSettingEClass == null) {
			annotationAttributeSettingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(5);
		}
		return annotationAttributeSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAttributeSetting_Attribute() {
        return (EReference)getAnnotationAttributeSetting().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAttributeSetting_Value() {
        return (EReference)getAnnotationAttributeSetting().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationValue() {
		if (annotationValueEClass == null) {
			annotationValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(6);
		}
		return annotationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAttribute() {
		if (annotationAttributeEClass == null) {
			annotationAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(7);
		}
		return annotationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAttribute_DefaultValue() {
        return (EReference)getAnnotationAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeable() {
		if (arrayTypeableEClass == null) {
			arrayTypeableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(8);
		}
		return arrayTypeableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeable_ArrayDimensionsBefore() {
        return (EReference)getArrayTypeable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeable_ArrayDimensionsAfter() {
        return (EReference)getArrayTypeable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayTypeable__GetArrayDimension() {
        return getArrayTypeable().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDimension() {
		if (arrayDimensionEClass == null) {
			arrayDimensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(9);
		}
		return arrayDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInitializer() {
		if (arrayInitializerEClass == null) {
			arrayInitializerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(10);
		}
		return arrayInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInitializer_InitialValues() {
        return (EReference)getArrayInitializer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInitializationValue() {
		if (arrayInitializationValueEClass == null) {
			arrayInitializationValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(11);
		}
		return arrayInitializationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiation() {
		if (arrayInstantiationEClass == null) {
			arrayInstantiationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(12);
		}
		return arrayInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiationBySize() {
		if (arrayInstantiationBySizeEClass == null) {
			arrayInstantiationBySizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(13);
		}
		return arrayInstantiationBySizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInstantiationBySize_Sizes() {
        return (EReference)getArrayInstantiationBySize().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiationByValues() {
		if (arrayInstantiationByValuesEClass == null) {
			arrayInstantiationByValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(14);
		}
		return arrayInstantiationByValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInstantiationByValues_ArrayInitializer() {
        return (EReference)getArrayInstantiationByValues().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiationByValuesUntyped() {
		if (arrayInstantiationByValuesUntypedEClass == null) {
			arrayInstantiationByValuesUntypedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(15);
		}
		return arrayInstantiationByValuesUntypedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstantiationByValuesTyped() {
		if (arrayInstantiationByValuesTypedEClass == null) {
			arrayInstantiationByValuesTypedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(16);
		}
		return arrayInstantiationByValuesTypedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArraySelector() {
		if (arraySelectorEClass == null) {
			arraySelectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(17);
		}
		return arraySelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArraySelector_Position() {
        return (EReference)getArraySelector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		if (classifierEClass == null) {
			classifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(18);
		}
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__GetAllSuperClassifiers() {
        return getClassifier().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteClassifier() {
		if (concreteClassifierEClass == null) {
			concreteClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(19);
		}
		return concreteClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteClassifier__GetInnerClassifiers() {
        return getConcreteClassifier().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteClassifier__GetAllInnerClassifiers() {
        return getConcreteClassifier().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteClassifier__GetSuperTypeReferences() {
        return getConcreteClassifier().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConcreteClassifier__GetAllMembers__Commentable() {
        return getConcreteClassifier().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementor() {
		if (implementorEClass == null) {
			implementorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(20);
		}
		return implementorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementor_Implements() {
        return (EReference)getImplementor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		if (classEClass == null) {
			classEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(21);
		}
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Extends() {
        return (EReference)getClass_().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_DefaultExtends() {
        return (EReference)getClass_().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__GetAllSuperClassifiers() {
        return getClass_().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__GetSuperClass() {
        return getClass_().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__UnWrapPrimitiveType() {
        return getClass_().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		if (interfaceEClass == null) {
			interfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(22);
		}
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Extends() {
        return (EReference)getInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_DefaultExtends() {
        return (EReference)getInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__GetAllSuperClassifiers() {
        return getInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		if (enumerationEClass == null) {
			enumerationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(23);
		}
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Constants() {
        return (EReference)getEnumeration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumeration__GetAllSuperClassifiers() {
        return getEnumeration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumeration__GetContainedConstant__String() {
        return getEnumeration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		if (annotationEClass == null) {
			annotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(24);
		}
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotation__GetAllSuperClassifiers() {
        return getAnnotation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousClass() {
		if (anonymousClassEClass == null) {
			anonymousClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(25);
		}
		return anonymousClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__GetAllSuperClassifiers() {
        return getAnonymousClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__GetSuperClassifier() {
        return getAnonymousClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousClass__GetAllMembers__Commentable() {
        return getAnonymousClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentable() {
		if (commentableEClass == null) {
			commentableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(26);
		}
		return commentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentable_LayoutInformations() {
        return (EReference)getCommentable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetConcreteClassifier__String() {
        return getCommentable().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetConcreteClassifierProxy__String() {
        return getCommentable().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetConcreteClassifiers__String_String() {
        return getCommentable().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetConcreteClassifierProxies__String_String() {
        return getCommentable().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetLibClass__String() {
        return getCommentable().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetLibInterface__String() {
        return getCommentable().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetClassClass() {
        return getCommentable().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetObjectClass() {
        return getCommentable().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetStringClass() {
        return getCommentable().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetAnnotationInterface() {
        return getCommentable().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingAnnotationInstance() {
        return getCommentable().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingAnonymousClass() {
        return getCommentable().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingConcreteClassifier() {
        return getCommentable().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingCompilationUnit() {
        return getCommentable().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetContainingPackageName() {
        return getCommentable().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetParentConcreteClassifier() {
        return getCommentable().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetParentByEType__EClass() {
        return getCommentable().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetFirstChildByEType__EClass() {
        return getCommentable().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetParentByType__Class() {
        return getCommentable().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetFirstChildByType__Class() {
        return getCommentable().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetChildrenByEType__EClass() {
        return getCommentable().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetChildrenByType__Class() {
        return getCommentable().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__GetComments() {
        return getCommentable().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__AddBeforeContainingStatement__Statement() {
        return getCommentable().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommentable__AddAfterContainingStatement__Statement() {
        return getCommentable().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		if (namedElementEClass == null) {
			namedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(27);
		}
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceAwareElement() {
		if (namespaceAwareElementEClass == null) {
			namespaceAwareElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(28);
		}
		return namespaceAwareElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceAwareElement_Namespaces() {
        return (EAttribute)getNamespaceAwareElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespaceAwareElement__GetNamespacesAsString() {
        return getNamespaceAwareElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespaceAwareElement__GetClassifierAtNamespaces() {
        return getNamespaceAwareElement().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaRoot() {
		if (javaRootEClass == null) {
			javaRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(29);
		}
		return javaRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJavaRoot__GetClassifiersInSamePackage() {
        return getJavaRoot().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		if (compilationUnitEClass == null) {
			compilationUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(30);
		}
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_Classifiers() {
        return (EReference)getCompilationUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__GetContainedClassifier__String() {
        return getCompilationUnit().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompilationUnit__GetClassifiersInSamePackage() {
        return getCompilationUnit().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		if (packageEClass == null) {
			packageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(31);
		}
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_CompilationUnits() {
        return (EReference)getPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__GetNamespacesAsString() {
        return getPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__GetClassifiersInSamePackage() {
        return getPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyModel() {
		if (emptyModelEClass == null) {
			emptyModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(32);
		}
		return emptyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionList() {
		if (expressionListEClass == null) {
			expressionListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(33);
		}
		return expressionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionList_Expressions() {
        return (EReference)getExpressionList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		if (expressionEClass == null) {
			expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(34);
		}
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__GetType() {
        return getExpression().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__GetAlternativeType() {
        return getExpression().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__GetOneType__boolean() {
        return getExpression().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__GetArrayDimension() {
        return getExpression().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentExpression() {
		if (assignmentExpressionEClass == null) {
			assignmentExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(35);
		}
		return assignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentExpression_Child() {
        return (EReference)getAssignmentExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentExpression_AssignmentOperator() {
        return (EReference)getAssignmentExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentExpression_Value() {
        return (EReference)getAssignmentExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentExpressionChild() {
		if (assignmentExpressionChildEClass == null) {
			assignmentExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(36);
		}
		return assignmentExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpression() {
		if (conditionalExpressionEClass == null) {
			conditionalExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(37);
		}
		return conditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_Child() {
        return (EReference)getConditionalExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_ExpressionIf() {
        return (EReference)getConditionalExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_ExpressionElse() {
        return (EReference)getConditionalExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpressionChild() {
		if (conditionalExpressionChildEClass == null) {
			conditionalExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(38);
		}
		return conditionalExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalOrExpression() {
		if (conditionalOrExpressionEClass == null) {
			conditionalOrExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(39);
		}
		return conditionalOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalOrExpression_Children() {
        return (EReference)getConditionalOrExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalOrExpressionChild() {
		if (conditionalOrExpressionChildEClass == null) {
			conditionalOrExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(40);
		}
		return conditionalOrExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalAndExpression() {
		if (conditionalAndExpressionEClass == null) {
			conditionalAndExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(41);
		}
		return conditionalAndExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAndExpression_Children() {
        return (EReference)getConditionalAndExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalAndExpressionChild() {
		if (conditionalAndExpressionChildEClass == null) {
			conditionalAndExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(42);
		}
		return conditionalAndExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusiveOrExpression() {
		if (inclusiveOrExpressionEClass == null) {
			inclusiveOrExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(43);
		}
		return inclusiveOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclusiveOrExpression_Children() {
        return (EReference)getInclusiveOrExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusiveOrExpressionChild() {
		if (inclusiveOrExpressionChildEClass == null) {
			inclusiveOrExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(44);
		}
		return inclusiveOrExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveOrExpression() {
		if (exclusiveOrExpressionEClass == null) {
			exclusiveOrExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(45);
		}
		return exclusiveOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveOrExpression_Children() {
        return (EReference)getExclusiveOrExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveOrExpressionChild() {
		if (exclusiveOrExpressionChildEClass == null) {
			exclusiveOrExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(46);
		}
		return exclusiveOrExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExpression() {
		if (andExpressionEClass == null) {
			andExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(47);
		}
		return andExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExpression_Children() {
        return (EReference)getAndExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExpressionChild() {
		if (andExpressionChildEClass == null) {
			andExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(48);
		}
		return andExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityExpression() {
		if (equalityExpressionEClass == null) {
			equalityExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(49);
		}
		return equalityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqualityExpression_EqualityOperators() {
        return (EReference)getEqualityExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqualityExpression_Children() {
        return (EReference)getEqualityExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityExpressionChild() {
		if (equalityExpressionChildEClass == null) {
			equalityExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(50);
		}
		return equalityExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceOfExpression() {
		if (instanceOfExpressionEClass == null) {
			instanceOfExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(51);
		}
		return instanceOfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceOfExpression_Child() {
        return (EReference)getInstanceOfExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceOfExpressionChild() {
		if (instanceOfExpressionChildEClass == null) {
			instanceOfExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(52);
		}
		return instanceOfExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationExpression() {
		if (relationExpressionEClass == null) {
			relationExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(53);
		}
		return relationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationExpression_Children() {
        return (EReference)getRelationExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationExpression_RelationOperators() {
        return (EReference)getRelationExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationExpressionChild() {
		if (relationExpressionChildEClass == null) {
			relationExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(54);
		}
		return relationExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShiftExpression() {
		if (shiftExpressionEClass == null) {
			shiftExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(55);
		}
		return shiftExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShiftExpression_Children() {
        return (EReference)getShiftExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShiftExpression_ShiftOperators() {
        return (EReference)getShiftExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShiftExpressionChild() {
		if (shiftExpressionChildEClass == null) {
			shiftExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(56);
		}
		return shiftExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditiveExpression() {
		if (additiveExpressionEClass == null) {
			additiveExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(57);
		}
		return additiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditiveExpression_Children() {
        return (EReference)getAdditiveExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditiveExpression_AdditiveOperators() {
        return (EReference)getAdditiveExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditiveExpressionChild() {
		if (additiveExpressionChildEClass == null) {
			additiveExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(58);
		}
		return additiveExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicativeExpression() {
		if (multiplicativeExpressionEClass == null) {
			multiplicativeExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(59);
		}
		return multiplicativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicativeExpression_Children() {
        return (EReference)getMultiplicativeExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicativeExpression_MultiplicativeOperators() {
        return (EReference)getMultiplicativeExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicativeExpressionChild() {
		if (multiplicativeExpressionChildEClass == null) {
			multiplicativeExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(60);
		}
		return multiplicativeExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		if (unaryExpressionEClass == null) {
			unaryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(61);
		}
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operators() {
        return (EReference)getUnaryExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Child() {
        return (EReference)getUnaryExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpressionChild() {
		if (unaryExpressionChildEClass == null) {
			unaryExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(62);
		}
		return unaryExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryModificationExpression() {
		if (unaryModificationExpressionEClass == null) {
			unaryModificationExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(63);
		}
		return unaryModificationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryModificationExpression_Child() {
        return (EReference)getUnaryModificationExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryModificationExpression_Operator() {
        return (EReference)getUnaryModificationExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefixUnaryModificationExpression() {
		if (prefixUnaryModificationExpressionEClass == null) {
			prefixUnaryModificationExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(64);
		}
		return prefixUnaryModificationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuffixUnaryModificationExpression() {
		if (suffixUnaryModificationExpressionEClass == null) {
			suffixUnaryModificationExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(65);
		}
		return suffixUnaryModificationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryModificationExpressionChild() {
		if (unaryModificationExpressionChildEClass == null) {
			unaryModificationExpressionChildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(66);
		}
		return unaryModificationExpressionChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCastExpression() {
		if (castExpressionEClass == null) {
			castExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(67);
		}
		return castExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastExpression_Child() {
        return (EReference)getCastExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryExpression() {
		if (primaryExpressionEClass == null) {
			primaryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(68);
		}
		return primaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedExpression() {
		if (nestedExpressionEClass == null) {
			nestedExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(69);
		}
		return nestedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedExpression_Expression() {
        return (EReference)getNestedExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeArgument() {
		if (typeArgumentEClass == null) {
			typeArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(70);
		}
		return typeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeArgumentable() {
		if (typeArgumentableEClass == null) {
			typeArgumentableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(71);
		}
		return typeArgumentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeArgumentable_TypeArguments() {
        return (EReference)getTypeArgumentable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallTypeArgumentable() {
		if (callTypeArgumentableEClass == null) {
			callTypeArgumentableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(72);
		}
		return callTypeArgumentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallTypeArgumentable_CallTypeArguments() {
        return (EReference)getCallTypeArgumentable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParametrizable() {
		if (typeParametrizableEClass == null) {
			typeParametrizableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(73);
		}
		return typeParametrizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParametrizable_TypeParameters() {
        return (EReference)getTypeParametrizable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendsTypeArgument() {
		if (extendsTypeArgumentEClass == null) {
			extendsTypeArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(74);
		}
		return extendsTypeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendsTypeArgument_ExtendTypes() {
        return (EReference)getExtendsTypeArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedTypeArgument() {
		if (qualifiedTypeArgumentEClass == null) {
			qualifiedTypeArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(75);
		}
		return qualifiedTypeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperTypeArgument() {
		if (superTypeArgumentEClass == null) {
			superTypeArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(76);
		}
		return superTypeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperTypeArgument_SuperType() {
        return (EReference)getSuperTypeArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParameter() {
		if (typeParameterEClass == null) {
			typeParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(77);
		}
		return typeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParameter_ExtendTypes() {
        return (EReference)getTypeParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__GetAllSuperClassifiers() {
        return getTypeParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__GetAllMembers__Commentable() {
        return getTypeParameter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeParameter__GetBoundType__TypeReference_Reference() {
        return getTypeParameter().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownTypeArgument() {
		if (unknownTypeArgumentEClass == null) {
			unknownTypeArgumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(78);
		}
		return unknownTypeArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		if (importEClass == null) {
			importEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(79);
		}
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImport__GetImportedClassifier__String() {
        return getImport().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImport__GetImportedClassifiers() {
        return getImport().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImport__GetImportedMembers() {
        return getImport().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportingElement() {
		if (importingElementEClass == null) {
			importingElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(80);
		}
		return importingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportingElement_Imports() {
        return (EReference)getImportingElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImportingElement__GetDefaultImports() {
        return getImportingElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticImport() {
		if (staticImportEClass == null) {
			staticImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(81);
		}
		return staticImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticImport_Static() {
        return (EReference)getStaticImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierImport() {
		if (classifierImportEClass == null) {
			classifierImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(82);
		}
		return classifierImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierImport_Classifier() {
        return (EReference)getClassifierImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImport() {
		if (packageImportEClass == null) {
			packageImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(83);
		}
		return packageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticClassifierImport() {
		if (staticClassifierImportEClass == null) {
			staticClassifierImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(84);
		}
		return staticClassifierImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticMemberImport() {
		if (staticMemberImportEClass == null) {
			staticMemberImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(85);
		}
		return staticMemberImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMemberImport_StaticMembers() {
        return (EReference)getStaticMemberImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializable() {
		if (initializableEClass == null) {
			initializableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(86);
		}
		return initializableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitializable_InitialValue() {
        return (EReference)getInitializable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantiation() {
		if (instantiationEClass == null) {
			instantiationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(87);
		}
		return instantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewConstructorCall() {
		if (newConstructorCallEClass == null) {
			newConstructorCallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(88);
		}
		return newConstructorCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewConstructorCall_AnonymousClass() {
        return (EReference)getNewConstructorCall().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplicitConstructorCall() {
		if (explicitConstructorCallEClass == null) {
			explicitConstructorCallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(89);
		}
		return explicitConstructorCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplicitConstructorCall_CallTarget() {
        return (EReference)getExplicitConstructorCall().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		if (literalEClass == null) {
			literalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(90);
		}
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteral__GetOneType__boolean() {
        return getLiteral().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelf() {
		if (selfEClass == null) {
			selfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(91);
		}
		return selfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		if (booleanLiteralEClass == null) {
			booleanLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(92);
		}
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteral_Value() {
        return (EAttribute)getBooleanLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterLiteral() {
		if (characterLiteralEClass == null) {
			characterLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(93);
		}
		return characterLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterLiteral_Value() {
        return (EAttribute)getCharacterLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatLiteral() {
		if (floatLiteralEClass == null) {
			floatLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(94);
		}
		return floatLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalFloatLiteral() {
		if (decimalFloatLiteralEClass == null) {
			decimalFloatLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(95);
		}
		return decimalFloatLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalFloatLiteral_DecimalValue() {
        return (EAttribute)getDecimalFloatLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexFloatLiteral() {
		if (hexFloatLiteralEClass == null) {
			hexFloatLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(96);
		}
		return hexFloatLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexFloatLiteral_HexValue() {
        return (EAttribute)getHexFloatLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleLiteral() {
		if (doubleLiteralEClass == null) {
			doubleLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(97);
		}
		return doubleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalDoubleLiteral() {
		if (decimalDoubleLiteralEClass == null) {
			decimalDoubleLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(98);
		}
		return decimalDoubleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalDoubleLiteral_DecimalValue() {
        return (EAttribute)getDecimalDoubleLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexDoubleLiteral() {
		if (hexDoubleLiteralEClass == null) {
			hexDoubleLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(99);
		}
		return hexDoubleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexDoubleLiteral_HexValue() {
        return (EAttribute)getHexDoubleLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLiteral() {
		if (integerLiteralEClass == null) {
			integerLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(100);
		}
		return integerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalIntegerLiteral() {
		if (decimalIntegerLiteralEClass == null) {
			decimalIntegerLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(101);
		}
		return decimalIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalIntegerLiteral_DecimalValue() {
        return (EAttribute)getDecimalIntegerLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexIntegerLiteral() {
		if (hexIntegerLiteralEClass == null) {
			hexIntegerLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(102);
		}
		return hexIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexIntegerLiteral_HexValue() {
        return (EAttribute)getHexIntegerLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOctalIntegerLiteral() {
		if (octalIntegerLiteralEClass == null) {
			octalIntegerLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(103);
		}
		return octalIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOctalIntegerLiteral_OctalValue() {
        return (EAttribute)getOctalIntegerLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongLiteral() {
		if (longLiteralEClass == null) {
			longLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(104);
		}
		return longLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalLongLiteral() {
		if (decimalLongLiteralEClass == null) {
			decimalLongLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(105);
		}
		return decimalLongLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalLongLiteral_DecimalValue() {
        return (EAttribute)getDecimalLongLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexLongLiteral() {
		if (hexLongLiteralEClass == null) {
			hexLongLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(106);
		}
		return hexLongLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexLongLiteral_HexValue() {
        return (EAttribute)getHexLongLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOctalLongLiteral() {
		if (octalLongLiteralEClass == null) {
			octalLongLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(107);
		}
		return octalLongLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOctalLongLiteral_OctalValue() {
        return (EAttribute)getOctalLongLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullLiteral() {
		if (nullLiteralEClass == null) {
			nullLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(108);
		}
		return nullLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuper() {
		if (superEClass == null) {
			superEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(109);
		}
		return superEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThis() {
		if (thisEClass == null) {
			thisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(110);
		}
		return thisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionThrower() {
		if (exceptionThrowerEClass == null) {
			exceptionThrowerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(111);
		}
		return exceptionThrowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionThrower_Exceptions() {
        return (EReference)getExceptionThrower().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		if (memberEClass == null) {
			memberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(112);
		}
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberContainer() {
		if (memberContainerEClass == null) {
			memberContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(113);
		}
		return memberContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberContainer_Members() {
        return (EReference)getMemberContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberContainer_DefaultMembers() {
        return (EReference)getMemberContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetContainedClassifier__String() {
        return getMemberContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetContainedField__String() {
        return getMemberContainer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetContainedMethod__String() {
        return getMemberContainer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetMethods() {
        return getMemberContainer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__RemoveMethods__String() {
        return getMemberContainer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetMembersByName__String() {
        return getMemberContainer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__CreateField__String_String() {
        return getMemberContainer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemberContainer__GetFields() {
        return getMemberContainer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalField() {
		if (additionalFieldEClass == null) {
			additionalFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(114);
		}
		return additionalFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalField__GetArrayDimension() {
        return getAdditionalField().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		if (constructorEClass == null) {
			constructorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(115);
		}
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyMember() {
		if (emptyMemberEClass == null) {
			emptyMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(116);
		}
		return emptyMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		if (fieldEClass == null) {
			fieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(117);
		}
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_AdditionalFields() {
        return (EReference)getField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		if (methodEClass == null) {
			methodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(118);
		}
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethod__IsMethodForCall__MethodCall_boolean() {
        return getMethod().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethod__IsSomeMethodForCall__MethodCall() {
        return getMethod().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethod__IsBetterMethodForCall__Method_MethodCall() {
        return getMethod().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMethod__GetArrayDimension() {
        return getMethod().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceMethod() {
		if (interfaceMethodEClass == null) {
			interfaceMethodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(119);
		}
		return interfaceMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMethod() {
		if (classMethodEClass == null) {
			classMethodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(120);
		}
		return classMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumConstant() {
		if (enumConstantEClass == null) {
			enumConstantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(121);
		}
		return enumConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumConstant_AnonymousClass() {
        return (EReference)getEnumConstant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifier() {
		if (modifierEClass == null) {
			modifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(122);
		}
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationInstanceOrModifier() {
		if (annotationInstanceOrModifierEClass == null) {
			annotationInstanceOrModifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(123);
		}
		return annotationInstanceOrModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotableAndModifiable() {
		if (annotableAndModifiableEClass == null) {
			annotableAndModifiableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(124);
		}
		return annotableAndModifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotableAndModifiable_AnnotationsAndModifiers() {
        return (EReference)getAnnotableAndModifiable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__IsHidden__Commentable() {
        return getAnnotableAndModifiable().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__IsStatic() {
        return getAnnotableAndModifiable().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__RemoveModifier__Class() {
        return getAnnotableAndModifiable().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__MakePublic() {
        return getAnnotableAndModifiable().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__MakePrivate() {
        return getAnnotableAndModifiable().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__MakeProtected() {
        return getAnnotableAndModifiable().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__GetModifiers() {
        return getAnnotableAndModifiable().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__RemoveAllModifiers() {
        return getAnnotableAndModifiable().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__HasModifier__Class() {
        return getAnnotableAndModifiable().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__IsPublic() {
        return getAnnotableAndModifiable().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__IsPrivate() {
        return getAnnotableAndModifiable().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__IsProtected() {
        return getAnnotableAndModifiable().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotableAndModifiable__AddModifier__Modifier() {
        return getAnnotableAndModifiable().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifiable() {
		if (modifiableEClass == null) {
			modifiableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(125);
		}
		return modifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiable_Modifiers() {
        return (EReference)getModifiable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstract() {
		if (abstractEClass == null) {
			abstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(126);
		}
		return abstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinal() {
		if (finalEClass == null) {
			finalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(127);
		}
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNative() {
		if (nativeEClass == null) {
			nativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(128);
		}
		return nativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtected() {
		if (protectedEClass == null) {
			protectedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(129);
		}
		return protectedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublic() {
		if (publicEClass == null) {
			publicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(130);
		}
		return publicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivate() {
		if (privateEClass == null) {
			privateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(131);
		}
		return privateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatic() {
		if (staticEClass == null) {
			staticEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(132);
		}
		return staticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrictfp() {
		if (strictfpEClass == null) {
			strictfpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(133);
		}
		return strictfpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronized() {
		if (synchronizedEClass == null) {
			synchronizedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(134);
		}
		return synchronizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransient() {
		if (transientEClass == null) {
			transientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(135);
		}
		return transientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolatile() {
		if (volatileEClass == null) {
			volatileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(136);
		}
		return volatileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		if (operatorEClass == null) {
			operatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(137);
		}
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditiveOperator() {
		if (additiveOperatorEClass == null) {
			additiveOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(138);
		}
		return additiveOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentOperator() {
		if (assignmentOperatorEClass == null) {
			assignmentOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(139);
		}
		return assignmentOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityOperator() {
		if (equalityOperatorEClass == null) {
			equalityOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(140);
		}
		return equalityOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicativeOperator() {
		if (multiplicativeOperatorEClass == null) {
			multiplicativeOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(141);
		}
		return multiplicativeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationOperator() {
		if (relationOperatorEClass == null) {
			relationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(142);
		}
		return relationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShiftOperator() {
		if (shiftOperatorEClass == null) {
			shiftOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(143);
		}
		return shiftOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperator() {
		if (unaryOperatorEClass == null) {
			unaryOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(144);
		}
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryModificationOperator() {
		if (unaryModificationOperatorEClass == null) {
			unaryModificationOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(145);
		}
		return unaryModificationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		if (assignmentEClass == null) {
			assignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(146);
		}
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentAnd() {
		if (assignmentAndEClass == null) {
			assignmentAndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(147);
		}
		return assignmentAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentDivision() {
		if (assignmentDivisionEClass == null) {
			assignmentDivisionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(148);
		}
		return assignmentDivisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentExclusiveOr() {
		if (assignmentExclusiveOrEClass == null) {
			assignmentExclusiveOrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(149);
		}
		return assignmentExclusiveOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentMinus() {
		if (assignmentMinusEClass == null) {
			assignmentMinusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(150);
		}
		return assignmentMinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentModulo() {
		if (assignmentModuloEClass == null) {
			assignmentModuloEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(151);
		}
		return assignmentModuloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentMultiplication() {
		if (assignmentMultiplicationEClass == null) {
			assignmentMultiplicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(152);
		}
		return assignmentMultiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentLeftShift() {
		if (assignmentLeftShiftEClass == null) {
			assignmentLeftShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(153);
		}
		return assignmentLeftShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentOr() {
		if (assignmentOrEClass == null) {
			assignmentOrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(154);
		}
		return assignmentOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentPlus() {
		if (assignmentPlusEClass == null) {
			assignmentPlusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(155);
		}
		return assignmentPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentRightShift() {
		if (assignmentRightShiftEClass == null) {
			assignmentRightShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(156);
		}
		return assignmentRightShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentUnsignedRightShift() {
		if (assignmentUnsignedRightShiftEClass == null) {
			assignmentUnsignedRightShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(157);
		}
		return assignmentUnsignedRightShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		if (equalEClass == null) {
			equalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(158);
		}
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEqual() {
		if (notEqualEClass == null) {
			notEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(159);
		}
		return notEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThan() {
		if (greaterThanEClass == null) {
			greaterThanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(160);
		}
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThanOrEqual() {
		if (greaterThanOrEqualEClass == null) {
			greaterThanOrEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(161);
		}
		return greaterThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThan() {
		if (lessThanEClass == null) {
			lessThanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(162);
		}
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThanOrEqual() {
		if (lessThanOrEqualEClass == null) {
			lessThanOrEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(163);
		}
		return lessThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddition() {
		if (additionEClass == null) {
			additionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(164);
		}
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtraction() {
		if (subtractionEClass == null) {
			subtractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(165);
		}
		return subtractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivision() {
		if (divisionEClass == null) {
			divisionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(166);
		}
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplication() {
		if (multiplicationEClass == null) {
			multiplicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(167);
		}
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemainder() {
		if (remainderEClass == null) {
			remainderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(168);
		}
		return remainderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplement() {
		if (complementEClass == null) {
			complementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(169);
		}
		return complementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinusMinus() {
		if (minusMinusEClass == null) {
			minusMinusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(170);
		}
		return minusMinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegate() {
		if (negateEClass == null) {
			negateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(171);
		}
		return negateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlusPlus() {
		if (plusPlusEClass == null) {
			plusPlusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(172);
		}
		return plusPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftShift() {
		if (leftShiftEClass == null) {
			leftShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(173);
		}
		return leftShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightShift() {
		if (rightShiftEClass == null) {
			rightShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(174);
		}
		return rightShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedRightShift() {
		if (unsignedRightShiftEClass == null) {
			unsignedRightShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(175);
		}
		return unsignedRightShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		if (referenceEClass == null) {
			referenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(176);
		}
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Next() {
        return (EReference)getReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_ArraySelectors() {
        return (EReference)getReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReference__GetReferencedType() {
        return getReference().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReference__GetPrevious() {
        return getReference().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentable() {
		if (argumentableEClass == null) {
			argumentableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(177);
		}
		return argumentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentable_Arguments() {
        return (EReference)getArgumentable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArgumentable__GetArgumentTypes() {
        return getArgumentable().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceableElement() {
		if (referenceableElementEClass == null) {
			referenceableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(178);
		}
		return referenceableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementReference() {
		if (elementReferenceEClass == null) {
			elementReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(179);
		}
		return elementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementReference_Target() {
        return (EReference)getElementReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierReference() {
		if (identifierReferenceEClass == null) {
			identifierReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(180);
		}
		return identifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodCall() {
		if (methodCallEClass == null) {
			methodCallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(181);
		}
		return methodCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflectiveClassReference() {
		if (reflectiveClassReferenceEClass == null) {
			reflectiveClassReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(182);
		}
		return reflectiveClassReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeReference() {
		if (primitiveTypeReferenceEClass == null) {
			primitiveTypeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(183);
		}
		return primitiveTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveTypeReference_PrimitiveType() {
        return (EReference)getPrimitiveTypeReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringReference() {
		if (stringReferenceEClass == null) {
			stringReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(184);
		}
		return stringReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringReference_Value() {
        return (EAttribute)getStringReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfReference() {
		if (selfReferenceEClass == null) {
			selfReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(185);
		}
		return selfReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfReference_Self() {
        return (EReference)getSelfReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		if (parameterEClass == null) {
			parameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(186);
		}
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametrizable() {
		if (parametrizableEClass == null) {
			parametrizableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(187);
		}
		return parametrizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametrizable_Parameters() {
        return (EReference)getParametrizable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinaryParameter() {
		if (ordinaryParameterEClass == null) {
			ordinaryParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(188);
		}
		return ordinaryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableLengthParameter() {
		if (variableLengthParameterEClass == null) {
			variableLengthParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(189);
		}
		return variableLengthParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementContainer() {
		if (statementContainerEClass == null) {
			statementContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(190);
		}
		return statementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementContainer_Statement() {
        return (EReference)getStatementContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementListContainer() {
		if (statementListContainerEClass == null) {
			statementListContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(191);
		}
		return statementListContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementListContainer_Statements() {
        return (EReference)getStatementListContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatementListContainer__GetLocalVariable__String() {
        return getStatementListContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditional() {
		if (conditionalEClass == null) {
			conditionalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(192);
		}
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_Condition() {
        return (EReference)getConditional().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForLoopInitializer() {
		if (forLoopInitializerEClass == null) {
			forLoopInitializerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(193);
		}
		return forLoopInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		if (statementEClass == null) {
			statementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(194);
		}
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchCase() {
		if (switchCaseEClass == null) {
			switchCaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(195);
		}
		return switchCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssert() {
		if (assertEClass == null) {
			assertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(196);
		}
		return assertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssert_ErrorMessage() {
        return (EReference)getAssert().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreak() {
		if (breakEClass == null) {
			breakEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(197);
		}
		return breakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		if (blockEClass == null) {
			blockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(198);
		}
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchBlock() {
		if (catchBlockEClass == null) {
			catchBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(199);
		}
		return catchBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchBlock_Parameter() {
        return (EReference)getCatchBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		if (conditionEClass == null) {
			conditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(200);
		}
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ElseStatement() {
        return (EReference)getCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinue() {
		if (continueEClass == null) {
			continueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(201);
		}
		return continueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultSwitchCase() {
		if (defaultSwitchCaseEClass == null) {
			defaultSwitchCaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(202);
		}
		return defaultSwitchCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoWhileLoop() {
		if (doWhileLoopEClass == null) {
			doWhileLoopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(203);
		}
		return doWhileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyStatement() {
		if (emptyStatementEClass == null) {
			emptyStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(204);
		}
		return emptyStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionStatement() {
		if (expressionStatementEClass == null) {
			expressionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(205);
		}
		return expressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionStatement_Expression() {
        return (EReference)getExpressionStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForLoop() {
		if (forLoopEClass == null) {
			forLoopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(206);
		}
		return forLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoop_Init() {
        return (EReference)getForLoop().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoop_Updates() {
        return (EReference)getForLoop().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEachLoop() {
		if (forEachLoopEClass == null) {
			forEachLoopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(207);
		}
		return forEachLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachLoop_Next() {
        return (EReference)getForEachLoop().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachLoop_Collection() {
        return (EReference)getForEachLoop().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJump() {
		if (jumpEClass == null) {
			jumpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(208);
		}
		return jumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJump_Target() {
        return (EReference)getJump().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJumpLabel() {
		if (jumpLabelEClass == null) {
			jumpLabelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(209);
		}
		return jumpLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariableStatement() {
		if (localVariableStatementEClass == null) {
			localVariableStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(210);
		}
		return localVariableStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariableStatement_Variable() {
        return (EReference)getLocalVariableStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalSwitchCase() {
		if (normalSwitchCaseEClass == null) {
			normalSwitchCaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(211);
		}
		return normalSwitchCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		if (returnEClass == null) {
			returnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(212);
		}
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_ReturnValue() {
        return (EReference)getReturn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		if (switchEClass == null) {
			switchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(213);
		}
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Cases() {
        return (EReference)getSwitch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Variable() {
        return (EReference)getSwitch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizedBlock() {
		if (synchronizedBlockEClass == null) {
			synchronizedBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(214);
		}
		return synchronizedBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizedBlock_LockProvider() {
        return (EReference)getSynchronizedBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrow() {
		if (throwEClass == null) {
			throwEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(215);
		}
		return throwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrow_Throwable() {
        return (EReference)getThrow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTryBlock() {
		if (tryBlockEClass == null) {
			tryBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(216);
		}
		return tryBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryBlock_CatcheBlocks() {
        return (EReference)getTryBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryBlock_FinallyBlock() {
        return (EReference)getTryBlock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileLoop() {
		if (whileLoopEClass == null) {
			whileLoopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(217);
		}
		return whileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileLoop_Condition() {
        return (EReference)getWhileLoop().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (typeEClass == null) {
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(218);
		}
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getType__EqualsType__long_Type_long() {
        return getType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getType__IsSuperType__long_Type_ArrayTypeable() {
        return getType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getType__GetAllMembers__Commentable() {
        return getType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		if (typedElementEClass == null) {
			typedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(219);
		}
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_TypeReference() {
        return (EReference)getTypedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		if (typeReferenceEClass == null) {
			typeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(220);
		}
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeReference__GetTarget() {
        return getTypeReference().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeReference__GetBoundTarget__Reference() {
        return getTypeReference().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeReference__GetPureClassifierReference() {
        return getTypeReference().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierReference() {
		if (classifierReferenceEClass == null) {
			classifierReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(221);
		}
		return classifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierReference_Target() {
        return (EReference)getClassifierReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceClassifierReference() {
		if (namespaceClassifierReferenceEClass == null) {
			namespaceClassifierReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(222);
		}
		return namespaceClassifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespaceClassifierReference_ClassifierReferences() {
        return (EReference)getNamespaceClassifierReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		if (primitiveTypeEClass == null) {
			primitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(223);
		}
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveType__GetAllMembers__Commentable() {
        return getPrimitiveType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitiveType__WrapPrimitiveType() {
        return getPrimitiveType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		if (booleanEClass == null) {
			booleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(224);
		}
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByte() {
		if (byteEClass == null) {
			byteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(225);
		}
		return byteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChar() {
		if (charEClass == null) {
			charEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(226);
		}
		return charEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble() {
		if (doubleEClass == null) {
			doubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(227);
		}
		return doubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat() {
		if (floatEClass == null) {
			floatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(228);
		}
		return floatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt() {
		if (intEClass == null) {
			intEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(229);
		}
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong() {
		if (longEClass == null) {
			longEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(230);
		}
		return longEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShort() {
		if (shortEClass == null) {
			shortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(231);
		}
		return shortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoid() {
		if (voidEClass == null) {
			voidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(232);
		}
		return voidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageReference() {
		if (packageReferenceEClass == null) {
			packageReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(233);
		}
		return packageReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageReference_Subpackages() {
        return (EReference)getPackageReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		if (variableEClass == null) {
			variableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(234);
		}
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__GetArrayDimension() {
        return getVariable().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__CreateMethodCallStatement__String_EList() {
        return getVariable().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__CreateMethodCall__String_EList() {
        return getVariable().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		if (localVariableEClass == null) {
			localVariableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(235);
		}
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalVariable_AdditionalLocalVariables() {
        return (EReference)getLocalVariable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalLocalVariable() {
		if (additionalLocalVariableEClass == null) {
			additionalLocalVariableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI).getEClassifiers().get(236);
		}
		return additionalLocalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdditionalLocalVariable__GetArrayDimension() {
        return getAdditionalLocalVariable().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFactory getJavaFactory() {
		return (JavaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.silvawb.java." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //JavaPackageImpl
