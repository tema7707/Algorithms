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
    public TreeNode pruneTree(TreeNode root) {
        if (tryToDelete(root) && root.val == 0) {
            return null;
        }
        
        return root;
    }
    
    public boolean tryToDelete(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        boolean left = tryToDelete(root.left);
        boolean right = tryToDelete(root.right);
        if (left) {
            root.left = null;
        }
        if (right) {
            root.right = null;
        }
        return root.val == 0 && left && right;
    }
}