class Remove_Nth_Node//from the end of the list
{
    ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode ptr=new ListNode(0);
        ptr.next=head;
        ptr=ptr.next;
        int len=0;
        while (ptr!=null)
        {
            len++;
            ptr=ptr.next;
        }
        if (len<2)
            return null;
        if (len==n)
            return head.next;   
            ptr=head;
        int i=0;
        while (i<len-n-1)
        {    
            ptr=ptr.next;
            i++;
        }
        ListNode skip=ptr.next.next;
        ptr.next=skip;
        while (ptr!=null && i<len-1)
        {
            ptr=ptr.next;
            i++;
        }
        return head;
    }
}