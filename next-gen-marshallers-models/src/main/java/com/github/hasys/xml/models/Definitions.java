package com.github.hasys.xml.models;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;
import org.treblereel.gwt.xml.mapper.api.annotation.XMLMapper;

@XMLMapper
@XmlRootElement(name = "definitions", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
public class Definitions {

    @XmlAttribute
    private String id;

    @XmlAttribute
    private String exporter = "jBPM Process Modeler";

    @XmlAttribute
    private String exporterVersion = "2.0";

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
                && Objects.equals(getExporterVersion(), that.getExporterVersion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                            getExporter(),
                            getExporterVersion());
    }
}