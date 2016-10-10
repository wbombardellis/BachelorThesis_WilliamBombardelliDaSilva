====================================================================
========================= BACHELOR THESIS ==========================
TECHNISCHE UNIVERSITÄT BERLIN
FAKULTÄT IV ELEKTROTECHNIK UND INFORMATIK
BACHELORSTUDIENGANG INFORMATIK
-------------------------------------------------------------------

Towards Synchronizing Relations Between
Artifacts in the Java Technological Space 

-------------------------------------------------------------------
Author:     William Bombardelli da Silva
Advisor:    Prof. Dr. Frank Trollmann
Reviewer:   Prof. Dr. Dr. h.c. Sahin Albayrak
Reviewer:   Prof. Dr. habil. Odej Kao
-------------------------------------------------------------------
This work is licensed under the Creative Commons 
Attribution-NonCommercial-ShareAlike 3.0 Unported License.
To view a copy of this license, visit 
http://creativecommons.org/licenses/by-nc-sa/3.0/ or send a letter
to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
====================================================================

############################# I. FILES ############################# 
Below are the description of the most important files of this thesis.

o   ./Metamodels/de.silvawb.java
        Folder containing the Java metamodel definitions, developed in this thesis, in EMF ECore and the respective Eclipse plug-in with such definition.

o   ./Metamodels/de.silvawb.java.edit
        Folder containing the Eclipse plug-in for creating Java models conform to the Java metamodel of ./Metamodels/de.silvawb.java

o   ./Metamodels/de.silvawb.java.editor
        Folder containing the front-end of the Eclipse plug-in for creating Java models of ./Metamodels/de.silvawb.java.edit

o   ./Metamodels/de.silvawb.uml
        Folder containing the UML metamodel definitions in EMF ECore. The Eclipse plug-in used for this metamodel is however the built-in plug-in given by Eclipse.

o   ./Metamodels/de.silvawb.java.edit_1.0.0.201602061423.jar
o   ./Metamodels/de.silvawb.java.editor_1.0.0.201602061423.jar
o   ./Metamodels/de.silvawb.java_0.1.0.201602061422.jar
        The three jar files for the Eclipse plug-in regarding the Java metamodel developed in this thesis. These three files should be transfered to the plug-ins folder of your Eclipse installation (see II. SETUP)
    
o   ./Transformations/de.silvawb.uml2java/model
        Folder containing the relation definitions between the UMLClassDiagram metamodel and the Java metamodel using the MoTE Plug-in (file uml2java.mltgg) and the respective diagrams (files *.mltgg_diagram).

o   ./Transformations/de.silvawb.uml2java.launch
        Folder containing the scripts used to execute the transformation umlClassDiagram2java (in ./Transformations/de.silvawb.uml2java) (see III. EXECUTING A TRANSFORMATION).
    
o   ./Transformations/de.silvawb.umlContract2java/model
        Folder containing the relation definitions between the UMLContract metamodel and the Java metamodel using the MoTE Plug-in (file umlContract2java.mltgg) and the respective diagrams (files *.mltgg_diagram).

o   ./Transformations/de.silvawb.umlContract2java.launch
        Folder containing the scripts used to execute the transformation umlContract2java (in ./Transformations/de.silvawb.umlContract2java) (see III. EXECUTING A TRANSFORMATION).

o   ./Transformations/de.silvawb.umlInteraction2java/model
        Folder containing the relation definitions between the UMLSequenceDiagram metamodel and the Java metamodel using the MoTE Plug-in (file umlInteraction2java.mltgg) and the respective diagrams (files *.mltgg_diagram).

o   ./Transformations/de.silvawb.umlInteraction2java.launch
        Folder containing the scripts used to execute the transformation umlSequenceDiagram2java (in ./Transformations/de.silvawb.umlInteraction2java) (see III. EXECUTING A TRANSFORMATION).

############################# II. SETUP #############################
Below are the steps necessary to setup the environment for using the metamodels and relations developed in this thesis

1. Download and install the Eclipse IDE Mars 2 Modeling Tool: http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/mars2
2. Download and Install Ecore Tools: http://www.eclipse.org/ecoretools/download.html
3. Download and Install Mote Plug-in: https://www.hpi.uni-potsdam.de/giese/public/mdelab/mdelab-projects/mote-a-tgg-based-model-transformation-engine/
4. Copy the following files into the plug-ins directory of the eclipse instalation (folder "plugins" inside eclipse's directory):
    ./Metamodels/de.silvawb.java.edit_1.0.0.201602061423.jar
    ./Metamodels/de.silvawb.java.editor_1.0.0.201602061423.jar
    ./Metamodels/de.silvawb.java_0.1.0.201602061422.jar

################## III. EXECUTING A TRANSFORMATION ##################
Below are the steps to execute a forward transformation between two models, which relations has been defined in this thesis. The setup steps should be successfully completed in order to run the transformations.

1. Import the following projects into your eclipse's workspace:
    ./Transformations/de.silvawb.uml2java
    ./Transformations/de.silvawb.umlContract2java
    ./Transformations/de.silvawb.umlInteraction2java
2. Right-click over the respective relation's project (de.silvawb.uml2java or de.silvawb.umlContract2java or de.silvawb.umlContract2java)
    Then Run as > Eclipse Application
3. Import the following projects into your eclipse's workspace:
    ./Transformations/de.silvawb.uml2java.launch
    ./Transformations/de.silvawb.umlContract2java.launch
    ./Transformations/de.silvawb.umlInteraction2java.launch
4. Open the desired relation's launch project (de.silvawb.uml2java.launch or de.silvawb.umlContract2java.launch or de.silvawb.umlInteraction2java.launch)
    Then Right-click over the forward workflow script file (uml2java_forward.workflow or umlContract2java_forward.workflow or umlInteraction2java_forward.workflow)
    Then choose the option "Execute Workflow", this will read the file "Example01.uml" and transform its model into a new java model that will be written in the file "Example01.emfjava"
5. Open the file "Example01.emfjava" to verify the results of the forward transformation. The log of the transformation is written in the console of the IDE.

