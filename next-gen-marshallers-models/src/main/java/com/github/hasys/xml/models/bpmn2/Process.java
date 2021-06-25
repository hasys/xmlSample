package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@XmlRootElement(name = "process", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
public class Process {

    @XmlAttribute
    public String id;

    @XmlAttribute(namespace = "http://www.jboss.org/drools")
    public String packageName;

    @XmlAttribute(namespace = "http://www.jboss.org/drools")
    public String version;

    @XmlAttribute(namespace = "http://www.jboss.org/drools")
    public boolean adHoc;

    @XmlAttribute
    public String name;

    @XmlAttribute
    public boolean isExecutable;

    @XmlAttribute
    public String processType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean getAdHoc() {
        return adHoc;
    }

    public void setAdHoc(boolean adHoc) {
        this.adHoc = adHoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExecutable() {
        return isExecutable;
    }

    public void setExecutable(boolean executable) {
        isExecutable = executable;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Process)) {
            return false;
        }
        Process process = (Process) o;
        return isExecutable() == process.isExecutable()
                && Objects.equals(getId(), process.getId())
                && Objects.equals(getPackageName(), process.getPackageName())
                && Objects.equals(getVersion(), process.getVersion())
                && Objects.equals(getAdHoc(), process.getAdHoc())
                && Objects.equals(getName(), process.getName())
                && Objects.equals(getProcessType(), process.getProcessType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                            getPackageName(),
                            getVersion(),
                            getAdHoc(),
                            getName(),
                            isExecutable(),
                            getProcessType());
    }
}
