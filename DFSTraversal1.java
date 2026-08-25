import java.util.*;
class DFSTraversal1
{
    private LinkedList<Integer> adjecency[];

    public DFSTraversal1(int v)
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
        adjecency[d].add(s);
    }

    public void dfsTraversal(int current, boolean visited[])
    {
        visited[current]=true;
        System.out.print(current+" ");

        for(int i=0; i<adjecency[current].size(); i++)
        {
            int neighbour=adjecency[current].get(i);
            if(visited[neighbour]==false)
            {
                dfsTraversal(neighbour, visited);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of vertex: ");
        int v=sc.nextInt();
        System.out.println("Enter no of edges: ");
        int e=sc.nextInt();

        DFSTraversal1 graph=new DFSTraversal1(v);

        System.out.println("Enter (u,v)");

        for(int i=0; i<e; i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();

            graph.addEdges(s,d);
        }
        
        boolean visited[]=new boolean[v];
        
        System.out.println("Enter start vertex: ");
        int start=sc.nextInt();

        graph.dfsTraversal(start, visited);
    }
}