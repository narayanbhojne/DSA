class bestByAndSell
{
    public static void main(String[] args) {
        
        int arr[]={1,2,4,7,6,5,8,9};

        int minprice=arr[0];
        int maxProfit=0;

        for(int i=1; i<arr.length; i++)
        {
            if(minprice>arr[i])
            {
                minprice=arr[i];
            }

            int profit=arr[i]-minprice;

            if(profit>maxProfit)
            {
                maxProfit=profit;
            }
        }
        System.out.println("max profit is="+maxProfit);
    }
}