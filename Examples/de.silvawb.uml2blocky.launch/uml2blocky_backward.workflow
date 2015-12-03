<?xml version="1.0" encoding="UTF-8"?>
<workflow:Workflow xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:mltgg.mote2.workflowComponent="http://www.mdelab.de/mltgg/mote2/workflowComponent/1.0" xmlns:workflow="http://mdelab/workflow/1.0" xmlns:workflow.components="http://mdelab/workflow/components/1.0" xmi:id="_DjQ1ED-MEeK2N-U9UdKF1Q" name="test x2y Transformation" description="Execute the example x to y model transformation. Note that plugin de.mdelab.mltgg.x2y must be installed in the Eclipse platform">
  <components xsi:type="workflow.components:ModelReader" xmi:id="_4By6YCsIEeWY-_V6HajtuA" name="modelReader" modelSlot="input" modelURI="platform:/resource/de.silvawb.uml2blocky.launch/My.blocky" newResourceURI=""/>
  <components xsi:type="mltgg.mote2.workflowComponent:Mote2Transformer" xmi:id="_SLnLoCr4EeWYyrAQ01CZ7A" name="mote2Transformer" description="" tggID="de.silvawb.uml2blocky" direction="backward" tggEngineSlot="" debugOutput="true" sdmCoverageReportSlot="">
    <leftModelSlots>output</leftModelSlots>
    <rightModelSlots>input</rightModelSlots>
  </components>
  <components xsi:type="workflow.components:ModelWriter" xmi:id="_5y4WICsLEeWY-_V6HajtuA" name="modelWriter" modelSlot="output" modelURI="platform:/resource/de.silvawb.uml2blocky.launch/My02.uml"/>
</workflow:Workflow>
