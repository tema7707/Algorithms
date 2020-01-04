/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static TreeNode tail;
    public void flatten(TreeNode root) {
        tail = null;
        connectToTail(root);
    }   
    
    static void connectToTail(TreeNode node) {
        if (node == null) {
            return;
        }
        
        TreeNode right = node.right;
        TreeNode left = node.left;
        node.left = null;
        
        if (tail != null) {
            tail.right = node;
        }
        tail = node;
        
        connectToTail(left);
        connectToTail(right);
    }
}