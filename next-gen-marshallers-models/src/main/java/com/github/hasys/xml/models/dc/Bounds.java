package com.github.hasys.xml.models.dc;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;

public class Bounds {

    @XmlAttribute
    private int height;

    @XmlAttribute
    private int width;

    @XmlAttribute
    private int x;

    @XmlAttribute
    private int y;

    // All code behind this comment is auto generated.
    // Please regenerate it again if you added new property.

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

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
        if (!(o instanceof Bounds)) {
            return false;
        }
        Bounds bounds = (Bounds) o;
        return getHeight() == bounds.getHeight()
                && getWidth() == bounds.getWidth()
                && getX() == bounds.getX()
                && getY() == bounds.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(),
                            getWidth(),
                            getX(),
                            getY());
    }
}
