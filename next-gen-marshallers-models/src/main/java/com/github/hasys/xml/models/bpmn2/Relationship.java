package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@XmlRootElement(name = "relationship", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
@XmlType(propOrder = {"extensionElements", "source", "target"})
public class Relationship {

    @XmlAttribute
    private String type = "BPSimData";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String source;

    private String target;

    private ExtensionElements extensionElements;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public ExtensionElements getExtensionElements() {
        return extensionElements;
    }

    public void setExtensionElements(ExtensionElements extensionElements) {
        this.extensionElements = extensionElements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Relationship)) {
            return false;
        }
        Relationship that = (Relationship) o;
        return Objects.equals(getType(), that.getType())
                && Objects.equals(getSource(), that.getSource())
                && Objects.equals(getTarget(), that.getTarget())
                && Objects.equals(getExtensionElements(), that.getExtensionElements());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(),
                            getSource(),
                            getTarget(),
                            getExtensionElements());
    }
}
