<?xml version="1.0" encoding="UTF-8"?>
<de.hpi.sam.storyDiagramEcore:ActivityDiagram xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:de.hpi.sam.storyDiagramEcore="http://de/hpi/sam/storyDiagramEcore.ecore" xmlns:de.hpi.sam.storyDiagramEcore.callActions="http://de/hpi/sam/storyDiagramEcore/callActions.ecore" xmlns:de.hpi.sam.storyDiagramEcore.expressions="http://de/hpi/sam/storyDiagramEcore/expressions.ecore" xmlns:de.hpi.sam.storyDiagramEcore.nodes="http://de/hpi/sam/storyDiagramEcore/nodes.ecore" xmlns:de.hpi.sam.storyDiagramEcore.sdm="http://de/hpi/sam/storyDiagramEcore/sdm.ecore" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" uuid="_nOYN0CgLEeKUYutVHhLzig">
  <activities name="SDL2UMLAxiom_R1_transform_forward" uuid="_nOYN0SgLEeKUYutVHhLzig">
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:InitialNode" uuid="_nk_-ECgLEeKUYutVHhLzig" outgoing="_pUSxcCgLEeKUYutVHhLzig"/>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="match LHS" uuid="_oUln8CgLEeKUYutVHhLzig" incoming="_pUSxcCgLEeKUYutVHhLzig" outgoing="_U3Oa4CgMEeKUYutVHhLzig _egQxsCgMEeKUYutVHhLzig">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__thisRule" uuid="_spucMCgLEeKUYutVHhLzig" incomingStoryLinks="_FQn5cCgMEeKUYutVHhLzig" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalAxiom"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="blockDiagram" uuid="_6-lo8CgLEeKUYutVHhLzig" incomingStoryLinks="_NualICgMEeKUYutVHhLzig" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//BlockDiagram"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__ruleGroup" uuid="_B-h2kCgMEeKUYutVHhLzig" outgoingStoryLinks="_FQn5cCgMEeKUYutVHhLzig" incomingStoryLinks="_MRhwYCgMEeKUYutVHhLzig">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalAxiomGroup"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__tggEngine" uuid="_F2HMICgMEeKUYutVHhLzig" outgoingStoryLinks="_M5xcICgMEeKUYutVHhLzig _NualICgMEeKUYutVHhLzig">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__opTgg" uuid="_J2vwACgMEeKUYutVHhLzig" outgoingStoryLinks="_MRhwYCgMEeKUYutVHhLzig" incomingStoryLinks="_M5xcICgMEeKUYutVHhLzig">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalTGG"/>
      </storyPatternObjects>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_FQn5cCgMEeKUYutVHhLzig" source="_B-h2kCgMEeKUYutVHhLzig" target="_spucMCgLEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalAxiomGroup/axioms"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_MRhwYCgMEeKUYutVHhLzig" source="_J2vwACgMEeKUYutVHhLzig" target="_B-h2kCgMEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalTGG/operationalAxiomGroup"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_M5xcICgMEeKUYutVHhLzig" source="_F2HMICgMEeKUYutVHhLzig" target="_J2vwACgMEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/operationalTGG"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_NualICgMEeKUYutVHhLzig" source="_F2HMICgMEeKUYutVHhLzig" target="_6-lo8CgLEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/uncoveredLeftElements"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ActivityFinalNode" uuid="_UateACgMEeKUYutVHhLzig" incoming="_U3Oa4CgMEeKUYutVHhLzig">
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_VF6XICgMEeKUYutVHhLzig" expressionString="mote::operationalTGG::ErrorCodeEnum::AXIOM_NOT_APPLICABLE" expressionLanguage="OCL"/>
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_VF6XISgMEeKUYutVHhLzig" expressionString="null" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="evaluate rule variables" uuid="_cw9-UCgMEeKUYutVHhLzig" incoming="_egQxsCgMEeKUYutVHhLzig" outgoing="_mT_MsCgMEeKUYutVHhLzig _sF6vECgMEeKUYutVHhLzig">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="nameVar" uuid="_fL8L8CgMEeKUYutVHhLzig" bindingType="BOUND">
        <classifier xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        <directAssignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_hH6wcCgMEeKUYutVHhLzig" expressionString="blockDiagram.name" expressionLanguage="OCL"/>
      </storyPatternObjects>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ActivityFinalNode" uuid="_mCWDECgMEeKUYutVHhLzig" incoming="_mT_MsCgMEeKUYutVHhLzig _SRDNYCgNEeKUYutVHhLzig _eCR_wCgNEeKUYutVHhLzig _GMoj0CgOEeKUYutVHhLzig">
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_m8CrMCgMEeKUYutVHhLzig" expressionString="mote::operationalTGG::ErrorCodeEnum::INTERNAL_ERROR" expressionLanguage="OCL"/>
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_m8Ix0CgMEeKUYutVHhLzig" expressionString="null" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="transform elements" uuid="_pw9C0CgMEeKUYutVHhLzig" incoming="_sF6vECgMEeKUYutVHhLzig" outgoing="_SRDNYCgNEeKUYutVHhLzig _UMdKICgNEeKUYutVHhLzig">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="blockDiagram" uuid="_to6L0CgMEeKUYutVHhLzig" incomingStoryLinks="_427jcCgMEeKUYutVHhLzig _GgZp0CgNEeKUYutVHhLzig _Iy-wcCgNEeKUYutVHhLzig" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//BlockDiagram"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="corrAxiom" uuid="_v3rJcCgMEeKUYutVHhLzig" modifier="CREATE" outgoingStoryLinks="_3SgjUCgMEeKUYutVHhLzig _427jcCgMEeKUYutVHhLzig" incomingStoryLinks="_EMfGcCgNEeKUYutVHhLzig _Fvw3ECgNEeKUYutVHhLzig">
        <classifier xsi:type="ecore:EClass" href="http://sdl2uml/1.0#//CorrAxiom"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="classDiagram" uuid="_z_jk0CgMEeKUYutVHhLzig" modifier="CREATE" incomingStoryLinks="_3SgjUCgMEeKUYutVHhLzig _K4x_UCgNEeKUYutVHhLzig">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/classDiagram.ecore#//UMLClassDiagram"/>
        <attributeAssignments uuid="_NEr2MCgNEeKUYutVHhLzig">
          <eStructuralFeature xsi:type="ecore:EAttribute" href="http:///de/hpi/sam/classDiagram.ecore#//UMLElement/name"/>
          <assignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_Ol38ICgNEeKUYutVHhLzig" expressionString="nameVar" expressionLanguage="OCL"/>
        </attributeAssignments>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__tggEngine" uuid="_6zSicCgMEeKUYutVHhLzig" outgoingStoryLinks="_Fvw3ECgNEeKUYutVHhLzig _GgZp0CgNEeKUYutVHhLzig _Iy-wcCgNEeKUYutVHhLzig _K4x_UCgNEeKUYutVHhLzig" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__thisRule" uuid="_BmpFkCgNEeKUYutVHhLzig" outgoingStoryLinks="_EMfGcCgNEeKUYutVHhLzig" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalAxiom"/>
      </storyPatternObjects>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_3SgjUCgMEeKUYutVHhLzig" modifier="CREATE" source="_v3rJcCgMEeKUYutVHhLzig" target="_z_jk0CgMEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNode/rightNodes"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_427jcCgMEeKUYutVHhLzig" modifier="CREATE" source="_v3rJcCgMEeKUYutVHhLzig" target="_to6L0CgMEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNode/leftNodes"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_EMfGcCgNEeKUYutVHhLzig" modifier="CREATE" source="_BmpFkCgNEeKUYutVHhLzig" target="_v3rJcCgMEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalMapping/createdTGGNodes"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_Fvw3ECgNEeKUYutVHhLzig" modifier="CREATE" source="_6zSicCgMEeKUYutVHhLzig" target="_v3rJcCgMEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/tggNodes"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_GgZp0CgNEeKUYutVHhLzig" modifier="DESTROY" source="_6zSicCgMEeKUYutVHhLzig" target="_to6L0CgMEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/uncoveredLeftElements"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_Iy-wcCgNEeKUYutVHhLzig" modifier="CREATE" source="_6zSicCgMEeKUYutVHhLzig" target="_to6L0CgMEeKUYutVHhLzig" valueTarget="_v3rJcCgMEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/coveredLeftElements"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_K4x_UCgNEeKUYutVHhLzig" modifier="CREATE" source="_6zSicCgMEeKUYutVHhLzig" target="_z_jk0CgMEeKUYutVHhLzig" valueTarget="_v3rJcCgMEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/coveredRightElements"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:DecisionNode" uuid="_TNCUgCgNEeKUYutVHhLzig" incoming="_WeN_ICgSEeK2bvcYRz1Q_Q" outgoing="_ZIHy4CgNEeKUYutVHhLzig _1hLTICgNEeKUYutVHhLzig"/>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="evaluate rule variables (opposite direction)" uuid="_VLrygCgNEeKUYutVHhLzig" incoming="_ZIHy4CgNEeKUYutVHhLzig" outgoing="_eCR_wCgNEeKUYutVHhLzig _t_YVoCgNEeKUYutVHhLzig">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="nameVar" uuid="_W0x3QigNEeKUYutVHhLzig" bindingType="BOUND">
        <classifier xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        <directAssignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_W0x3QygNEeKUYutVHhLzig" expressionString="classDiagram.name" expressionLanguage="OCL"/>
      </storyPatternObjects>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="check attribute formulas" uuid="_jFGZYCgNEeKUYutVHhLzig" incoming="_t_YVoCgNEeKUYutVHhLzig" outgoing="_vRlkYCgNEeKUYutVHhLzig _0pxKACgNEeKUYutVHhLzig">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="blockDiagram" uuid="_nKBnYSgNEeKUYutVHhLzig" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//BlockDiagram"/>
        <constraints xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_oLiuwCgNEeKUYutVHhLzig" expressionString="blockDiagram.name = nameVar" expressionLanguage="OCL"/>
      </storyPatternObjects>
      <constraints xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_rclowCgNEeKUYutVHhLzig" expressionString="blockDiagram.name = classDiagram.name" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ActivityFinalNode" uuid="_uu344CgNEeKUYutVHhLzig" incoming="_vRlkYCgNEeKUYutVHhLzig">
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_wH2eACgNEeKUYutVHhLzig" expressionString="mote::operationalTGG::ErrorCodeEnum::ATTRIBUTE_FORMULA_VIOLATED" expressionLanguage="OCL"/>
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_wH8koCgNEeKUYutVHhLzig" expressionString="null" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:MergeNode" uuid="_z7OpACgNEeKUYutVHhLzig" incoming="_0pxKACgNEeKUYutVHhLzig _1hLTICgNEeKUYutVHhLzig" outgoing="_4tdB4CgNEeKUYutVHhLzig"/>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="add TGGNodeTag to queue" uuid="_3Zh74CgNEeKUYutVHhLzig" incoming="_4tdB4CgNEeKUYutVHhLzig" outgoing="_GMoj0CgOEeKUYutVHhLzig _KI4W8CgOEeKUYutVHhLzig">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__tggEngine" uuid="_6V-e4CgNEeKUYutVHhLzig" outgoingStoryLinks="_-c54ACgNEeKUYutVHhLzig" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__transformationQueue" uuid="_8PSJ4CgNEeKUYutVHhLzig" outgoingStoryLinks="_EKK80CgOEeKUYutVHhLzig" incomingStoryLinks="_-c54ACgNEeKUYutVHhLzig">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TransformationQueue"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__tggNodeTag" uuid="_AxHWUCgOEeKUYutVHhLzig" modifier="CREATE" outgoingStoryLinks="_EsHzUCgOEeKUYutVHhLzig" incomingStoryLinks="_EKK80CgOEeKUYutVHhLzig">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNodeTag"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="corrAxiom" uuid="_Cvw0UCgOEeKUYutVHhLzig" incomingStoryLinks="_EsHzUCgOEeKUYutVHhLzig">
        <classifier xsi:type="ecore:EClass" href="http://sdl2uml/1.0#//CorrAxiom"/>
      </storyPatternObjects>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_-c54ACgNEeKUYutVHhLzig" source="_6V-e4CgNEeKUYutVHhLzig" target="_8PSJ4CgNEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/forwardTransformationQueue"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_EKK80CgOEeKUYutVHhLzig" modifier="CREATE" source="_8PSJ4CgNEeKUYutVHhLzig" target="_AxHWUCgOEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TransformationQueue/elements"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_EsHzUCgOEeKUYutVHhLzig" modifier="CREATE" source="_AxHWUCgOEeKUYutVHhLzig" target="_Cvw0UCgOEeKUYutVHhLzig">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNodeTag/tggNode"/>
      </storyPatternLinks>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ActivityFinalNode" uuid="_JlTv0CgOEeKUYutVHhLzig" incoming="_KI4W8CgOEeKUYutVHhLzig">
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_K7PA8CgOEeKUYutVHhLzig" expressionString="mote::operationalTGG::ErrorCodeEnum::OK" expressionLanguage="OCL"/>
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_K7VHkCgOEeKUYutVHhLzig" expressionString="classDiagram" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ExpressionActivityNode" name="inform TGG engine about covered links" uuid="_SzVBwCgSEeK2bvcYRz1Q_Q" incoming="_UMdKICgNEeKUYutVHhLzig" outgoing="_WeN_ICgSEeK2bvcYRz1Q_Q">
      <expression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:CallActionExpression" uuid="_p1FxYCp8EeKPBKWczpE9Mg">
        <callActions xsi:type="de.hpi.sam.storyDiagramEcore.callActions:MethodCallAction" uuid="_qhEGkCp8EeKPBKWczpE9Mg" methodClassName="" methodName="">
          <method href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/linkNowCovered"/>
          <instanceVariable xsi:type="de.hpi.sam.storyDiagramEcore.expressions:CallActionExpression" uuid="_wlUIACp8EeKPBKWczpE9Mg">
            <callActions xsi:type="de.hpi.sam.storyDiagramEcore.callActions:VariableReferenceAction" uuid="_xMVEsCp8EeKPBKWczpE9Mg" variableName="__tggEngine">
              <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine"/>
            </callActions>
          </instanceVariable>
        </callActions>
      </expression>
    </nodes>
    <edges uuid="_pUSxcCgLEeKUYutVHhLzig" source="_nk_-ECgLEeKUYutVHhLzig" target="_oUln8CgLEeKUYutVHhLzig"/>
    <edges uuid="_U3Oa4CgMEeKUYutVHhLzig" source="_oUln8CgLEeKUYutVHhLzig" target="_UateACgMEeKUYutVHhLzig" guardType="FAILURE"/>
    <edges uuid="_egQxsCgMEeKUYutVHhLzig" source="_oUln8CgLEeKUYutVHhLzig" target="_cw9-UCgMEeKUYutVHhLzig" guardType="SUCCESS"/>
    <edges uuid="_mT_MsCgMEeKUYutVHhLzig" source="_cw9-UCgMEeKUYutVHhLzig" target="_mCWDECgMEeKUYutVHhLzig" guardType="FAILURE"/>
    <edges uuid="_sF6vECgMEeKUYutVHhLzig" source="_cw9-UCgMEeKUYutVHhLzig" target="_pw9C0CgMEeKUYutVHhLzig" guardType="SUCCESS"/>
    <edges uuid="_SRDNYCgNEeKUYutVHhLzig" source="_pw9C0CgMEeKUYutVHhLzig" target="_mCWDECgMEeKUYutVHhLzig" guardType="FAILURE"/>
    <edges uuid="_UMdKICgNEeKUYutVHhLzig" source="_pw9C0CgMEeKUYutVHhLzig" target="_SzVBwCgSEeK2bvcYRz1Q_Q" guardType="SUCCESS"/>
    <edges uuid="_ZIHy4CgNEeKUYutVHhLzig" source="_TNCUgCgNEeKUYutVHhLzig" target="_VLrygCgNEeKUYutVHhLzig" guardType="BOOLEAN">
      <guardExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_aM4bgCgNEeKUYutVHhLzig" expressionString="__checkAttributeFormulae" expressionLanguage="OCL"/>
    </edges>
    <edges uuid="_eCR_wCgNEeKUYutVHhLzig" source="_VLrygCgNEeKUYutVHhLzig" target="_mCWDECgMEeKUYutVHhLzig" guardType="FAILURE"/>
    <edges uuid="_t_YVoCgNEeKUYutVHhLzig" source="_VLrygCgNEeKUYutVHhLzig" target="_jFGZYCgNEeKUYutVHhLzig" guardType="SUCCESS"/>
    <edges uuid="_vRlkYCgNEeKUYutVHhLzig" source="_jFGZYCgNEeKUYutVHhLzig" target="_uu344CgNEeKUYutVHhLzig" guardType="FAILURE"/>
    <edges uuid="_0pxKACgNEeKUYutVHhLzig" source="_jFGZYCgNEeKUYutVHhLzig" target="_z7OpACgNEeKUYutVHhLzig" guardType="SUCCESS"/>
    <edges uuid="_1hLTICgNEeKUYutVHhLzig" source="_TNCUgCgNEeKUYutVHhLzig" target="_z7OpACgNEeKUYutVHhLzig" guardType="ELSE"/>
    <edges uuid="_4tdB4CgNEeKUYutVHhLzig" source="_z7OpACgNEeKUYutVHhLzig" target="_3Zh74CgNEeKUYutVHhLzig"/>
    <edges uuid="_GMoj0CgOEeKUYutVHhLzig" source="_3Zh74CgNEeKUYutVHhLzig" target="_mCWDECgMEeKUYutVHhLzig" guardType="FAILURE"/>
    <edges uuid="_KI4W8CgOEeKUYutVHhLzig" source="_3Zh74CgNEeKUYutVHhLzig" target="_JlTv0CgOEeKUYutVHhLzig" guardType="SUCCESS"/>
    <edges uuid="_WeN_ICgSEeK2bvcYRz1Q_Q" source="_SzVBwCgSEeK2bvcYRz1Q_Q" target="_TNCUgCgNEeKUYutVHhLzig"/>
    <parameters name="__thisRule" uuid="_qo4l0CgLEeKUYutVHhLzig">
      <type xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalAxiom"/>
    </parameters>
    <parameters name="__errorCode" uuid="_0-u_UCgLEeKUYutVHhLzig" direction="OUT">
      <type xsi:type="ecore:EEnum" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/ErrorCodeEnum"/>
    </parameters>
    <parameters name="__checkAttributeFormulae" uuid="_2j0t0CgLEeKUYutVHhLzig">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EBoolean"/>
    </parameters>
    <parameters name="blockDiagram" uuid="_4Uc98CgLEeKUYutVHhLzig">
      <type xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//BlockDiagram"/>
    </parameters>
    <parameters name="classDiagram" uuid="_5ZTtMCgLEeKUYutVHhLzig" direction="OUT">
      <type xsi:type="ecore:EClass" href="http:///de/hpi/sam/classDiagram.ecore#//UMLClassDiagram"/>
    </parameters>
  </activities>
</de.hpi.sam.storyDiagramEcore:ActivityDiagram>
