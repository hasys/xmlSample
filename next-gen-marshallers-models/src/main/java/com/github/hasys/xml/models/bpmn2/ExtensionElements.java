package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.github.hasys.xml.models.bpsim.BPSimData;
import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@XmlRootElement(name = "extensionElements", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
public class ExtensionElements {

    @XmlElement(name = "BPSimData")
    private BPSimData bpSimData;

    public BPSimData getBpSimData() {
        return bpSimData;
    }

    public void setBpSimData(BPSimData bpSimData) {
        this.bpSimData = bpSimData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionElements)) {
            return false;
        }
        ExtensionElements that = (ExtensionElements) o;
        return Objects.equals(getBpSimData(), that.getBpSimData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBpSimData());
    }
}
