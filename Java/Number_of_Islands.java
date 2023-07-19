import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;

class Number_of_Islands {
    int numIslands(char[][] grid) {
        HashSet<int[]> vistedSet= new HashSet<int[]>();
        Queue<int[]> queue= new LinkedList<int[]>();
        int rows=grid.length;
        int cols=grid[0].length;
        int islandCount=0;

        if (rows<1 || cols<1)
            return 0;

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (grid[i][j]=='1') {
                    queue.offer(new int[] {i,j});
                    islandCount++;
                    break;
                }
            }
            if (islandCount==1)
                break;
        }
        

        while (!queue.isEmpty()) {
            int len=queue.size();
            for (int i=0; i<len; i++) {
                int arr[] = queue.poll();
                int r=arr[0], c=arr[1];
                int lr=r,lc=c-1;
                int rr=r,rc=c+1;
                int tr=r-1,tc=c;
                int br=r+1,bc=c;
                System.out.println (r+" "+c+" "+vistedSet.contains(arr));
                if (grid[r][c]=='1' && !vistedSet.contains(arr)) {
                    System.out.println ("WE VISIT"+r+" "+c);
                    vistedSet.add(new int[]{r,c});
                    if (!vistedSet.contains(new int[]{lr,lc}) && !vistedSet.contains(new int[] {rr,rc}) && vistedSet.contains(new int[] {tr,tc}) && !vistedSet.contains(new int[] {br,bc}))
                        islandCount++;
                System.out.println ("AFTER"+r+" "+c+" "+vistedSet.contains(new int[]{r,c}));
                }

                if (lc>=0 && grid[lr][lc]=='1')
                    queue.offer(new int[] {lr,lc});
                if (rc<cols && grid[rr][rc]=='1')
                    queue.offer(new int[] {rr,rc});
                if (tr>=0 && grid[tr][tc]=='1')
                    queue.offer(new int[] {tr,tc});
                if (br<rows && grid[br][bc]=='1')
                    queue.offer(new int[] {br,bc});
            }
        }

        return islandCount;
    }
}