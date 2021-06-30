package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@XmlRootElement(name = "task", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
public class Task {

    @XmlAttribute
    private String id;

    @XmlAttribute
    private String name;

    private ExtensionElements extensionElements;

    private String incoming;
    private String outgoing;

    // All code behind this comment is auto generated.
    // Please regenerate it again if you added new property.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtensionElements getExtensionElements() {
        return extensionElements;
    }

    public void setExtensionElements(ExtensionElements extensionElements) {
        this.extensionElements = extensionElements;
    }

    public String getIncoming() {
        return incoming;
    }

    public void setIncoming(String incoming) {
        this.incoming = incoming;
    }

    public String getOutgoing() {
        return outgoing;
    }

    public void setOutgoing(String outgoing) {
        this.outgoing = outgoing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(getId(), task.getId())
                && Objects.equals(getName(), task.getName())
                && Objects.equals(getExtensionElements(), task.getExtensionElements())
                && Objects.equals(getIncoming(), task.getIncoming())
                && Objects.equals(getOutgoing(), task.getOutgoing());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                            getName(),
                            getExtensionElements(),
                            getIncoming(),
                            getOutgoing());
    }
}
