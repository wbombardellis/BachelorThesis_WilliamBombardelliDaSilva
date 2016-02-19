/**
 */
package de.silvawb.umlInteraction2java.generated.util;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG;

import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

import de.silvawb.umlInteraction2java.generated.*;

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
 * @see de.silvawb.umlInteraction2java.generated.GeneratedPackage
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
		case GeneratedPackage.UML_INTERACTION2JAVA_OPERATIONAL_TGG: {
			umlInteraction2javaOperationalTGG umlInteraction2javaOperationalTGG = (umlInteraction2javaOperationalTGG) theEObject;
			T result = caseumlInteraction2javaOperationalTGG(umlInteraction2javaOperationalTGG);
			if (result == null)
				result = caseSdmOperationalTGG(umlInteraction2javaOperationalTGG);
			if (result == null)
				result = caseOperationalTGG(umlInteraction2javaOperationalTGG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UML_INTERACTION2JAVA_AXIOM: {
			umlInteraction2javaAxiom umlInteraction2javaAxiom = (umlInteraction2javaAxiom) theEObject;
			T result = caseumlInteraction2javaAxiom(umlInteraction2javaAxiom);
			if (result == null)
				result = caseOperationalAxiomGroup(umlInteraction2javaAxiom);
			if (result == null)
				result = caseOperationalMappingGroup(umlInteraction2javaAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UI_LIFELINE2J_MANNOTATION: {
			uILifeline2jMAnnotation uILifeline2jMAnnotation = (uILifeline2jMAnnotation) theEObject;
			T result = caseuILifeline2jMAnnotation(uILifeline2jMAnnotation);
			if (result == null)
				result = caseOperationalRuleGroup(uILifeline2jMAnnotation);
			if (result == null)
				result = caseOperationalMappingGroup(uILifeline2jMAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION: {
			uMessageSequence2jInteractionAnnotation uMessageSequence2jInteractionAnnotation = (uMessageSequence2jInteractionAnnotation) theEObject;
			T result = caseuMessageSequence2jInteractionAnnotation(uMessageSequence2jInteractionAnnotation);
			if (result == null)
				result = caseOperationalRuleGroup(uMessageSequence2jInteractionAnnotation);
			if (result == null)
				result = caseOperationalMappingGroup(uMessageSequence2jInteractionAnnotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOPERATION2J_METHOD_HELPER_RULE: {
			uOperation2jMethod_HelperRule uOperation2jMethod_HelperRule = (uOperation2jMethod_HelperRule) theEObject;
			T result = caseuOperation2jMethod_HelperRule(uOperation2jMethod_HelperRule);
			if (result == null)
				result = caseOperationalRuleGroup(uOperation2jMethod_HelperRule);
			if (result == null)
				result = caseOperationalMappingGroup(uOperation2jMethod_HelperRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2: {
			uMessageSequence2jInteractionAnnotation_2 uMessageSequence2jInteractionAnnotation_2 = (uMessageSequence2jInteractionAnnotation_2) theEObject;
			T result = caseuMessageSequence2jInteractionAnnotation_2(uMessageSequence2jInteractionAnnotation_2);
			if (result == null)
				result = caseOperationalRuleGroup(uMessageSequence2jInteractionAnnotation_2);
			if (result == null)
				result = caseOperationalMappingGroup(uMessageSequence2jInteractionAnnotation_2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UML_INTERACTION2JAVA_AXIOM_R1: {
			umlInteraction2javaAxiom_r1 umlInteraction2javaAxiom_r1 = (umlInteraction2javaAxiom_r1) theEObject;
			T result = caseumlInteraction2javaAxiom_r1(umlInteraction2javaAxiom_r1);
			if (result == null)
				result = caseOperationalAxiom(umlInteraction2javaAxiom_r1);
			if (result == null)
				result = caseOperationalMapping(umlInteraction2javaAxiom_r1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UOPERATION2J_METHOD_HELPER_RULE_R4: {
			uOperation2jMethod_HelperRule_r4 uOperation2jMethod_HelperRule_r4 = (uOperation2jMethod_HelperRule_r4) theEObject;
			T result = caseuOperation2jMethod_HelperRule_r4(uOperation2jMethod_HelperRule_r4);
			if (result == null)
				result = caseOperationalRule(uOperation2jMethod_HelperRule_r4);
			if (result == null)
				result = caseOperationalMapping(uOperation2jMethod_HelperRule_r4);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_2R5: {
			uMessageSequence2jInteractionAnnotation_2_r5 uMessageSequence2jInteractionAnnotation_2_r5 = (uMessageSequence2jInteractionAnnotation_2_r5) theEObject;
			T result = caseuMessageSequence2jInteractionAnnotation_2_r5(uMessageSequence2jInteractionAnnotation_2_r5);
			if (result == null)
				result = caseOperationalRule(uMessageSequence2jInteractionAnnotation_2_r5);
			if (result == null)
				result = caseOperationalMapping(uMessageSequence2jInteractionAnnotation_2_r5);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UMESSAGE_SEQUENCE2J_INTERACTION_ANNOTATION_R3: {
			uMessageSequence2jInteractionAnnotation_r3 uMessageSequence2jInteractionAnnotation_r3 = (uMessageSequence2jInteractionAnnotation_r3) theEObject;
			T result = caseuMessageSequence2jInteractionAnnotation_r3(uMessageSequence2jInteractionAnnotation_r3);
			if (result == null)
				result = caseOperationalRule(uMessageSequence2jInteractionAnnotation_r3);
			if (result == null)
				result = caseOperationalMapping(uMessageSequence2jInteractionAnnotation_r3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.UI_LIFELINE2J_MANNOTATION_R2: {
			uILifeline2jMAnnotation_r2 uILifeline2jMAnnotation_r2 = (uILifeline2jMAnnotation_r2) theEObject;
			T result = caseuILifeline2jMAnnotation_r2(uILifeline2jMAnnotation_r2);
			if (result == null)
				result = caseOperationalRule(uILifeline2jMAnnotation_r2);
			if (result == null)
				result = caseOperationalMapping(uILifeline2jMAnnotation_r2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml Interaction2java Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml Interaction2java Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseumlInteraction2javaOperationalTGG(umlInteraction2javaOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml Interaction2java Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml Interaction2java Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseumlInteraction2javaAxiom(umlInteraction2javaAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uI Lifeline2j MAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uI Lifeline2j MAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuILifeline2jMAnnotation(uILifeline2jMAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uMessage Sequence2j Interaction Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uMessage Sequence2j Interaction Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuMessageSequence2jInteractionAnnotation(uMessageSequence2jInteractionAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOperation2j Method Helper Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOperation2j Method Helper Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOperation2jMethod_HelperRule(uOperation2jMethod_HelperRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uMessage Sequence2j Interaction Annotation 2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uMessage Sequence2j Interaction Annotation 2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuMessageSequence2jInteractionAnnotation_2(uMessageSequence2jInteractionAnnotation_2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml Interaction2java Axiom r1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml Interaction2java Axiom r1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseumlInteraction2javaAxiom_r1(umlInteraction2javaAxiom_r1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uOperation2j Method Helper Rule r4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uOperation2j Method Helper Rule r4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuOperation2jMethod_HelperRule_r4(uOperation2jMethod_HelperRule_r4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uMessage Sequence2j Interaction Annotation 2r5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uMessage Sequence2j Interaction Annotation 2r5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuMessageSequence2jInteractionAnnotation_2_r5(uMessageSequence2jInteractionAnnotation_2_r5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uMessage Sequence2j Interaction Annotation r3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uMessage Sequence2j Interaction Annotation r3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuMessageSequence2jInteractionAnnotation_r3(uMessageSequence2jInteractionAnnotation_r3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uI Lifeline2j MAnnotation r2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uI Lifeline2j MAnnotation r2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuILifeline2jMAnnotation_r2(uILifeline2jMAnnotation_r2 object) {
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
