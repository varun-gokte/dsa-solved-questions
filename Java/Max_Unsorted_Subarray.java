import java.util.Arrays;

class Max_Unsorted_Subarray
{
    int[] subUnsort(int[] A)
    {
        int[] arr=A.clone();
        Arrays.sort(arr);
        int start=-1,end=-1;
        for (int i=0; i<A.length; i++)
        {
            if (start==-1 && A[i]!=arr[i])
                start=i;
            else if (A[i]!=arr[i])
                end=i;
        }
        return (start==-1)?new int[]{-1}:new int[]{start,end};
    }
}