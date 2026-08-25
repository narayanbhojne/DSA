class frequency
{
    public static void main(String[] args) {
        
        int arr[]={10,20,30,20,40,50,20,20};
        int maxCount=0;
        for(int i=0; i<arr.length; i++)
        {
            int count=1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }

            if(count>maxCount)
            {
                maxCount=count;
            }
        }
        System.out.println("frequency is "+maxCount);
    }
}