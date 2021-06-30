package com.github.hasys.xml.models.bpmn2;

import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;
import org.treblereel.gwt.xml.mapper.api.annotation.XmlUnwrappedCollection;

@XmlRootElement(name = "process", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
public class Process {

    @XmlAttribute
    private String id;

    @XmlAttribute(namespace = "http://www.jboss.org/drools")
    private String packageName;

    @XmlAttribute(namespace = "http://www.jboss.org/drools")
    private String version;

    @XmlAttribute(namespace = "http://www.jboss.org/drools")
    private boolean adHoc;

    @XmlAttribute
    private String name;

    @XmlAttribute
    private boolean isExecutable;

    @XmlAttribute
    private String processType;

    @XmlElement(name = "startEvent")
    @XmlUnwrappedCollection
    private List<StartEvent> startEvents;

    @XmlElement(name = "endEvent")
    @XmlUnwrappedCollection
    private List<EndEvent> endEvents;

    @XmlElement(name = "sequenceFlow")
    @XmlUnwrappedCollection
    private List<SequenceFlow> sequenceFlows;

    @XmlElement(name = "scriptTask")
    @XmlUnwrappedCollection
    private List<ScriptTask> scriptTasks;

    @XmlElement(name = "task")
    @XmlUnwrappedCollection
    private List<Task> tasks;

    // All code behind this comment is auto generated.
    // Please regenerate it again if you added new property.

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

    public boolean isAdHoc() {
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

    public boolean getIsExecutable() {
        return isExecutable;
    }

    public void setIsExecutable(boolean executable) {
        isExecutable = executable;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public List<StartEvent> getStartEvents() {
        return startEvents;
    }

    public void setStartEvents(List<StartEvent> startEvents) {
        this.startEvents = startEvents;
    }

    public List<EndEvent> getEndEvents() {
        return endEvents;
    }

    public void setEndEvents(List<EndEvent> endEvents) {
        this.endEvents = endEvents;
    }

    public List<SequenceFlow> getSequenceFlows() {
        return sequenceFlows;
    }

    public void setSequenceFlows(List<SequenceFlow> sequenceFlows) {
        this.sequenceFlows = sequenceFlows;
    }

    public List<ScriptTask> getScriptTasks() {
        return scriptTasks;
    }

    public void setScriptTasks(List<ScriptTask> scriptTasks) {
        this.scriptTasks = scriptTasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
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
        return isAdHoc() == process.isAdHoc() && getIsExecutable() == process.getIsExecutable() && Objects.equals(getId(), process.getId()) && Objects.equals(getPackageName(), process.getPackageName()) && Objects.equals(getVersion(), process.getVersion()) && Objects.equals(getName(), process.getName()) && Objects.equals(getProcessType(), process.getProcessType()) && Objects.equals(getStartEvents(), process.getStartEvents()) && Objects.equals(getEndEvents(), process.getEndEvents()) && Objects.equals(getSequenceFlows(), process.getSequenceFlows()) && Objects.equals(getScriptTasks(), process.getScriptTasks()) && Objects.equals(getTasks(), process.getTasks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPackageName(), getVersion(), isAdHoc(), getName(), getIsExecutable(), getProcessType(), getStartEvents(), getEndEvents(), getSequenceFlows(), getScriptTasks(), getTasks());
    }
}
