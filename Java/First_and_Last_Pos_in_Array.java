class First_and_Last_Pos_in_Array
{
    int[] searchRange(int[] nums, int target)
    {
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int lower=0,upper=nums.length-1,mid;
        while (lower<=upper)
        {
            mid=(upper+lower)/2;
            if (nums[mid]==target)
            {
                while (mid>0 && nums[mid-1]==nums[mid])
                    mid--;
                ans[0]=mid;
                while (mid<nums.length-1 && nums[mid+1]==nums[mid])
                    mid++;
                ans[1]=mid;        
                break;
            }
            else if (target<nums[mid])
                upper=mid-1;
            else
                lower=mid+1;
        }
        return ans;
    }
}