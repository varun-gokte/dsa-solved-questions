import java.util.*;

class Largest_Number
{
    String largestNumber(final int[] A) {
        if (A.length==0)
            return "";

        String[] arr = new String[A.length];
        for (int i=0; i<A.length; i++)
            arr[i]=Integer.toString(A[i]);

        Arrays.sort (arr, new Comparator<String>() {
            public int compare (String a, String b) {
                String s1=a+b;
                String s2=b+a;
                return s2.compareTo(s1);
            }
        });

        if (arr[0].equals("0"))
            return "0";

        String str="";
        for (int i=0; i<arr.length; i++)
            str+=arr[i];

        return str;
    }
}