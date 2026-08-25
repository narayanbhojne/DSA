class inteferonce
{
    public static void main(String args[])
    {
        int arr[]={1,3,4,8,8,7,5,5,4,9,4,1,2,6,6,7};

        
        int number=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            int count=0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }    
            }
            if(count==1)
            {
                System.out.println("Single Number="+arr[i]);
                break;
            }
        }

    }
}