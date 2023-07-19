class Remove_Duplicates_From_Array
{
    int removeDuplicates(int[] nums)
    {
        int count=1,fast=1,slow=1;
        while (fast<nums.length)
        {
            if (nums[fast]!=nums[fast-1])
            {
                nums[slow]=nums[fast];
                slow++;
                count++;
            }
            fast++;
        }
        return count;
    }
}