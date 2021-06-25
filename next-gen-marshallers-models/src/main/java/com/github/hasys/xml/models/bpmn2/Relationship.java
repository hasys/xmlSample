package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@XmlRootElement(name = "relationship", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
public class Relationship {

    @XmlAttribute
    private String type = "BPSimData";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType());
    }
}
