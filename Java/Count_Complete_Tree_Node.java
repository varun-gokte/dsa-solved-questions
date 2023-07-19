class Count_Complete_Tree_Node
{
    public int countNodes(TreeNode root) 
    {
        if (root==null)
            return 0;

        TreeNode rightmost=root,leftmost=root;
        int rightCount=0,leftCount=0;

        while (rightmost!=null)
        {
            rightCount++;
            rightmost=rightmost.right;
        }
        while (leftmost!=null)
        {
            leftCount++;
            leftmost=leftmost.left;
        }

        if (leftCount==rightCount)
            return (int)Math.pow(2,leftCount)-1;
        else
            return 1+countNodes(root.left)+countNodes(root.right);
   }
}