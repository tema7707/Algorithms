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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.val == sum && root.left == null && root.right == null)
            return true;
        
        boolean ans = false;
        if (root.left != null)
            ans = ans || hasPathSum(root.left, sum - root.val);
        if (root.right != null)
            ans = ans || hasPathSum(root.right, sum - root.val);
        return ans;
    }
}