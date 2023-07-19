class Merge_Sorted_Arrays
{
    void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i=0,j=0,k=0;
        int[] res = new int[m+n];
        while (k<(m+n))
        {
            if (i>=m && j<n)
                res[k++]=nums2[j++];
            else if (j>=n && i<m)
                res[k++]=nums1[i++];
            else if (i>=m && j>=m)
                break;
            else
                res[k++]=(nums1[i]<=nums2[j])?nums1[i++]:nums2[j++];
        }

        for (i=0; i<m+n; i++)
            nums1[i]=res[i];
    }
}