class Search_in_Rotated_Array
{
    public int search(int[] nums, int target)
    {
       int l=0,r=nums.length-1,mid;
       while (l<=r)
       {
            mid=(l+r)/2;
            if (target==nums[mid])
                return mid;
            if (nums[l]<=nums[mid])
            {
                if (target<nums[l] || target>nums[mid])
                    l=mid+1;
                else
                    r=mid-1;
            }
            else
            {
                if (target>nums[r] || target<nums[mid])
                    r=mid-1;
                else
                    l=mid+1;
            }
       }
       return -1;
    }
}