import java.util.*;
class BuyAndSell1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int price[]=new int[n];

        for(int i=0; i<n; i++)
        {
            price[i]=sc.nextInt();
        }

        int profit=0;

        for(int i=1; i<n; i++)
        {
            if(price[i]>price[i-1])
            {
                profit=profit+price[i]-price[i-1];
            }
        }
        System.out.println("Profit is : "+profit);
    }
}