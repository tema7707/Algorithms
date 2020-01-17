# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def sumEvenGrandparent(self, root: TreeNode) -> int:
        ans = 0
        if root == None:
            return 0
        if root.left != None:
            if root.left.left != None and root.val % 2 == 0:
                ans += root.left.left.val
            if root.left.right != None and root.val % 2 == 0:
                ans += root.left.right.val
            ans += self.sumEvenGrandparent(root.left)
        if root.right != None:
            if root.right.left != None and root.val % 2 == 0:
                ans += root.right.left.val
            if root.right.right != None and root.val % 2 == 0:
                ans += root.right.right.val
            ans += self.sumEvenGrandparent(root.right)
        
        return ans