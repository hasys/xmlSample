package com.github.hasys.xml.models.bpmn2;

import javax.xml.bind.annotation.XmlRootElement;

import org.treblereel.gwt.xml.mapper.api.annotation.TargetNamespace;

@XmlRootElement(name = "BPMNDiagram", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@TargetNamespace(prefix = "bpmn2", namespace = "http://www.omg.org/bpmn20")
public class BpmnDiagram {

}
