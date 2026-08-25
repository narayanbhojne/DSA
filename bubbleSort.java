class bubbleSort
{
    public static void main(String[] args) {
        
        int arr[]={1,8,7,6,5,4,3};

        for(int i=0; i<arr.length-1; i++)
        {
            int min=i;
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array");

        for(int k=0; k<arr.length; k++)
        {
            System.out.print(arr[k]+" ");
        }
    }

}