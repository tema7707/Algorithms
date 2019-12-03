/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode curr = null;
        int ost = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + ost;
            if (head == null) {
                head = new ListNode(sum % 10);
                curr = head;
            } else {
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
            }
            ost = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while (l1 != null) {
            int sum = l1.val + ost;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            l1 = l1.next;
            ost = sum / 10;
        }
        
        while (l2 != null) {
            int sum = l2.val + ost;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            l2 = l2.next;
            ost = sum / 10;
        }
        
        if (ost > 0)
            curr.next = new ListNode(ost);
        
        return head;
    }
}