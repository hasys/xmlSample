package com.github.hasys.xml.example;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    private static String path = System.getProperty("user.dir") + "/next-gen-marshallers-basic-example/target/bpmn-test/generated/";

    private final static String KOGITO_FILE_PATH = "kogito.bpmn";
    private final static String TRISOTECH_FILE_PATH = "trisotech.A.1.0.Interchange.bpmn";
    private final static String BPMNIO_FILE_PATH = "bpmnio.bpmn";

    public static void main(String[] args) throws XMLStreamException, IOException {

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
        String generatedProcess = mapper.write(definitions);

        saveFile("generated.bpmn",
                 generatedProcess);
        readAndRegenerateFile(KOGITO_FILE_PATH, "kogito");
        readAndRegenerateFile(BPMNIO_FILE_PATH, "bpmnio");
        readAndRegenerateFile(TRISOTECH_FILE_PATH, "trisotech");
    }

    private static void readAndRegenerateFile(String original, String newFile) throws IOException, XMLStreamException {
        String source = loadFile(original);
        saveFile(newFile + "Original.bpmn", source);
        Definitions definitions = mapper.read(source);
        String marshalledUnmarshalled = mapper.write(definitions);
        saveFile(newFile + "Remarshalled.bpmn", marshalledUnmarshalled);
    }

    private static String loadFile(String path) throws IOException {
        return new String(
                Objects.requireNonNull(Thread.currentThread()
                                               .getContextClassLoader()
                                               .getResourceAsStream(path)
                ).readAllBytes()
        );
    }

    private static void saveFile(String name, String content) throws IOException {
        File file = new File(path + name);
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(file, false));
        outputStream.write(content.getBytes());
        outputStream.close();
    }
}
