class Climbing_Staircase
{
    int climbStairs(int n)
    {
        if (n<=2)
            return n;
        int[] arr = new int[n+1];
        for (int i=1; i<=n; i++)
        {
            if (i<=2)
                arr[i]=i;
            else
                arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}



/*
  ALT: Recursion - too slow
  int climbStairs(int n)
    {
        int[] arr=new int[n+1];
        int ans=helper(n,arr);
        return ans;
    }
    int helper(int n,int[] arr)
    {
        if (arr[n]!=0)
            return arr[n];
        else if (n<=2)
            return n;
        else
        {
            int sol=climbStairs(n-1)+climbStairs(n-2);
            arr[n]=sol;
            return sol;
        }
    }
 */