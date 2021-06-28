package com.github.hasys.xml.example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import com.github.hasys.xml.models.bpmn2.Definitions;
import com.github.hasys.xml.models.bpmn2.Definitions_XMLMapperImpl;
import com.github.hasys.xml.models.bpmn2.ExtensionElements;
import com.github.hasys.xml.models.bpmn2.Process;
import com.github.hasys.xml.models.bpmn2.Relationship;
import com.github.hasys.xml.models.bpmndi.BpmnDiagram;
import com.github.hasys.xml.models.bpmndi.BpmnEdge;
import com.github.hasys.xml.models.bpmndi.BpmnPlane;
import com.github.hasys.xml.models.bpmndi.BpmnShape;
import com.github.hasys.xml.models.bpsim.BPSimData;
import com.github.hasys.xml.models.bpsim.Scenario;
import com.github.hasys.xml.models.dc.Bounds;
import com.github.hasys.xml.models.di.Waypoint;

public class Main {

    private static Definitions_XMLMapperImpl mapper = Definitions_XMLMapperImpl.INSTANCE;
    private static final String SHAPE_ID_PREFIX = "shape_";
    private static final String EDGE_ID_PREFIX = "edge_" + SHAPE_ID_PREFIX;
    private static final String EDGE_ID_BRIDGE = "_to_" + SHAPE_ID_PREFIX;

    public static void main(String[] args) throws XMLStreamException {
        final String DEFINITION_ID = "_xo6H0LclEDmUduPSF37zfg";
        final String PROCESS_ID = "simpliestRunnable";
        final String NODE_1_ID = "_E0ED1E96-1A91-4021-BEF7-22F6779EC911";
        final String NODE_2_ID = "_2A0B3CED-3819-4CF3-9935-FD23972C3C62";
        final String NODE_3_ID = "_43312E35-867E-4AA0-8EC7-30C7F803AA38";
        final String EDGE_1_ID = "_986393D6-DB11-49ED-A8AC-7EC8D26C9A9C";
        final String EDGE_2_ID = "_22F71A00-C577-4993-B6EE-99798C4C9555";

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


        Process process = new Process();
        process.setExecutable(true);
        process.setAdHoc(false);
        process.setProcessType("Public");
        process.setName(PROCESS_ID);
        process.setId(PROCESS_ID);
        process.setPackageName("com.example");
        process.setVersion("1.0");

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
        definitions.setBpmnDiagram(diagram);
        definitions.setProcess(process);
        definitions.setRelationship(relationship);
        System.out.println(mapper.write(definitions));
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
