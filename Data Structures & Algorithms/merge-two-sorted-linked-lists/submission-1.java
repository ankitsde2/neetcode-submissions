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
        ListNode temp1=list1;
        ListNode temp2=list2;
        List<Integer> li=new ArrayList<>();
        while(temp1!=null){
            li.add(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            li.add(temp2.val);
            temp2=temp2.next;
        }
        if(li.size()==0) return null;
        Collections.sort(li);
        ListNode temp=new ListNode(li.get(0));
        ListNode head=temp;
        for(int i=1;i<li.size();i++){
            temp.next=new ListNode(li.get(i));
            temp=temp.next;
        }
        return head;
    }
}