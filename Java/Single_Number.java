import java.util.*;
class Single_Number
{
    int singleNumber(int[] nums)
    {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for (int i=0; i<nums.length; i++)
        {
            if (hash.containsKey(nums[i])==false)
                hash.put(nums[i], 1);
            else
                hash.replace (nums[i],hash.get(nums[i])+1);
        }
        for (Map.Entry<Integer,Integer> entry : hash.entrySet())
        {
            Integer key = (Integer)entry.getKey();
            Integer val = (Integer)entry.getValue();
            if (val==1)
                return key;
        }
        return -1; 
    }
}