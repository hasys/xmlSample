package com.github.hasys.xml.models.bpmndi;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.github.hasys.xml.models.dc.Bounds;

public class BpmnShape {

    @XmlAttribute
    private String id;

    @XmlAttribute
    private String bpmnElement;

    @XmlElement(name = "Bounds")
    private Bounds bounds;

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

    public Bounds getBounds() {
        return bounds;
    }

    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BpmnShape)) {
            return false;
        }
        BpmnShape bpmnShape = (BpmnShape) o;
        return Objects.equals(getId(), bpmnShape.getId())
                && Objects.equals(getBpmnElement(), bpmnShape.getBpmnElement())
                && Objects.equals(getBounds(), bpmnShape.getBounds());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                            getBpmnElement(),
                            getBounds());
    }
}
