class Min_Subarray_Size
{
    int minSubArrayLen(int target, int[] nums)
    {
        int result=Integer.MAX_VALUE;
        int left=0,sum=0;

        for (int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            
            if (sum>=target)
            {
                result=Math.min (result, left-i+1);
                sum-=nums[left];
                left++;
            }
        }
        return (result==Integer.MAX_VALUE)?0 :result;
    }

    public static void main(String[] args) 
    {
        Min_Subarray_Size mss = new Min_Subarray_Size();
        int target = 11, nums[] = {5,1,3,5,10,7,4,9,2,8};
        System.out.println (mss.minSubArrayLen(target, nums));    
    }
}

//target = 4
/* ALT: INEFFICIENT
    int minSubArrayLen(int target, int[] nums)
    {
        int left_ptr=0;
        int right_ptr=0;
        int minLen=Integer.MAX_VALUE;
        int prev=Integer.MAX_VALUE;
        int dead_end=0;
        int c=0;
        while (left_ptr<nums.length-1)
        {
            int sum=0;
            int i=0;
            for (i=left_ptr; i<=right_ptr; i++)
                sum+=nums[i];
            i=right_ptr-left_ptr+1;
            if (sum>=target && i<=minLen)
            {
                minLen=i;
                left_ptr++;
            }
            else if (right_ptr<nums.length-1)
                right_ptr++;
            if (prev==left_ptr && dead_end>1)
                break;
            if (right_ptr==nums.length-1 && sum<target)
            {    prev=left_ptr;
                if (prev==left_ptr) dead_end++;
            }
            System.out.println("count "+ c++);
        }

        return (minLen==Integer.MAX_VALUE)?0 :minLen;
    }
*/