class Merge_Nodes_Between_Zeroes
{
    ListNode mergeNodes(ListNode head)
    {
        ListNode working=new ListNode(0);
        ListNode list=working;
        int sum=0;
        while (head!=null)
        {
            if (head.val!=0 && head.next.val==0)
            {
                sum+=head.val;
                ListNode new_node = new ListNode(sum);
                working.next=new_node;
                working=working.next;
                sum=0;
            }
            else
                sum+=head.val;
            head=head.next;
        }
        return list.next;
    }
}