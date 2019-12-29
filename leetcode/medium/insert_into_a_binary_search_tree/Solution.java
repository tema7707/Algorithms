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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return null;    
        }
        
        TreeNode curr = root;
        TreeNode node = new TreeNode(val);
        while (true) {
            if (val < curr.val) {
                if (curr.left == null) {
                    curr.left = node;
                    return root;
                }
                curr = curr.left;
            } else {
                if (curr.right == null) {
                    curr.right = node;
                    return root;
                }
                curr = curr.right;
            }
        }
    }
}