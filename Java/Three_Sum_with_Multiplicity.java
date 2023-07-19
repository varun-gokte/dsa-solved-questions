import java.util.*;

class Three_Sum_with_Multiplicity
{
    int threeSumMulti(int[] arr, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        long res=0;

        for (int i : arr)
        {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], 0);
            else
                map.replace(arr[i],map.get(arr[i])+1);
        }

        for (Map.Entry<Integer,Integer> mapElOne : map.entrySet())
        {
            for (Map.Entry<Integer,Integer> mapElTwo : map.entrySet())
            {
                int a=mapElOne.getKey  ();
                int b=mapElTwo.getKey();
                int c=target-a-b;
                if (!map.containsKey(c))
                    continue;
                
                if  (a==b && b==c)
                    res+=map.get(a)*(map.get(a)-1)*(map.get(a)-2)/6;
                else if (a==b && b!=c)
                    res+=map.get(a)*(map.get(a)-1)*map.get(c)/2;
                else
                    res+=map.get(a)*map.get(b)*map.get(c);
            }
        }

        return (int)res % 1000000007;
    }
}