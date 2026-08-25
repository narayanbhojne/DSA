import java.util.*;
class longestconsicative1
{
    public static void main(String[] args) {
        
        int arr[]={1,2,7,6,5,4,8};

        Arrays.sort(arr);

        int count=1;
        int longest=1;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]==arr[i-1]+1)
            {
                count++;
            }
            else
            {
                //longest=Math.max(longest,count);
                count=1;
            }
        }
        System.out.println(count);
    }
}