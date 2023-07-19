import java.util.*;
class Group_Anagrams
{
    List<List<String>> groupAnagrams(String[] strs)
    {
        List<List<String>> big_list = new ArrayList<>();
        HashMap<String,List<String>> hash = new HashMap<>();

        for (int i=0; i<strs.length; i++)
        {
            char[] str=strs[i].toCharArray();
            Arrays.sort(str);;
            String s=String.valueOf(str);
            
            if (hash.containsKey(s)==true)
            {
                List<String> l1=hash.get(s);
                l1.add(strs[i]);    
                hash.replace(s,l1);
            }
            else
            {
                List<String> l1 = new ArrayList<>();
                l1.add(strs[i]);
                hash.put(s,l1);
            }
        }

        for (Map.Entry<String,List<String>> entry: hash.entrySet())
        {
            List<String> value=entry.getValue();
            big_list.add(value);
        }
        return big_list;
    }
}