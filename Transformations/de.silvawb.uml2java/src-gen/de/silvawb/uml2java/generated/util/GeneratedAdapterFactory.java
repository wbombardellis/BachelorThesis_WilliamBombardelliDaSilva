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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.silvawb.uml2java.generated.GeneratedPackage
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
		public Adapter caseuml2javaOperationalTGG(uml2javaOperationalTGG object) {
			return createuml2javaOperationalTGGAdapter();
		}

		@Override
		public Adapter caseuml2javaAxiom(uml2javaAxiom object) {
			return createuml2javaAxiomAdapter();
		}

		@Override
		public Adapter caseuIAttribute2jIAttribute(uIAttribute2jIAttribute object) {
			return createuIAttribute2jIAttributeAdapter();
		}

		@Override
		public Adapter caseuCOperation2jCMethod_Rule(uCOperation2jCMethod_Rule object) {
			return createuCOperation2jCMethod_RuleAdapter();
		}

		@Override
		public Adapter caseuInterface2jInterface_Rule(uInterface2jInterface_Rule object) {
			return createuInterface2jInterface_RuleAdapter();
		}

		@Override
		public Adapter caseuIOperation2jIMethod_Rule(uIOperation2jIMethod_Rule object) {
			return createuIOperation2jIMethod_RuleAdapter();
		}

		@Override
		public Adapter caseuIRealization2jIImplementation_Rule(uIRealization2jIImplementation_Rule object) {
			return createuIRealization2jIImplementation_RuleAdapter();
		}

		@Override
		public Adapter caseuCAttribute2jCAttribute_Rule(uCAttribute2jCAttribute_Rule object) {
			return createuCAttribute2jCAttribute_RuleAdapter();
		}

		@Override
		public Adapter caseuPackage2jPackage_Rule(uPackage2jPackage_Rule object) {
			return createuPackage2jPackage_RuleAdapter();
		}

		@Override
		public Adapter caseuClass2jClass_Rule(uClass2jClass_Rule object) {
			return createuClass2jClass_RuleAdapter();
		}

		@Override
		public Adapter caseuml2javaAxiom_r1(uml2javaAxiom_r1 object) {
			return createuml2javaAxiom_r1Adapter();
		}

		@Override
		public Adapter caseuIAttribute2jIAttribute_r7(uIAttribute2jIAttribute_r7 object) {
			return createuIAttribute2jIAttribute_r7Adapter();
		}

		@Override
		public Adapter caseuCAttribute2jCAttribute_Rule_r4(uCAttribute2jCAttribute_Rule_r4 object) {
			return createuCAttribute2jCAttribute_Rule_r4Adapter();
		}

		@Override
		public Adapter caseuIRealization2jIImplementation_Rule_r9(uIRealization2jIImplementation_Rule_r9 object) {
			return createuIRealization2jIImplementation_Rule_r9Adapter();
		}

		@Override
		public Adapter caseuClass2jClass_Rule_r3(uClass2jClass_Rule_r3 object) {
			return createuClass2jClass_Rule_r3Adapter();
		}

		@Override
		public Adapter caseuIOperation2jIMethod_Rule_r8(uIOperation2jIMethod_Rule_r8 object) {
			return createuIOperation2jIMethod_Rule_r8Adapter();
		}

		@Override
		public Adapter caseuInterface2jInterface_Rule_r6(uInterface2jInterface_Rule_r6 object) {
			return createuInterface2jInterface_Rule_r6Adapter();
		}

		@Override
		public Adapter caseuCOperation2jCMethod_Rule_r5(uCOperation2jCMethod_Rule_r5 object) {
			return createuCOperation2jCMethod_Rule_r5Adapter();
		}

		@Override
		public Adapter caseuPackage2jPackage_Rule_r2(uPackage2jPackage_Rule_r2 object) {
			return createuPackage2jPackage_Rule_r2Adapter();
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
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uml2javaOperationalTGG <em>uml2java Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uml2javaOperationalTGG
	 * @generated
	 */
	public Adapter createuml2javaOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uml2javaAxiom <em>uml2java Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom
	 * @generated
	 */
	public Adapter createuml2javaAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute <em>uI Attribute2j IAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute
	 * @generated
	 */
	public Adapter createuIAttribute2jIAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule <em>uC Operation2j CMethod Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule
	 * @generated
	 */
	public Adapter createuCOperation2jCMethod_RuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule <em>uInterface2j Interface Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule
	 * @generated
	 */
	public Adapter createuInterface2jInterface_RuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule <em>uI Operation2j IMethod Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule
	 * @generated
	 */
	public Adapter createuIOperation2jIMethod_RuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule <em>uI Realization2j IImplementation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule
	 * @generated
	 */
	public Adapter createuIRealization2jIImplementation_RuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule <em>uC Attribute2j CAttribute Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule
	 * @generated
	 */
	public Adapter createuCAttribute2jCAttribute_RuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule <em>uPackage2j Package Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule
	 * @generated
	 */
	public Adapter createuPackage2jPackage_RuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule <em>uClass2j Class Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule
	 * @generated
	 */
	public Adapter createuClass2jClass_RuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uml2javaAxiom_r1 <em>uml2java Axiom r1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uml2javaAxiom_r1
	 * @generated
	 */
	public Adapter createuml2javaAxiom_r1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7 <em>uI Attribute2j IAttribute r7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uIAttribute2jIAttribute_r7
	 * @generated
	 */
	public Adapter createuIAttribute2jIAttribute_r7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4 <em>uC Attribute2j CAttribute Rule r4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uCAttribute2jCAttribute_Rule_r4
	 * @generated
	 */
	public Adapter createuCAttribute2jCAttribute_Rule_r4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9 <em>uI Realization2j IImplementation Rule r9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uIRealization2jIImplementation_Rule_r9
	 * @generated
	 */
	public Adapter createuIRealization2jIImplementation_Rule_r9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uClass2jClass_Rule_r3 <em>uClass2j Class Rule r3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uClass2jClass_Rule_r3
	 * @generated
	 */
	public Adapter createuClass2jClass_Rule_r3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8 <em>uI Operation2j IMethod Rule r8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uIOperation2jIMethod_Rule_r8
	 * @generated
	 */
	public Adapter createuIOperation2jIMethod_Rule_r8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6 <em>uInterface2j Interface Rule r6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uInterface2jInterface_Rule_r6
	 * @generated
	 */
	public Adapter createuInterface2jInterface_Rule_r6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5 <em>uC Operation2j CMethod Rule r5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uCOperation2jCMethod_Rule_r5
	 * @generated
	 */
	public Adapter createuCOperation2jCMethod_Rule_r5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2 <em>uPackage2j Package Rule r2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.silvawb.uml2java.generated.uPackage2jPackage_Rule_r2
	 * @generated
	 */
	public Adapter createuPackage2jPackage_Rule_r2Adapter() {
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
