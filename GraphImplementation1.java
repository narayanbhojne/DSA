import java.util.*;

class GraphImplementation1 {

    private LinkedList<Integer> adjacency[];

    public GraphImplementation1(int v) {

        adjacency = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjacency[i] = new LinkedList<>();
        }
    }

    // Insert Edge
    public void insertEdge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s); // Remove for directed graph
    }

    // Display Graph
    public void printGraph() {

        System.out.println("\nAdjacency List:");

        for (int i = 0; i < adjacency.length; i++) {

            System.out.print(i + " -> ");

            for (int neighbour : adjacency[i]) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        GraphImplementation1 graph = new GraphImplementation1(v);

        System.out.println("Enter edges (source destination):");

        for (int i = 0; i < e; i++) {

            int s = sc.nextInt();
            int d = sc.nextInt();

            graph.insertEdge(s, d);
        }

        graph.printGraph();

        sc.close();
    }
}