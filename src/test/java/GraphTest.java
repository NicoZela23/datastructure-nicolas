import nzo.incremental.graphs.GEdge;
import nzo.incremental.graphs.GNode;
import nzo.incremental.graphs.Graph;
import nzo.incremental.interfaces.IGraph;
import org.junit.jupiter.api.Test;
import java.util.Collections;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    @Test
    void testAddNodeAndGetNodes() {
        IGraph graph = new Graph("Test Graph");
        GNode node1 = new GNode("A");
        graph.addNode(node1);
        assertEquals(1, graph.getNumberOfNodes());
        assertEquals(List.of(node1), graph.getNodes());
    }

    @Test
    void testRemoveNodeAndEdge() {
        IGraph graph = new Graph("Test Graph");
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);
        assertEquals(1, graph.getNumberOfEdges());
        graph.removeNode(node1);
        assertEquals(1, graph.getNumberOfNodes());
        assertEquals(0, graph.getNumberOfEdges());
    }

    @Test
    void testGetEdge() {
        IGraph graph = new Graph("Test Graph");
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);
        GEdge edge = graph.getEdge(node1, node2);
        assertNotNull(edge);
        assertEquals(5, edge.getWeight());
    }
}

