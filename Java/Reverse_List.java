class Reverse_List {
    public ListNode reverseList(ListNode head){
        if (head==null || head.next==null)
            return head;
            
        ListNode prevNode=head;
        ListNode currNode=prevNode.next;

        while (currNode!=null)
        {
            ListNode nextNode=currNode.next;

            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }

        head.next=null;
        head=prevNode;
        return head;
    }
}