import java.util.*;
class largestElemtn
{
    public static void main(String[] args) {
        
        int arr[]={1,5,4,3,6,7,8,9,88,1};

        Arrays.sort(arr);

        System.out.println(arr[arr.length-2]);
    }
}