/*
// Definition for a Node.
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
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        // Placing the copy node just after the original one
        while (temp != null) {
            Node copy = new Node(temp.val);
            Node temp2 = temp.next;
            temp.next = copy;
            copy.next = temp2;
            temp=temp.next.next;
        }
        // Connecting the random pointers of the copy nodes
        temp = head;
        while (temp != null) {
            if (temp.random != null)
                temp.next.random = temp.random.next;
            else
                temp.next.random = null;
            temp=temp.next.next;
        }
        // Connecting original next of the original nodes
        temp=head;
        Node dummy=new Node(-1);
        if(temp!=null) dummy.next=temp.next;
        Node res=dummy;
        while(temp!=null){
            Node copy=temp.next;
            temp.next=copy.next;
            res.next=copy;
            res=res.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}
