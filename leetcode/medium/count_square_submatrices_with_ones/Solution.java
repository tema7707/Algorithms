class Solution {
    public int countSquares(int[][] matrix) {
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans += countOnes(matrix, j, i);
            }
        }

        return ans;
    }
    
    public int countOnes(int[][] matrix, int x, int y) {
        int count = 0;
        boolean isCorrect = true;
        while (isCorrect && (count + x < matrix[0].length) && (count + y < matrix.length)) {
            for (int i = 0; i <= count; i++) {
                if (matrix[y + i][x + count] != 1 || matrix[y + count][x + i] != 1) {
                    isCorrect = false;
                    break;
                }
            }
            if (isCorrect) {
                count++;
            }
        }

        return count;
    }
}