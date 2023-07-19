class Trapping_Rain_Water
{
    //O(1) space
    int trap(final int[] A)
    {
        int maxLeft=A[0],maxRight=A[A.length-1],l=0,r=A.length-1,sum=0;

        while (l<=r)
        {
            if (maxLeft<=maxRight)
            {
                if (maxLeft-A[l]>0)
                    sum+=maxLeft-A[l];
                if (A[l]>maxLeft)
                    maxLeft=A[l];
                l++;
            }
            else
            {
                if (maxRight-A[r]>0)
                    sum+=maxRight-A[r];
                if (A[r]>maxRight)
                    maxRight=A[r];
                r--;
            }
        }

        return sum;
    }

    //O(n) space
    /*int trap(final int[] A)
    {
        int[] maxLeft = new int[A.length];
        int[] maxRight = new int[A.length];

        int i,maxHeight=0,sum=0;

        for (i=0; i<maxLeft.length; i++)
        {
            if (A[i]>maxHeight)
                maxHeight=A[i];
            maxLeft[i]=maxHeight;
        }

        maxHeight=0;

        for (i=maxLeft.length-1; i>=0; i--)
        {
            if (A[i]>maxHeight)
                maxHeight=A[i];
            maxRight[i]=maxHeight;
        }

        for (i=0; i<A.length; i++)
        {
            int n=Math.min(maxLeft[i],maxRight[i])-A[i];
            if (n>0)
                sum+=n;
        }

        return sum;
    }*/
}