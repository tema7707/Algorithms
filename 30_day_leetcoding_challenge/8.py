# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def middleNode(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        fast = head
        slow = head
        while fast != None:
            fast = fast.next
            if fast != None:
                slow = slow.next
                fast = fast.next
        
        return slow
            
        
