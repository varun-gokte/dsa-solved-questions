class Edit_Distance
{
    int[][] dp;
    int minDistance(String A, String B) {
        dp = new int[A.length()][B.length()];
        return findMin (A,B,0,0); 
    }

    int findMin (String A, String B, int i, int j)
    {
        if (i==A.length() || j==B.length())
            return (A.length()-i+B.length()-j);
        
        if (A.charAt(i)==B.charAt(j))
            return findMin(A, B, i+1, j+1);
        
        if (dp[i][j]!=0)  
            return dp[i][j]; 
            
        int add=findMin(A, B, i+1, j)+1;
        int del=findMin(A, B, i, j+1)+1;
        int rep=findMin(A, B, i+1, j+1)+1;

        dp[i][j]=Math.min(Math.min(add, del), rep);  
        
        return dp[i][j];
    }
}