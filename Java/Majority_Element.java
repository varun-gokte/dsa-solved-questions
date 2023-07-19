import java.util.*;
class Majority_Element
{
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> counter = new HashMap<Integer,Integer>();
        for (int i=0; i<nums.length; i++)
        {
            if (counter.containsKey(nums[i])==false)
                counter.put(nums[i],1);
            else
            {
                int count=counter.get(nums[i]);
                counter.replace (nums[i],count+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : counter.entrySet())
        {
            Integer key=(Integer)entry.getKey();
            Integer value=(Integer)entry.getValue();
            if (value>nums.length/2)
                return key;
        }
        return -1;
    }
}