package structures;

/*
 * An adjacency matrix is another way to represent a graph,
 * where the graph is represented as a 2D array. In this
 * representation, both rows and columns represent vertices,
 * and the values in the matrix represent the edges between them.
 */
public class UnweightedAdjacencyMatrixGraph {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public UnweightedAdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // for undirected graph
    }

    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
        adjacencyMatrix[destination][source] = 0; // for undirected graph
    }

    public boolean isEdge(int source, int destination) {
        return adjacencyMatrix[source][destination] == 1;
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UnweightedAdjacencyMatrixGraph graph = new UnweightedAdjacencyMatrixGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        System.out.println("adjacencyMatrix:");
        graph.printGraph();
        System.out.println("Remove edge between 0 & 1:");
        graph.removeEdge(0, 1);
        System.out.println("Updated adjacencyMatrix:");
        graph.printGraph();
        System.out.println("Edge between 1 & 2: " + graph.isEdge(1, 2));
    }
}
