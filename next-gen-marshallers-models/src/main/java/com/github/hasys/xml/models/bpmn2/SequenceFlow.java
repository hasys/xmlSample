package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@XmlRootElement(name = "extensionElements", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
public class SequenceFlow {

    @XmlAttribute
    private String id;

    @XmlAttribute
    private String sourceRef;

    @XmlAttribute
    private String targetRef;

    private ExtensionElements extensionElements;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    public String getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
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
        if (!(o instanceof SequenceFlow)) {
            return false;
        }
        SequenceFlow that = (SequenceFlow) o;
        return Objects.equals(getId(), that.getId())
                && Objects.equals(getSourceRef(), that.getSourceRef())
                && Objects.equals(getTargetRef(), that.getTargetRef())
                && Objects.equals(getExtensionElements(), that.getExtensionElements());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                            getSourceRef(),
                            getTargetRef(),
                            getExtensionElements());
    }
}
