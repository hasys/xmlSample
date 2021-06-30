package com.github.hasys.xml.example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import com.github.hasys.xml.models.bpmn2.Definitions;
import com.github.hasys.xml.models.bpmn2.Definitions_XMLMapperImpl;
import com.github.hasys.xml.models.bpmn2.ExtensionElements;
import com.github.hasys.xml.models.bpmn2.Process;
import com.github.hasys.xml.models.bpmn2.ScriptTask;
import com.github.hasys.xml.models.drools.MetaData;

import static com.github.hasys.xml.example.XmlGenerator.EDGE_1_ID;
import static com.github.hasys.xml.example.XmlGenerator.EDGE_2_ID;
import static com.github.hasys.xml.example.XmlGenerator.NODE_2_ID;

public class Executable {

    private static Definitions_XMLMapperImpl mapper = Definitions_XMLMapperImpl.INSTANCE;

    public static void main(String[] args) throws XMLStreamException {

        Process process = XmlGenerator.createProcess();

        ScriptTask task = new ScriptTask();
        task.setId(NODE_2_ID);
        task.setIncoming(EDGE_1_ID);
        task.setOutgoing(EDGE_2_ID);

        task.setName("Task");
        task.setScriptFormat("http://www.java.com/java");
        ExtensionElements taskExtensions = new ExtensionElements();
        MetaData taskExtensionData = new MetaData();
        taskExtensionData.setName("elementname");
        taskExtensionData.setMetaValue("Task");
        task.setExtensionElements(taskExtensions);
        List<MetaData> taskMetaDataList = new ArrayList<>();
        taskMetaDataList.add(taskExtensionData);
        taskExtensions.setMetaData(taskMetaDataList);
        List<ScriptTask> tasks = new ArrayList<>();
        tasks.add(task);
        task.setScript("System.out.println(\"Hello World\");");
        process.setScriptTasks(tasks);

        Definitions definitions = XmlGenerator.createDefinitions();
        definitions.setBpmnDiagram(XmlGenerator.createBpmnDiagram());
        definitions.setProcess(process);
        System.out.println(mapper.write(definitions));
    }
}
