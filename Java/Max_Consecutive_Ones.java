class Max_Consecutive_Ones
{
    int longestOnes(int[] nums, int k)
    {
        int zeroCount=0, maxLen=0, start=0;

        for (int end=0; end<nums.length; end++) {
            if (nums[end]==0)
                zeroCount++;

            if (zeroCount>k) {
                if (nums[start]==0)
                    zeroCount--;
                start++;
            }

            maxLen=Math.max(maxLen, end-start+1);
        }

        return maxLen;
    }
}