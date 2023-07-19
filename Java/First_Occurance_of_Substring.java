import java.util.Queue;
import java.util.LinkedList;
class First_Occurance_of_Substring
{
    int strStr(String haystack, String needle)
    {
        Queue<Character> queue = new LinkedList<>();
        for (char straw : haystack.toCharArray())
            queue.offer(straw);
        int count=0;
        int len=needle.length();
        String s="";
        while (count<haystack.length())
        {
            while (s.length()<len)
            {    
                s+=queue.poll();
                count++;
            }
            if (s.equals(needle))
                return count-len;
            String t="";
            for (int i=1; i<len; i++)
                t+=s.charAt(i);
            s=t;
        }
        return -1;
    }
}