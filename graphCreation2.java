/* import java.util.*;

class graphCreation2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter No of Edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u); // Remove this line for directed graph
        }

        System.out.println("\nAdjacency List:");

        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");

            for (int neighbour : graph.get(i)) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }

        sc.close();
    }
} */

import java.util.*;

class graphCreation2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter No of vertex:");
        int V=sc.nextInt();
        System.out.print("Enter no of edges: ");
        int E=sc.nextInt();

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0; i<V; i++)
        {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter (u,v)");

        for(int i=0; i<E; i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i=0; i<V; i++)
        {
            System.out.print(i+"->");

            for(int neighbour : graph.get(i))
            {
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}