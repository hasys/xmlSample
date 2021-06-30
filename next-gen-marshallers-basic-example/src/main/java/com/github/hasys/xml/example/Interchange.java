package com.github.hasys.xml.example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import com.github.hasys.xml.models.bpmn2.Definitions;
import com.github.hasys.xml.models.bpmn2.Definitions_XMLMapperImpl;
import com.github.hasys.xml.models.bpmn2.Process;
import com.github.hasys.xml.models.bpmn2.Task;

import static com.github.hasys.xml.example.XmlGenerator.EDGE_1_ID;
import static com.github.hasys.xml.example.XmlGenerator.EDGE_2_ID;
import static com.github.hasys.xml.example.XmlGenerator.NODE_2_ID;

public class Interchange {

    private static Definitions_XMLMapperImpl mapper = Definitions_XMLMapperImpl.INSTANCE;

    public static void main(String[] args) throws XMLStreamException {

        Process process = XmlGenerator.createProcess();

        Task task = new Task();
        task.setId(NODE_2_ID);
        task.setIncoming(EDGE_1_ID);
        task.setOutgoing(EDGE_2_ID);

        task.setName("Task");
        task.setExtensionElements(XmlGenerator.createTaskExtensions());

        List<Task> tasks = new ArrayList<>();
        tasks.add(task);
        process.setTasks(tasks);

        Definitions definitions = XmlGenerator.createDefinitions();
        definitions.setBpmnDiagram(XmlGenerator.createBpmnDiagram());
        definitions.setProcess(process);
        System.out.println(mapper.write(definitions));
    }
}
