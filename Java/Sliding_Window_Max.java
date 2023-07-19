import java.util.Deque;
import java.util.LinkedList;

class Sliding_Window_Max
{
    int[] maxSlidingWindow(int[] nums, int k)
    {
        int[] res = new int[nums.length-k+1];
        Deque<Integer> win = new LinkedList<>();
        int i=0,w=0,c=0;
        while (i<nums.length)
        {
            if (w==k)
            {
                res[c++]=nums[win.peekFirst()];
                w=0;
                if (win.peekFirst()<i-k)
                    win.removeFirst();
            }
            while (!win.isEmpty())
            {
                if (nums[win.peekLast()]<nums[i])
                    win.removeLast();
            }
            win.addLast(i);
            w++;
            i++;
        }

        return res;
    }
}