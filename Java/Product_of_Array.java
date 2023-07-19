class Product_of_Array
{
    int[] productExceptSelf(int[] nums)
    {
        int[] forward = new int[nums.length];
        int[] backward = new int[nums.length];
        int i;
        
        
        for (i=0; i<nums.length; i++)
        {
            forward[i]=1;
            backward[i]=1;
        }

        for (i=0; i<nums.length-1; i++)
            forward[i+1]=nums[i]*forward[i];

        for (i=nums.length-1; i>0; i--)
            backward[i-1]=nums[i]*backward[i];

        for (i=0; i<nums.length; i++)
            nums[i]=forward[i]*backward[i];
        
        return nums;
    }
}

//[1,2,3,4]
//[1,1,1,1]