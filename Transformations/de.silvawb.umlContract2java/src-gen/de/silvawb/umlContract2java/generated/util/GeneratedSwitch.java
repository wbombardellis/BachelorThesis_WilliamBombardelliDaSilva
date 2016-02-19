/**
 */
package de.silvawb.umlContract2java.generated.util;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG;

import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

import de.silvawb.umlContract2java.generated.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.silvawb.umlContract2java.generated.GeneratedPackage
 * @generated
 */
public class GeneratedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedSwitch() {
		if (modelPackage == null) {
			modelPackage = GeneratedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GeneratedPackage.UML_CONTRACT2JAVA_OPERATIONAL_TGG: {
			umlContract2javaOperationalTGG umlContract2javaOperationalTGG = (umlContract2javaOperationalTGG) theEObject;
			T result = caseumlContract2javaOperationalTGG(umlContract2javaOperationalTGG);
			if (result == null)
				result = caseSdmOperationalTGG(umlContract2javaOperationalTGG);
			if (result == null)
				result = caseOperationalTGG(umlContract2javaOperationalTGG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UML_CONTRACT2JAVA_AXIOM: {
			umlContract2javaAxiom umlContract2javaAxiom = (umlContract2javaAxiom) theEObject;
			T result = caseumlContract2javaAxiom(umlContract2javaAxiom);
			if (result == null)
				result = caseOperationalAxiomGroup(umlContract2javaAxiom);
			if (result == null)
				result = caseOperationalMappingGroup(umlContract2javaAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UPROPERTY2J_FIELD_HELPER: {
			uProperty2jField_Helper uProperty2jField_Helper = (uProperty2jField_Helper) theEObject;
			T result = caseuProperty2jField_Helper(uProperty2jField_Helper);
			if (result == null)
				result = caseOperationalRuleGroup(uProperty2jField_Helper);
			if (result == null)
				result = caseOperationalMappingGroup(uProperty2jField_Helper);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOP_PRE2J_MA_PRE: {
			uOPPre2jMAPre uOPPre2jMAPre = (uOPPre2jMAPre) theEObject;
			T result = caseuOPPre2jMAPre(uOPPre2jMAPre);
			if (result == null)
				result = caseOperationalRuleGroup(uOPPre2jMAPre);
			if (result == null)
				result = caseOperationalMappingGroup(uOPPre2jMAPre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UC_INV2J_CINV: {
			uCInv2jCInv uCInv2jCInv = (uCInv2jCInv) theEObject;
			T result = caseuCInv2jCInv(uCInv2jCInv);
			if (result == null)
				result = caseOperationalRuleGroup(uCInv2jCInv);
			if (result == null)
				result = caseOperationalMappingGroup(uCInv2jCInv);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UCLASS2J_CLASS_HELPER: {
			uClass2jClass_Helper uClass2jClass_Helper = (uClass2jClass_Helper) theEObject;
			T result = caseuClass2jClass_Helper(uClass2jClass_Helper);
			if (result == null)
				result = caseOperationalRuleGroup(uClass2jClass_Helper);
			if (result == null)
				result = caseOperationalMappingGroup(uClass2jClass_Helper);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UO_PARAMENTER2J_MARGUMENT: {
			uOParamenter2jMArgument uOParamenter2jMArgument = (uOParamenter2jMArgument) theEObject;
			T result = caseuOParamenter2jMArgument(uOParamenter2jMArgument);
			if (result == null)
				result = caseOperationalRuleGroup(uOParamenter2jMArgument);
			if (result == null)
				result = caseOperationalMappingGroup(uOParamenter2jMArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOPERATION2J_METHOD_HELPER: {
			uOperation2jMethod_Helper uOperation2jMethod_Helper = (uOperation2jMethod_Helper) theEObject;
			T result = caseuOperation2jMethod_Helper(uOperation2jMethod_Helper);
			if (result == null)
				result = caseOperationalRuleGroup(uOperation2jMethod_Helper);
			if (result == null)
				result = caseOperationalMappingGroup(uOperation2jMethod_Helper);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOP_POS_INT2J_MA_POS_ASSERT: {
			uOPPosInt2jMAPosAssert uOPPosInt2jMAPosAssert = (uOPPosInt2jMAPosAssert) theEObject;
			T result = caseuOPPosInt2jMAPosAssert(uOPPosInt2jMAPosAssert);
			if (result == null)
				result = caseOperationalRuleGroup(uOPPosInt2jMAPosAssert);
			if (result == null)
				result = caseOperationalMappingGroup(uOPPosInt2jMAPosAssert);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOP_POS2J_MA_POS: {
			uOPPos2jMAPos uOPPos2jMAPos = (uOPPos2jMAPos) theEObject;
			T result = caseuOPPos2jMAPos(uOPPos2jMAPos);
			if (result == null)
				result = caseOperationalRuleGroup(uOPPos2jMAPos);
			if (result == null)
				result = caseOperationalMappingGroup(uOPPos2jMAPos);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UC_INV_INT2J_CINV_ASSERT: {
			uCInvInt2jCInvAssert uCInvInt2jCInvAssert = (uCInvInt2jCInvAssert) theEObject;
			T result = caseuCInvInt2jCInvAssert(uCInvInt2jCInvAssert);
			if (result == null)
				result = caseOperationalRuleGroup(uCInvInt2jCInvAssert);
			if (result == null)
				result = caseOperationalMappingGroup(uCInvInt2jCInvAssert);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOP_PRE_INT2J_MA_PRE_ASSERT: {
			uOPPreInt2jMAPreAssert uOPPreInt2jMAPreAssert = (uOPPreInt2jMAPreAssert) theEObject;
			T result = caseuOPPreInt2jMAPreAssert(uOPPreInt2jMAPreAssert);
			if (result == null)
				result = caseOperationalRuleGroup(uOPPreInt2jMAPreAssert);
			if (result == null)
				result = caseOperationalMappingGroup(uOPPreInt2jMAPreAssert);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UML_CONTRACT2JAVA_AXIOM_R1: {
			umlContract2javaAxiom_r1 umlContract2javaAxiom_r1 = (umlContract2javaAxiom_r1) theEObject;
			T result = caseumlContract2javaAxiom_r1(umlContract2javaAxiom_r1);
			if (result == null)
				result = caseOperationalAxiom(umlContract2javaAxiom_r1);
			if (result == null)
				result = caseOperationalMapping(umlContract2javaAxiom_r1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UO_PARAMENTER2J_MARGUMENT_R4: {
			uOParamenter2jMArgument_r4 uOParamenter2jMArgument_r4 = (uOParamenter2jMArgument_r4) theEObject;
			T result = caseuOParamenter2jMArgument_r4(uOParamenter2jMArgument_r4);
			if (result == null)
				result = caseOperationalRule(uOParamenter2jMArgument_r4);
			if (result == null)
				result = caseOperationalMapping(uOParamenter2jMArgument_r4);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UC_INV2J_CINV_R9: {
			uCInv2jCInv_r9 uCInv2jCInv_r9 = (uCInv2jCInv_r9) theEObject;
			T result = caseuCInv2jCInv_r9(uCInv2jCInv_r9);
			if (result == null)
				result = caseOperationalRule(uCInv2jCInv_r9);
			if (result == null)
				result = caseOperationalMapping(uCInv2jCInv_r9);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOP_PRE2J_MA_PRE_R5: {
			uOPPre2jMAPre_r5 uOPPre2jMAPre_r5 = (uOPPre2jMAPre_r5) theEObject;
			T result = caseuOPPre2jMAPre_r5(uOPPre2jMAPre_r5);
			if (result == null)
				result = caseOperationalRule(uOPPre2jMAPre_r5);
			if (result == null)
				result = caseOperationalMapping(uOPPre2jMAPre_r5);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOP_PRE_INT2J_MA_PRE_ASSERT_R7: {
			uOPPreInt2jMAPreAssert_r7 uOPPreInt2jMAPreAssert_r7 = (uOPPreInt2jMAPreAssert_r7) theEObject;
			T result = caseuOPPreInt2jMAPreAssert_r7(uOPPreInt2jMAPreAssert_r7);
			if (result == null)
				result = caseOperationalRule(uOPPreInt2jMAPreAssert_r7);
			if (result == null)
				result = caseOperationalMapping(uOPPreInt2jMAPreAssert_r7);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOP_POS_INT2J_MA_POS_ASSERT_R8: {
			uOPPosInt2jMAPosAssert_r8 uOPPosInt2jMAPosAssert_r8 = (uOPPosInt2jMAPosAssert_r8) theEObject;
			T result = caseuOPPosInt2jMAPosAssert_r8(uOPPosInt2jMAPosAssert_r8);
			if (result == null)
				result = caseOperationalRule(uOPPosInt2jMAPosAssert_r8);
			if (result == null)
				result = caseOperationalMapping(uOPPosInt2jMAPosAssert_r8);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOPERATION2J_METHOD_HELPER_R3: {
			uOperation2jMethod_Helper_r3 uOperation2jMethod_Helper_r3 = (uOperation2jMethod_Helper_r3) theEObject;
			T result = caseuOperation2jMethod_Helper_r3(uOperation2jMethod_Helper_r3);
			if (result == null)
				result = caseOperationalRule(uOperation2jMethod_Helper_r3);
			if (result == null)
				result = caseOperationalMapping(uOperation2jMethod_Helper_r3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UC_INV_INT2J_CINV_ASSERT_R10: {
			uCInvInt2jCInvAssert_r10 uCInvInt2jCInvAssert_r10 = (uCInvInt2jCInvAssert_r10) theEObject;
			T result = caseuCInvInt2jCInvAssert_r10(uCInvInt2jCInvAssert_r10);
			if (result == null)
				result = caseOperationalRule(uCInvInt2jCInvAssert_r10);
			if (result == null)
				result = caseOperationalMapping(uCInvInt2jCInvAssert_r10);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UCLASS2J_CLASS_HELPER_R2: {
			uClass2jClass_Helper_r2 uClass2jClass_Helper_r2 = (uClass2jClass_Helper_r2) theEObject;
			T result = caseuClass2jClass_Helper_r2(uClass2jClass_Helper_r2);
			if (result == null)
				result = caseOperationalRule(uClass2jClass_Helper_r2);
			if (result == null)
				result = caseOperationalMapping(uClass2jClass_Helper_r2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOP_POS2J_MA_POS_R6: {
			uOPPos2jMAPos_r6 uOPPos2jMAPos_r6 = (uOPPos2jMAPos_r6) theEObject;
			T result = caseuOPPos2jMAPos_r6(uOPPos2jMAPos_r6);
			if (result == null)
				result = caseOperationalRule(uOPPos2jMAPos_r6);
			if (result == null)
				result = caseOperationalMapping(uOPPos2jMAPos_r6);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UPROPERTY2J_FIELD_HELPER_R11: {
			uProperty2jField_Helper_r11 uProperty2jField_Helper_r11 = (uProperty2jField_Helper_r11) theEObject;
			T result = caseuProperty2jField_Helper_r11(uProperty2jField_Helper_r11);
			if (result == null)
				result = caseOperationalRule(uProperty2jField_Helper_r11);
			if (result == null)
				result = caseOperationalMapping(uProperty2jField_Helper_r11);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml Contract2java Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml Contract2java Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseumlContract2javaOperationalTGG(umlContract2javaOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml Contract2java Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml Contract2java Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseumlContract2javaAxiom(umlContract2javaAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uProperty2j Field Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uProperty2j Field Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuProperty2jField_Helper(uProperty2jField_Helper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOP Pre2j MA Pre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOP Pre2j MA Pre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOPPre2jMAPre(uOPPre2jMAPre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uC Inv2j CInv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uC Inv2j CInv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuCInv2jCInv(uCInv2jCInv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uClass2j Class Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uClass2j Class Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuClass2jClass_Helper(uClass2jClass_Helper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uO Paramenter2j MArgument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uO Paramenter2j MArgument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOParamenter2jMArgument(uOParamenter2jMArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOperation2j Method Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOperation2j Method Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOperation2jMethod_Helper(uOperation2jMethod_Helper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOP Pos Int2j MA Pos Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOP Pos Int2j MA Pos Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOPPosInt2jMAPosAssert(uOPPosInt2jMAPosAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOP Pos2j MA Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOP Pos2j MA Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOPPos2jMAPos(uOPPos2jMAPos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uC Inv Int2j CInv Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uC Inv Int2j CInv Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuCInvInt2jCInvAssert(uCInvInt2jCInvAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOP Pre Int2j MA Pre Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOP Pre Int2j MA Pre Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOPPreInt2jMAPreAssert(uOPPreInt2jMAPreAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml Contract2java Axiom r1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml Contract2java Axiom r1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseumlContract2javaAxiom_r1(umlContract2javaAxiom_r1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uO Paramenter2j MArgument r4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uO Paramenter2j MArgument r4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOParamenter2jMArgument_r4(uOParamenter2jMArgument_r4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uC Inv2j CInv r9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uC Inv2j CInv r9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuCInv2jCInv_r9(uCInv2jCInv_r9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOP Pre2j MA Pre r5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOP Pre2j MA Pre r5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOPPre2jMAPre_r5(uOPPre2jMAPre_r5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOP Pre Int2j MA Pre Assert r7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOP Pre Int2j MA Pre Assert r7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOPPreInt2jMAPreAssert_r7(uOPPreInt2jMAPreAssert_r7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOP Pos Int2j MA Pos Assert r8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOP Pos Int2j MA Pos Assert r8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOPPosInt2jMAPosAssert_r8(uOPPosInt2jMAPosAssert_r8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOperation2j Method Helper r3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOperation2j Method Helper r3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOperation2jMethod_Helper_r3(uOperation2jMethod_Helper_r3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uC Inv Int2j CInv Assert r10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uC Inv Int2j CInv Assert r10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuCInvInt2jCInvAssert_r10(uCInvInt2jCInvAssert_r10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uClass2j Class Helper r2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uClass2j Class Helper r2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuClass2jClass_Helper_r2(uClass2jClass_Helper_r2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOP Pos2j MA Pos r6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOP Pos2j MA Pos r6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOPPos2jMAPos_r6(uOPPos2jMAPos_r6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uProperty2j Field Helper r11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uProperty2j Field Helper r11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuProperty2jField_Helper_r11(uProperty2jField_Helper_r11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalTGG(OperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdmOperationalTGG(SdmOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMappingGroup(OperationalMappingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiomGroup(OperationalAxiomGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRuleGroup(OperationalRuleGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMapping(OperationalMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiom(OperationalAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRule(OperationalRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GeneratedSwitch
