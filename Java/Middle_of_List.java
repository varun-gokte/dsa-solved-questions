class Middle_of_List {
    public ListNode middleNode(ListNode head)
    {
        ListNode temp=head;
        int i=0;
        while (temp!=null)
        {
            i++;
            temp=temp.next;
        }
        int mid=i/2+1;
        for (i=0; i<mid-1; i++)
            head=head.next;
        return head;
   }
}