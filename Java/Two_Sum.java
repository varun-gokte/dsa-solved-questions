import java.util.HashMap;

class Two_Sum
{
    int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
        for (int i=0; i<nums.length; i++)
        {
            if (list.containsKey(nums[i]))
            {
                int[] res={list.get(nums[i]),i};
                return res;
            }
            else
                list.put(target-nums[i],i);
        }
        int[] res={-1,-1};
        return res;
    }

    public static void main(String[] args) 
    {
        int[] nums ={3,2,4};
        int target=6;
        Two_Sum ts = new Two_Sum();
        int[] res=ts.twoSum(nums,target);
        for (int i=0; i<res.length; i++)
            System.out.print (res[i]+" "); 
    }
}

/*
 ALT:
 int[] twoSum(int[] nums, int target)
    {
        int i,j;

        for (i=0; i<nums.length-1; i++)
        {
            for (j=i+1; j<nums.length; j++)
            {
                if (nums[i]+nums[j]==target)
                {
                    int[] res = {i,j};
                    return res;
                }
            }
        }
        int[] res={-1};
        return res;
    }
 */