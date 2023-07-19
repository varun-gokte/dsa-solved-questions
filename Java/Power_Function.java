class Power_Function
{
    double myPow(double x, int n)
    {
        if (n==-2147483648)
        {
            n=Math.abs(n+1);
            System.out.println (n);
            double ans=extra(x,n);
            ans=1/ans;
            return ans/x;
        }
        else if (n<0)
        {
            double ans=extra(x,Math.abs(n));
            return (1/ans);
        }
        else
            return extra(x,n);
    }
    double extra(double x, int n)
    {
        if (n==0)
            return 1;

        double res=0;   
        res=extra(x,n/2);
        if (n%2==0)
            return res*res;
        else
            return res*res*x;
    }

    public static void main(String[] args) 
    {
        Power_Function pf = new Power_Function();
        double x=2.00000;
        int n=2147483647;
        System.out.println (pf.myPow(x, n));
    }
}

/*double myPow(double x, int n)
    {
        boolean negative=false;
        double res=1;
        if (n==0)
            return 1;

        if (n<0)
        {
            negative=true;
            n=Math.abs(n);
        }

        for (int i=1; i<=n; i++)
            res*=x;

        if (negative)
            res=1/res;
            
        return res;
    } */