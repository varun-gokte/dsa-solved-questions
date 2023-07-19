class Longest_Increasing_Subsequence
{
    int lengthOfLIS(int[] nums)
    {
        int[] dp = new int[nums.length];
        for (int i=0; i<nums.length; i++)
            dp[i]=1;
        findLength(nums, nums.length-1,dp);
        int max=0;
        for (int i=0; i<nums.length; i++)
            if (dp[i]>max)
                max=dp[i];
        return max;
    }

    void findLength (int nums[], int i, int[] dp)
    {
        if (i==-1)
            return;

        for (int j=i; j<nums.length; j++)
        {
            if (nums[i]<nums[j] && dp[i]<1+dp[j])
                dp[i]=1+dp[j];
        }
        findLength(nums, i-1, dp);
    }
}