class Max_Depth_of_Tree 
   {
    public int maxDepth(TreeNode root) 
    {
        if (root==null)
            return 0;
        if (root.left==null && root.right==null)
            return 1;
        else
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
   }