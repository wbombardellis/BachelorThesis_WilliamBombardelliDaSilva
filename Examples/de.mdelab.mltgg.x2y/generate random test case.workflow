<?xml version="1.0" encoding="UTF-8"?>
<workflow:Workflow xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:mltgg.testingTestCaseGenerator="http://www.mdelab.de/mltgg/testing/testCaseGenerator/1.0" xmlns:workflow="http://mdelab/workflow/1.0" xmlns:workflow.components="http://mdelab/workflow/components/1.0" xmi:id="_K6_20D-8EeKcdevfdpY3iA" name="generate random test case">
  <properties xmi:id="_-UvrgD-8EeKc0Kfc-Cd_Pw" name="numberOfTestCases" defaultValue="1">
    <type href="http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
  </properties>
  <properties xmi:id="__1xZYD-8EeKc0Kfc-Cd_Pw" name="testCaseSize" defaultValue="10">
    <type href="http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
  </properties>
  <properties xmi:id="_mePHsEgzEeKC4YepvrDzdg" name="outputDir" defaultValue="./randomtestcases">
    <type href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
  </properties>
  <properties xmi:id="_rxb5oVW7EeKhwa6ZGeKPuA" name="direction" defaultValue="forward">
    <type href="http://www.mdelab.de/mltgg/mote2/1.0#//TransformationDirectionEnum"/>
  </properties>
  <properties xmi:id="_z3BgsFW7EeKhwa6ZGeKPuA" name="outputModels" defaultValue="true">
    <type href="http://www.eclipse.org/emf/2002/Ecore#//EBoolean"/>
  </properties>
  <properties xmi:id="_Ht528HQ5EeKh3MQeDMCSXw" name="generateOnlyValidModels" defaultValue="false">
    <type href="http://www.eclipse.org/emf/2002/Ecore#//EBoolean"/>
  </properties>
  <!-- <properties xmi:id="_rxb5oVW7EeKhwa6ZGeKPuB" name="testCaseDescriptionTemplateOperations">
    <type href="http://www.mdelab.de/mltgg/testing/testCaseDescription/1.0#//TestCaseOperation"/>
    http://www.mdelab.de/mltgg/testing/testCaseDescription#//TestCaseOperation
  </properties> -->
  
  <components xsi:type="workflow.components:DirectoryCleaner" xmi:id="_kEBIAEgzEeKC4YepvrDzdg" name="directoryCleaner">
    <directoryURIs>${outputDir}</directoryURIs>
  </components>
  <components xsi:type="workflow.components:ModelReader" xmi:id="_PyACAD-8EeKcdevfdpY3iA" name="load test annotations" modelSlot="testAnnotations" modelURI="testCase.testannotations"/>
  <components xsi:type="workflow.components:ModelValidator" xmi:id="_peMogD--EeKWwZCKE46egQ" name="validate test annotations" modelSlot="testAnnotations"/>
  <components xsi:type="mltgg.testingTestCaseGenerator:TestCaseGenerator" xmi:id="_XY9MUD-8EeKcdevfdpY3iA" name="generate random test case" testAnnotationsSlot="testAnnotations" outputFolderURI="${outputDir}" outputTestModelsInTestCase="${outputModels}">
    <testCaseDescriptionGenerator xsi:type="mltgg.testingTestCaseGenerator:RandomTestCaseDescriptionGenerator" xmi:id="_Mr-5gEhSEeKdCtK-NoqIRg" numberOfTestCases="${numberOfTestCases}" generateOnlyValidModels="${generateOnlyValidModels}" />
    <testedComponentGenerator xsi:type="mltgg.testingTestCaseGenerator:Mote2TestedComponentGenerator" xmi:id="_3GEPkFW7EeKhwa6ZGeKPuA" transformationDirection="forward" outputTransformationResult="true"/>
  </components>
</workflow:Workflow>
