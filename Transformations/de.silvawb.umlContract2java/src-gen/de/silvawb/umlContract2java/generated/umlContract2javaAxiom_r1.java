/**
 */
package de.silvawb.umlContract2java.generated;

import de.mdelab.mlsdm.Activity;

import de.mdelab.mltgg.mote2.TGGNode;

import de.mdelab.mltgg.mote2.impl.TransformationException;

import de.mdelab.mltgg.mote2.operationalTGG.ErrorCodeEnum;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uml Contract2java Axiom r1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getAddElementActivity <em>Add Element Activity</em>}</li>
 *   <li>{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getMoveElementActivity <em>Move Element Activity</em>}</li>
 *   <li>{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getChangeAttributeActivity <em>Change Attribute Activity</em>}</li>
 *   <li>{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformForwardActivity <em>Transform Forward Activity</em>}</li>
 *   <li>{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformMappingActivity <em>Transform Mapping Activity</em>}</li>
 *   <li>{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformBackwardActivity <em>Transform Backward Activity</em>}</li>
 *   <li>{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}</li>
 *   <li>{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}</li>
 * </ul>
 *
 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#getumlContract2javaAxiom_r1()
 * @model
 * @generated
 */
public interface umlContract2javaAxiom_r1 extends OperationalAxiom {
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
	 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#getumlContract2javaAxiom_r1_AddElementActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getAddElementActivity();

	/**
	 * Sets the value of the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getAddElementActivity <em>Add Element Activity</em>}' reference.
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
	 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#getumlContract2javaAxiom_r1_MoveElementActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getMoveElementActivity();

	/**
	 * Sets the value of the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getMoveElementActivity <em>Move Element Activity</em>}' reference.
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
	 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#getumlContract2javaAxiom_r1_ChangeAttributeActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getChangeAttributeActivity();

	/**
	 * Sets the value of the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getChangeAttributeActivity <em>Change Attribute Activity</em>}' reference.
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
	 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#getumlContract2javaAxiom_r1_TransformForwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getTransformForwardActivity();

	/**
	 * Sets the value of the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformForwardActivity <em>Transform Forward Activity</em>}' reference.
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
	 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#getumlContract2javaAxiom_r1_TransformMappingActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getTransformMappingActivity();

	/**
	 * Sets the value of the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformMappingActivity <em>Transform Mapping Activity</em>}' reference.
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
	 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#getumlContract2javaAxiom_r1_TransformBackwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getTransformBackwardActivity();

	/**
	 * Sets the value of the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getTransformBackwardActivity <em>Transform Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform Backward Activity</em>' reference.
	 * @see #getTransformBackwardActivity()
	 * @generated
	 */
	void setTransformBackwardActivity(Activity value);

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
	 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#getumlContract2javaAxiom_r1_SynchronizeForwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getSynchronizeForwardActivity();

	/**
	 * Sets the value of the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}' reference.
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
	 * @see de.silvawb.umlContract2java.generated.GeneratedPackage#getumlContract2javaAxiom_r1_SynchronizeBackwardActivity()
	 * @model required="true"
	 * @generated
	 */
	Activity getSynchronizeBackwardActivity();

	/**
	 * Sets the value of the '{@link de.silvawb.umlContract2java.generated.umlContract2javaAxiom_r1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronize Backward Activity</em>' reference.
	 * @see #getSynchronizeBackwardActivity()
	 * @generated
	 */
	void setSynchronizeBackwardActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" parametersMapType="de.mdelab.mltgg.mote2.helpers.MapEntry<KeyType, ValueType>" leftInputElementsMany="true" rightInputElementsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EMap<String, Object> parametersCopy = new org.eclipse.emf.common.util.BasicEMap<String, Object>(parameters.map());\n\n((de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG) this.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getAddElementActivity(), parametersCopy);\n\nde.mdelab.mltgg.mote2.TGGNode tggNode = (de.mdelab.mltgg.mote2.TGGNode) parametersCopy.get(\"corrAxiom\");\n\nif (tggNode != null)\n{\nleftInputElements.add((org.eclipse.emf.ecore.EObject) parametersCopy.get(\"model\"));\nrightInputElements.add((org.eclipse.emf.ecore.EObject) parametersCopy.get(\"target\"));\t\n}\n\nreturn tggNode;'"
	 * @generated
	 */
	TGGNode addElement(EMap<String, Object> parameters, EList<EObject> leftInputElements,
			EList<EObject> rightInputElements) throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" correspondenceNodeRequired="true" ruleParametersMapType="de.mdelab.mltgg.mote2.helpers.MapEntry<KeyType, ValueType>"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EMap<String, Object> params = new org.eclipse.emf.common.util.BasicEMap<String, Object>(ruleParameters.map());\n\t\t\nparams.put(\"corrAxiom\", correspondenceNode);\n\t\t\n((de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG) this\n\t\t\t\t.getOperationalAxiomGroup().getOperationalTGG())\n\t\t\t\t.executeActivity(this.getChangeAttributeActivity(), params);\n\t\t\nreturn (Boolean) params.get(\"__returnValue\");'"
	 * @generated
	 */
	boolean changeAttributeValues(TGGNode correspondenceNode, EMap<String, Object> ruleParameters)
			throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" leftInputElementsRequired="true" leftInputElementsMany="true" rightInputElementsRequired="true" rightInputElementsMany="true" checkAttributeFormulaeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\n\n\t\tparameters.put(\"__thisRule\", this);\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\n\t\t\t\tparameters.put(\"model\", leftInputElements.get(0));\n\n\t\t((de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG) this.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getTransformForwardActivity(), parameters);\t\t\n\n\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\n\n\t\tif (errorCode == ErrorCodeEnum.OK)\n\t\t{\n\t\t\t\t\trightInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get(\"target\"));\n\t\t}\n\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum transformForward(EList<EObject> leftInputElements, EList<EObject> rightInputElements,
			boolean checkAttributeFormulae) throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" leftInputElementsRequired="true" leftInputElementsMany="true" rightInputElementsRequired="true" rightInputElementsMany="true" checkAttributeFormulaeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\n\n\t\tparameters.put(\"__thisRule\", this);\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\n\t\t\t\tparameters.put(\"model\", leftInputElements.get(0));\n\t\t\t\tparameters.put(\"target\", rightInputElements.get(0));\n\n\t\t((de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG) this.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getTransformMappingActivity(), parameters);\t\t\n\n\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\n\n\t\tif (errorCode == ErrorCodeEnum.OK)\n\t\t{\n\t\t\t\t\trightInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get(\"target\"));\n\t\t\t\t\tleftInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get(\"model\"));\n\t\t}\n\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum transformMapping(EList<EObject> leftInputElements, EList<EObject> rightInputElements,
			boolean checkAttributeFormulae) throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" leftInputElementsRequired="true" leftInputElementsMany="true" rightInputElementsRequired="true" rightInputElementsMany="true" checkAttributeFormulaeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\n\n\t\tparameters.put(\"__thisRule\", this);\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\n\t\t\t\tparameters.put(\"target\", rightInputElements.get(0));\n\n\t\t((de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG) this.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getTransformBackwardActivity(), parameters);\t\t\n\n\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\n\n\t\tif (errorCode == ErrorCodeEnum.OK)\n\t\t{\n\t\t\t\t\tleftInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get(\"model\"));\n\t\t}\n\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum transformBackward(EList<EObject> leftInputElements, EList<EObject> rightInputElements,
			boolean checkAttributeFormulae) throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" leftInputElementsRequired="true" leftInputElementsMany="true" rightInputElementsRequired="true" rightInputElementsMany="true" inputTggNodeRequired="true" checkAttributeFormulaeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\n\n\t\tparameters.put(\"__thisRule\", this);\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\n\t\tparameters.put(\"__inputTggNode\", inputTggNode);\n\t\t\tparameters.put(\"model\", leftInputElements.get(0));\n\t\t\tparameters.put(\"target\", rightInputElements.get(0));\n\n\t\t((de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG) this.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getSynchronizeForwardActivity(), parameters);\t\t\n\n\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\n\n\t\tif (errorCode == ErrorCodeEnum.OK)\n\t\t{\n\t\t\t\t\trightInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get(\"target\"));\n\t\t}\n\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum synchronizeForward(EList<EObject> leftInputElements, EList<EObject> rightInputElements,
			TGGNode inputTggNode, boolean checkAttributeFormulae) throws TransformationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.mdelab.mltgg.mote2.helpers.TransformationException" leftInputElementsRequired="true" leftInputElementsMany="true" rightInputElementsRequired="true" rightInputElementsMany="true" inputTggNodeRequired="true" checkAttributeFormulaeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nfinal org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();\n\n\t\tparameters.put(\"__thisRule\", this);\n\t\tparameters.put(\"__checkAttributeFormulae\", checkAttributeFormulae);\n\t\tparameters.put(\"__inputTggNode\", inputTggNode);\n\t\t\tparameters.put(\"model\", leftInputElements.get(0));\n\t\t\tparameters.put(\"target\", rightInputElements.get(0));\n\n\t\t((de.silvawb.umlContract2java.generated.umlContract2javaOperationalTGG) this.getOperationalAxiomGroup().getOperationalTGG()).executeActivity(this.getSynchronizeBackwardActivity(), parameters);\t\t\n\n\n\t\tfinal ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get(\"__errorCode\");\n\n\t\tif (errorCode == ErrorCodeEnum.OK)\n\t\t{\n\t\t\t\t\tleftInputElements.add((org.eclipse.emf.ecore.EObject) parameters.get(\"model\"));\n\t\t}\n\n\t\treturn errorCode;'"
	 * @generated
	 */
	ErrorCodeEnum synchronizeBackward(EList<EObject> leftInputElements, EList<EObject> rightInputElements,
			TGGNode inputTggNode, boolean checkAttributeFormulae) throws TransformationException;

} // umlContract2javaAxiom_r1
