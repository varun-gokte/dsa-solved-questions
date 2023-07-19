import java.util.HashSet;

class Happy_Number
{
    boolean isHappy(int n)
    {
        HashSet<Integer> list = new HashSet<>();
        while (true)
        {
            int temp=n,sum=0;
            while (temp!=0)
            {
                sum+=Math.pow(temp%10, 2);
                temp/=10;
            }
            if (sum==1)
                return true;
            if (list.contains(sum))
                return false; 
            list.add(sum);
            n=sum;
        }
    }
}