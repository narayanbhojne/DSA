/* import java.util.*;
class bfstraversal2
{
    private LinkedList<Integer> adjecency[];

    public bfstraversal2(int v)
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
    public void bfs(int start)
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

        System.out.println("Enter no of vertex: ");
        int v=sc.nextInt();
        System.out.println("Enter no of edges: ");
        int e=sc.nextInt();

        bfstraversal2 graph=new bfstraversal2(v);

        System.out.println("Enter u and v");

        for(int i=0; i<e; i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();

            graph.addEdges(s,d);
        }

        System.out.println("Enter Starting vertex: ");
        int start=sc.nextInt();

        graph.bfs(start);


        
    }
} */

import java.util.*;
class bfstraversal2
{
    private LinkedList<Integer> adjecency[];

    public bfstraversal2(int v)
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

    public void bfs(int start)
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

        System.out.println("Enter No of vertex: ");
        int v=sc.nextInt();
        System.out.println("Enter no of edges: ");
        int e=sc.nextInt();

        bfstraversal2 graph=new bfstraversal2(v);

        System.out.println("Enter (s,d)");

        for(int i=0; i<e; i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();

            graph.addEdges(s,d);
        }

        System.out.println("Enter starting node: ");
        int start=sc.nextInt();

        graph.bfs(start);
    }
}