class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, getArea(grid, i, j));
                }
            }
        }
        
        return max;
    }
    
    static int getArea(int[][] grid, int i, int j) {
        int area = 1;
        grid[i][j] = 2;
        
        if (i + 1 < grid.length && grid[i+1][j] == 1) {
            area += getArea(grid, i + 1, j); 
        }
        
        if (i > 0 && grid[i-1][j] == 1) {
            area += getArea(grid, i - 1, j); 
        }
        
        if (j + 1 < grid[i].length && grid[i][j+1] == 1) {
            area += getArea(grid, i, j + 1); 
        }
        
        if (j > 0 && grid[i][j-1] == 1) {
            area += getArea(grid, i, j - 1); 
        }
        
        return area;
    }
}