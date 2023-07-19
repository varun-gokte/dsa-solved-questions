class Reverse_K_Nodes
{
    ListNode reverseList(ListNode A, int B)
    {
        ListNode tail = A;
        ListNode ans=new ListNode(0);
        ListNode fin=ans;
        while (A!=null)
        {
            for (int i=1; i<=B; i++)
                tail=tail.next;
            ans.next=reverseList(A, tail);
            for (int i=1; i<=B; i++)
                ans=ans.next;
            A=tail;
        }
        return fin.next;
    }

    ListNode reverseList(ListNode head, ListNode tail)
    {
        ListNode prev_node = null;
        while (head!=tail)
        {    
            ListNode next_node = head.next;
            head.next=prev_node;
            prev_node=head;
            head=next_node;
        }
        return prev_node;
    }
}