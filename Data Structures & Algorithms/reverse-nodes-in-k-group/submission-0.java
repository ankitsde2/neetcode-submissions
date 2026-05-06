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
    private ListNode reverseLL(ListNode head){
        ListNode temp=head;
        ListNode prev= null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    private ListNode findKthNode(ListNode head, int k){
        ListNode temp=head;
        while(k>1 && temp!=null){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kthNode=findKthNode(temp,k);
            if(kthNode==null){
                if(prev!=null) prev.next=temp;
                break;
            }
            ListNode next=kthNode.next;
            kthNode.next=null;
            reverseLL(temp);
            if(temp==head){
                head=kthNode;
            }else{
                prev.next=kthNode;
            }
            prev=temp;
            temp=next;
        }
        return head;
    }
}
