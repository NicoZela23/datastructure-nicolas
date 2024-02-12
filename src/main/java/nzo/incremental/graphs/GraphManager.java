package nzo.incremental.graphs;

import nzo.incremental.interfaces.IGraph;
import nzo.incremental.interfaces.IStructureManager;
import nzo.incremental.menu.ConsoleMenu;
import nzo.incremental.menu.GraphMenu;
import nzo.incremental.menu.MenuFactory;

import java.util.Scanner;

public class GraphManager implements IStructureManager {
    private final Scanner scannerValues;
    private static IGraph graph;
    private MenuFactory menuFactory;
    private final ConsoleMenu currentMenu;

    public GraphManager() {
        scannerValues = new Scanner(System.in);
        graph = new Graph("MyGraph");
        menuFactory = new GraphMenu();
        currentMenu = menuFactory.createMenu();
    }
    @Override
    public void run() {
        int userChoice;
        do {
            currentMenu.displayMenu();
            userChoice = currentMenu.getUserChoiceInteger();
            processUserChoice(userChoice);
        } while (userChoice != 14);
    }
    private void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                addNode(scannerValues);
                break;
            case 2:
                addEdge(scannerValues);
                break;
            case 3:
                removeNode(scannerValues);
                break;
            case 4:
                removeEdge(scannerValues);
                break;
            case 5:
                displayNumberOfNodes();
                break;
            case 6:
                displayNodes();
                break;
            case 7:
                displayNumberOfEdges();
                break;
            case 8:
                displayEdges();
                break;
            case 9:
                displayEdge(scannerValues);
                break;
            case 10:
                outDegree(scannerValues);
                break;
            case 11:
                inDegree(scannerValues);
                break;
            case 12:
                outGoingEdges(scannerValues);
                break;
            case 13:
                IncomingEdges(scannerValues);
                break;
        }
    }
    private static void addNode(Scanner scanner) {
        System.out.println("\u001B[33m" + "Enter node name: ");
        System.out.print("> ");
        String nodeName = scanner.next();
        graph.addNode(new GNode(nodeName));
        System.out.println("\u001B[33m" + "Node added successfully!");
    }
    private static void addEdge(Scanner scanner) {
        System.out.println("\u001B[33m" + "Enter source node name: ");
        System.out.print("> ");
        String sourceName = scanner.next();
        System.out.println("\u001B[33m" + "Enter destination node name: ");
        System.out.print("> ");
        String destName = scanner.next();
        System.out.println("\u001B[33m" + "Enter edge weight: ");
        System.out.print("> ");
        int weight = scanner.nextInt();
        GNode source = new GNode(sourceName);
        GNode dest = new GNode(destName);
        graph.addEdge(source, dest, weight);
        System.out.println("\u001B[33m" + "Edge added successfully!");
    }
    private static void removeNode(Scanner scanner) {
        System.out.println("\u001B[33m" + "Enter node name to remove: ");
        System.out.print("> ");
        String nodeName = scanner.next();
        graph.removeNode(new GNode(nodeName));
        System.out.println("\u001B[33m" + "Node removed successfully!");
    }
    private static void removeEdge(Scanner scanner) {
        System.out.println("\u001B[33m" + "Enter source node name: ");
        System.out.print("> ");
        String sourceName = scanner.next();
        System.out.println("\u001B[33m" + "Enter destination node name: ");
        System.out.print("> ");
        String destName = scanner.next();
        GNode source = new GNode(sourceName);
        GNode dest = new GNode(destName);
        GEdge edge = graph.getEdge(source, dest);
        if (edge != null) {
            graph.removeEdge(edge);
            System.out.println("\u001B[33m" + "Edge removed successfully!");
        } else {
            System.out.println("\u001B[33m" + "Edge not found!");
        }
    }
    private static void displayNumberOfNodes(){
        System.out.print("\u001B[33m" + "Number of Nodes: ");
        System.out.println("\u001B[32m" + graph.getNumberOfNodes());
    }
    private static void displayNodes(){
        System.out.print("\u001B[33m" + "Nodes: ");
        System.out.println("\u001B[32m" + graph.getNodes());
    }
    private static void displayNumberOfEdges(){
        System.out.print("\u001B[33m" + "Number of Edges: ");
        System.out.println("\u001B[32m" + graph.getNumberOfEdges());
    }
    private static void displayEdges(){
        System.out.print("\u001B[33m" + "Edges: ");
        System.out.println("\u001B[32m" + graph.getEdges());
    }
    private static void displayEdge(Scanner scanner) {
        System.out.println("\u001B[33m" + "Enter source node name: ");
        System.out.print("> ");
        String sourceName = scanner.next();
        System.out.println("\u001B[33m" + "Enter destination node name: ");
        System.out.print("> ");
        String destName = scanner.next();
        GNode source = new GNode(sourceName);
        GNode dest = new GNode(destName);
        GEdge edge = graph.getEdge(source, dest);
        if (edge != null) {
            System.out.println("\u001B[32m" + "Edge: " + edge);
        } else {
            System.out.println("\u001B[32m" + "Edge not found!");
        }
    }
    private static void outDegree(Scanner scanner) {
        System.out.println("\u001B[33m" + "Enter node name: ");
        System.out.print("> ");
        String nodeName = scanner.next();
        GNode node = new GNode(nodeName);
        System.out.println("\u001B[32m" + "Out Degree: " + graph.outDegree(node));
    }
    private static void inDegree(Scanner scanner) {
        System.out.println("\u001B[33m" + "Enter node name: ");
        System.out.print("> ");
        String nodeName = scanner.next();
        GNode node = new GNode(nodeName);
        System.out.println("\u001B[32m" + "In Degree: " + graph.inDegree(node));
    }
    private static void outGoingEdges(Scanner scanner) {
        System.out.println("\u001B[33m" + "Enter node name: ");
        System.out.print("> ");
        String nodeName = scanner.next();
        GNode node = new GNode(nodeName);
        System.out.println("\u001B[32m" + "Outgoing Edges: " + graph.outgoingEdges(node));
    }
    private static void IncomingEdges(Scanner scanner) {
        System.out.println("\u001B[33m" + "Enter node name: ");
        String nodeName = scanner.next();
        GNode node = new GNode(nodeName);
        System.out.println("\u001B[32m" + "Incoming Edges: " + graph.incomingEdges(node));
    }

}
