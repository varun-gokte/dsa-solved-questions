/*
 * Minimum number of steps to reduce a number to 1 using the following ops only:
 * Decrement by 1
 * Divide by 2
 * Divide by 3
 */

class Reduce_to_One
{
    int reduce(int n,int arr[])
    {
        int num;
        if (n<=3)
            return 1;
        if (arr[n]!=0)
            return arr[n];  
        else
        {
            num=reduce(n-1,arr);
            if (n%2==0)
                num=Math.min (num,reduce(n/2,arr));
            if (n%3%3==0)
                num=Math.min (num,reduce(n/3,arr));
        }
        return num;
    }

    public static void main(String[] args) {
        Reduce_to_One rto = new Reduce_to_One();
        int n=6;
        int arr[] = new int[n];
        System.out.println (rto.reduce(n, arr));
    }

}