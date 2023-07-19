import java.util.*;
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) 
    { 
        this.val = val; 
    }

    TreeNode(int val, TreeNode left, TreeNode right) 
    {
    this.val = val;
    this.left = left;
    this.right = right;
    }
}

class Binary_Tree_Inorder 
{
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> ans = new ArrayList<Integer>();
        inorder(root,ans);
        return ans;
    }

    private void inorder(TreeNode node, List<Integer> list)
    {
        if (node==null)
            return;
        if (node.left!=null)
            inorder(node.left,list);
        list.add(node.val);
        if (node.right!=null)
            inorder(node.right,list);
    }
}
