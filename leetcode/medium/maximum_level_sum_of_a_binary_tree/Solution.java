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
    static int[] sums;
    static boolean[] used;
    
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        sums = new int[10001];
        used = new boolean[10001];
        getSum(root, 0);
        int max = 0;
        int ans = 0;
        for (int i = 0; i < sums.length; i++) {
            if (!used[i]) {
                break;
            }
            if (sums[i] > max) {
                max = sums[i];
                ans = i + 1;
            }
        }
        
        
        return ans;
    }
    
    static void getSum(TreeNode node, int lvl) {
        if (node == null) {
            return;
        }
        
        sums[lvl] += node.val;
        used[lvl] = true;
        getSum(node.left, lvl+1);
        getSum(node.right, lvl+1);
    }
}