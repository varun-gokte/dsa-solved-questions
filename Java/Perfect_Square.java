class Perfect_Square
{
    boolean isPerfectSquare(int num)
    {
        int i=1;
        boolean flag=false;
        while (i<=num)
        {
            if (Math.pow(i,2)==num)
                flag=true;
            i++;
        }
        return flag;
    }

    public static void main(String[] args) 
    {
        Perfect_Square obj = new Perfect_Square();
        int x=2000105819;
        System.out.println (obj.isPerfectSquare(x));
    }
}