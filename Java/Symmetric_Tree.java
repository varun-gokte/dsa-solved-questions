class Symmetric_Tree
{
    public boolean isSymmetric(TreeNode root) 
    {
        return symmetry (root.left,root.right);
    }

    boolean symmetry (TreeNode leftSide, TreeNode rightSide )
    {
        
        if (leftSide==null ^ rightSide==null)
            return false;
        else if (leftSide==null && rightSide==null)
            return true;

        if (leftSide.val!=rightSide.val)
            return false;
        else
        {
            boolean a = symmetry(leftSide.left,rightSide.right);
            boolean b = symmetry(leftSide.right,rightSide.left);
            return (a && b);
        }
    }       
} 