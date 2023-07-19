class Balanced_Binary_Tree
{
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        int leftHeight=0,rightHeight=0;
        if (root.left!=null)
            leftHeight=findHeight(root.left);
        if (root.right!=null)
            rightHeight=findHeight(root.right);
        if (Math.abs(rightHeight-leftHeight)>1)
            return false;
        
        boolean l=false,r=false;
        l=isBalanced(root.left);
        r=isBalanced(root.right);

        return (l && r);
    }

    private int findHeight(TreeNode root)
    {
        if (root==null)
            return 0;
        return Math.max(findHeight(root.right),findHeight(root.left))+1;
    }
}