package structures;

import java.util.HashMap;
import java.util.ArrayList;

/*
 * A graph is a non-linear data structure consisting of vertices
 * (or nodes) and edges that connect these vertices. Graphs are
 * used to represent networks, relationships, and various
 * real-world scenarios where entities are interconnected.
 * They can be directed (edges have a direction) or undirected,
 * and weighted or unweighted.
 */
public class UnweightedAdjacencyListGraphExample {
    private HashMap<Integer, ArrayList<Integer>> adjacencyList;

    public UnweightedAdjacencyListGraphExample() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // for undirected graph
    }

    public ArrayList<Integer> getEdges(int vertex) {
        return adjacencyList.get(vertex);
    }

    public void printGraph() {
        for (HashMap.Entry<Integer, ArrayList<Integer>> entry : adjacencyList.entrySet()) {
            System.out.println("vertex: " + entry.getKey() + " -> " + "edges: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        UnweightedAdjacencyListGraphExample graph = new UnweightedAdjacencyListGraphExample();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.printGraph();
        System.out.println("Edges for vertex 2: " + graph.getEdges(2));
    }
}