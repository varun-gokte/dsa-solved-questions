import java.util.HashMap;
class Subarray_Sum_Equals_K
{
    int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result=0,sum=0;
        map.put(0,1);
        
        for (int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            if (map.containsKey(sum-k))
                result+=map.get(sum-k);

            if (map.containsKey(sum))
                map.replace(sum, map.get(sum)+1);
            else
                map.put(sum, 1);
        }

        return result;
    }
}