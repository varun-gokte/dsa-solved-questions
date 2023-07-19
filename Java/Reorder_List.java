class Reorder_List
{
    void reorderList(ListNode head)
    {
        if (head==null || head.next==null)
            return;
        ListNode slow = head;
        ListNode fast = slow;
        ListNode prev=null;
        while (fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=null;
        ListNode node2=reverseList(slow);
        ListNode node1=head;
        ListNode temp = new ListNode();
        while (node1!=null || node2!=null)
        {
            if (node1!=null)
            {
                temp.next=node1;
                node1=node1.next;
                temp=temp.next;
            }
            if (node2!=null)
            {
                temp.next=node2;
                node2=node2.next;
                temp=temp.next;
            }
        }
    }

    ListNode reverseList(ListNode head)
    {
        ListNode next = null;
        ListNode current = head;
        ListNode previous = null;
        while (current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}