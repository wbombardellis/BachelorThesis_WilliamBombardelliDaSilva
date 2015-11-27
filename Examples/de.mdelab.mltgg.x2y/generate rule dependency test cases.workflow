<?xml version="1.0" encoding="UTF-8"?>
<workflow:Workflow xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:mltgg.testingTestCaseGenerator="http://www.mdelab.de/mltgg/testing/testCaseGenerator/1.0" xmlns:workflow="http://mdelab/workflow/1.0" xmlns:workflow.components="http://mdelab/workflow/components/1.0" xmi:id="_K6_20D-8EeKcdevfdpY3iA" name="generate random test case">
  <components xsi:type="workflow.components:DirectoryCleaner" xmi:id="_usrv0EgzEeKC4YepvrDzdg" name="directoryCleaner">
    <directoryURIs>${outputDir}</directoryURIs>
  </components>
  <components xsi:type="workflow.components:ModelReader" xmi:id="_PyACAD-8EeKcdevfdpY3iA" name="load test annotations" modelSlot="testAnnotations" modelURI="testCase.testannotations"/>
  <components xsi:type="workflow.components:ModelValidator" xmi:id="_peMogD--EeKWwZCKE46egQ" name="validate test annotations" modelSlot="testAnnotations"/>
  <components xsi:type="mltgg.testingTestCaseGenerator:TestCaseGenerator" xmi:id="_XY9MUD-8EeKcdevfdpY3iA" name="generate rule dependency test cases" testAnnotationsSlot="testAnnotations" outputFolderURI="${outputDir}" outputTestModelsInTestCase="${outputModels}">
    <testCaseDescriptionGenerator xsi:type="mltgg.testingTestCaseGenerator:RuleDependencyBasedTestCaseDescriptionGenerator" xmi:id="_DhzB4EhSEeKdCtK-NoqIRg" minimizeTestCases="${minimizeTestCases}"/>
    <testedComponentGenerator xsi:type="mltgg.testingTestCaseGenerator:Mote2TestedComponentGenerator" xmi:id="_D-5NkEhSEeKdCtK-NoqIRg" transformationDirection="forward" outputTransformationResult="true"/>
  </components>
  <properties xmi:id="_sTbZcEgzEeKC4YepvrDzdg" name="outputDir" defaultValue="rule dependency test cases">
    <type href="http://www.eclipse.org/emf/2002/Ecore#//EString"/>
  </properties>
  <properties xmi:id="_844iwFW7EeKhwa6ZGeKPuA" name="direction" defaultValue="forward">
    <type href="http://www.mdelab.de/mltgg/mote2/1.0#//TransformationDirectionEnum"/>
  </properties>
  <properties xmi:id="_Ax40oFW8EeKhwa6ZGeKPuA" name="outputModels" defaultValue="true">
    <type href="http://www.eclipse.org/emf/2002/Ecore#//EBoolean"/>
  </properties>
  <properties xmi:id="_R8CGkHQzEeKPprrawAWTXg" name="minimizeTestCases" defaultValue="false">
    <type href="http://www.eclipse.org/emf/2002/Ecore#//EBoolean"/>
  </properties>
</workflow:Workflow>
