import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Copy_List_with_Random_Pointer
{
    Node copyRandomList(Node head)
    {
        HashMap<Node,Node> oldToCopy = new HashMap<>();
        oldToCopy.put(null, null);

        Node current=head;
        while (current!=null)
        {
            oldToCopy.put(current, new Node(current.val));
            current=current.next;
        }

        current=head;
        Node copy=new Node(0);
        Node ans=copy;
        while (current!=null)
        {
            Node temp=oldToCopy.get(current);
            temp.next=oldToCopy.get(current.next);
            temp.random=oldToCopy.get(current.random);
            copy.next=temp;
            copy=copy.next;
            current=current.next;
        }

        return ans.next;
    }
}