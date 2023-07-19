import java.util.Queue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

class Network_Delay_Time {
    int networkDelayTime(int[][] times, int n, int k) {
        HashSet<Integer> visited = new HashSet<>();
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k);
        
        HashMap<Integer,Integer> shortest = new HashMap<>();
        shortest.put(k, 0);

        for (int i=1; i<=n; i++)
            if (i!=k)
                shortest.put(i,Integer.MAX_VALUE);

        int result=0;

        while (!queue.isEmpty()) {
            int src=queue.poll();
            if (visited.contains(src))
                continue;
            for (int i=0; i<times.length; i++) {
                if (times[i][0]==src) {
                    int des=times[i][1];
                    int len=times[i][2];
                    if (shortest.get(src)+len<shortest.get(des))
                        shortest.replace(des, shortest.get(src)+len);
                    queue.offer(times[i][1]);
                }
            }
            visited.add(src);
        }

        for (Map.Entry<Integer,Integer> entry : shortest.entrySet())
            result=Math.max(result,entry.getValue());

        return (result==Integer.MAX_VALUE)?-1:result;
    }

    public static void main(String[] args) {
        
    }
}