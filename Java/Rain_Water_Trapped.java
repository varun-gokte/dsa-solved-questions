class Rain_Water_Trapped
{
    int trap(final int[] A)
    {
        int water=0;

        int[] left_max = new int[A.length];
        int[] right_max = new int[A.length];

        int l=0,r=0;

        for (int i=0; i<A.length; i++)
        {
            if (A[i]>l)
                l=A[i];
            left_max[i]=l;
        }

        for (int i=A.length-1; i>=0; i--)
        {
            if (A[i]>r)
                r=A[i];
            right_max[i]=r;
        }

        for (int i=0; i<A.length; i++)
        {
            int min=Math.min(left_max[i],right_max[i]);
            int num=min-A[i];
            if (num>0)
                water+=num;
        }

        return water;
    }   
}