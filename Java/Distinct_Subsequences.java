class Distinct_Subsequences
{
    public int numDistinct(String A, String B) {
        int[][] dp = new int[A.length()][B.length()];
        for (int i=0; i<A.length(); i++)
            for (int j=0; j<B.length(); j++)
                dp[i][j]=-1;
        helper (dp,A,B,0,0);
        
        return dp[0][0];
    }
    
    int helper (int[][] dp, String A, String B, int i, int j)
    {
        if (j==B.length())
            return 1;
        if (i==A.length())
            return 0;
            
        if (dp[i][j]!=-1)
            return dp[i][j];
            
        if (A.charAt(i)==B.charAt(j))
            dp[i][j]=helper (dp,A,B,i+1,j+1) + helper (dp,A,B,i+1,j);
        else
            dp[i][j]= helper(dp,A,B,i+1,j);
        return dp[i][j];
    }
}