/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0;
        }
        
        int ans = head.val;
        while (head.next != null) {
            head = head.next;
            ans *= 2;
            ans += head.val;
        }
        
        return ans;
    }
}