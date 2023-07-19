import java.util.*;
class Three_Sum
{
    public List<List<Integer>> threeSum(int[] nums)
    {
       HashSet<List<Integer>> res = new HashSet<>();
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(nums);

       for (int i=0; i<nums.length-2; i++)
       {
           int l=i+1,r=nums.length-1;
           int req=0-nums[i];
           while (l<r)
           {
                int sum=nums[l]+nums[r];
                if (sum==req && !res.contains(Arrays.asList(nums[i],nums[l],nums[r])))
                {
                    List<Integer> a = Arrays.asList(nums[i],nums[l],nums[r]);
                    Collections.sort(a);
                    res.add(a);
                }
                else if (sum>req)
                    r--;
                else
                    l++;
           }
       }

        for (List<Integer> i : res)
            ans.add(i);

        return ans;
    }
}