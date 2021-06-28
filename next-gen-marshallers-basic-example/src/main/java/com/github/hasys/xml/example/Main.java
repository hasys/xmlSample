package com.github.hasys.xml.example;

import javax.xml.stream.XMLStreamException;

import com.github.hasys.xml.models.bpmn2.BpmnDiagram;
import com.github.hasys.xml.models.bpmn2.Definitions;
import com.github.hasys.xml.models.bpmn2.Definitions_XMLMapperImpl;
import com.github.hasys.xml.models.bpmn2.ExtensionElements;
import com.github.hasys.xml.models.bpmn2.Process;
import com.github.hasys.xml.models.bpmn2.Relationship;
import com.github.hasys.xml.models.bpsim.BPSimData;
import com.github.hasys.xml.models.bpsim.Scenario;

public class Main {

    static Definitions_XMLMapperImpl mapper = Definitions_XMLMapperImpl.INSTANCE;

    public static void main(String[] args) throws XMLStreamException {
        final String DEFINITION_ID = "_xo6H0LclEDmUduPSF37zfg";

        BpmnDiagram diagram = new BpmnDiagram();
        Process process = new Process();
        process.setExecutable(true);
        process.setAdHoc(false);
        process.setProcessType("Public");
        process.setName("simpliestRunnable");
        process.setId("simpliestRunnable");
        process.setPackageName("com.example");
        process.setVersion("1.0");

        Relationship relationship = new Relationship();
        ExtensionElements extensionElements = new ExtensionElements();
        relationship.setExtensionElements(extensionElements);
        relationship.setSource(DEFINITION_ID);
        relationship.setTarget(DEFINITION_ID);
        BPSimData bpSimData = new BPSimData();
        Scenario scenario = new Scenario();
        bpSimData.setScenario(scenario);
        extensionElements.setBpSimData(bpSimData);

        Definitions definitions = new Definitions();
        definitions.setId(DEFINITION_ID);
        definitions.setBpmnDiagram(diagram);
        definitions.setProcess(process);
        definitions.setRelationship(relationship);
        System.out.println(mapper.write(definitions));
    }
}
