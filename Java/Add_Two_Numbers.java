class ListNode 
{
    int val;
    ListNode next;
    
    ListNode() 
    {}

    ListNode(int val) 
    { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) 
    { 
        this.val = val; 
        this.next = next; 
    }
}


class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode l3=new ListNode(0);
        ListNode current=l3;
        int carry=0;
        while (l1!=null || l2!=null)
        {
            int sum=0;
            if (l1!=null)
            {    
                sum+=l1.val;
                l1=l1.next;
            }
            if (l2!=null)
            {    
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            sum%=10;
            ListNode newNode = new ListNode(sum);
            current.next=newNode;
            current=current.next;
        }
        if (carry==1)
        {
            ListNode newNode = new ListNode(carry);
            current.next=newNode;
            current=current.next;
        }    
        return l3.next;
    }
}