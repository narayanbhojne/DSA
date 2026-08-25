import java.util.*;
class BFS
{
    private LinkedList<Integer> adjecency[];

    public BFS(int v)
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

    public void bfsTraversal(int start)
    {
        boolean visitor[]=new boolean[adjecency.length];

        Queue<Integer> queue=new LinkedList<Integer>();

        visitor[start]=true;
        queue.add(start);
        while(!queue.isEmpty())
        {
            int current=queue.poll();

            System.out.print(current+" ");

            for(int i=0; i<adjecency[current].size(); i++)
            {
                int neighbour=adjecency[current].get(i);

                if(visitor[neighbour]==false)
                {
                    visitor[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }
    }
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of vertex:");
        int v=sc.nextInt();
        System.out.print("Enter no of edges: ");
        int e=sc.nextInt();
        BFS graph=new BFS(v);
        System.out.println("Eter (u,v)");

        for(int i=0; i<e; i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();

            graph.addEdges(s,d);
        }
            System.out.println("Enter Starting ((node))):");
            int start=sc.nextInt();

            System.out.println("bfs traversal: ");

            graph.bfsTraversal(start);
    }
}