import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

class Tree_Right_View
{
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root==null)
            return res;
        queue.offer(root);

        while (!queue.isEmpty())
        {
            int len = queue.size();

            for (int i=0; i<len; i++)
            {
                TreeNode cur=queue.poll();
                if (i==0)
                    res.add(cur.val);
                if (cur.right!=null)
                    queue.offer(cur.right);
                if (cur.left!=null)
                    queue.offer(cur.left);
            }
        }
        return res;
    }
}