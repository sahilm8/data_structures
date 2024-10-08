package structures.graph;

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
public class AdjacencyListGraphExample {
    private static class UnweightedAdjacencyListGraph {
        private HashMap<Integer, ArrayList<Integer>> adjacencyList;

        public UnweightedAdjacencyListGraph() {
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
            UnweightedAdjacencyListGraph graph = new UnweightedAdjacencyListGraph();
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

    private static class WeightedAdjacencyListGraphExample {
        private HashMap<Integer, HashMap<Integer, Integer>> adjacencyList;

        public WeightedAdjacencyListGraphExample() {
            this.adjacencyList = new HashMap<>();
        }

        public void addVertex(int vertex) {
            adjacencyList.putIfAbsent(vertex, new HashMap<>());
        }

        public void addEdge(int source, int destination, int weight) {
            adjacencyList.get(source).put(destination, weight);
            adjacencyList.get(destination).put(source, weight); // for undirected graph
        }

        public HashMap<Integer, Integer> getEdges(int vertex) {
            return adjacencyList.get(vertex);
        }

        public void printGraph() {
            for (HashMap.Entry<Integer, HashMap<Integer, Integer>> entry : adjacencyList.entrySet()) {
                System.out.println("vertex: " + entry.getKey() + " -> " + "edges & weight:" + entry.getValue());
            }
        }

        public static void main(String[] args) {
            WeightedAdjacencyListGraphExample graph = new WeightedAdjacencyListGraphExample();
            graph.addVertex(0);
            graph.addVertex(1);
            graph.addVertex(2);
            graph.addVertex(3);
            graph.addEdge(0, 1, 5);
            graph.addEdge(0, 2, 3);
            graph.addEdge(1, 2, 2);
            graph.addEdge(2, 3, 1);
            graph.printGraph();
            System.out.println("Edges for vertex 2: " + graph.getEdges(2));
        }
    }

    public static void main(String[] args) {
        System.out.println("Unweighted:");
        System.out.println();
        UnweightedAdjacencyListGraph.main(args);
        System.out.println();
        System.out.println("Weighted:");
        System.out.println();
        WeightedAdjacencyListGraphExample.main(args);
        System.out.println();
    }
}