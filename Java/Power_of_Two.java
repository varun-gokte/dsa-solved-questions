 class Power_of_Two
 {
    boolean isPowerOfTwo(int n)
    {
        if (n<=0)
            return false;
        while (n>1)
        {
            if (n%2==0)
                n/=2;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Power_of_Two pot = new Power_of_Two();
        int n=0;
        System.out.println (pot.isPowerOfTwo(n));
    }
 }