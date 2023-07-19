class Maximum_Twin_Sum
{
    int pairSum(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        fast=head;
        slow=reverseList(slow.next);
        int max=0;
        while (fast!=null && slow!=null)
        {
            int sum=fast.val+slow.val;
            if (sum>max)
                max=sum;
            fast=fast.next;
            slow=slow.next;
        }
        return max;
    }

    ListNode reverseList(ListNode head)
    {
        ListNode prev_node=null;
        while (head!=null)
        {
            ListNode next_node = head.next;
            head.next=prev_node;
            prev_node=head;
            head=next_node;
        }

        return prev_node;
    }
}