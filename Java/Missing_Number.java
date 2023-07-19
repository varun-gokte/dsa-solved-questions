class Missing_Number
{
    int missingNumber(int[] nums)
    {
        int calcSum,actSum=0;
        for (int i=0; i<nums.length; i++)
            actSum+=nums[i];
        calcSum=nums.length*(nums.length+1)/2;
        return (calcSum-actSum);
    }
}