import java.util.HashMap;
import java.util.Map;

class Longest_Repeating_Char_Replacement
{
    public int characterReplacement(String s, int k) {
        if (k==0)
            return 0;
        if (s.length()<2)
            return s.length();

        int sub=0;
        int l=0,r=0,str_len=s.length();
        HashMap<Character,Integer> map = new HashMap<>();

        while (r<str_len) {
            char ch=s.charAt(r);
            if (map.containsKey(ch))
                map.replace(ch,map.get(ch)+1);
            else
                map.put(ch,1);
            
            int window_size=r-l+1;
            int max=0;
            for (Map.Entry<Character,Integer> entry : map.entrySet())
                max=Math.max(max,entry.getValue());
            
            int rep=window_size-max;
            if (rep<=k)
                sub=Math.max(window_size,sub);
            else {
                char c = s.charAt(l);
                map.replace (c,map.get(c)-1);
                l++;
            }
        }
        return sub;
    }
}