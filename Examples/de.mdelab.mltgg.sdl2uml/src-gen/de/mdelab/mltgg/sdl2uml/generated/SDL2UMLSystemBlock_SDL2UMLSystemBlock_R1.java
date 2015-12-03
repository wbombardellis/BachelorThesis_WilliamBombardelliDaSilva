/**
 */
package de.mdelab.mltgg.sdl2uml.generated;

import de.mdelab.mlsdm.Activity;

import de.mdelab.mltgg.mote2.TGGNode;

import de.mdelab.mltgg.mote2.impl.TransformationException;

import de.mdelab.mltgg.mote2.operationalTGG.ErrorCodeEnum;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDL2UML System Block SDL2UML System Block R1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getAddElementActivity <em>Add Element Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getMoveElementActivity <em>Move Element Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getChangeAttributeActivity <em>Change Attribute Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformForwardActivity <em>Transform Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformMappingActivity <em>Transform Mapping Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformBackwardActivity <em>Transform Backward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getRepairForwardActivity <em>Repair Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getRepairBackwardActivity <em>Repair Backward Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1()
 * @model
 * @generated
 */
public interface SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1 extends
		OperationalRule {
	/**
	 * Returns the value of the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Element Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Element Activity</em>' reference.
	 * @see #setAddElementActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_AddElementActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getAddElementActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getAddElementActivity <em>Add Element Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Element Activity</em>' reference.
	 * @see #getAddElementActivity()
	 * @generated
	 */
	void setAddElementActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move Element Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Element Activity</em>' reference.
	 * @see #setMoveElementActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_MoveElementActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getMoveElementActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getMoveElementActivity <em>Move Element Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move Element Activity</em>' reference.
	 * @see #getMoveElementActivity()
	 * @generated
	 */
	void setMoveElementActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Attribute Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Attribute Activity</em>' reference.
	 * @see #setChangeAttributeActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ChangeAttributeActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getChangeAttributeActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getChangeAttributeActivity <em>Change Attribute Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Attribute Activity</em>' reference.
	 * @see #getChangeAttributeActivity()
	 * @generated
	 */
	void setChangeAttributeActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Forward Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Forward Activity</em>' reference.
	 * @see #setTransformForwardActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_TransformForwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getTransformForwardActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformForwardActivity <em>Transform Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform Forward Activity</em>' reference.
	 * @see #getTransformForwardActivity()
	 * @generated
	 */
	void setTransformForwardActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Mapping Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Mapping Activity</em>' reference.
	 * @see #setTransformMappingActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_TransformMappingActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getTransformMappingActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformMappingActivity <em>Transform Mapping Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform Mapping Activity</em>' reference.
	 * @see #getTransformMappingActivity()
	 * @generated
	 */
	void setTransformMappingActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Backward Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Backward Activity</em>' reference.
	 * @see #setTransformBackwardActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_TransformBackwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getTransformBackwardActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getTransformBackwardActivity <em>Transform Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform Backward Activity</em>' reference.
	 * @see #getTransformBackwardActivity()
	 * @generated
	 */
	void setTransformBackwardActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict Check Forward Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict Check Forward Activity</em>' reference.
	 * @see #setConflictCheckForwardActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ConflictCheckForwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getConflictCheckForwardActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict Check Forward Activity</em>' reference.
	 * @see #getConflictCheckForwardActivity()
	 * @generated
	 */
	void setConflictCheckForwardActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict Check Mapping Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict Check Mapping Activity</em>' reference.
	 * @see #setConflictCheckMappingActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ConflictCheckMappingActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getConflictCheckMappingActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict Check Mapping Activity</em>' reference.
	 * @see #getConflictCheckMappingActivity()
	 * @generated
	 */
	void setConflictCheckMappingActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict Check Backward Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict Check Backward Activity</em>' reference.
	 * @see #setConflictCheckBackwardActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_ConflictCheckBackwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getConflictCheckBackwardActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict Check Backward Activity</em>' reference.
	 * @see #getConflictCheckBackwardActivity()
	 * @generated
	 */
	void setConflictCheckBackwardActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronize Forward Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronize Forward Activity</em>' reference.
	 * @see #setSynchronizeForwardActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_SynchronizeForwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getSynchronizeForwardActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronize Forward Activity</em>' reference.
	 * @see #getSynchronizeForwardActivity()
	 * @generated
	 */
	void setSynchronizeForwardActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronize Backward Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronize Backward Activity</em>' reference.
	 * @see #setSynchronizeBackwardActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_SynchronizeBackwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getSynchronizeBackwardActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronize Backward Activity</em>' reference.
	 * @see #getSynchronizeBackwardActivity()
	 * @generated
	 */
	void setSynchronizeBackwardActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repair Forward Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repair Forward Activity</em>' reference.
	 * @see #setRepairForwardActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_RepairForwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getRepairForwardActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getRepairForwardActivity <em>Repair Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repair Forward Activity</em>' reference.
	 * @see #getRepairForwardActivity()
	 * @generated
	 */
	void setRepairForwardActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repair Backward Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repair Backward Activity</em>' reference.
	 * @see #setRepairBackwardActivity(Activity)
	 * @see de.mdelab.mltgg.sdl2uml.generated.GeneratedPackage#getSDL2UMLSystemBlock_SDL2UMLSystemBlock_R1_RepairBackwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getRepairBackwardActivity();

	/**
	 * Sets the value of the '{@link de.mdelab.mltgg.sdl2uml.generated.SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1#getRepairBackwardActivity <em>Repair Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repair Backward Activity</em>' reference.
	 * @see #getRepairBackwardActivity()
	 * @generated
	 */
	void setRepairBackwardActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" parametersMapType="de.mdelab.mltgg.mote2.helpers.MapEntry<KeyType, ValueType>"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EMap<String, Object> parametersCopy = new org.eclipse.emf.common.util.BasicEMap<String, Object>(parameters.map());\r\n\r\n((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getAddElementActivity(),\tparametersCopy);\r\n\r\nreturn (TGGNode) parametersCopy.get(\"corrSystem\");'"
	 * @generated
	 */
	TGGNode addElement(EMap<String, Object> parameters)
			throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" correspondenceNodeRequired="true" ruleParametersMapType="de.mdelab.mltgg.mote2.helpers.MapEntry<KeyType, ValueType>"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EMap<String, Object> params = new org.eclipse.emf.common.util.BasicEMap<String, Object>(ruleParameters.map());\r\n\t\t\r\nparams.put(\"corrSystem\", correspondenceNode);\r\n\t\t\r\n((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this\r\n\t\t\t\t.getOperationalRuleGroup().getOperationalTGG())\r\n\t\t\t\t.executeActivity(this.getChangeAttributeActivity(), params);\r\n\t\t\r\nreturn (Boolean) params.get(\"__returnValue\");'"
	 * @generated
	 */
	boolean changeAttributeValues(TGGNode correspondenceNode,
			EMap<String, Object> ruleParameters) throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" correspondenceNodeRequired="true" oldPreviousCorrespondenceNodeRequired="true" newPreviousCorrespondenceNodeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EMap<String, Object> params = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\t\t\r\nparams.put(\"corrSystem\", correspondenceNode);\r\nparams.put(\"__oldPreviousCorrespondenceNode\", oldPreviousCorrespondenceNode);\r\nparams.put(\"__newPreviousCorrespondenceNode\", newPreviousCorrespondenceNode);\r\n\t\t\r\n((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this\r\n\t\t\t\t.getOperationalRuleGroup().getOperationalTGG())\r\n\t\t\t\t.executeActivity(this.getMoveElementActivity(), params);\r\n\t\t\r\nreturn (Boolean) params.get(\"__returnValue\");'"
	 * @generated
	 */
	boolean moveElement(TGGNode correspondenceNode,
			TGGNode oldPreviousCorrespondenceNode,
			TGGNode newPreviousCorrespondenceNode)
			throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true" checkAttributeFormulaeRequired="true" considerAllLhsCorrNodesRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\n\t\tparameters.put(\"__thisRule\", this);\r\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\r\n\t\tparameters.put(\"__considerAllLhsCorrNodes\", considerAllLhsCorrNodes); \r\n\t\tparameters.put(\"__inputTggNode\", inputTggNode);\r\n\t\t\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getTransformForwardActivity(), parameters);\r\n\r\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\r\n\r\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum transformForward(TGGNode inputTggNode,
			boolean checkAttributeFormulae, boolean considerAllLhsCorrNodes)
			throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true" checkAttributeFormulaeRequired="true" considerAllLhsCorrNodesRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\n\t\tparameters.put(\"__thisRule\", this);\r\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\r\n\t\tparameters.put(\"__considerAllLhsCorrNodes\", considerAllLhsCorrNodes); \r\n\t\tparameters.put(\"__inputTggNode\", inputTggNode);\r\n\t\t\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getTransformMappingActivity(), parameters);\r\n\r\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\r\n\r\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum transformMapping(TGGNode inputTggNode,
			boolean checkAttributeFormulae, boolean considerAllLhsCorrNodes)
			throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true" checkAttributeFormulaeRequired="true" considerAllLhsCorrNodesRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\n\t\tparameters.put(\"__thisRule\", this);\r\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\r\n\t\tparameters.put(\"__considerAllLhsCorrNodes\", considerAllLhsCorrNodes); \r\n\t\tparameters.put(\"__inputTggNode\", inputTggNode);\r\n\t\t\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getTransformBackwardActivity(), parameters);\r\n\r\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\r\n\r\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum transformBackward(TGGNode inputTggNode,
			boolean checkAttributeFormulae, boolean considerAllLhsCorrNodes)
			throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\nparameters.put(\"__thisRule\", this);\r\nparameters.put(\"__inputTggNode\", inputTggNode);\r\n\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getConflictCheckForwardActivity(), parameters);\r\n\r\n@SuppressWarnings(\"unchecked\")\r\nfinal java.util.Collection<? extends EObject> returnValue = (java.util.Collection<? extends EObject>) parameters.get(\"__returnValue\");\r\n\r\nif (returnValue == null)\r\n{\r\n\treturn null;\r\n}\r\nelse\r\n{\r\n\treturn new org.eclipse.emf.common.util.BasicEList<EObject>(returnValue);\r\n}\r\n'"
	 * @generated
	 */
	EList<EObject> conflictCheckForward(TGGNode inputTggNode)
			throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\nparameters.put(\"__thisRule\", this);\r\nparameters.put(\"__inputTggNode\", inputTggNode);\r\n\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getConflictCheckMappingActivity(), parameters);\r\n\r\n@SuppressWarnings(\"unchecked\")\r\nfinal java.util.Collection<? extends EObject> returnValue = (java.util.Collection<? extends EObject>) parameters.get(\"__returnValue\");\r\n\r\nif (returnValue == null)\r\n{\r\n\treturn null;\r\n}\r\nelse\r\n{\r\n\treturn new org.eclipse.emf.common.util.BasicEList<EObject>(returnValue);\r\n}\r\n'"
	 * @generated
	 */
	EList<EObject> conflictCheckMapping(TGGNode inputTggNode)
			throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\nparameters.put(\"__thisRule\", this);\r\nparameters.put(\"__inputTggNode\", inputTggNode);\r\n\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getConflictCheckBackwardActivity(), parameters);\r\n\r\n@SuppressWarnings(\"unchecked\")\r\nfinal java.util.Collection<? extends EObject> returnValue = (java.util.Collection<? extends EObject>) parameters.get(\"__returnValue\");\r\n\r\nif (returnValue == null)\r\n{\r\n\treturn null;\r\n}\r\nelse\r\n{\r\n\treturn new org.eclipse.emf.common.util.BasicEList<EObject>(returnValue);\r\n}\r\n'"
	 * @generated
	 */
	EList<EObject> conflictCheckBackward(TGGNode inputTggNode)
			throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true" checkAttributeFormulaeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\n\t\tparameters.put(\"__thisRule\", this);\r\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\r\n\t\tparameters.put(\"__inputTggNode\", inputTggNode);\r\n\t\t\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getSynchronizeForwardActivity(), parameters);\r\n\r\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\r\n\r\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum synchronizeForward(TGGNode inputTggNode,
			boolean checkAttributeFormulae) throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true" checkAttributeFormulaeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\n\t\tparameters.put(\"__thisRule\", this);\r\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\r\n\t\tparameters.put(\"__inputTggNode\", inputTggNode);\r\n\t\t\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getSynchronizeBackwardActivity(), parameters);\r\n\r\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\r\n\r\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum synchronizeBackward(TGGNode inputTggNode,
			boolean checkAttributeFormulae) throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true" checkAttributeFormulaeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\n\t\tparameters.put(\"__thisRule\", this);\r\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\r\n\t\tparameters.put(\"__inputTggNode\", inputTggNode);\r\n\t\t\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getRepairForwardActivity(), parameters);\r\n\r\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\r\n\r\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum repairForward(TGGNode inputTggNode,
			boolean checkAttributeFormulae) throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" inputTggNodeRequired="true" checkAttributeFormulaeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\r\n\r\n\t\tparameters.put(\"__thisRule\", this);\r\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\r\n\t\tparameters.put(\"__inputTggNode\", inputTggNode);\r\n\t\t\r\n\t\t((de.mdelab.mltgg.sdl2uml.generated.SDL2UMLOperationalTGG) this.getOperationalRuleGroup().getOperationalTGG()).executeActivity(this.getRepairBackwardActivity(), parameters);\r\n\r\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\r\n\r\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum repairBackward(TGGNode inputTggNode,
			boolean checkAttributeFormulae) throws TransformationException;

} // SDL2UMLSystemBlock_SDL2UMLSystemBlock_R1
