@XmlSchema(
        namespace = "http://www.omg.org/spec/BPMN/20100524/DI",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix = "dc", namespaceURI = "http://www.omg.org/spec/DD/20100524/DC")
        }
)
package com.github.hasys.xml.models.bpmndi;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;