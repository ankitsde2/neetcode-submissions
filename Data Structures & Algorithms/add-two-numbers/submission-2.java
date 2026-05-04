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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        while(temp1!=null && temp2!=null){
            int sum=temp1.val+temp2.val+carry;
            carry=sum/10;
            int num=sum%10;
            temp.next= new ListNode(num);
            temp1=temp1.next;
            temp2=temp2.next;
            temp=temp.next;
        }
        while(temp1!=null){
            int sum=temp1.val+carry;
            carry=sum/10;
            int num=sum%10;
            temp.next= new ListNode(num);
            temp1=temp1.next;
            temp=temp.next;
        }
        while(temp2!=null){
            int sum=temp2.val+carry;
            carry=sum/10;
            int num=sum%10;
            temp.next= new ListNode(num);
            temp2=temp2.next;
            temp=temp.next;
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
            temp=temp.next;
        }
        return dummy.next;
    }
}
