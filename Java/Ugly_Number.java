class Ugly_Number
{
    boolean isUgly(int n)
    {
        if (n<= 0)
            return false;
        if (n==1)
            return true;
        while (n>1)
        {
            if (n%5==0)
                n/=5;
            else if (n%3==0)
                n/=3;
            else if (n%2==0)
                n/=2;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Ugly_Number un = new Ugly_Number();
        int n=13;
        System.out.println (un.isUgly(n));
    }
}