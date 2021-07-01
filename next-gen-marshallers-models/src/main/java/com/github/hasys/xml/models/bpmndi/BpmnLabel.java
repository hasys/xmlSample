package com.github.hasys.xml.models.bpmndi;

import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;

import com.github.hasys.xml.models.dc.Bounds;

public class BpmnLabel {

    @XmlElement(name = "Bounds")
    private Bounds bounds;

    // All code behind this comment is auto generated.
    // Please regenerate it again if you added new property.

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
        if (!(o instanceof BpmnLabel)) {
            return false;
        }
        BpmnLabel bpmnLabel = (BpmnLabel) o;
        return Objects.equals(getBounds(), bpmnLabel.getBounds());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBounds());
    }
}
