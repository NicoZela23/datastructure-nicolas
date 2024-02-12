package nzo.incremental.graphs;

import nzo.incremental.interfaces.IGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph implements IGraph {
    String name;
    Map<GNode, List<GEdge>> graph;

    public Graph(String name){
        this.name = name;
        graph = new java.util.HashMap<>();
    }

    @Override
    public int getNumberOfNodes() {
        return graph.size();
    }

    @Override
    public List<GNode> getNodes() {
        return new ArrayList<GNode>(graph.keySet());
    }

    @Override
    public int getNumberOfEdges() {
        return getEdges().size();
    }

    @Override
    public List<GEdge> getEdges() {
        List<GEdge> returnEdges = new ArrayList<>();
        for (List<GEdge> edges : graph.values()) {
            returnEdges.addAll(edges);
        }
        return returnEdges;
    }

    @Override
    public GEdge getEdge(GNode source, GNode destination) {
        List<GEdge> edges = graph.get(source);
        for (GEdge edge : edges){
            if (edge.getDestination().equals(destination)){
                return edge;
            }
        }
        return null;
    }

    @Override
    public int outDegree(GNode node) {
        return graph.get(node).size();
    }

    @Override
    public int inDegree(GNode node) {
        int counter = 0;

        for (GNode key : graph.keySet()){
            List<GEdge> edges = graph.get(key);
            for (GEdge edge : edges){
                if (edge.getDestination().equals(node)){
                    counter++;
                }
            }
        }
        return counter;
    }

    @Override
    public List<GEdge> outgoingEdges(GNode node) {
        return graph.get(node);
    }

    @Override
    public List<GEdge> incomingEdges(GNode node) {
        for (GNode key : graph.keySet()){
            List<GEdge> edges = graph.get(key);
            for (GEdge edge : edges){
                if (edge.getDestination().equals(node)){
                 return edges;
             }
          }
        }
        return null;
    }

    @Override
    public void addNode(GNode node) {
        if (!graph.containsKey(node)) {
            graph.put(node, new ArrayList<>());
        }
    }


    @Override
    public void addEdge(GNode source, GNode destination, int weight) {
        if (!graph.containsKey(source)) {
            addNode(source);
        }

        List<GEdge> currentNodeEdges = graph.get(source);
        if (currentNodeEdges == null) {
            currentNodeEdges = new ArrayList<>();
            graph.put(source, currentNodeEdges);
        }
        currentNodeEdges.add(new GEdge(source, destination, weight));
    }


    @Override
    public void removeNode(GNode node) {
        graph.remove(node);
    }

    @Override
    public void removeEdge(GEdge edge) {
        List<GEdge> currentNodeEdges = graph.get(edge.getSource());
        currentNodeEdges.remove(edge);
    }
}
