package com.github.hasys.xml.example;

import java.util.ArrayList;
import java.util.List;

import com.github.hasys.xml.models.bpmn2.Definitions;
import com.github.hasys.xml.models.bpmn2.EndEvent;
import com.github.hasys.xml.models.bpmn2.ExtensionElements;
import com.github.hasys.xml.models.bpmn2.Process;
import com.github.hasys.xml.models.bpmn2.Relationship;
import com.github.hasys.xml.models.bpmn2.SequenceFlow;
import com.github.hasys.xml.models.bpmn2.StartEvent;
import com.github.hasys.xml.models.bpmndi.BpmnDiagram;
import com.github.hasys.xml.models.bpmndi.BpmnEdge;
import com.github.hasys.xml.models.bpmndi.BpmnPlane;
import com.github.hasys.xml.models.bpmndi.BpmnShape;
import com.github.hasys.xml.models.bpsim.BPSimData;
import com.github.hasys.xml.models.bpsim.Scenario;
import com.github.hasys.xml.models.dc.Bounds;
import com.github.hasys.xml.models.di.Waypoint;
import com.github.hasys.xml.models.drools.MetaData;

public class XmlGenerator {

    private static final String SHAPE_ID_PREFIX = "shape_";
    private static final String EDGE_ID_PREFIX = "edge_" + SHAPE_ID_PREFIX;
    private static final String EDGE_ID_BRIDGE = "_to_" + SHAPE_ID_PREFIX;
    public static final String PROCESS_ID = "simpliestRunnable";
    public static final String NODE_1_ID = "_E0ED1E96-1A91-4021-BEF7-22F6779EC911";
    public static final String NODE_2_ID = "_2A0B3CED-3819-4CF3-9935-FD23972C3C62";
    public static final String NODE_3_ID = "_43312E35-867E-4AA0-8EC7-30C7F803AA38";
    public static final String EDGE_1_ID = "_986393D6-DB11-49ED-A8AC-7EC8D26C9A9C";
    public static final String EDGE_2_ID = "_22F71A00-C577-4993-B6EE-99798C4C9555";

    public static Definitions createDefinitions() {
        final String DEFINITION_ID = "_xo6H0LclEDmUduPSF37zfg";

        Relationship relationship = new Relationship();
        ExtensionElements extensionElements = new ExtensionElements();
        relationship.setExtensionElements(extensionElements);
        relationship.setSource(DEFINITION_ID);
        relationship.setTarget(DEFINITION_ID);
        BPSimData bpSimData = new BPSimData();
        Scenario scenario = new Scenario();
        bpSimData.setScenario(scenario);
        extensionElements.setBpSimData(bpSimData);

        Definitions definitions = new Definitions();
        definitions.setId(DEFINITION_ID);
        definitions.setRelationship(relationship);

        return definitions;
    }

    public static BpmnDiagram createBpmnDiagram() {
        BpmnDiagram diagram = new BpmnDiagram();
        BpmnPlane plane = new BpmnPlane();
        plane.setBpmnElement(PROCESS_ID);
        diagram.setBpmnPlane(plane);
        List<BpmnShape> shapes = new ArrayList<>();
        BpmnShape shape1 = createBpmnShape(NODE_1_ID, 56, 56, 133, 162);
        BpmnShape shape2 = createBpmnShape(NODE_2_ID, 102, 154, 269, 139);
        BpmnShape shape3 = createBpmnShape(NODE_3_ID, 56, 56, 503, 162);
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        plane.setBpmnShapes(shapes);

        List<BpmnEdge> edges = new ArrayList<>();
        BpmnEdge edge1 = createBpmnEdge(EDGE_1_ID, NODE_1_ID, NODE_2_ID, 189, 190, 269, 190);
        BpmnEdge edge2 = createBpmnEdge(EDGE_2_ID, NODE_2_ID, NODE_3_ID, 423, 190, 503, 190);
        edges.add(edge1);
        edges.add(edge2);
        plane.setBpmnEdges(edges);

        return diagram;
    }

    public static Process createProcess() {
        Process process = new Process();
        process.setIsExecutable(true);
        process.setAdHoc(false);
        process.setProcessType("Public");
        process.setName(PROCESS_ID);
        process.setId(PROCESS_ID);
        process.setPackageName("com.example");
        process.setVersion("1.0");

        List<StartEvent> startEvents = new ArrayList<>();
        StartEvent startEvent = new StartEvent();
        startEvent.setId(NODE_1_ID);
        startEvent.setOutgoing(EDGE_1_ID);
        startEvents.add(startEvent);
        process.setStartEvents(startEvents);

        List<EndEvent> endEvents = new ArrayList<>();
        EndEvent endEvent = new EndEvent();
        endEvent.setId(NODE_3_ID);
        endEvent.setIncoming(EDGE_2_ID);
        endEvents.add(endEvent);
        process.setEndEvents(endEvents);

        SequenceFlow flow1 = createSequenceFlow(EDGE_1_ID,
                                                NODE_1_ID,
                                                NODE_2_ID);

        SequenceFlow flow2 = createSequenceFlow(EDGE_2_ID,
                                                NODE_2_ID,
                                                NODE_3_ID);
        List<SequenceFlow> flows = new ArrayList<>();
        flows.add(flow1);
        flows.add(flow2);
        process.setSequenceFlows(flows);

        return process;
    }

    public static ExtensionElements createTaskExtensions() {
        ExtensionElements taskExtensions = new ExtensionElements();
        MetaData taskExtensionData = new MetaData();
        taskExtensionData.setName("elementname");
        taskExtensionData.setMetaValue("Task");
        List<MetaData> taskMetaDataList = new ArrayList<>();
        taskMetaDataList.add(taskExtensionData);
        taskExtensions.setMetaData(taskMetaDataList);
        return taskExtensions;
    }

    private static SequenceFlow createSequenceFlow(String id, String source, String target) {
        SequenceFlow flow = new SequenceFlow();
        flow.setId(id);
        flow.setSourceRef(source);
        flow.setTargetRef(target);
        MetaData metaDataSource = new MetaData();
        metaDataSource.setName("isAutoConnection.source");
        metaDataSource.setMetaValue("true");
        MetaData metaDataTarget = new MetaData();
        metaDataTarget.setName("isAutoConnection.target");
        metaDataTarget.setMetaValue("true");
        List<MetaData> data = new ArrayList<>();
        data.add(metaDataSource);
        data.add(metaDataTarget);
        ExtensionElements extension = new ExtensionElements();
        extension.setMetaData(data);
        flow.setExtensionElements(extension);
        return flow;
    }

    private static BpmnShape createBpmnShape(String nodeId, int height, int width, int x, int y) {
        BpmnShape shape = new BpmnShape();
        shape.setId(SHAPE_ID_PREFIX + nodeId);
        shape.setBpmnElement(nodeId);
        Bounds bounds = new Bounds();
        bounds.setHeight(height);
        bounds.setWidth(width);
        bounds.setX(x);
        bounds.setY(y);
        shape.setBounds(bounds);

        return shape;
    }

    private static BpmnEdge createBpmnEdge(String bpmnElement, String fromNode, String toNode, int x1, int y1, int x2, int y2) {
        BpmnEdge edge = new BpmnEdge();
        edge.setBpmnElement(bpmnElement);
        edge.setId(EDGE_ID_PREFIX + fromNode + EDGE_ID_BRIDGE + toNode);

        List<Waypoint> waypoints = new ArrayList<>();

        Waypoint waypoint1 = new Waypoint();
        waypoint1.setX(x1);
        waypoint1.setY(y1);
        waypoints.add(waypoint1);

        Waypoint waypoint2 = new Waypoint();
        waypoint2.setX(x2);
        waypoint2.setY(y2);
        waypoints.add(waypoint2);

        edge.setWaypoint(waypoints);

        return edge;
    }
}
