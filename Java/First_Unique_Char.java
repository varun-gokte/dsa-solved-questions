import java.util.*;
import java.util.LinkedList;

class First_Unique_Char
{
    int firstUniqChar(String s)
    {
        HashMap<Character,Integer> list = new HashMap<>();
        Queue<Character> queue = new LinkedList<Character>();
        char[] str=s.toCharArray();
        for (int i=0; i<str.length; i++)
        {
            if (list.containsKey(str[i]))
                list.replace(str[i], list.get(str[i])+1);
            else
                list.put(str[i], 1);
            queue.offer(str[i]);
        }
        int index=0;
        while (!queue.isEmpty())
        {
            char ch=queue.poll();
            if (list.get(ch)==1)
                return index;
            index++; 
        }
        return -1;
    }
}