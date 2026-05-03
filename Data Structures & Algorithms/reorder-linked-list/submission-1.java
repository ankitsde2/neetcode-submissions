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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head;
        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        second = prev;
        while (second != null) {
            ListNode temp1 = first.next;
            first.next = second;
            first = temp1;
            ListNode temp2 = second.next;
            second.next = first;
            second = temp2;
        }
    }
}
