package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.github.hasys.xml.models.bpmndi.BpmnDiagram;
import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;
import org.treblereel.gwt.xml.mapper.api.annotation.XMLMapper;

@XMLMapper
@XmlType(propOrder = {"process", "bpmnDiagram", "relationship"})
@XmlRootElement(name = "definitions", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
public class Definitions {

    @XmlAttribute
    private String id;

    @XmlAttribute
    private String exporter = "jBPM Process Modeler";

    @XmlAttribute
    private String exporterVersion = "2.0";

    @XmlElement(name = "BPMNDiagram")
    private BpmnDiagram bpmnDiagram;

    private Relationship relationship;

    private Process process;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExporter() {
        return exporter;
    }

    public void setExporter(String exporter) {
        this.exporter = exporter;
    }

    public String getExporterVersion() {
        return exporterVersion;
    }

    public void setExporterVersion(String exporterVersion) {
        this.exporterVersion = exporterVersion;
    }

    public BpmnDiagram getBpmnDiagram() {
        return bpmnDiagram;
    }

    public void setBpmnDiagram(BpmnDiagram bpmnDiagram) {
        this.bpmnDiagram = bpmnDiagram;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Definitions)) {
            return false;
        }
        Definitions that = (Definitions) o;
        return Objects.equals(getId(), that.getId())
                && Objects.equals(getExporter(), that.getExporter())
                && Objects.equals(getExporterVersion(), that.getExporterVersion())
                && Objects.equals(getBpmnDiagram(), that.getBpmnDiagram())
                && Objects.equals(getRelationship(), that.getRelationship())
                && Objects.equals(getProcess(), that.getProcess());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                            getExporter(),
                            getExporterVersion(),
                            getBpmnDiagram(),
                            getRelationship(),
                            getProcess());
    }
}