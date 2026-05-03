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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode left=list1;
        ListNode right=list2;
        ListNode head=null;
        ListNode temp=null;
        if(left.val<=right.val){
            head=left;
            temp= head;
            left=left.next;
        }else{
            head=right;
            temp= head;
            right=right.next;
        }
        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                temp=left;
                left=left.next;
            }else{
                temp.next=right;
                temp=right;
                right=right.next;
            }
        }
        while(left!=null){
            temp.next=left;
            temp=left;
            left=left.next;
        }
        while(right!=null){
            temp.next=right;
            temp=right;
            right=right.next;
        }
        return head;
    }
}