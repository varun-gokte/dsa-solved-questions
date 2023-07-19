import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

class Flood_Fill
{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int rep=image[sr][sc];

        if (image[sr][sc]==color)
            return image;
            
        Queue<int[]> q = new LinkedList<>();
        HashSet<int[]> hs = new HashSet<>();
        q.offer(new int[]{sr,sc});

        while (!q.isEmpty()) {
            int len=q.size();
            for (int i=0; i<len; i++) {
                int arr[]=q.poll();
                if (hs.contains(arr))
                    continue;
                int r=arr[0];
                int c=arr[1];

                image[r][c]=color;
                hs.add(new int[]{sr,sc});
                
                int lr=r,lc=c-1;
                int rr=r,rc=c+1;
                int tr=r-1,tc=c;
                int br=r+1,bc=c;
                
                if (lc>=0 && image[lr][lc]==rep)
                {    
                    image[lr][lc]=color;
                    q.add(new int[] {lr,lc});
                }
                if (rc<n && image[rr][rc]==rep)
                {
                    image[rr][rc]=color;
                    q.add(new int[]{rr,rc});
                } 
                if (tr>=0 && image[tr][tc]==rep)
                {
                    image[tr][tc]=color;
                    q.add(new int[] {tr,tc});
                }
                if (br<m && image[br][bc]==rep)
                {
                    image[br][bc]=color;
                    q.add(new int[] {br,bc});
                }
            }
        }

        return image;
    }
}