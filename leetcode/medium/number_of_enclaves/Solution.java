class Solution {
    public int numEnclaves(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            dfs(i, 0, A);
            dfs(i, A[i].length - 1, A);
        }
        for (int i = 0; i < A[0].length; i++) {
            dfs(0, i, A);
            dfs(A.length - 1, i, A);
        }
        
        int ans = 0;
        for (int i = 1; i < A.length - 1; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 1) {
                    ans++;
                }
            }
        }
        
        return ans;
    }
    
    void dfs(int y, int x, int[][] A) {
        if (A[y][x] == 0 || A[y][x] == 2) {
            return;
        }
        
        A[y][x] = 2;
        if (y + 1 < A.length) {
            dfs(y + 1, x, A);
        }
        if (y - 1 >= 0) {
            dfs(y - 1, x, A);
        }
        if (x + 1 < A[y].length) {
            dfs(y, x + 1, A);
        }
        if (x - 1 >= 0) {
            dfs(y, x - 1, A);
        }
    }
}