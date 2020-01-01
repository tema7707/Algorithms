class Solution {
    public int heightChecker(int[] heights) {
        int[] notSorted = new int[heights.length];
        System.arraycopy(heights, 0, notSorted, 0, heights.length);
        Arrays.sort(heights);
        int diff = 0;
        
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != notSorted[i]) {
                diff++;
            }
        }
        
        return diff;
    }
}