/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int k=size-n;
        if(k==0) return head.next;
        int i=1;
        temp=head;
        while(i<k && temp!=null){
            temp=temp.next;
            i++;
        }
        if(temp!=null && temp.next!=null) temp.next=temp.next.next;
        return head;
    }
}
