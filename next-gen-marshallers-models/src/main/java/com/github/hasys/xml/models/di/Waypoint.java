package com.github.hasys.xml.models.di;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;

public class Waypoint {

    @XmlAttribute
    private int x;

    @XmlAttribute
    private int y;

    // All code behind this comment is auto generated.
    // Please regenerate it again if you added new property.

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Waypoint)) {
            return false;
        }
        Waypoint waypoint = (Waypoint) o;
        return getX() == waypoint.getX()
                && getY() == waypoint.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
