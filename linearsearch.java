class linearsearch
{
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        int search=5;
        boolean b=false;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==search)
            {
                b=true;
            }
        }

        if(b)
        {
            System.out.println("available");
        }
        else
        {
            System.out.println("not available");
        }
    }

}