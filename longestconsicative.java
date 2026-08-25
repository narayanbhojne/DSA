import java.util.*;
class longestconsicative
{
    public static void main(String args[])
    {
        int arr[]={1,2,88,77,66,3,4,5};
        int count=1;
        int max=1;
        Arrays.sort(arr);

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]==arr[i-1])
            {
                continue;
            }

            if(arr[i]==arr[i-1]+1)
            {
                count++;
            }
            else
            {
                count=1;
            }

            if(count>max)
            {
                max=count;
            }

            
        }
        System.out.println(max);
    }
}