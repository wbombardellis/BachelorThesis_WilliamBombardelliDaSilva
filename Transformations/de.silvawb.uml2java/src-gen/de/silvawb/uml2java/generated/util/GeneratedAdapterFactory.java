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
		public Adapter caseuPackage2jPackage_Rule(uPackage2jPackage_Rule object) {
			return createuPackage2jPackage_RuleAdapter();
		}

		@Override
		public Adapter caseuml2javaAxiom_r1(uml2javaAxiom_r1 object) {
			return createuml2javaAxiom_r1Adapter();
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
