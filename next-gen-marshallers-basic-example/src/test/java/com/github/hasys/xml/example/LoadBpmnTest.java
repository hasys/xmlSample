package com.github.hasys.xml.example;

import java.io.IOException;
import java.util.Objects;

import javax.xml.stream.XMLStreamException;

import com.github.hasys.xml.models.bpmn2.Definitions;
import com.github.hasys.xml.models.bpmn2.Definitions_XMLMapperImpl;
import org.junit.jupiter.api.Test;

public class LoadBpmnTest {

    private static Definitions_XMLMapperImpl mapper = Definitions_XMLMapperImpl.INSTANCE;

    private final static String GENERATED_FILE_PATH = "generatedSample.bpmn";
    private final static String TRISOTECH_FILE_PATH = "trisotech.A.1.0.Interchange.bpmn";
    private final static String BPMNIO_FILE_PATH = "bpmnio.bpmn";

    @Test
    public void testGeneratedFile() throws XMLStreamException, IOException {
        String source = loadFile(GENERATED_FILE_PATH);
        Definitions definitions = mapper.read(source);
        String marshalledUnmarshalled = mapper.write(definitions);
        System.out.println(marshalledUnmarshalled);
    }

    @Test
    public void testTrisotechFile() throws IOException, XMLStreamException {
        String source = loadFile(TRISOTECH_FILE_PATH);
        Definitions definitions = mapper.read(source);
        String marshalledUnmarshalled = mapper.write(definitions);
        System.out.println(marshalledUnmarshalled);
    }

    @Test
    public void testBpmnIoFile() throws IOException, XMLStreamException {
        String source = loadFile(BPMNIO_FILE_PATH);
        Definitions definitions = mapper.read(source);
        String marshalledUnmarshalled = mapper.write(definitions);
        System.out.println(marshalledUnmarshalled);
    }

    private String loadFile(String path) throws IOException {
        return new String(
                Objects.requireNonNull(Thread.currentThread()
                                               .getContextClassLoader()
                                               .getResourceAsStream(path)
                ).readAllBytes()
        );
    }
}
