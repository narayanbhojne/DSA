import java.util.*;
class DFSTraversal
{
    private LinkedList<Integer> adjecency[];

    public DFSTraversal(int v)
    {
        adjecency=new LinkedList[v];

        for(int i=0; i<v; i++)
        {
            adjecency[i]=new LinkedList<Integer>();
        }
    }

    public void addEdges(int s, int d)
    {
        adjecency[s].add(d);
        adjecency[d].add(s);//remove directed edges:
    }

    public void dfsTraversals(int current, boolean visited[])
    {
        visited[current]=true;
        System.out.print(current+" ");

        for(int i=0; i<adjecency[current].size(); i++)
        {
            int neighbour=adjecency[current].get(i);
            if(visited[neighbour]==false)
            {
                dfsTraversals(neighbour, visited);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Vertex: ");
        int v=sc.nextInt();
        System.out.println("Enter No of edges: ");
        int e=sc.nextInt();

        DFSTraversal graph=new DFSTraversal(v);

        System.out.println("Enter U and V");

        for(int i=0; i<e; i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();

            graph.addEdges(s,d);
        }

        boolean visited[]=new boolean[v];
        System.out.println("Enter starting node: ");
        int start=sc.nextInt();

        System.out.println("Dfs Traversal: ");

        graph.dfsTraversals(start, visited);
    }

}