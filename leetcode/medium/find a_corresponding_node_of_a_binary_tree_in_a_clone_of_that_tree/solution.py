# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def getTargetCopy(self, original, cloned, target):
        """
        :type original: TreeNode
        :type cloned: TreeNode
        :type target: TreeNode
        :rtype: TreeNode
        """
        self.target = target
        return self.find(original, cloned)
    
    def find(self, node, cloned):
        if node == self.target:
            return cloned
        if node == None:
            return None
        left = self.find(node.left, cloned.left)
        right = self.find(node.right, cloned.right)
        if left != None:
            return left
        return right
