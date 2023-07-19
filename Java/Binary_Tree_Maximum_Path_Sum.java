class Binary_Tree_Maximum_Path_Sum
{
    int max_val=Integer.MIN_VALUE;
    int maxPathSum(TreeNode root)
    {
        pathSum(root);
        return max_val;
    }

    int pathSum(TreeNode node)
    {
        if (node==null)
            return 0;
        int left=Math.max(0,pathSum(node.left));
        int right=Math.max(0,pathSum(node.right));
        max_val=Math.max(max_val,left+right+node.val);
        return Math.max(left,right)+node.val;
    }
}