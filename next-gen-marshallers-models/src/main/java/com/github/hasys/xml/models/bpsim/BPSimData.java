package com.github.hasys.xml.models.bpsim;

import java.util.Objects;

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
