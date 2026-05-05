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
    public ListNode mergeKLists(ListNode[] lists) {
       List<Integer> values=new ArrayList<>();
       for(ListNode list: lists){
            while(list!=null){
                values.add(list.val);
                list=list.next;
            }
       } 
       Collections.sort(values);
       ListNode dummy= new ListNode(-1);
       ListNode temp=dummy;
       for(Integer value: values){
            temp.next=new ListNode(value);
            temp=temp.next;
       }
       return dummy.next;
    }
}
