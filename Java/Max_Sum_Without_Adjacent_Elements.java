class Max_Sum_Without_Adjacent_Elements
{
    public int adjacent(int[][] A) {
        int cols=A[0].length;
        
        int dp[] = new int[cols+1];
        dp[0]=0;
        dp[1]=Math.max (A[0][0],A[1][0]);
        
        for (int i=1; i<cols; i++)
        {
            int col_max=Math.max(A[0][i],A[1][i]);
            dp[i+1]=Math.max(dp[i],dp[i-1]+col_max);
        }
        
        return dp[cols];
    }
}