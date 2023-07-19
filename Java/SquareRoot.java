class SquareRoot
{
    int mySqrt(int x)
    {
        int i=1;
        while (true)
        {
            if (Math.pow(i,2)>x)
                break;
            i++;
        }
        return --i;
    }

    public static void main(String[] args) 
    {
        SquareRoot obj = new SquareRoot();
        int x=2147395600;
        System.out.println (obj.mySqrt(x));
    }
}