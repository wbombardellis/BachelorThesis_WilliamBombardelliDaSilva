/**
 */
package de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl;

import de.mdelab.mlsdm.Activity;

import de.mdelab.mltgg.UmlClassDiagram2Java.generated.GeneratedPackage;
import de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaAxiom_r1;

import de.mdelab.mltgg.mote2.TGGNode;

import de.mdelab.mltgg.mote2.impl.TransformationException;

import de.mdelab.mltgg.mote2.operationalTGG.ErrorCodeEnum;

import de.mdelab.mltgg.mote2.operationalTGG.impl.OperationalAxiomImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Class Diagram2 Java Axiom r1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl.UmlClassDiagram2JavaAxiom_r1Impl#getAddElementActivity <em>Add Element Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl.UmlClassDiagram2JavaAxiom_r1Impl#getMoveElementActivity <em>Move Element Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl.UmlClassDiagram2JavaAxiom_r1Impl#getChangeAttributeActivity <em>Change Attribute Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl.UmlClassDiagram2JavaAxiom_r1Impl#getTransformForwardActivity <em>Transform Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl.UmlClassDiagram2JavaAxiom_r1Impl#getTransformMappingActivity <em>Transform Mapping Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl.UmlClassDiagram2JavaAxiom_r1Impl#getTransformBackwardActivity <em>Transform Backward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl.UmlClassDiagram2JavaAxiom_r1Impl#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.UmlClassDiagram2Java.generated.impl.UmlClassDiagram2JavaAxiom_r1Impl#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UmlClassDiagram2JavaAxiom_r1Impl extends OperationalAxiomImpl implements UmlClassDiagram2JavaAxiom_r1 {
	/**
	 * The cached value of the '{@link #getAddElementActivity() <em>Add Element Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddElementActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity addElementActivity;

	/**
	 * The cached value of the '{@link #getMoveElementActivity() <em>Move Element Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveElementActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity moveElementActivity;

	/**
	 * The cached value of the '{@link #getChangeAttributeActivity() <em>Change Attribute Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeAttributeActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity changeAttributeActivity;

	/**
	 * The cached value of the '{@link #getTransformForwardActivity() <em>Transform Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformForwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity transformForwardActivity;

	/**
	 * The cached value of the '{@link #getTransformMappingActivity() <em>Transform Mapping Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformMappingActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity transformMappingActivity;

	/**
	 * The cached value of the '{@link #getTransformBackwardActivity() <em>Transform Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformBackwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity transformBackwardActivity;

	/**
	 * The cached value of the '{@link #getSynchronizeForwardActivity() <em>Synchronize Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizeForwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity synchronizeForwardActivity;

	/**
	 * The cached value of the '{@link #getSynchronizeBackwardActivity() <em>Synchronize Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizeBackwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity synchronizeBackwardActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlClassDiagram2JavaAxiom_r1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratedPackage.Literals.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getAddElementActivity() {
		if (addElementActivity != null && addElementActivity.eIsProxy()) {
			InternalEObject oldAddElementActivity = (InternalEObject) addElementActivity;
			addElementActivity = (Activity) eResolveProxy(oldAddElementActivity);
			if (addElementActivity != oldAddElementActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY,
							oldAddElementActivity, addElementActivity));
			}
		}
		return addElementActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetAddElementActivity() {
		return addElementActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddElementActivity(Activity newAddElementActivity) {
		Activity oldAddElementActivity = addElementActivity;
		addElementActivity = newAddElementActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY, oldAddElementActivity,
					addElementActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getMoveElementActivity() {
		if (moveElementActivity != null && moveElementActivity.eIsProxy()) {
			InternalEObject oldMoveElementActivity = (InternalEObject) moveElementActivity;
			moveElementActivity = (Activity) eResolveProxy(oldMoveElementActivity);
			if (moveElementActivity != oldMoveElementActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY,
							oldMoveElementActivity, moveElementActivity));
			}
		}
		return moveElementActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetMoveElementActivity() {
		return moveElementActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveElementActivity(Activity newMoveElementActivity) {
		Activity oldMoveElementActivity = moveElementActivity;
		moveElementActivity = newMoveElementActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY, oldMoveElementActivity,
					moveElementActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getChangeAttributeActivity() {
		if (changeAttributeActivity != null && changeAttributeActivity.eIsProxy()) {
			InternalEObject oldChangeAttributeActivity = (InternalEObject) changeAttributeActivity;
			changeAttributeActivity = (Activity) eResolveProxy(oldChangeAttributeActivity);
			if (changeAttributeActivity != oldChangeAttributeActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY,
							oldChangeAttributeActivity, changeAttributeActivity));
			}
		}
		return changeAttributeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetChangeAttributeActivity() {
		return changeAttributeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeAttributeActivity(Activity newChangeAttributeActivity) {
		Activity oldChangeAttributeActivity = changeAttributeActivity;
		changeAttributeActivity = newChangeAttributeActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY,
					oldChangeAttributeActivity, changeAttributeActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getTransformForwardActivity() {
		if (transformForwardActivity != null && transformForwardActivity.eIsProxy()) {
			InternalEObject oldTransformForwardActivity = (InternalEObject) transformForwardActivity;
			transformForwardActivity = (Activity) eResolveProxy(oldTransformForwardActivity);
			if (transformForwardActivity != oldTransformForwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY,
							oldTransformForwardActivity, transformForwardActivity));
			}
		}
		return transformForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTransformForwardActivity() {
		return transformForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformForwardActivity(Activity newTransformForwardActivity) {
		Activity oldTransformForwardActivity = transformForwardActivity;
		transformForwardActivity = newTransformForwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY,
					oldTransformForwardActivity, transformForwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getTransformMappingActivity() {
		if (transformMappingActivity != null && transformMappingActivity.eIsProxy()) {
			InternalEObject oldTransformMappingActivity = (InternalEObject) transformMappingActivity;
			transformMappingActivity = (Activity) eResolveProxy(oldTransformMappingActivity);
			if (transformMappingActivity != oldTransformMappingActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY,
							oldTransformMappingActivity, transformMappingActivity));
			}
		}
		return transformMappingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTransformMappingActivity() {
		return transformMappingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformMappingActivity(Activity newTransformMappingActivity) {
		Activity oldTransformMappingActivity = transformMappingActivity;
		transformMappingActivity = newTransformMappingActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY,
					oldTransformMappingActivity, transformMappingActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getTransformBackwardActivity() {
		if (transformBackwardActivity != null && transformBackwardActivity.eIsProxy()) {
			InternalEObject oldTransformBackwardActivity = (InternalEObject) transformBackwardActivity;
			transformBackwardActivity = (Activity) eResolveProxy(oldTransformBackwardActivity);
			if (transformBackwardActivity != oldTransformBackwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY,
							oldTransformBackwardActivity, transformBackwardActivity));
			}
		}
		return transformBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTransformBackwardActivity() {
		return transformBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformBackwardActivity(Activity newTransformBackwardActivity) {
		Activity oldTransformBackwardActivity = transformBackwardActivity;
		transformBackwardActivity = newTransformBackwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY,
					oldTransformBackwardActivity, transformBackwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getSynchronizeForwardActivity() {
		if (synchronizeForwardActivity != null && synchronizeForwardActivity.eIsProxy()) {
			InternalEObject oldSynchronizeForwardActivity = (InternalEObject) synchronizeForwardActivity;
			synchronizeForwardActivity = (Activity) eResolveProxy(oldSynchronizeForwardActivity);
			if (synchronizeForwardActivity != oldSynchronizeForwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY,
							oldSynchronizeForwardActivity, synchronizeForwardActivity));
			}
		}
		return synchronizeForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetSynchronizeForwardActivity() {
		return synchronizeForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizeForwardActivity(Activity newSynchronizeForwardActivity) {
		Activity oldSynchronizeForwardActivity = synchronizeForwardActivity;
		synchronizeForwardActivity = newSynchronizeForwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY,
					oldSynchronizeForwardActivity, synchronizeForwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getSynchronizeBackwardActivity() {
		if (synchronizeBackwardActivity != null && synchronizeBackwardActivity.eIsProxy()) {
			InternalEObject oldSynchronizeBackwardActivity = (InternalEObject) synchronizeBackwardActivity;
			synchronizeBackwardActivity = (Activity) eResolveProxy(oldSynchronizeBackwardActivity);
			if (synchronizeBackwardActivity != oldSynchronizeBackwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY,
							oldSynchronizeBackwardActivity, synchronizeBackwardActivity));
			}
		}
		return synchronizeBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetSynchronizeBackwardActivity() {
		return synchronizeBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizeBackwardActivity(Activity newSynchronizeBackwardActivity) {
		Activity oldSynchronizeBackwardActivity = synchronizeBackwardActivity;
		synchronizeBackwardActivity = newSynchronizeBackwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY,
					oldSynchronizeBackwardActivity, synchronizeBackwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGGNode addElement(final EMap<String, Object> parameters, final EList<EObject> leftInputElements,
			final EList<EObject> rightInputElements) throws TransformationException {
		final EMap<String, Object> parametersCopy = new org.eclipse.emf.common.util.BasicEMap<String, Object>(
				parameters.map());

		((de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaOperationalTGG) this
				.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getAddElementActivity(),
						parametersCopy);

		de.mdelab.mltgg.mote2.TGGNode tggNode = (de.mdelab.mltgg.mote2.TGGNode) parametersCopy.get("corrAxiom");

		if (tggNode != null) {
			leftInputElements.add((org.eclipse.emf.ecore.EObject) parametersCopy.get("Uml Class Diagram"));
			rightInputElements.add((org.eclipse.emf.ecore.EObject) parametersCopy.get("Java System"));
		}

		return tggNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean changeAttributeValues(final TGGNode correspondenceNode, final EMap<String, Object> ruleParameters)
			throws TransformationException {
		org.eclipse.emf.common.util.EMap<String, Object> params = new org.eclipse.emf.common.util.BasicEMap<String, Object>(
				ruleParameters.map());

		params.put("corrAxiom", correspondenceNode);

		((de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaOperationalTGG) this
				.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getChangeAttributeActivity(),
						params);

		return (Boolean) params.get("__returnValue");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum transformForward(final EList<EObject> leftInputElements,
			final EList<EObject> rightInputElements, final boolean checkAttributeFormulae)
					throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("Uml Class Diagram", leftInputElements.get(0));

		((de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaOperationalTGG) this
				.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getTransformForwardActivity(),
						parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		if (errorCode == ErrorCodeEnum.OK) {
			rightInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get("Java System"));
		}

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum transformMapping(final EList<EObject> leftInputElements,
			final EList<EObject> rightInputElements, final boolean checkAttributeFormulae)
					throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("Uml Class Diagram", leftInputElements.get(0));
		parameters.put("Java System", rightInputElements.get(0));

		((de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaOperationalTGG) this
				.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getTransformMappingActivity(),
						parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		if (errorCode == ErrorCodeEnum.OK) {
			rightInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get("Java System"));
			leftInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get("Uml Class Diagram"));
		}

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum transformBackward(final EList<EObject> leftInputElements,
			final EList<EObject> rightInputElements, final boolean checkAttributeFormulae)
					throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("Java System", rightInputElements.get(0));

		((de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaOperationalTGG) this
				.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getTransformBackwardActivity(),
						parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		if (errorCode == ErrorCodeEnum.OK) {
			leftInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get("Uml Class Diagram"));
		}

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum synchronizeForward(final EList<EObject> leftInputElements,
			final EList<EObject> rightInputElements, final TGGNode inputTggNode, final boolean checkAttributeFormulae)
					throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("__inputTggNode", inputTggNode);
		parameters.put("Uml Class Diagram", leftInputElements.get(0));
		parameters.put("Java System", rightInputElements.get(0));

		((de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaOperationalTGG) this
				.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getSynchronizeForwardActivity(),
						parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		if (errorCode == ErrorCodeEnum.OK) {
			rightInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get("Java System"));
		}

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum synchronizeBackward(final EList<EObject> leftInputElements,
			final EList<EObject> rightInputElements, final TGGNode inputTggNode, final boolean checkAttributeFormulae)
					throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("__inputTggNode", inputTggNode);
		parameters.put("Uml Class Diagram", leftInputElements.get(0));
		parameters.put("Java System", rightInputElements.get(0));

		((de.mdelab.mltgg.UmlClassDiagram2Java.generated.UmlClassDiagram2JavaOperationalTGG) this
				.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getSynchronizeBackwardActivity(),
						parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		if (errorCode == ErrorCodeEnum.OK) {
			leftInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get("Uml Class Diagram"));
		}

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY:
			if (resolve)
				return getAddElementActivity();
			return basicGetAddElementActivity();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY:
			if (resolve)
				return getMoveElementActivity();
			return basicGetMoveElementActivity();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY:
			if (resolve)
				return getChangeAttributeActivity();
			return basicGetChangeAttributeActivity();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY:
			if (resolve)
				return getTransformForwardActivity();
			return basicGetTransformForwardActivity();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY:
			if (resolve)
				return getTransformMappingActivity();
			return basicGetTransformMappingActivity();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY:
			if (resolve)
				return getTransformBackwardActivity();
			return basicGetTransformBackwardActivity();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY:
			if (resolve)
				return getSynchronizeForwardActivity();
			return basicGetSynchronizeForwardActivity();
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY:
			if (resolve)
				return getSynchronizeBackwardActivity();
			return basicGetSynchronizeBackwardActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY:
			setAddElementActivity((Activity) newValue);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY:
			setMoveElementActivity((Activity) newValue);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY:
			setChangeAttributeActivity((Activity) newValue);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY:
			setTransformForwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY:
			setTransformMappingActivity((Activity) newValue);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY:
			setTransformBackwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY:
			setSynchronizeForwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY:
			setSynchronizeBackwardActivity((Activity) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY:
			setAddElementActivity((Activity) null);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY:
			setMoveElementActivity((Activity) null);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY:
			setChangeAttributeActivity((Activity) null);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY:
			setTransformForwardActivity((Activity) null);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY:
			setTransformMappingActivity((Activity) null);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY:
			setTransformBackwardActivity((Activity) null);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY:
			setSynchronizeForwardActivity((Activity) null);
			return;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY:
			setSynchronizeBackwardActivity((Activity) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__ADD_ELEMENT_ACTIVITY:
			return addElementActivity != null;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__MOVE_ELEMENT_ACTIVITY:
			return moveElementActivity != null;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__CHANGE_ATTRIBUTE_ACTIVITY:
			return changeAttributeActivity != null;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_FORWARD_ACTIVITY:
			return transformForwardActivity != null;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_MAPPING_ACTIVITY:
			return transformMappingActivity != null;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__TRANSFORM_BACKWARD_ACTIVITY:
			return transformBackwardActivity != null;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_FORWARD_ACTIVITY:
			return synchronizeForwardActivity != null;
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1__SYNCHRONIZE_BACKWARD_ACTIVITY:
			return synchronizeBackwardActivity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___ADD_ELEMENT__EMAP_ELIST_ELIST:
			return addElement((EMap<String, Object>) arguments.get(0), (EList<EObject>) arguments.get(1),
					(EList<EObject>) arguments.get(2));
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP:
			return changeAttributeValues((TGGNode) arguments.get(0), (EMap<String, Object>) arguments.get(1));
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN:
			return transformForward((EList<EObject>) arguments.get(0), (EList<EObject>) arguments.get(1),
					(Boolean) arguments.get(2));
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN:
			return transformMapping((EList<EObject>) arguments.get(0), (EList<EObject>) arguments.get(1),
					(Boolean) arguments.get(2));
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN:
			return transformBackward((EList<EObject>) arguments.get(0), (EList<EObject>) arguments.get(1),
					(Boolean) arguments.get(2));
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN:
			return synchronizeForward((EList<EObject>) arguments.get(0), (EList<EObject>) arguments.get(1),
					(TGGNode) arguments.get(2), (Boolean) arguments.get(3));
		case GeneratedPackage.UML_CLASS_DIAGRAM2_JAVA_AXIOM_R1___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN:
			return synchronizeBackward((EList<EObject>) arguments.get(0), (EList<EObject>) arguments.get(1),
					(TGGNode) arguments.get(2), (Boolean) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UmlClassDiagram2JavaAxiom_r1Impl
