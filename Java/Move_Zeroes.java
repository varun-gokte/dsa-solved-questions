class Move_Zeroes
{
    void moveZeroes(int[] nums)
    {
        for (int i=nums.length-1; i>=0; i--)
        {
            if (nums[i]==0)
            {
                int j=i,temp;
                while (j<nums.length-1)
                {
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    j++;
                }
            }
        }
        for (int i=0; i<nums.length;i++)
            System.out.print (nums[i]+" ");
    }

    public static void main(String[] args) {
        Move_Zeroes mz = new Move_Zeroes();
        int[] x={0,1,0,3,12};
        mz.moveZeroes(x);
    }
}