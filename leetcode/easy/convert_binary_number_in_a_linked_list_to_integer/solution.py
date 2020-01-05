# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        if head == None:
            return 0
        
        ans = head.val
        while head.next:
            head = head.next
            ans = ans << 1
            ans += head.val
        return ans