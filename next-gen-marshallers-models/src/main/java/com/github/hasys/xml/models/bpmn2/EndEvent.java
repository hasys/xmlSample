package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "endEvent", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
public class EndEvent {
    @XmlAttribute
    private String id;

    private String incoming;

    // All code behind this comment is auto generated.
    // Please regenerate it again if you added new property.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIncoming() {
        return incoming;
    }

    public void setIncoming(String incoming) {
        this.incoming = incoming;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EndEvent)) {
            return false;
        }
        EndEvent endEvent = (EndEvent) o;
        return Objects.equals(getId(), endEvent.getId()) && Objects.equals(getIncoming(), endEvent.getIncoming());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getIncoming());
    }
}
