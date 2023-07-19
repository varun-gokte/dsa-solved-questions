class Power_of_Three
{
    boolean isPowerOfThree(int n)
    {
        double num=n;
        if (n<=0)
            return false;
        while (true)
        {
            if (num!=Math.floor(num))
                return false;
            if (num==1)
                return true;
            num/=3;
        }
    }
}