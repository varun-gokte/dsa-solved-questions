import java.util.*;

class Find_Median_from_Data_Stream
{
    PriorityQueue<Double> small;
    PriorityQueue<Double>large;

    public Find_Median_from_Data_Stream() {
        small = new PriorityQueue<>(Collections.reverseOrder());
        large = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        small.add((double)num);

        if (!small.isEmpty() && !large.isEmpty() && small.peek()>large.peek())
            large.add(small.remove());

        if (small.size()>large.size()+1)
            large.add(small.remove());
        if (large.size()>small.size()+1)
            small.add(large.remove());
    }
    
    public double findMedian() {
        if (small.size()<large.size())
            return large.peek();
        else if (small.size()>large.size())
            return small.peek();
        else
            return (small.peek()+large.peek())/2;

    }
}