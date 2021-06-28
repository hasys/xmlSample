package com.github.hasys.xml.models.bpmndi;

import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.github.hasys.xml.models.di.Waypoint;
import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;
import org.treblereel.gwt.xml.mapper.api.annotation.XmlUnwrappedCollection;

@XmlRootElement(name = "BPMNEdge", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
@TargetNamespace(prefix = "bpmndi", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
public class BpmnEdge {

    @XmlAttribute
    private String id;

    @XmlAttribute
    private String bpmnElement;

    @XmlElement
    @XmlUnwrappedCollection
    private List<Waypoint> waypoint;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBpmnElement() {
        return bpmnElement;
    }

    public void setBpmnElement(String bpmnElement) {
        this.bpmnElement = bpmnElement;
    }

    public List<Waypoint> getWaypoint() {
        return waypoint;
    }

    public void setWaypoint(List<Waypoint> waypoint) {
        this.waypoint = waypoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BpmnEdge)) {
            return false;
        }
        BpmnEdge bpmnEdge = (BpmnEdge) o;
        return Objects.equals(getId(), bpmnEdge.getId())
                && Objects.equals(getBpmnElement(), bpmnEdge.getBpmnElement())
                && Objects.equals(getWaypoint(), bpmnEdge.getWaypoint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                            getBpmnElement(),
                            getWaypoint());
    }
}
