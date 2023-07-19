class Merge_Sorted_Lists
{
    ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode head=new ListNode(0);
        ListNode list3=head;
        while (list1!=null || list2!=null)
        {
            if (list1==null)
            {
                ListNode new_node=new ListNode(list2.val);
                head.next=new_node;
                head=head.next;
                list2=list2.next;
            }
            else if (list2==null)
            {
                ListNode new_node=new ListNode(list1.val);
                head.next=new_node;
                head=head.next;
                list1=list1.next;
            }
            else
            {
                if (list1.val<list2.val)
                {
                    ListNode new_node=new ListNode(list1.val);
                    head.next=new_node;
                    head=head.next;
                    list1=list1.next;
                }
                else
                {
                    ListNode new_node=new ListNode(list2.val);
                    head.next=new_node;
                    head=head.next;
                    list2=list2.next;
                }
            }
        }
            return list3.next;
    }
}