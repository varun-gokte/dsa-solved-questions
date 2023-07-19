class Coin_Change
{
    public int coinChange(int[] coins, int amount)
    {
        int[] memo = new int[amount+1];
        memo[0]=0;

        for (int i=1; i<memo.length; i++)
            memo[i]=amount+1;
        
        for (int i=1; i<memo.length; i++)
            for (int j=0; j<coins.length; j++)
                if (i-coins[j]>=0)
                    memo[i]=Math.min (memo[i],1+memo[i-coins[j]]);

        return (memo[amount]==amount+1) ? -1 : memo[amount];
    }

}