import java.util.*;
class Longest_Substring
{
    int lengthOfLongestSubstring(String s)
    {
        int l=0,r=1,len=s.length(),diff=0,max_diff=1;
        HashMap<Character,Integer> list = new HashMap<Character,Integer>();
        if (s.equals(""))
            return 0;
        list.put(s.charAt(l), l);
        while (l<len && r<len)
        {
            diff=r-l+1;
            if (list.containsKey(s.charAt(r)))
            {
                    list.remove(s.charAt(l));
                    l++;
            }
            else
            {
                list.put(s.charAt(r), r);
                r++;
                if (diff>max_diff)
                    max_diff=diff;
            }
        }
        return max_diff;
    }
    public static void main(String[] args) 
    {
        Longest_Substring ls = new Longest_Substring();
        String s="";
        System.out.println(ls.lengthOfLongestSubstring(s));
    }
}
//a b c a b c b b
//0 1 2 3 4 5 6 7 
//  1   r
//diff=3
//maxdiff=3
/*
b 1
c 2
a 3
 */ 