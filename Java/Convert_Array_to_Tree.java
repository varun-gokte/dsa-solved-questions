class Convert_Array_to_Tree
{
    TreeNode sortedArrayToBST(int[] nums)
    {
        if (nums.length==0)
            return null;
        return convert(nums, 0, nums.length-1);
    }

    TreeNode convert (int nums[], int left, int right)
    {
        if (left>right)
            return null;
        int mid=(right-left)/2+left;
        TreeNode node = new TreeNode (nums[mid]);
        node.left=convert(nums,left,mid-1);
        node.right=convert(nums,mid+1,right);
        return node;
    }
}