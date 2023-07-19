class Unique_BSTs
{
    public int numTrees(int n) {
        int[] cache = new int[n+1];
        if (n<2)
            return 1;
        cache[0]=1;
        cache[1]=1;

        for (int i=2; i<n+1; i++)
        {
            int total=0;
            for (int j=1; j<i+1; j++)
            {
                int left=cache[j-1];
                int right=cache[i-j];
                total+=left*right;
            }
            cache[i]=total;
        }

        return cache[n];
    }   
}