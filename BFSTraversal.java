import java.util.*;
class BFSTraversal
{
    private LinkedList<Integer> adjecency[];

    public BFSTraversal(int v)
    {
        adjecency=new LinkedList[v];

        for(int i=0; i<v; i++)
        {
            adjecency[i]=new LinkedList<Integer>();
        }
    }


    void addEdges(int s, int d)
    {
        adjecency[s].add(d);
        adjecency[d].add(s);
    }

    public void bfstravers(int start)
    {
        boolean visited[]=new boolean[adjecency.length];
        Queue<Integer> queue=new LinkedList<Integer>();

        visited[start]=true;
        queue.add(start);

        while(!queue.isEmpty())
        {
            int current=queue.poll();
            System.out.print(current+" ");

            for(int i=0; i<adjecency[current].size(); i++)
            {
                int neighbour=adjecency[current].get(i);

                if(visited[neighbour]==false)
                {
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Vertex: ");
        int v=sc.nextInt();
        System.out.println("Enter no of edges: ");
        int e=sc.nextInt();

        BFSTraversal graph=new BFSTraversal(v);

        System.out.println("Enter E and V");
        for(int i=0; i<e; i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();

            graph.addEdges(s,d);
        }

        System.out.println("Enter Starting node: ");
        int start=sc.nextInt();

        graph.bfstravers(start);
    }
}