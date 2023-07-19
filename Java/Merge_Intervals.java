import java.util.ArrayList;

class Interval 
{
    int start;
    int end;

    Interval() 
    { 
        start = 0; 
        end = 0; 
    }
    
    Interval(int s, int e) 
    { 
        start = s; 
        end = e; 
    }
}

class Merge_Intervals
{
    ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval)
    {
        ArrayList<Interval> res = new ArrayList<>();
        
        for (int i=0; i<intervals.size(); i++)
        {
            if (newInterval.end<intervals.get(i).start)
            {
                res.add(newInterval);
                for (int j=i; j<intervals.size(); j++)
                    res.add(intervals.get(j));
                return res;
            }
            else if (newInterval.start>intervals.get(i).end)
                res.add(intervals.get(i));
            else
            {
                newInterval.start=Math.min(newInterval.start,intervals.get(i).start);
                newInterval.end=Math.max(newInterval.end,intervals.get(i).end);
            }
        }
        
        res.add(newInterval);
            
        return res;
    }
}