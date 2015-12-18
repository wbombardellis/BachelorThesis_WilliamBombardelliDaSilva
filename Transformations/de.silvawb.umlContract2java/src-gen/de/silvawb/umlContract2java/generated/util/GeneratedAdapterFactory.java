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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.umlContract2java.generated.GeneratedPackage
 * @generated
 */
public class GeneratedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneratedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratedSwitch<Adapter> modelSwitch = new GeneratedSwitch<Adapter>() {
		@Override
		public Adapter caseumlContract2javaOperationalTGG(umlContract2javaOperationalTGG object) {
			return createumlContract2javaOperationalTGGAdapter();
		}

		@Override
		public Adapter caseumlContract2javaAxiom(umlContract2javaAxiom object) {
			return createumlContract2javaAxiomAdapter();
		}

		@Override
		public Adapter caseuOPPreInt2jMAPreAssert(uOPPreInt2jMAPreAssert object) {
			return createuOPPreInt2jMAPreAssertAdapter();
		}

		@Override
		public Adapter caseuOperation2jMethod_Helper(uOperation2jMethod_Helper object) {
			return createuOperation2jMethod_HelperAdapter();
		}

		@Override
		public Adapter caseuCInv2jCInv(uCInv2jCInv object) {
			return createuCInv2jCInvAdapter();
		}

		@Override
		public Adapter caseuOPPos2jMAPos(uOPPos2jMAPos object) {
			return createuOPPos2jMAPosAdapter();
		}

		@Override
		public Adapter caseuClass2jClass_Helper(uClass2jClass_Helper object) {
			return createuClass2jClass_HelperAdapter();
		}

		@Override
		public Adapter caseuOPPre2jMAPre(uOPPre2jMAPre object) {
			return createuOPPre2jMAPreAdapter();
		}

		@Override
		public Adapter caseuOPPosInt2jMAPosAssert(uOPPosInt2jMAPosAssert object) {
			return createuOPPosInt2jMAPosAssertAdapter();
		}

		@Override
		public Adapter caseuProperty2jField_Helper(uProperty2jField_Helper object) {
			return createuProperty2jField_HelperAdapter();
		}

		@Override
		public Adapter caseuCInvInt2jCInvAssert(uCInvInt2jCInvAssert object) {
			return createuCInvInt2jCInvAssertAdapter();
		}

		@Override
		public Adapter caseuOParamenter2jMArgument(uOParamenter2jMArgument object) {
			return createuOParamenter2jMArgumentAdapter();
		}

		@Override
		public Adapter caseumlContract2javaAxiom_r1(umlContract2javaAxiom_r1 object) {
			return createumlContract2javaAxiom_r1Adapter();
		}

		@Override
		public Adapter caseuOParamenter2jMArgument_r4(uOParamenter2jMArgument_r4 object) {
			return createuOParamenter2jMArgument_r4Adapter();
		}

		@Override
		public Adapter caseuOPPreInt2jMAPreAssert_r7(uOPPreInt2jMAPreAssert_r7 object) {
			return createuOPPreInt2jMAPreAssert_r7Adapter();
		}

		@Override
		public Adapter caseuCInv2jCInv_r9(uCInv2jCInv_r9 object) {
			return createuCInv2jCInv_r9Adapter();
		}

		@Override
		public Adapter caseuCInvInt2jCInvAssert_r10(uCInvInt2jCInvAssert_r10 object) {
			return createuCInvInt2jCInvAssert_r10Adapter();
		}

		@Override
		public Adapter caseuProperty2jField_Helper_r11(uProperty2jField_Helper_r11 object) {
			return createuProperty2jField_Helper_r11Adapter();
		}

		@Override
		public Adapter caseuOPPosInt2jMAPosAssert_r8(uOPPosInt2jMAPosAssert_r8 object) {
			return createuOPPosInt2jMAPosAssert_r8Adapter();
		}

		@Override
		public Adapter caseuClass2jClass_Helper_r2(uClass2jClass_Helper_r2 object) {
			return createuClass2jClass_Helper_r2Adapter();
		}

		@Override
		public Adapter caseuOPPre2jMAPre_r5(uOPPre2jMAPre_r5 object) {
			return createuOPPre2jMAPre_r5Adapter();
		}

		@Override
		public Adapter caseuOperation2jMethod_Helper_r3(uOperation2jMethod_Helper_r3 object) {
			return createuOperation2jMethod_Helper_r3Adapter();
		}

		@Override
		public Adapter caseuOPPos2jMAPos_r6(uOPPos2jMAPos_r6 object) {
			return createuOPPos2jMAPos_r6Adapter();
		}

		@Override
		public Adapter caseOperationalTGG(OperationalTGG object) {
			return createOperationalTGGAdapter();
		}

		@Override
		public Adapter caseSdmOperationalTGG(SdmOperationalTGG object) {
			return createSdmOperationalTGGAdapter();
		}

		@Override
		public Adapter caseOperationalMappingGroup(OperationalMappingGroup object) {
			return createOperationalMappingGroupAdapter();
		}

		@Override
		public Adapter caseOperationalAxiomGroup(OperationalAxiomGroup object) {
			return createOperationalAxiomGroupAdapter();
		}

		@Override
		public Adapter caseOperationalRuleGroup(OperationalRuleGroup object) {
			return createOperationalRuleGroupAdapter();
		}

		@Override
		public Adapter caseOperationalMapping(OperationalMapping object) {
			return createOperationalMappingAdapter();
		}

		@Override
		public Adapter caseOperationalAxiom(OperationalAxiom object) {
			return createOperationalAxiomAdapter();
		}

		@Override
		public Adapter caseOperationalRule(OperationalRule object) {
			return createOperationalRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG <em>uml Contract2java Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG
	 * @generated
	 */
	public Adapter createumlContract2javaOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom <em>uml Contract2java Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom
	 * @generated
	 */
	public Adapter createumlContract2javaAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert <em>uOP Pre Int2j MA Pre Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert
	 * @generated
	 */
	public Adapter createuOPPreInt2jMAPreAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper <em>uOperation2j Method Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper
	 * @generated
	 */
	public Adapter createuOperation2jMethod_HelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv <em>uC Inv2j CInv</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv
	 * @generated
	 */
	public Adapter createuCInv2jCInvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos <em>uOP Pos2j MA Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos
	 * @generated
	 */
	public Adapter createuOPPos2jMAPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper <em>uClass2j Class Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper
	 * @generated
	 */
	public Adapter createuClass2jClass_HelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre <em>uOP Pre2j MA Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre
	 * @generated
	 */
	public Adapter createuOPPre2jMAPreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert <em>uOP Pos Int2j MA Pos Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert
	 * @generated
	 */
	public Adapter createuOPPosInt2jMAPosAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper <em>uProperty2j Field Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper
	 * @generated
	 */
	public Adapter createuProperty2jField_HelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert <em>uC Inv Int2j CInv Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert
	 * @generated
	 */
	public Adapter createuCInvInt2jCInvAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument <em>uO Paramenter2j MArgument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument
	 * @generated
	 */
	public Adapter createuOParamenter2jMArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1 <em>uml Contract2java Axiom r1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1
	 * @generated
	 */
	public Adapter createumlContract2javaAxiom_r1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4 <em>uO Paramenter2j MArgument r4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOParamenter2jMArgument_r4
	 * @generated
	 */
	public Adapter createuOParamenter2jMArgument_r4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7 <em>uOP Pre Int2j MA Pre Assert r7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOPPreInt2jMAPreAssert_r7
	 * @generated
	 */
	public Adapter createuOPPreInt2jMAPreAssert_r7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uCInv2jCInv_r9 <em>uC Inv2j CInv r9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uCInv2jCInv_r9
	 * @generated
	 */
	public Adapter createuCInv2jCInv_r9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10 <em>uC Inv Int2j CInv Assert r10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uCInvInt2jCInvAssert_r10
	 * @generated
	 */
	public Adapter createuCInvInt2jCInvAssert_r10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11 <em>uProperty2j Field Helper r11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uProperty2jField_Helper_r11
	 * @generated
	 */
	public Adapter createuProperty2jField_Helper_r11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8 <em>uOP Pos Int2j MA Pos Assert r8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOPPosInt2jMAPosAssert_r8
	 * @generated
	 */
	public Adapter createuOPPosInt2jMAPosAssert_r8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2 <em>uClass2j Class Helper r2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uClass2jClass_Helper_r2
	 * @generated
	 */
	public Adapter createuClass2jClass_Helper_r2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5 <em>uOP Pre2j MA Pre r5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOPPre2jMAPre_r5
	 * @generated
	 */
	public Adapter createuOPPre2jMAPre_r5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3 <em>uOperation2j Method Helper r3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOperation2jMethod_Helper_r3
	 * @generated
	 */
	public Adapter createuOperation2jMethod_Helper_r3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6 <em>uOP Pos2j MA Pos r6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.umlContract2java.generated.uOPPos2jMAPos_r6
	 * @generated
	 */
	public Adapter createuOPPos2jMAPos_r6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG <em>Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG
	 * @generated
	 */
	public Adapter createOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG <em>Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG
	 * @generated
	 */
	public Adapter createSdmOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup <em>Operational Mapping Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup
	 * @generated
	 */
	public Adapter createOperationalMappingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup <em>Operational Axiom Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup
	 * @generated
	 */
	public Adapter createOperationalAxiomGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup <em>Operational Rule Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup
	 * @generated
	 */
	public Adapter createOperationalRuleGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping <em>Operational Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping
	 * @generated
	 */
	public Adapter createOperationalMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom <em>Operational Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom
	 * @generated
	 */
	public Adapter createOperationalAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalRule <em>Operational Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalRule
	 * @generated
	 */
	public Adapter createOperationalRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GeneratedAdapterFactory
