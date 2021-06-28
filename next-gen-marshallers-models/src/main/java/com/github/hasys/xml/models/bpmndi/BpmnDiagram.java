package com.github.hasys.xml.models.bpmndi;

import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@XmlRootElement(name = "BPMNDiagram", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
@TargetNamespace(prefix = "bpmndi", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
public class BpmnDiagram {

    @XmlElement(name = "BPMNPlane")
    private BpmnPlane bpmnPlane;

    public BpmnPlane getBpmnPlane() {
        return bpmnPlane;
    }

    public void setBpmnPlane(BpmnPlane bpmnPlane) {
        this.bpmnPlane = bpmnPlane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BpmnDiagram)) {
            return false;
        }
        BpmnDiagram that = (BpmnDiagram) o;
        return Objects.equals(getBpmnPlane(), that.getBpmnPlane());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBpmnPlane());
    }
}
