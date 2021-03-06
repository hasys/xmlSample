package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@XmlRootElement(name = "startEvent", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
public class StartEvent {

    @XmlAttribute
    private String id;

    private String outgoing;

    // All code behind this comment is auto generated.
    // Please regenerate it again if you added new property.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (!(o instanceof StartEvent)) {
            return false;
        }
        StartEvent that = (StartEvent) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getOutgoing(), that.getOutgoing());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOutgoing());
    }
}
