class Sort_Colors
{
    void sortColors(int[] nums)
    {
        int i;
        int[] arr = new int[3];
        for (i=0; i<nums.length; i++)
            arr[nums[i]]++;
        i=0;
        while (i<nums.length)
        {
            if (i<arr[0])
                nums[i]=0;
            else if (i<arr[0]+arr[1])
                nums[i]=1;
            else
                nums[i]=2;
            i++;
        }
    }
}