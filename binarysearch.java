

class binarysearch
{
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8,9};
        int start=0;
        int end=arr.length-1;
        int target=7;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target==arr[mid])
            {
                System.out.println("Element foud at index "+mid);
            }

            if(target>mid)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    }
}