class Length_of_Longest_Subsequence
{
    public int longestSubsequenceLength(final int[] A) {
        int[] lis = new int[A.length];
        int[] lds = new int[A.length];

        for (int i=0; i<A.length; i++)
        {
            lis[i]=1;
            lds[i]=1;
        }

        for (int i=0; i<A.length; i++)
        {
            for (int j=0; j<i; j++)
            {
                if (A[i]>A[j] && lis[j]+1>lis[i])
                    lis[i]=1+lis[j];
            }
        }

        for (int i=A.length-1; i>=0; i--)
        {
            for (int j=A.length-1; j>i; j--)
            {
                if (A[i]>A[j] && lds[j]+1>lds[i])
                    lds[i]=1+lds[j];
            }
        }
        
        int max=0;
        for (int i=0; i<A.length; i++)
        {
            if (lis[i]+lds[i]-1>max)
                max=lis[i]+lds[i]-1;
        }
        return max;
    }
}