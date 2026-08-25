import java.util.*;

class Stair {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of steps: ");
        int n = sc.nextInt();

        System.out.println("Enter three valid jumps:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        boolean[] broken = new boolean[n + 1];

        System.out.print("Enter number of broken stairs: ");
        int m = sc.nextInt();

        System.out.println("Enter broken stair numbers:");
        for (int i = 0; i < m; i++) {
            int stair = sc.nextInt();

            if (stair >= 0 && stair <= n) {
                broken[stair] = true;
            }
        }

        long[] dp = new long[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {

            if (broken[i])
                continue;

            if (i >= x)
                dp[i] += dp[i - x];

            if (i >= y)
                dp[i] += dp[i - y];

            if (i >= z)
                dp[i] += dp[i - z];
        }

        System.out.println("Ways = " + dp[n]);
    }
}