class Container_With_Most_Water
{
    int maxArea(int[] height)
    {
        int l=0,r=height.length-1,max=0;
        while (l<r)
        {
            if (height[l]<height[r])
            {
                int area=height[l]*(r-l);
                max=Math.max(max, area);
                l++;
            }
            else
            {
                int area=height[r]*(r-l);
                max=Math.max(max, area);
                r--;
            }
        }
        return max;
    }
}
