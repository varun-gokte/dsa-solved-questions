import java.util.*;
class Reverse_Integer
{
    int reverse(int x)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int num=x,count=0;
        while (num!=0)
        {
            stack.push(num%10);
            num/=10;
            count++;
        }   
        int len=count;
        num=0;
        long ans=0;
        while (count>0)
        {
            ans+=(stack.pop()*Math.pow(10,len-count));
            count--;
        }

        if (ans==(int)ans)
            return (int)ans;
        else
            return 0;
    }

    public static void main(String[] args) 
    {
        Reverse_Integer ri = new Reverse_Integer();
        int n=-12345;
        System.out.println (ri.reverse(n));
    }
}