/**
 */
package de.silvawb.uml2blocky;

import de.mdelab.mltgg.mote2.Mote2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.silvawb.uml2blocky.Uml2blockyFactory
 * @model kind="package"
 * @generated
 */
public interface Uml2blockyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uml2blocky";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tu-berlin.de/uml2blocky";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.silvawb.uml2blocky";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Uml2blockyPackage eINSTANCE = de.silvawb.uml2blocky.impl.Uml2blockyPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.silvawb.uml2blocky.impl.CorrAxiomImpl <em>Corr Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2blocky.impl.CorrAxiomImpl
	 * @see de.silvawb.uml2blocky.impl.Uml2blockyPackageImpl#getCorrAxiom()
	 * @generated
	 */
	int CORR_AXIOM = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.silvawb.uml2blocky.impl.CorrRuleImpl <em>Corr Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.silvawb.uml2blocky.impl.CorrRuleImpl
	 * @see de.silvawb.uml2blocky.impl.Uml2blockyPackageImpl#getCorrRule()
	 * @generated
	 */
	int CORR_RULE = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_RULE__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_RULE__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_RULE__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_RULE__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_RULE__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_RULE__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_RULE_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_RULE_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2blocky.CorrAxiom <em>Corr Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Axiom</em>'.
	 * @see de.silvawb.uml2blocky.CorrAxiom
	 * @generated
	 */
	EClass getCorrAxiom();

	/**
	 * Returns the meta object for class '{@link de.silvawb.uml2blocky.CorrRule <em>Corr Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Rule</em>'.
	 * @see de.silvawb.uml2blocky.CorrRule
	 * @generated
	 */
	EClass getCorrRule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Uml2blockyFactory getUml2blockyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.silvawb.uml2blocky.impl.CorrAxiomImpl <em>Corr Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.uml2blocky.impl.CorrAxiomImpl
		 * @see de.silvawb.uml2blocky.impl.Uml2blockyPackageImpl#getCorrAxiom()
		 * @generated
		 */
		EClass CORR_AXIOM = eINSTANCE.getCorrAxiom();

		/**
		 * The meta object literal for the '{@link de.silvawb.uml2blocky.impl.CorrRuleImpl <em>Corr Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.silvawb.uml2blocky.impl.CorrRuleImpl
		 * @see de.silvawb.uml2blocky.impl.Uml2blockyPackageImpl#getCorrRule()
		 * @generated
		 */
		EClass CORR_RULE = eINSTANCE.getCorrRule();

	}

} //Uml2blockyPackage
