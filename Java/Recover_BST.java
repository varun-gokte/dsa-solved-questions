class Recover_BST
{
    TreeNode prev=new TreeNode(Integer.MIN_VALUE),first=null,midddle=null,last=null;
    public void recoverTree(TreeNode root) {
     inorder (root);

     if (first!=null && last!=null)
     {
         int t=first.val;
         first.val=last.val;
         last.val=t;
     }
     else
     {
         int t=first.val;
         first.val=midddle.val;
         midddle.val=t;
     }
    }

    void inorder (TreeNode root)
    {
        if (root==null)
            return;
        inorder (root.left);

        if (prev!=null && prev.val>root.val)
        {
            if (first==null)
            {
                first=prev;
                midddle=root;
            }
            else
                last=root;
        }
        prev=root;

        inorder(root.right);
    }
}