import java.util.*;

class bfstraversal3 {

    private LinkedList<Integer>[] adjecency;

    public bfstraversal3(int v) {

        adjecency = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjecency[i] = new LinkedList<Integer>();
        }
    }

    public void addEdges(int s, int d) {

        adjecency[s].add(d);
        adjecency[d].add(s); // Remove this line for directed graph
    }

    public void bfsTraversal(int start) {

        boolean[] visited = new boolean[adjecency.length];

        Queue<Integer> queue = new LinkedList<Integer>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int i = 0; i < adjecency[current].size(); i++) {

                int neighbour = adjecency[current].get(i);

                if (visited[neighbour] == false) {

                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        bfstraversal3 graph = new bfstraversal3(v);

        System.out.println("Enter edges (u v):");

        for (int i = 0; i < e; i++) {

            int s = sc.nextInt();
            int d = sc.nextInt();

            graph.addEdges(s, d);
        }

        System.out.print("Enter starting node: ");
        int start = sc.nextInt();

        System.out.print("BFS Traversal: ");
        graph.bfsTraversal(start);

        sc.close();
    }
}