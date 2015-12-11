/**
 */
package de.silvawb.uml2java.generated.util;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG;

import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

import de.silvawb.uml2java.generated.*;

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
 * @see de.silvawb.uml2java.generated.GeneratedPackage
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
		case GeneratedPackage.UML2JAVA_OPERATIONAL_TGG: {
			uml2javaOperationalTGG uml2javaOperationalTGG = (uml2javaOperationalTGG) theEObject;
			T result = caseuml2javaOperationalTGG(uml2javaOperationalTGG);
			if (result == null)
				result = caseSdmOperationalTGG(uml2javaOperationalTGG);
			if (result == null)
				result = caseOperationalTGG(uml2javaOperationalTGG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UML2JAVA_AXIOM: {
			uml2javaAxiom uml2javaAxiom = (uml2javaAxiom) theEObject;
			T result = caseuml2javaAxiom(uml2javaAxiom);
			if (result == null)
				result = caseOperationalAxiomGroup(uml2javaAxiom);
			if (result == null)
				result = caseOperationalMappingGroup(uml2javaAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UI_ATTRIBUTE2J_IATTRIBUTE: {
			uIAttribute2jIAttribute uIAttribute2jIAttribute = (uIAttribute2jIAttribute) theEObject;
			T result = caseuIAttribute2jIAttribute(uIAttribute2jIAttribute);
			if (result == null)
				result = caseOperationalRuleGroup(uIAttribute2jIAttribute);
			if (result == null)
				result = caseOperationalMappingGroup(uIAttribute2jIAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UC_OPERATION2J_CMETHOD_RULE: {
			uCOperation2jCMethod_Rule uCOperation2jCMethod_Rule = (uCOperation2jCMethod_Rule) theEObject;
			T result = caseuCOperation2jCMethod_Rule(uCOperation2jCMethod_Rule);
			if (result == null)
				result = caseOperationalRuleGroup(uCOperation2jCMethod_Rule);
			if (result == null)
				result = caseOperationalMappingGroup(uCOperation2jCMethod_Rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UINTERFACE2J_INTERFACE_RULE: {
			uInterface2jInterface_Rule uInterface2jInterface_Rule = (uInterface2jInterface_Rule) theEObject;
			T result = caseuInterface2jInterface_Rule(uInterface2jInterface_Rule);
			if (result == null)
				result = caseOperationalRuleGroup(uInterface2jInterface_Rule);
			if (result == null)
				result = caseOperationalMappingGroup(uInterface2jInterface_Rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UI_OPERATION2J_IMETHOD_RULE: {
			uIOperation2jIMethod_Rule uIOperation2jIMethod_Rule = (uIOperation2jIMethod_Rule) theEObject;
			T result = caseuIOperation2jIMethod_Rule(uIOperation2jIMethod_Rule);
			if (result == null)
				result = caseOperationalRuleGroup(uIOperation2jIMethod_Rule);
			if (result == null)
				result = caseOperationalMappingGroup(uIOperation2jIMethod_Rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UI_REALIZATION2J_IIMPLEMENTATION_RULE: {
			uIRealization2jIImplementation_Rule uIRealization2jIImplementation_Rule = (uIRealization2jIImplementation_Rule) theEObject;
			T result = caseuIRealization2jIImplementation_Rule(uIRealization2jIImplementation_Rule);
			if (result == null)
				result = caseOperationalRuleGroup(uIRealization2jIImplementation_Rule);
			if (result == null)
				result = caseOperationalMappingGroup(uIRealization2jIImplementation_Rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UC_ATTRIBUTE2J_CATTRIBUTE_RULE: {
			uCAttribute2jCAttribute_Rule uCAttribute2jCAttribute_Rule = (uCAttribute2jCAttribute_Rule) theEObject;
			T result = caseuCAttribute2jCAttribute_Rule(uCAttribute2jCAttribute_Rule);
			if (result == null)
				result = caseOperationalRuleGroup(uCAttribute2jCAttribute_Rule);
			if (result == null)
				result = caseOperationalMappingGroup(uCAttribute2jCAttribute_Rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UPACKAGE2J_PACKAGE_RULE: {
			uPackage2jPackage_Rule uPackage2jPackage_Rule = (uPackage2jPackage_Rule) theEObject;
			T result = caseuPackage2jPackage_Rule(uPackage2jPackage_Rule);
			if (result == null)
				result = caseOperationalRuleGroup(uPackage2jPackage_Rule);
			if (result == null)
				result = caseOperationalMappingGroup(uPackage2jPackage_Rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UCLASS2J_CLASS_RULE: {
			uClass2jClass_Rule uClass2jClass_Rule = (uClass2jClass_Rule) theEObject;
			T result = caseuClass2jClass_Rule(uClass2jClass_Rule);
			if (result == null)
				result = caseOperationalRuleGroup(uClass2jClass_Rule);
			if (result == null)
				result = caseOperationalMappingGroup(uClass2jClass_Rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UML2JAVA_AXIOM_R1: {
			uml2javaAxiom_r1 uml2javaAxiom_r1 = (uml2javaAxiom_r1) theEObject;
			T result = caseuml2javaAxiom_r1(uml2javaAxiom_r1);
			if (result == null)
				result = caseOperationalAxiom(uml2javaAxiom_r1);
			if (result == null)
				result = caseOperationalMapping(uml2javaAxiom_r1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UI_ATTRIBUTE2J_IATTRIBUTE_R7: {
			uIAttribute2jIAttribute_r7 uIAttribute2jIAttribute_r7 = (uIAttribute2jIAttribute_r7) theEObject;
			T result = caseuIAttribute2jIAttribute_r7(uIAttribute2jIAttribute_r7);
			if (result == null)
				result = caseOperationalRule(uIAttribute2jIAttribute_r7);
			if (result == null)
				result = caseOperationalMapping(uIAttribute2jIAttribute_r7);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UC_ATTRIBUTE2J_CATTRIBUTE_RULE_R4: {
			uCAttribute2jCAttribute_Rule_r4 uCAttribute2jCAttribute_Rule_r4 = (uCAttribute2jCAttribute_Rule_r4) theEObject;
			T result = caseuCAttribute2jCAttribute_Rule_r4(uCAttribute2jCAttribute_Rule_r4);
			if (result == null)
				result = caseOperationalRule(uCAttribute2jCAttribute_Rule_r4);
			if (result == null)
				result = caseOperationalMapping(uCAttribute2jCAttribute_Rule_r4);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UI_REALIZATION2J_IIMPLEMENTATION_RULE_R9: {
			uIRealization2jIImplementation_Rule_r9 uIRealization2jIImplementation_Rule_r9 = (uIRealization2jIImplementation_Rule_r9) theEObject;
			T result = caseuIRealization2jIImplementation_Rule_r9(uIRealization2jIImplementation_Rule_r9);
			if (result == null)
				result = caseOperationalRule(uIRealization2jIImplementation_Rule_r9);
			if (result == null)
				result = caseOperationalMapping(uIRealization2jIImplementation_Rule_r9);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UCLASS2J_CLASS_RULE_R3: {
			uClass2jClass_Rule_r3 uClass2jClass_Rule_r3 = (uClass2jClass_Rule_r3) theEObject;
			T result = caseuClass2jClass_Rule_r3(uClass2jClass_Rule_r3);
			if (result == null)
				result = caseOperationalRule(uClass2jClass_Rule_r3);
			if (result == null)
				result = caseOperationalMapping(uClass2jClass_Rule_r3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UI_OPERATION2J_IMETHOD_RULE_R8: {
			uIOperation2jIMethod_Rule_r8 uIOperation2jIMethod_Rule_r8 = (uIOperation2jIMethod_Rule_r8) theEObject;
			T result = caseuIOperation2jIMethod_Rule_r8(uIOperation2jIMethod_Rule_r8);
			if (result == null)
				result = caseOperationalRule(uIOperation2jIMethod_Rule_r8);
			if (result == null)
				result = caseOperationalMapping(uIOperation2jIMethod_Rule_r8);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UINTERFACE2J_INTERFACE_RULE_R6: {
			uInterface2jInterface_Rule_r6 uInterface2jInterface_Rule_r6 = (uInterface2jInterface_Rule_r6) theEObject;
			T result = caseuInterface2jInterface_Rule_r6(uInterface2jInterface_Rule_r6);
			if (result == null)
				result = caseOperationalRule(uInterface2jInterface_Rule_r6);
			if (result == null)
				result = caseOperationalMapping(uInterface2jInterface_Rule_r6);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UC_OPERATION2J_CMETHOD_RULE_R5: {
			uCOperation2jCMethod_Rule_r5 uCOperation2jCMethod_Rule_r5 = (uCOperation2jCMethod_Rule_r5) theEObject;
			T result = caseuCOperation2jCMethod_Rule_r5(uCOperation2jCMethod_Rule_r5);
			if (result == null)
				result = caseOperationalRule(uCOperation2jCMethod_Rule_r5);
			if (result == null)
				result = caseOperationalMapping(uCOperation2jCMethod_Rule_r5);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UPACKAGE2J_PACKAGE_RULE_R2: {
			uPackage2jPackage_Rule_r2 uPackage2jPackage_Rule_r2 = (uPackage2jPackage_Rule_r2) theEObject;
			T result = caseuPackage2jPackage_Rule_r2(uPackage2jPackage_Rule_r2);
			if (result == null)
				result = caseOperationalRule(uPackage2jPackage_Rule_r2);
			if (result == null)
				result = caseOperationalMapping(uPackage2jPackage_Rule_r2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml2java Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml2java Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuml2javaOperationalTGG(uml2javaOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml2java Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml2java Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuml2javaAxiom(uml2javaAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uI Attribute2j IAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uI Attribute2j IAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuIAttribute2jIAttribute(uIAttribute2jIAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uC Operation2j CMethod Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uC Operation2j CMethod Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuCOperation2jCMethod_Rule(uCOperation2jCMethod_Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uInterface2j Interface Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uInterface2j Interface Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuInterface2jInterface_Rule(uInterface2jInterface_Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uI Operation2j IMethod Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uI Operation2j IMethod Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuIOperation2jIMethod_Rule(uIOperation2jIMethod_Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uI Realization2j IImplementation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uI Realization2j IImplementation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuIRealization2jIImplementation_Rule(uIRealization2jIImplementation_Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uC Attribute2j CAttribute Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uC Attribute2j CAttribute Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuCAttribute2jCAttribute_Rule(uCAttribute2jCAttribute_Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uPackage2j Package Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uPackage2j Package Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuPackage2jPackage_Rule(uPackage2jPackage_Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uClass2j Class Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uClass2j Class Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuClass2jClass_Rule(uClass2jClass_Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml2java Axiom r1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml2java Axiom r1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuml2javaAxiom_r1(uml2javaAxiom_r1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uI Attribute2j IAttribute r7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uI Attribute2j IAttribute r7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuIAttribute2jIAttribute_r7(uIAttribute2jIAttribute_r7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uC Attribute2j CAttribute Rule r4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uC Attribute2j CAttribute Rule r4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuCAttribute2jCAttribute_Rule_r4(uCAttribute2jCAttribute_Rule_r4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uI Realization2j IImplementation Rule r9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uI Realization2j IImplementation Rule r9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuIRealization2jIImplementation_Rule_r9(uIRealization2jIImplementation_Rule_r9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uClass2j Class Rule r3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uClass2j Class Rule r3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuClass2jClass_Rule_r3(uClass2jClass_Rule_r3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uI Operation2j IMethod Rule r8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uI Operation2j IMethod Rule r8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuIOperation2jIMethod_Rule_r8(uIOperation2jIMethod_Rule_r8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uInterface2j Interface Rule r6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uInterface2j Interface Rule r6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuInterface2jInterface_Rule_r6(uInterface2jInterface_Rule_r6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uC Operation2j CMethod Rule r5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uC Operation2j CMethod Rule r5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuCOperation2jCMethod_Rule_r5(uCOperation2jCMethod_Rule_r5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uPackage2j Package Rule r2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uPackage2j Package Rule r2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuPackage2jPackage_Rule_r2(uPackage2jPackage_Rule_r2 object) {
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
