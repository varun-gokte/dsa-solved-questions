import java.util.Stack;

class Next_Greater
{
    public int[] nextGreater(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[A.length];
        int i=0;
        
        while (i<A.length)
        {
            while (!stack.isEmpty() && A[stack.peek()]<A[i])
                res[stack.pop()]=A[i];
            stack.push(i);
            i++;
        }
        while (!stack.isEmpty())
        {
            res[stack.pop()]=-1;
        }
        return res;
    }
}