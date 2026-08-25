import java.util.*;

class longestsubstring2
{
    public static void main(String[] args) {
        
        String str="abcabcd";
        int start=0;
        int end=0;
        int maxLength=0;

        List<Character> list=new ArrayList<>();
        while(end<str.length())
        {
            if(!list.contains(str.charAt(end)))
            {
                list.add(str.charAt(end));
                end++;
                maxLength=Math.max(list.size(), maxLength);
            }
            else
            {
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        System.out.println("maxlength: "+maxLength);
    }
}