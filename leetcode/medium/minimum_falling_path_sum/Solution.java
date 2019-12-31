class Solution {
    public int minFallingPathSum(int[][] A) {
        if (A == null || A.length < 0) {
            return 0;
        }
        
        int min;
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                min = A[i-1][j];        
                if (j != 0 && min > A[i-1][j-1]) {
                    min = A[i-1][j-1];
                }
                if (j != A[0].length - 1 && min > A[i-1][j+1]) {
                    min = A[i-1][j+1];
                }
                
                A[i][j] += min;
            }
        }
        
        min = A[A.length - 1][0];
        for (int i = 0; i < A[A.length - 1].length; i++) {
            if (min > A[A.length - 1][i]) {
                min = A[A.length - 1][i];
            }
        }
        
        return min;
    }
}