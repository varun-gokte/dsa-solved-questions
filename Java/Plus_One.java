class Plus_One
{ //[9,9,9]
    int[] plusOne(int[] digits)
    {
        int len=digits.length;
        int i=len-1;
        int temp=0;
        digits[i]++;
        while (i>=0 && digits[i]>9)
        {
            digits[i]-=10;
            if (i==0)
                temp=1;
            else
                digits[i-1]++;
            i--;
        }
        if (temp==0)
            return digits;
        else
        {
            int[] ans = new int[len+1];
            ans[0]=temp;
            for (i=1; i<len+1; i++)
                ans[i]=digits[i-1];
            return ans;
        }
    }

    public static void main(String[] args) {
        Plus_One po = new Plus_One();
        int[] x={9};
        int[] y=po.plusOne(x);
        for (int i=0; i<y.length; i++)
            System.out.print (y[i]+" ");
    }
}