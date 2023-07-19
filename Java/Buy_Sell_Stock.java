class Buy_Sell_Stock
{
    public int maxProfit(int[] prices) 
    {
        int l=0,r=1,diff,max_diff=0;
        while (l<prices.length && r<prices.length)
        {
            diff=prices[r]-prices[l];
            if (diff<0)
                l=r;
            else if (diff>max_diff)
                max_diff=diff;
            r++;
        }    
        return max_diff;
    }
}