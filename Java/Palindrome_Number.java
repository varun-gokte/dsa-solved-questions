import java.util.*;
class Palindrome_Number
{
    boolean isPalindrome(int x)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int num=x,count=0;
        if (x<0)
            return false;
        while (num!=0)
        {
            stack.push(num%10);
            num/=10;
            count++;
        }   
        int len=count;
        num=0;
        while (count>0)
        {
            num+=(int)(stack.pop()*Math.pow(10,len-count));
            count--;
        }
        if (num==x)
            return true;
        else
            return false;
    }

    public static void main(String[] args) 
    {
        Palindrome_Number pn = new Palindrome_Number();
        int n=2147483647;
        System.out.println (pn.isPalindrome(n));
    }
}