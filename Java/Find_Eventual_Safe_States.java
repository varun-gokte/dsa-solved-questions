import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

class Find_Eventual_Safe_States {
    HashMap<Integer,Boolean> map = new HashMap<>();

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new LinkedList<>();

        for (int i=0; i<graph.length; i++) {
            if (isSafe(graph,i))
                res.add(i);
        }

        return res;
    }

    boolean isSafe (int[][] graph, int i) {
        if (map.containsKey(i))
            return map.get(i);

        map.put(i,false);

        for (int j=0; j<graph[i].length; j++) {
            if (!isSafe(graph,graph[i][j]))
                return false;
        }

        map.replace(i,true);
        return true;
    }
}