class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    ans++;
                }
            }
        }   
        
        return ans;
    }
    
    private void dfs(int i, int j, char[][] grid) {
        if (i < 0 || i >= grid.length) {
            return;
        }
        if (j < 0 || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] == '2' || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '2';
        dfs(i + 1, j, grid);
        dfs(i - 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);
    }
}
