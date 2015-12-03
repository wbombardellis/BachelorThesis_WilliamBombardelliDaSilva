<?xml version="1.0" encoding="UTF-8"?>
<de.hpi.sam.storyDiagramEcore:ActivityDiagram xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:de.hpi.sam.storyDiagramEcore="http://de/hpi/sam/storyDiagramEcore.ecore" xmlns:de.hpi.sam.storyDiagramEcore.expressions="http://de/hpi/sam/storyDiagramEcore/expressions.ecore" xmlns:de.hpi.sam.storyDiagramEcore.nodes="http://de/hpi/sam/storyDiagramEcore/nodes.ecore" xmlns:de.hpi.sam.storyDiagramEcore.sdm="http://de/hpi/sam/storyDiagramEcore/sdm.ecore" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" uuid="_rRidECgSEeK2bvcYRz1Q_Q">
  <activities name="SDL2UMLSystemBlock_R1_transform_forward" uuid="_rRidESgSEeK2bvcYRz1Q_Q">
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:InitialNode" uuid="_ru6VkCgSEeK2bvcYRz1Q_Q" outgoing="_ugGq0CgSEeK2bvcYRz1Q_Q"/>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="match LHS" uuid="_sMwvMCgSEeK2bvcYRz1Q_Q" incoming="_ugGq0CgSEeK2bvcYRz1Q_Q _Rc9ScCgXEeKHbt73pUDu1w _ISxZUDCzEeKmprO7C9JKzQ" outgoing="_17gagCgUEeKHbt73pUDu1w _S-CqsCgXEeKHbt73pUDu1w" forEach="true">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="blockDiagram" uuid="_u_Yn0CgSEeK2bvcYRz1Q_Q" outgoingStoryLinks="_-PHhYCgSEeK2bvcYRz1Q_Q" incomingStoryLinks="_7RPbACgSEeK2bvcYRz1Q_Q">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//BlockDiagram"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="classDiagram" uuid="_yLwdMCgSEeK2bvcYRz1Q_Q" incomingStoryLinks="_8Ly-wCgSEeK2bvcYRz1Q_Q">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/classDiagram.ecore#//UMLClassDiagram"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="corrAxiom" uuid="_1XA4QCgSEeK2bvcYRz1Q_Q" outgoingStoryLinks="_7RPbACgSEeK2bvcYRz1Q_Q _8Ly-wCgSEeK2bvcYRz1Q_Q" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://sdl2uml/1.0#//CorrAxiom"/>
        <directAssignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_5NokgCgSEeK2bvcYRz1Q_Q" expressionString="__inputTggNode" expressionLanguage="OCL"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="system" uuid="_8-PvYCgSEeK2bvcYRz1Q_Q" incomingStoryLinks="_-PHhYCgSEeK2bvcYRz1Q_Q _KTOMcCgTEeK2bvcYRz1Q_Q">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//SystemBlock"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__thisRule" uuid="__qxAACgSEeK2bvcYRz1Q_Q" incomingStoryLinks="_EIrVwCgTEeK2bvcYRz1Q_Q" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalRule"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__ruleGroup" uuid="_CLXUgCgTEeK2bvcYRz1Q_Q" outgoingStoryLinks="_EIrVwCgTEeK2bvcYRz1Q_Q" incomingStoryLinks="_GmCwECgTEeK2bvcYRz1Q_Q">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalRuleGroup"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__opTgg" uuid="_EoihkCgTEeK2bvcYRz1Q_Q" outgoingStoryLinks="_GmCwECgTEeK2bvcYRz1Q_Q" incomingStoryLinks="_IqIHsCgTEeK2bvcYRz1Q_Q">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalTGG"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__tggEngine" uuid="_HNbgMCgTEeK2bvcYRz1Q_Q" outgoingStoryLinks="_IqIHsCgTEeK2bvcYRz1Q_Q _KTOMcCgTEeK2bvcYRz1Q_Q">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine"/>
      </storyPatternObjects>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_7RPbACgSEeK2bvcYRz1Q_Q" source="_1XA4QCgSEeK2bvcYRz1Q_Q" target="_u_Yn0CgSEeK2bvcYRz1Q_Q">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNode/leftNodes"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_8Ly-wCgSEeK2bvcYRz1Q_Q" source="_1XA4QCgSEeK2bvcYRz1Q_Q" target="_yLwdMCgSEeK2bvcYRz1Q_Q">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNode/rightNodes"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_-PHhYCgSEeK2bvcYRz1Q_Q" source="_u_Yn0CgSEeK2bvcYRz1Q_Q" target="_8-PvYCgSEeK2bvcYRz1Q_Q">
        <eStructuralFeature xsi:type="ecore:EReference" href="http:///de/hpi/sam/blockDiagram.ecore#//BlockDiagram/modelElements"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_EIrVwCgTEeK2bvcYRz1Q_Q" source="_CLXUgCgTEeK2bvcYRz1Q_Q" target="__qxAACgSEeK2bvcYRz1Q_Q">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalRuleGroup/rules"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_GmCwECgTEeK2bvcYRz1Q_Q" source="_EoihkCgTEeK2bvcYRz1Q_Q" target="_CLXUgCgTEeK2bvcYRz1Q_Q">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalTGG/operationalRuleGroups"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_IqIHsCgTEeK2bvcYRz1Q_Q" source="_HNbgMCgTEeK2bvcYRz1Q_Q" target="_EoihkCgTEeK2bvcYRz1Q_Q">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/operationalTGG"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_KTOMcCgTEeK2bvcYRz1Q_Q" source="_HNbgMCgTEeK2bvcYRz1Q_Q" target="_8-PvYCgSEeK2bvcYRz1Q_Q">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/uncoveredLeftElements"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <constraints xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_OGgQ0CgTEeK2bvcYRz1Q_Q" expressionString="not __tggEngine.isLinkCovered(blockDiagram, system, 'modelElements')" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="evaluate rule variables" uuid="_03gm4CgUEeKHbt73pUDu1w" incoming="_17gagCgUEeKHbt73pUDu1w" outgoing="_8JN58CgUEeKHbt73pUDu1w __rtwUCgUEeKHbt73pUDu1w">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="nameVar" uuid="_27ssMCgUEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        <directAssignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_5UfvkCgUEeKHbt73pUDu1w" expressionString="system.name" expressionLanguage="OCL"/>
      </storyPatternObjects>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ActivityFinalNode" uuid="_7TbhcCgUEeKHbt73pUDu1w" incoming="_8JN58CgUEeKHbt73pUDu1w _x1BQ0CgVEeKHbt73pUDu1w _wc81MCgWEeKHbt73pUDu1w _MUUksCgXEeKHbt73pUDu1w">
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_g4ZFsCgXEeKHbt73pUDu1w" expressionString="mote::operationalTGG::ErrorCodeEnum::INTERNAL_ERROR" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="transform elements" uuid="_92UU8CgUEeKHbt73pUDu1w" incoming="_G6y5wDCzEeKmprO7C9JKzQ" outgoing="_w1aN8CgVEeKHbt73pUDu1w _x1BQ0CgVEeKHbt73pUDu1w">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="system" uuid="_AykqsCgVEeKHbt73pUDu1w" incomingStoryLinks="_V2l3ECgVEeKHbt73pUDu1w _bfFJkCgVEeKHbt73pUDu1w _fCb7kCgVEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//SystemBlock"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="blockDiagram" uuid="_AykqsSgVEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//BlockDiagram"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="corrAxiom" uuid="_AykqsigVEeKHbt73pUDu1w" outgoingStoryLinks="_WzPskCgVEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://sdl2uml/1.0#//CorrAxiom"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="classDiagram" uuid="_AykqtCgVEeKHbt73pUDu1w" outgoingStoryLinks="_QstzMCgVEeKHbt73pUDu1w _SomRECgVEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/classDiagram.ecore#//UMLClassDiagram"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__tggEngine" uuid="_DkuCMigVEeKHbt73pUDu1w" outgoingStoryLinks="_aDJXECgVEeKHbt73pUDu1w _bfFJkCgVEeKHbt73pUDu1w _fCb7kCgVEeKHbt73pUDu1w _o5YykCgVEeKHbt73pUDu1w _rF9X0CgVEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__thisRule" uuid="_DkuCMygVEeKHbt73pUDu1w" outgoingStoryLinks="_Yb3QMCgVEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalRule"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="corrSystem" uuid="_F1Ap0CgVEeKHbt73pUDu1w" modifier="CREATE" outgoingStoryLinks="_UBAOcCgVEeKHbt73pUDu1w _U7p40CgVEeKHbt73pUDu1w _V2l3ECgVEeKHbt73pUDu1w" incomingStoryLinks="_WzPskCgVEeKHbt73pUDu1w _Yb3QMCgVEeKHbt73pUDu1w _aDJXECgVEeKHbt73pUDu1w">
        <classifier xsi:type="ecore:EClass" href="http://sdl2uml/1.0#//CorrSystem"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="clazz" uuid="_HwOZUCgVEeKHbt73pUDu1w" modifier="CREATE" outgoingStoryLinks="_TaF_cCgVEeKHbt73pUDu1w" incomingStoryLinks="_QstzMCgVEeKHbt73pUDu1w _UBAOcCgVEeKHbt73pUDu1w _o5YykCgVEeKHbt73pUDu1w">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/classDiagram.ecore#//UMLClass"/>
        <attributeAssignments uuid="_L4TB8CgVEeKHbt73pUDu1w">
          <eStructuralFeature xsi:type="ecore:EAttribute" href="http:///de/hpi/sam/classDiagram.ecore#//UMLElement/name"/>
          <assignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_NAZScCgVEeKHbt73pUDu1w" expressionString="nameVar" expressionLanguage="OCL"/>
        </attributeAssignments>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="stereotype" uuid="_J7jocCgVEeKHbt73pUDu1w" modifier="CREATE" incomingStoryLinks="_SomRECgVEeKHbt73pUDu1w _TaF_cCgVEeKHbt73pUDu1w _U7p40CgVEeKHbt73pUDu1w _rF9X0CgVEeKHbt73pUDu1w">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/classDiagram.ecore#//UMLStereotype"/>
        <attributeAssignments uuid="_OKr7UCgVEeKHbt73pUDu1w">
          <eStructuralFeature xsi:type="ecore:EAttribute" href="http:///de/hpi/sam/classDiagram.ecore#//UMLStereotype/text"/>
          <assignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_PPEJcCgVEeKHbt73pUDu1w" expressionString="'system'" expressionLanguage="OCL"/>
        </attributeAssignments>
        <attributeAssignments uuid="_uPZhACjxEeKa8bi0E3LSuQ">
          <eStructuralFeature xsi:type="ecore:EAttribute" href="http:///de/hpi/sam/classDiagram.ecore#//UMLElement/name"/>
          <assignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_vgxpUCjxEeKa8bi0E3LSuQ" expressionString="nameVar.concat('_stereotype')" expressionLanguage="OCL"/>
        </attributeAssignments>
      </storyPatternObjects>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_QstzMCgVEeKHbt73pUDu1w" modifier="CREATE" source="_AykqtCgVEeKHbt73pUDu1w" target="_HwOZUCgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http:///de/hpi/sam/classDiagram.ecore#//UMLClassDiagram/elements"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_SomRECgVEeKHbt73pUDu1w" modifier="CREATE" source="_AykqtCgVEeKHbt73pUDu1w" target="_J7jocCgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http:///de/hpi/sam/classDiagram.ecore#//UMLClassDiagram/elements"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_TaF_cCgVEeKHbt73pUDu1w" modifier="CREATE" source="_HwOZUCgVEeKHbt73pUDu1w" target="_J7jocCgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http:///de/hpi/sam/classDiagram.ecore#//UMLIncrement/stereotypes"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_UBAOcCgVEeKHbt73pUDu1w" modifier="CREATE" source="_F1Ap0CgVEeKHbt73pUDu1w" target="_HwOZUCgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNode/rightNodes"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_U7p40CgVEeKHbt73pUDu1w" modifier="CREATE" source="_F1Ap0CgVEeKHbt73pUDu1w" target="_J7jocCgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNode/rightNodes"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_V2l3ECgVEeKHbt73pUDu1w" modifier="CREATE" source="_F1Ap0CgVEeKHbt73pUDu1w" target="_AykqsCgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNode/leftNodes"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_WzPskCgVEeKHbt73pUDu1w" modifier="CREATE" source="_AykqsigVEeKHbt73pUDu1w" target="_F1Ap0CgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNode/next"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_Yb3QMCgVEeKHbt73pUDu1w" modifier="CREATE" source="_DkuCMygVEeKHbt73pUDu1w" target="_F1Ap0CgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalMapping/createdTGGNodes"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_aDJXECgVEeKHbt73pUDu1w" modifier="CREATE" source="_DkuCMigVEeKHbt73pUDu1w" target="_F1Ap0CgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/tggNodes"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_bfFJkCgVEeKHbt73pUDu1w" modifier="DESTROY" source="_DkuCMigVEeKHbt73pUDu1w" target="_AykqsCgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/uncoveredLeftElements"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_fCb7kCgVEeKHbt73pUDu1w" modifier="CREATE" source="_DkuCMigVEeKHbt73pUDu1w" target="_AykqsCgVEeKHbt73pUDu1w" valueTarget="_F1Ap0CgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/coveredLeftElements"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_o5YykCgVEeKHbt73pUDu1w" modifier="CREATE" source="_DkuCMigVEeKHbt73pUDu1w" target="_HwOZUCgVEeKHbt73pUDu1w" valueTarget="_F1Ap0CgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/coveredRightElements"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:MapEntryStoryPatternLink" uuid="_rF9X0CgVEeKHbt73pUDu1w" modifier="CREATE" source="_DkuCMigVEeKHbt73pUDu1w" target="_J7jocCgVEeKHbt73pUDu1w" valueTarget="_F1Ap0CgVEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/coveredRightElements"/>
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//helpers/MapEntry"/>
      </storyPatternLinks>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ExpressionActivityNode" name="inform TGG engine about covered links" uuid="_uivAsCgVEeKHbt73pUDu1w" incoming="_w1aN8CgVEeKHbt73pUDu1w" outgoing="_EAm3gCgWEeKHbt73pUDu1w">
      <expression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_zMR-sCgVEeKHbt73pUDu1w" expressionString="__tggEngine.linkNowCovered(blockDiagram, system, 'modelElements') = null and&#xD;&#xA;__tggEngine.linkNowCovered(classDiagram, clazz, 'elements') = null and&#xD;&#xA;__tggEngine.linkNowCovered(classDiagram, stereotype, 'elements') = null and&#xD;&#xA;__tggEngine.linkNowCovered(clazz, stereotype, 'stereotypes') = null" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:DecisionNode" uuid="_DUQu4CgWEeKHbt73pUDu1w" incoming="_EAm3gCgWEeKHbt73pUDu1w" outgoing="_Fov6ACgWEeKHbt73pUDu1w _RK5HgCgWEeKHbt73pUDu1w"/>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:MergeNode" uuid="_E3WSQCgWEeKHbt73pUDu1w" incoming="_Fov6ACgWEeKHbt73pUDu1w _9PTGUCgWEeKHbt73pUDu1w" outgoing="_AxaiMCgXEeKHbt73pUDu1w"/>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="evaluate rule variables (opposite direction)" uuid="_GraQ4CgWEeKHbt73pUDu1w" incoming="_RK5HgCgWEeKHbt73pUDu1w" outgoing="_wc81MCgWEeKHbt73pUDu1w _46ELcCgWEeKHbt73pUDu1w">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="nameVar" uuid="_K1xYgCgWEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
        <directAssignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_MVVGwCgWEeKHbt73pUDu1w" expressionString="clazz.name" expressionLanguage="OCL"/>
      </storyPatternObjects>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="check attribute formulas" uuid="_yDkNsCgWEeKHbt73pUDu1w" incoming="_46ELcCgWEeKHbt73pUDu1w" outgoing="_7hh88CgWEeKHbt73pUDu1w _9PTGUCgWEeKHbt73pUDu1w">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="system" uuid="_zReyUCgWEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//SystemBlock"/>
        <constraints xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_10p5sCgWEeKHbt73pUDu1w" expressionString="self.name = nameVar" expressionLanguage="OCL"/>
      </storyPatternObjects>
      <constraints xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_3jwf0CgWEeKHbt73pUDu1w" expressionString="system.name = clazz.name" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ActivityFinalNode" uuid="_7JsEsCgWEeKHbt73pUDu1w" incoming="_7hh88CgWEeKHbt73pUDu1w">
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_jcO7cCgXEeKHbt73pUDu1w" expressionString="mote::operationalTGG::ErrorCodeEnum::ATTRIBUTE_FORMULA_VIOLATED" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="add TGG node tag to queue" uuid="_-p5cECgWEeKHbt73pUDu1w" incoming="_AxaiMCgXEeKHbt73pUDu1w" outgoing="_MUUksCgXEeKHbt73pUDu1w _Rc9ScCgXEeKHbt73pUDu1w">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__tggEngine" uuid="_BmJx0CgXEeKHbt73pUDu1w" outgoingStoryLinks="_FBsEkCgXEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__queue" uuid="_DXQjECgXEeKHbt73pUDu1w" outgoingStoryLinks="_IWQzsCgXEeKHbt73pUDu1w" incomingStoryLinks="_FBsEkCgXEeKHbt73pUDu1w">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TransformationQueue"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="__tag" uuid="_Gu-s0CgXEeKHbt73pUDu1w" modifier="CREATE" outgoingStoryLinks="_KsRo0CgXEeKHbt73pUDu1w" incomingStoryLinks="_IWQzsCgXEeKHbt73pUDu1w">
        <classifier xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNodeTag"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="corrSystem" uuid="_I6N1UCgXEeKHbt73pUDu1w" incomingStoryLinks="_KsRo0CgXEeKHbt73pUDu1w" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http://sdl2uml/1.0#//CorrSystem"/>
      </storyPatternObjects>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_FBsEkCgXEeKHbt73pUDu1w" source="_BmJx0CgXEeKHbt73pUDu1w" target="_DXQjECgXEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGEngine/forwardTransformationQueue"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_IWQzsCgXEeKHbt73pUDu1w" modifier="CREATE" source="_DXQjECgXEeKHbt73pUDu1w" target="_Gu-s0CgXEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TransformationQueue/elements"/>
      </storyPatternLinks>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" uuid="_KsRo0CgXEeKHbt73pUDu1w" modifier="CREATE" source="_Gu-s0CgXEeKHbt73pUDu1w" target="_I6N1UCgXEeKHbt73pUDu1w">
        <eStructuralFeature xsi:type="ecore:EReference" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNodeTag/tggNode"/>
      </storyPatternLinks>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ActivityFinalNode" uuid="_Ske7MCgXEeKHbt73pUDu1w" incoming="_S-CqsCgXEeKHbt73pUDu1w">
      <outParameterValues xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_efIvUCgXEeKHbt73pUDu1w" expressionString="mote::operationalTGG::ErrorCodeEnum::OK" expressionLanguage="OCL"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="check LHS attribute values" uuid="__5lg0DCyEeKmprO7C9JKzQ" incoming="__rtwUCgUEeKHbt73pUDu1w" outgoing="_G6y5wDCzEeKmprO7C9JKzQ _ISxZUDCzEeKmprO7C9JKzQ">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="system" uuid="_DXOsYDCzEeKmprO7C9JKzQ" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="http:///de/hpi/sam/blockDiagram.ecore#//SystemBlock"/>
        <constraints xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_ErUKcDCzEeKmprO7C9JKzQ" expressionString="system.name = nameVar" expressionLanguage="OCL"/>
      </storyPatternObjects>
    </nodes>
    <edges uuid="_ugGq0CgSEeK2bvcYRz1Q_Q" source="_ru6VkCgSEeK2bvcYRz1Q_Q" target="_sMwvMCgSEeK2bvcYRz1Q_Q"/>
    <edges uuid="_17gagCgUEeKHbt73pUDu1w" source="_sMwvMCgSEeK2bvcYRz1Q_Q" target="_03gm4CgUEeKHbt73pUDu1w" guardType="FOR_EACH"/>
    <edges uuid="_8JN58CgUEeKHbt73pUDu1w" source="_03gm4CgUEeKHbt73pUDu1w" target="_7TbhcCgUEeKHbt73pUDu1w" guardType="FAILURE"/>
    <edges uuid="__rtwUCgUEeKHbt73pUDu1w" source="_03gm4CgUEeKHbt73pUDu1w" target="__5lg0DCyEeKmprO7C9JKzQ" guardType="SUCCESS"/>
    <edges uuid="_w1aN8CgVEeKHbt73pUDu1w" source="_92UU8CgUEeKHbt73pUDu1w" target="_uivAsCgVEeKHbt73pUDu1w" guardType="SUCCESS"/>
    <edges uuid="_x1BQ0CgVEeKHbt73pUDu1w" source="_92UU8CgUEeKHbt73pUDu1w" target="_7TbhcCgUEeKHbt73pUDu1w" guardType="FAILURE"/>
    <edges uuid="_EAm3gCgWEeKHbt73pUDu1w" source="_uivAsCgVEeKHbt73pUDu1w" target="_DUQu4CgWEeKHbt73pUDu1w"/>
    <edges uuid="_Fov6ACgWEeKHbt73pUDu1w" source="_DUQu4CgWEeKHbt73pUDu1w" target="_E3WSQCgWEeKHbt73pUDu1w" guardType="ELSE"/>
    <edges uuid="_RK5HgCgWEeKHbt73pUDu1w" source="_DUQu4CgWEeKHbt73pUDu1w" target="_GraQ4CgWEeKHbt73pUDu1w" guardType="BOOLEAN">
      <guardExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" uuid="_SBiboCgWEeKHbt73pUDu1w" expressionString="__checkAttributeFormulae" expressionLanguage="OCL"/>
    </edges>
    <edges uuid="_wc81MCgWEeKHbt73pUDu1w" source="_GraQ4CgWEeKHbt73pUDu1w" target="_7TbhcCgUEeKHbt73pUDu1w" guardType="FAILURE"/>
    <edges uuid="_46ELcCgWEeKHbt73pUDu1w" source="_GraQ4CgWEeKHbt73pUDu1w" target="_yDkNsCgWEeKHbt73pUDu1w" guardType="SUCCESS"/>
    <edges uuid="_7hh88CgWEeKHbt73pUDu1w" source="_yDkNsCgWEeKHbt73pUDu1w" target="_7JsEsCgWEeKHbt73pUDu1w" guardType="FAILURE"/>
    <edges uuid="_9PTGUCgWEeKHbt73pUDu1w" source="_yDkNsCgWEeKHbt73pUDu1w" target="_E3WSQCgWEeKHbt73pUDu1w" guardType="SUCCESS"/>
    <edges uuid="_AxaiMCgXEeKHbt73pUDu1w" source="_E3WSQCgWEeKHbt73pUDu1w" target="_-p5cECgWEeKHbt73pUDu1w"/>
    <edges uuid="_MUUksCgXEeKHbt73pUDu1w" source="_-p5cECgWEeKHbt73pUDu1w" target="_7TbhcCgUEeKHbt73pUDu1w" guardType="FAILURE"/>
    <edges uuid="_Rc9ScCgXEeKHbt73pUDu1w" source="_-p5cECgWEeKHbt73pUDu1w" target="_sMwvMCgSEeK2bvcYRz1Q_Q" guardType="SUCCESS"/>
    <edges uuid="_S-CqsCgXEeKHbt73pUDu1w" source="_sMwvMCgSEeK2bvcYRz1Q_Q" target="_Ske7MCgXEeKHbt73pUDu1w" guardType="END"/>
    <edges uuid="_G6y5wDCzEeKmprO7C9JKzQ" source="__5lg0DCyEeKmprO7C9JKzQ" target="_92UU8CgUEeKHbt73pUDu1w" guardType="SUCCESS"/>
    <edges uuid="_ISxZUDCzEeKmprO7C9JKzQ" source="__5lg0DCyEeKmprO7C9JKzQ" target="_sMwvMCgSEeK2bvcYRz1Q_Q" guardType="FAILURE"/>
    <parameters name="__thisRule" uuid="_UrhgMCgXEeKHbt73pUDu1w">
      <type xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/OperationalRule"/>
    </parameters>
    <parameters name="__errorCode" uuid="_WImiMCgXEeKHbt73pUDu1w" direction="OUT">
      <type xsi:type="ecore:EEnum" href="http://www.mdelab.de/mltgg/mote/1.0#//operationalTGG/ErrorCodeEnum"/>
    </parameters>
    <parameters name="__inputTggNode" uuid="_Xj9s8CgXEeKHbt73pUDu1w">
      <type xsi:type="ecore:EClass" href="http://www.mdelab.de/mltgg/mote/1.0#//TGGNode"/>
    </parameters>
    <parameters name="__checkAttributeFormulae" uuid="_aeN3kCgXEeKHbt73pUDu1w">
      <type xsi:type="ecore:EDataType" href="http://www.eclipse.org/emf/2002/Ecore#//EBoolean"/>
    </parameters>
  </activities>
</de.hpi.sam.storyDiagramEcore:ActivityDiagram>
