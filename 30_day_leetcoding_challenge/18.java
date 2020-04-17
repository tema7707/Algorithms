class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int[][] ans = new int[grid.length][grid[0].length];
        int prev = 0;
        for (int i = 0; i < grid.length; i++) {
            ans[i][0] = grid[i][0] + prev; 
            prev = ans[i][0];
        }
        prev = 0;
        for (int i = 0; i < grid[0].length; i++) {
            ans[0][i] = grid[0][i] + prev;
            prev = ans[0][i];
        }
        
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                ans[i][j] = grid[i][j] + Math.min(ans[i - 1][j], ans[i][j - 1]);
            }
        }
        
        return ans[grid.length - 1][grid[0].length - 1];
    }
}
