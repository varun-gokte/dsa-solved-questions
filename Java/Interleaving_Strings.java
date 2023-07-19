class Interleaving_Strings
{
    public int isInterleave(String A, String B, String C) {
        boolean[] dp = new boolean[C.length()];
        
        return (helper (dp,A,B,C,0,0))?1:0;
    }
    
    boolean helper (boolean[] dp,String A, String B, String C, int i, int j) {
        if (i+j==C.length())
            return true;
            
        if (dp[i+j]==true)
            return true;
        
        if (i<A.length() && j<B.length() && A.charAt(i)==C.charAt(i+j) && B.charAt(j)==C.charAt(i+j))
            dp[i+j]=helper(dp,A,B,C,i,j+1) || helper(dp,A,B,C,i+1,j);
                
        else if (i<A.length() && A.charAt(i)==C.charAt(i+j))
            dp[i+j]=helper(dp,A,B,C,i+1,j);
            
        else if (j<B.length() && B.charAt(j)==C.charAt(i+j))
            dp[i+j]=helper(dp,A,B,C,i,j+1);
                 
        else 
            return false;
        
        return dp[i+j];
    }
}