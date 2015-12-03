/**
 */
package de.mdelab.mltgg.sdl2uml.generated.util;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG;

import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

import de.mdelab.mltgg.sdl2uml.generated.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage
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
		public Adapter caseSDL2UMLOperationalTGG(SDL2UMLOperationalTGG object) {
			return createSDL2UMLOperationalTGGAdapter();
		}

		@Override
		public Adapter caseSDL2UMLAxiom(SDL2UMLAxiom object) {
			return createSDL2UMLAxiomAdapter();
		}

		@Override
		public Adapter caseSDL2UMLConnectionVar3(SDL2UMLConnectionVar3 object) {
			return createSDL2UMLConnectionVar3Adapter();
		}

		@Override
		public Adapter caseSDL2UMLProcess(SDL2UMLProcess object) {
			return createSDL2UMLProcessAdapter();
		}

		@Override
		public Adapter caseSDL2UMLBlock(SDL2UMLBlock object) {
			return createSDL2UMLBlockAdapter();
		}

		@Override
		public Adapter caseSDL2UMLConnectionVar1(SDL2UMLConnectionVar1 object) {
			return createSDL2UMLConnectionVar1Adapter();
		}

		@Override
		public Adapter caseSDL2UMLConnectionVar2(SDL2UMLConnectionVar2 object) {
			return createSDL2UMLConnectionVar2Adapter();
		}

		@Override
		public Adapter caseSDL2UMLSystemBlock(SDL2UMLSystemBlock object) {
			return createSDL2UMLSystemBlockAdapter();
		}

		@Override
		public Adapter caseSDL2UMLAxiom_SDL2UMLAxiom_R1(
				SDL2UMLAxiom_SDL2UMLAxiom_R1 object) {
			return createSDL2UMLAxiom_SDL2UMLAxiom_R1Adapter();
		}

		@Override
		public Adapter caseSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1(
				SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1 object) {
			return createSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1Adapter();
		}

		@Override
		public Adapter caseSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1(
				SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1 object) {
			return createSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1Adapter();
		}

		@Override
		public Adapter caseSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1(
				SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1 object) {
			return createSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1Adapter();
		}

		@Override
		public Adapter caseSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1(
				SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1 object) {
			return createSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1Adapter();
		}

		@Override
		public Adapter caseSDL2UMLProcess_SDL2UMLProcess_R1(
				SDL2UMLProcess_SDL2UMLProcess_R1 object) {
			return createSDL2UMLProcess_SDL2UMLProcess_R1Adapter();
		}

		@Override
		public Adapter caseSDL2UMLBlock_SDL2UMLBlock_R1(
				SDL2UMLBlock_SDL2UMLBlock_R1 object) {
			return createSDL2UMLBlock_SDL2UMLBlock_R1Adapter();
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
		public Adapter caseOperationalMappingGroup(
				OperationalMappingGroup object) {
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
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG <em>SDL2UML Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG
	 * @generated
	 */
	public Adapter createSDL2UMLOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom <em>SDL2UML Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom
	 * @generated
	 */
	public Adapter createSDL2UMLAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3 <em>SDL2UML Connection Var3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3
	 * @generated
	 */
	public Adapter createSDL2UMLConnectionVar3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess <em>SDL2UML Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess
	 * @generated
	 */
	public Adapter createSDL2UMLProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock <em>SDL2UML Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock
	 * @generated
	 */
	public Adapter createSDL2UMLBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1 <em>SDL2UML Connection Var1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1
	 * @generated
	 */
	public Adapter createSDL2UMLConnectionVar1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2 <em>SDL2UML Connection Var2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2
	 * @generated
	 */
	public Adapter createSDL2UMLConnectionVar2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock <em>SDL2UML System Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock
	 * @generated
	 */
	public Adapter createSDL2UMLSystemBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1 <em>SDL2UML Axiom SDL2UML Axiom R1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLAxiom_SDL2UMLAxiom_R1
	 * @generated
	 */
	public Adapter createSDL2UMLAxiom_SDL2UMLAxiom_R1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1 <em>SDL2UML System Block SDL2UML System Block R1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1
	 * @generated
	 */
	public Adapter createSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1 <em>SDL2UML Connection Var2 SDL2UML Connection Var2 R1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1
	 * @generated
	 */
	public Adapter createSDL2UMLConnectionVar2_SDL2UMLConnectionVar2_R1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1 <em>SDL2UML Connection Var1 SDL2UML Connection Var1 R1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1
	 * @generated
	 */
	public Adapter createSDL2UMLConnectionVar1_SDL2UMLConnectionVar1_R1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1 <em>SDL2UML Connection Var3 SDL2UML Connection Var3 R1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1
	 * @generated
	 */
	public Adapter createSDL2UMLConnectionVar3_SDL2UMLConnectionVar3_R1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1 <em>SDL2UML Process SDL2UML Process R1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLProcess_SDL2UMLProcess_R1
	 * @generated
	 */
	public Adapter createSDL2UMLProcess_SDL2UMLProcess_R1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1 <em>SDL2UML Block SDL2UML Block R1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.sdl2uml.generated.SDL2UMLBlock_SDL2UMLBlock_R1
	 * @generated
	 */
	public Adapter createSDL2UMLBlock_SDL2UMLBlock_R1Adapter() {
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
