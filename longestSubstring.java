import java.util.*;
class longestSubstring
{
    public static void main(String args[])
    {
        String str="abcdabcbbfghjkl";
        int start=0;
        int end=0;
        int maxLength=0;

        List<Character> list=new ArrayList<Character>();

        while(end<str.length())
        {
            if(!list.contains(str.charAt(end)))
            {
                list.add(str.charAt(end));
                end++;
                maxLength=Math.max(maxLength, list.size());
            }
            else
            {
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        System.out.println(maxLength);
    }
}