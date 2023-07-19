class Diameter_of_Tree
{
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null)
            return 0;
        int l=diameterOfBinaryTree(root.left);
        int r=diameterOfBinaryTree(root.right);
        int d=maxDepth(root.left)+maxDepth(root.right);
        return Math.max(Math.max(l,r),d);
    }
    int maxDepth(TreeNode root) 
    {
        if (root==null)
            return 0;
        if (root.left==null && root.right==null)
            return 1;
        else
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}