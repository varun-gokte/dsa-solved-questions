class Path_Sum
{
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null)
            return false;
        return findPath (root,targetSum,0);
    }

    boolean findPath (TreeNode root, int target, int sum)
    {
        if (root==null)
            return false;
        System.out.println (sum);
        sum+=root.val;
        if (sum==target && root.left==null && root.right==null)
            return true;
        else
        {
            boolean a = findPath (root.left,target,sum);
            boolean b = findPath (root.right,target,sum);
            return (a || b);
        }
    }
}