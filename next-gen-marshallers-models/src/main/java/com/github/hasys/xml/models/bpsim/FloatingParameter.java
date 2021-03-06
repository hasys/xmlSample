package com.github.hasys.xml.models.bpsim;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;

public class FloatingParameter {

    @XmlAttribute
    private int value;

    // All code behind this comment is auto generated.
    // Please regenerate it again if you added new property.

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FloatingParameter)) {
            return false;
        }
        FloatingParameter that = (FloatingParameter) o;
        return getValue() == that.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
