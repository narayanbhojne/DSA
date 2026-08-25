import java.util.*;
class GraphCreation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of edges: ");
        int E=sc.nextInt();
        System.out.println("Enter number of Vertex: ");
        int V=sc.nextInt();

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0; i<V; i++)
        {
            graph.add(new ArrayList<>());
        }
        System.out.println("enter edges  (E and V)");

        for(int i=0; i<E; i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        System.out.println("Adjacency list: ");

        for(int i=0; i<V; i++)
        {
            System.out.print(i+"->");

            for(int neighbour: graph.get(i))
            {
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }

    }
}