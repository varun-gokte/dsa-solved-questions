class Longest_Palindromic_Subsequence {
    public int solve(String A) {
        String B="";
        for (int i=A.length()-1; i>=0; i--)
            B+=A.charAt(i);
        int[][] dp = new int[A.length()][A.length()];
        return find(A,B,0,0,dp);
    }
    
    private int find (String A, String B, int i, int j, int[][] dp)
    {
        if (i==A.length() || j==B.length())
            return 0;
        
        if (dp[i][j]!=0)
            return dp[i][j];
            
        if (A.charAt(i)==B.charAt(j))
        {
            dp[i][j]=find (A,B,i+1,j+1,dp)+1;
            return dp[i][j];
        }
        else
        {
            dp[i][j]=Math.max (find(A,B,i+1,j,dp),find(A,B,i,j+1,dp));
            return dp[i][j];
        }
    }
}