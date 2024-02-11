package nzo.incremental.interfaces;

import nzo.incremental.graphs.GEdge;
import nzo.incremental.graphs.GNode;

import java.util.List;

/**
 * Interface representing a graph.
 */
public interface IGraph {

    /**
     * Returns the number of nodes in the graph.
     *
     * @return The number of nodes in the graph.
     */
    int getNumberOfNodes();

    /**
     * Returns a list of all nodes in the graph.
     *
     * @return A list containing all nodes in the graph.
     */
    List<GNode> getNodes();

    /**
     * Returns the number of edges in the graph.
     *
     * @return The number of edges in the graph.
     */
    int getNumberOfEdges();

    /**
     * Returns a list of all edges in the graph.
     *
     * @return A list containing all edges in the graph.
     */
    List<GEdge> getEdges();

    /**
     * Returns the edge between the specified source and destination nodes, if it exists.
     *
     * @param source      The source node of the edge.
     * @param destination The destination node of the edge.
     * @return The edge between the source and destination nodes, or null if no such edge exists.
     */
    GEdge getEdge(GNode source, GNode destination);

    /**
     * Returns the out-degree of the specified node.
     *
     * @param node The node whose out-degree is to be calculated.
     * @return The out-degree of the specified node.
     */
    int outDegree(GNode node);

    /**
     * Returns the in-degree of the specified node.
     *
     * @param node The node whose in-degree is to be calculated.
     * @return The in-degree of the specified node.
     */
    int inDegree(GNode node);

    /**
     * Returns a list of all outgoing edges from the specified node.
     *
     * @param node The node whose outgoing edges are to be retrieved.
     * @return A list containing all outgoing edges from the specified node.
     */
    List<GEdge> outgoingEdges(GNode node);

    /**
     * Returns a list of all incoming edges to the specified node.
     *
     * @param node The node whose incoming edges are to be retrieved.
     * @return A list containing all incoming edges to the specified node.
     */
    List<GEdge> incomingEdges(GNode node);

    /**
     * Adds a node to the graph.
     *
     * @param node The node to be added to the graph.
     */
    void addNode(GNode node);

    /**
     * Adds an edge between the specified source and destination nodes with the given weight.
     *
     * @param source      The source node of the edge.
     * @param destination The destination node of the edge.
     * @param weight      The weight of the edge.
     */
    void addEdge(GNode source, GNode destination, int weight);

    /**
     * Removes the specified node from the graph.
     *
     * @param node The node to be removed from the graph.
     */
    void removeNode(GNode node);

    /**
     * Removes the specified edge from the graph.
     *
     * @param edge The edge to be removed from the graph.
     */
    void removeEdge(GEdge edge);
}

