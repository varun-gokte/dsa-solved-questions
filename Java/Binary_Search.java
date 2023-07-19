class Binary_Search
{
    int search(int[] nums, int target)
    {
        int lower=0,upper=nums.length-1;
        int mid;
        
        while (lower<=upper)
        {
            mid=(lower+upper)/2;
            if (nums[mid]==target)
                return mid;
            else if (target<nums[mid])
                upper=mid-1;
            else
                lower=mid+1;
        }

        return -1;
    }
}