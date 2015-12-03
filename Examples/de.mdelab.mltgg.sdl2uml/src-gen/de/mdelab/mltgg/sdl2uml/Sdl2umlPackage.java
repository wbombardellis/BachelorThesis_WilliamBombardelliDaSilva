/**
 */
package de.mdelab.mltgg.sdl2uml;

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
 * @see de.mdelab.mltgg.sdl2uml.Sdl2umlFactory
 * @model kind="package"
 * @generated
 */
public interface Sdl2umlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sdl2uml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdelab.de/mltgg/sdl2uml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.hpi.sam.mote.sdl2uml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sdl2umlPackage eINSTANCE = de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrAxiomImpl <em>Corr Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.impl.CorrAxiomImpl
	 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrAxiom()
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
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrConnectionImpl <em>Corr Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.impl.CorrConnectionImpl
	 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrConnection()
	 * @generated
	 */
	int CORR_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrConnectableImpl <em>Corr Connectable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.impl.CorrConnectableImpl
	 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrConnectable()
	 * @generated
	 */
	int CORR_CONNECTABLE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTABLE__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTABLE__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTABLE__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTABLE__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTABLE__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTABLE__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Connectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTABLE_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Connectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTABLE_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrProcessImpl <em>Corr Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.impl.CorrProcessImpl
	 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrProcess()
	 * @generated
	 */
	int CORR_PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_PROCESS__ANNOTATIONS = CORR_CONNECTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_PROCESS__NEXT = CORR_CONNECTABLE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_PROCESS__PREVIOUS = CORR_CONNECTABLE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_PROCESS__LEFT_NODES = CORR_CONNECTABLE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_PROCESS__RIGHT_NODES = CORR_CONNECTABLE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_PROCESS__CREATED_BY = CORR_CONNECTABLE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_PROCESS_FEATURE_COUNT = CORR_CONNECTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_PROCESS_OPERATION_COUNT = CORR_CONNECTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrBlockImpl <em>Corr Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.impl.CorrBlockImpl
	 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrBlock()
	 * @generated
	 */
	int CORR_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK__ANNOTATIONS = CORR_CONNECTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK__NEXT = CORR_CONNECTABLE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK__PREVIOUS = CORR_CONNECTABLE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK__LEFT_NODES = CORR_CONNECTABLE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK__RIGHT_NODES = CORR_CONNECTABLE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK__CREATED_BY = CORR_CONNECTABLE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK_FEATURE_COUNT = CORR_CONNECTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK_OPERATION_COUNT = CORR_CONNECTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrSystemImpl <em>Corr System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.sdl2uml.impl.CorrSystemImpl
	 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrSystem()
	 * @generated
	 */
	int CORR_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_SYSTEM__ANNOTATIONS = CORR_BLOCK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_SYSTEM__NEXT = CORR_BLOCK__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_SYSTEM__PREVIOUS = CORR_BLOCK__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_SYSTEM__LEFT_NODES = CORR_BLOCK__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_SYSTEM__RIGHT_NODES = CORR_BLOCK__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_SYSTEM__CREATED_BY = CORR_BLOCK__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_SYSTEM_FEATURE_COUNT = CORR_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_SYSTEM_OPERATION_COUNT = CORR_BLOCK_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.CorrAxiom <em>Corr Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Axiom</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.CorrAxiom
	 * @generated
	 */
	EClass getCorrAxiom();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.CorrConnection <em>Corr Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Connection</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.CorrConnection
	 * @generated
	 */
	EClass getCorrConnection();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.CorrConnectable <em>Corr Connectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Connectable</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.CorrConnectable
	 * @generated
	 */
	EClass getCorrConnectable();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.CorrProcess <em>Corr Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Process</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.CorrProcess
	 * @generated
	 */
	EClass getCorrProcess();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.CorrBlock <em>Corr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Block</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.CorrBlock
	 * @generated
	 */
	EClass getCorrBlock();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.sdl2uml.CorrSystem <em>Corr System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr System</em>'.
	 * @see de.mdelab.mltgg.sdl2uml.CorrSystem
	 * @generated
	 */
	EClass getCorrSystem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Sdl2umlFactory getSdl2umlFactory();

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
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrAxiomImpl <em>Corr Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.impl.CorrAxiomImpl
		 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrAxiom()
		 * @generated
		 */
		EClass CORR_AXIOM = eINSTANCE.getCorrAxiom();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrConnectionImpl <em>Corr Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.impl.CorrConnectionImpl
		 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrConnection()
		 * @generated
		 */
		EClass CORR_CONNECTION = eINSTANCE.getCorrConnection();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrConnectableImpl <em>Corr Connectable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.impl.CorrConnectableImpl
		 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrConnectable()
		 * @generated
		 */
		EClass CORR_CONNECTABLE = eINSTANCE.getCorrConnectable();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrProcessImpl <em>Corr Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.impl.CorrProcessImpl
		 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrProcess()
		 * @generated
		 */
		EClass CORR_PROCESS = eINSTANCE.getCorrProcess();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrBlockImpl <em>Corr Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.impl.CorrBlockImpl
		 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrBlock()
		 * @generated
		 */
		EClass CORR_BLOCK = eINSTANCE.getCorrBlock();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.sdl2uml.impl.CorrSystemImpl <em>Corr System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.sdl2uml.impl.CorrSystemImpl
		 * @see de.mdelab.mltgg.sdl2uml.impl.Sdl2umlPackageImpl#getCorrSystem()
		 * @generated
		 */
		EClass CORR_SYSTEM = eINSTANCE.getCorrSystem();

	}

} //Sdl2umlPackage
