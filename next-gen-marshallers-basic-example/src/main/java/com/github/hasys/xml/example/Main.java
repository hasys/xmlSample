package com.github.hasys.xml.example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import com.github.hasys.xml.models.bpmn2.BpmnDiagram;
import com.github.hasys.xml.models.bpmn2.Definitions;
import com.github.hasys.xml.models.bpmn2.Definitions_XMLMapperImpl;
import com.github.hasys.xml.models.bpmn2.Process;
import com.github.hasys.xml.models.bpmn2.Relationship;

public class Main {

    static Definitions_XMLMapperImpl mapper = Definitions_XMLMapperImpl.INSTANCE;

    public static void main(String[] args) throws XMLStreamException {

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

        Definitions definitions = new Definitions();
        definitions.setId("_xo6H0LclEDmUduPSF37zfg");
        definitions.setBpmnDiagram(diagram);
        definitions.setProcess(process);
        definitions.setRelationship(relationship);
        System.out.println(mapper.write(definitions));
    }

}
