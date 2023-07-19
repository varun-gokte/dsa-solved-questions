import java.util.*;
import java.util.LinkedList;
class Rotting_Oranges
{
    int orangesRotting(int[][] grid)
    {
        int rows=grid.length;
        int cols=grid[0].length;
        int minutes=0;

        int fresh=0;
        Queue<int[]> queue = new LinkedList<int[]>();
        for (int r=0; r<rows; r++)
        {
            for (int c=0; c<cols; c++)
            {
                if (grid[r][c]==2)
                    queue.add(new int[] {r,c});
                if (grid[r][c]==1)
                    fresh++;
            }   
        }
        if (queue.isEmpty())
            return -1;
            
        while (!queue.isEmpty())
        {
            int len=queue.size();
            for (int i=0; i<len; i++)
            {
                int[] arr=queue.poll();
                int r=arr[0],c=arr[1];

                int lr=r,lc=c-1;
                int rr=r,rc=c+1;
                int tr=r-1,tc=c;
                int br=r+1,bc=c;
                
                if (lc>=0 && grid[lr][lc]==1)
                {    
                    grid[lr][lc]=2;
                    queue.add(new int[] {lr,lc});
                    fresh--;
                }
                if (rc<cols && grid[rr][rc]==1)
                {
                    grid[rr][rc]=2;
                    queue.add(new int[]{rr,rc});
                    fresh--;
                } 
                if (tr>=0 && grid[tr][tc]==1)
                {
                    grid[tr][tc]=2;
                    queue.add(new int[] {tr,tc});
                    fresh--;
                }
                if (br<rows && grid[br][bc]==1)
                {
                    grid[br][bc]=2;
                    queue.add(new int[] {br,bc});
                    fresh--;
                }
            }
            minutes++;
        }
        if (fresh>0)
            return -1;
        else
            return minutes-1;
    }
}