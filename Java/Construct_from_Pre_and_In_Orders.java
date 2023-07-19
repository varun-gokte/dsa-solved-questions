class Construct_from_Pre_and_In_Orders
{
    TreeNode buildTree(int[] A, int[] B)
    {
        return constructTree(0, 0, B.length-1, A, B);
    }

    TreeNode constructTree (int preStart,int inStart, int inEnd, int[] preorder, int[] inorder)
    {
        if ((preStart>preorder.length-1) || (inStart>inEnd))
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int mid=0;

        for (int i=inStart; i<=inEnd; i++)
            if (inorder[i]==root.val)
                mid=i;

        root.left= constructTree(preStart+1, inStart, mid-1, preorder, inorder);
        root.right= constructTree(preStart+mid-inStart+1, mid+1, inEnd, preorder, inorder);

        return root;
    }
}