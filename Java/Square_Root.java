class Square_Root
{
    public int sqrt(int A)
    {
        if (A<2)
            return A;
        long upper=A,lower=1;
        while (lower<=upper)
        {
            long mid=(upper+lower)/2;
            if (mid*mid<=A && (mid+1)*(mid+1)>A)
                return (int)mid;
            else if (mid*mid<A)
                lower=mid+1;
            else   
                upper=mid-1;
        }
        return -1;
    }
}