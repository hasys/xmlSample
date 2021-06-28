package com.github.hasys.xml.models.bpmndi;

import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;
import org.treblereel.gwt.xml.mapper.api.annotation.XmlUnwrappedCollection;

@XmlRootElement(name = "BPMNPlane", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
@TargetNamespace(prefix = "bpmndi", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
public class BpmnPlane {

    @XmlAttribute
    private String bpmnElement;

    @XmlElement(name = "BPMNShape")
    @XmlUnwrappedCollection
    private List<BpmnShape> bpmnShapes;

    @XmlElement(name = "BPMNEdge")
    @XmlUnwrappedCollection
    private List<BpmnEdge> bpmnEdges;

    public String getBpmnElement() {
        return bpmnElement;
    }

    public void setBpmnElement(String bpmnElement) {
        this.bpmnElement = bpmnElement;
    }

    public List<BpmnShape> getBpmnShapes() {
        return bpmnShapes;
    }

    public void setBpmnShapes(List<BpmnShape> bpmnShapes) {
        this.bpmnShapes = bpmnShapes;
    }

    public List<BpmnEdge> getBpmnEdges() {
        return bpmnEdges;
    }

    public void setBpmnEdges(List<BpmnEdge> bpmnEdges) {
        this.bpmnEdges = bpmnEdges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BpmnPlane)) {
            return false;
        }
        BpmnPlane plane = (BpmnPlane) o;
        return Objects.equals(getBpmnElement(), plane.getBpmnElement())
                && Objects.equals(getBpmnShapes(), plane.getBpmnShapes())
                && Objects.equals(getBpmnEdges(), plane.getBpmnEdges());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBpmnElement(),
                            getBpmnShapes(),
                            getBpmnEdges());
    }
}
