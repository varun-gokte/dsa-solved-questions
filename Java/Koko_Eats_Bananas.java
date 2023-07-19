import java.util.Arrays;

class Koko_Eats_Bananas
{
    int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l=1, r=piles[piles.length-1];
        
        while (l<r) {
            int mid=l+(r-l)/2;
            int hours=0;

            for (int i=0; i<piles.length; i++)
                hours+=Math.ceil((double)piles[i]/mid);
                
            if (hours>h)
                l=mid+1;
            else 
                r=mid;
        }

        return r;
    }
}