class Search_Insert_Position
{
    int searchInsert(int[] nums, int target) 
    {
        int lower=0, upper=nums.length-1;
        if (target<nums[0])
            return 0;
        else if (target>nums[nums.length-1])
            return nums.length;

        while (lower<=upper)
        {
            int mid=(upper+lower)/2;
            if (target==nums[mid])
                return mid;
            else if (upper==lower)
                return upper;

            if (target<nums[mid])
                upper=mid;
            else
                lower=mid+1;
        }
        return -1; 
    }
}
//       |
//[1,3,5,6]
// 0 1 2 3
//lower=3
//upper=3
//mid=3
//target=7