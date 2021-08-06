package com.github.hasys.xml.models.bpmn2;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "scriptTask", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
public class ScriptTask {

    @XmlAttribute
    private String id;

    @XmlAttribute
    private String name;

    @XmlAttribute
    private String scriptFormat;

    private ExtensionElements extensionElements;

    private String script;

    private String incoming;
    private String outgoing;

    // All code behind this comment is auto generated.
    // Please regenerate it again if you added new property.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScriptFormat() {
        return scriptFormat;
    }

    public void setScriptFormat(String scriptFormat) {
        this.scriptFormat = scriptFormat;
    }

    public ExtensionElements getExtensionElements() {
        return extensionElements;
    }

    public void setExtensionElements(ExtensionElements extensionElements) {
        this.extensionElements = extensionElements;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getIncoming() {
        return incoming;
    }

    public void setIncoming(String incoming) {
        this.incoming = incoming;
    }

    public String getOutgoing() {
        return outgoing;
    }

    public void setOutgoing(String outgoing) {
        this.outgoing = outgoing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScriptTask)) {
            return false;
        }
        ScriptTask that = (ScriptTask) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getScriptFormat(), that.getScriptFormat()) && Objects.equals(getExtensionElements(), that.getExtensionElements()) && Objects.equals(getScript(), that.getScript()) && Objects.equals(getIncoming(), that.getIncoming()) && Objects.equals(getOutgoing(), that.getOutgoing());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getScriptFormat(), getExtensionElements(), getScript(), getIncoming(), getOutgoing());
    }
}
