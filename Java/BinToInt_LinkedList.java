class BinToInt_LinkedList {
    public int getDecimalValue(ListNode head) 
    {
        ListNode temp=head;
        int i=0;
        while (temp!=null)
        {
            i++;
            temp=temp.next;
        }
        int dec=0;
        while (head!=null)
        {
            int num=head.val;
            if (num==1)
                dec+=Math.pow(2,i);
            i--;
            head=head.next;
        }
        return dec;    
    }
}