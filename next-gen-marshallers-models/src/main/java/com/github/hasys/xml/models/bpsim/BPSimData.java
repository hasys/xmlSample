package com.github.hasys.xml.models.bpsim;

import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@TargetNamespace(prefix = "bpsim", namespace = "http://www.bpsim.org/schemas/1.0")
public class BPSimData {

    private Scenario scenario;

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BPSimData)) {
            return false;
        }
        BPSimData bpSimData = (BPSimData) o;
        return Objects.equals(getScenario(), bpSimData.getScenario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScenario());
    }
}
