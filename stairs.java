import java.util.*;
class stairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int Z=sc.nextInt();
        int M=sc.nextInt();

        boolean broken[]=new boolean[N];
        for(int i=0; i<M; i++)
        {
            int stair=sc.nextInt();
            if(stair<=N)
            {
                broken[stair]=true;
            }
        }
        long dp[]=new long[N+1];

        dp[0]=1;
        for(int i=0; i<N; i++)
        {
            if(broken[i]==true)
            {
                continue;
            }

            if(i>=X)
            {
                dp[i]=dp[i]+dp[X-i];
            }
            if(i>=Y)
            {
                dp[i]=dp[i]+dp[Y-i];
            }
            if(i>=Z)
            {
                dp[i]=dp[i]+dp[Z-i];
            }
        }
        System.out.println(dp[N]);

    }
}

