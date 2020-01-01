class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if (points == null || points.length < 2) {
            return 0;
        }
        
        int x = points[0][0];
        int y = points[0][1];
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            time += Math.max(Math.abs(points[i][0]-x), 
                             Math.abs(points[i][1]-y));
            x = points[i][0];
            y = points[i][1];
        }
        
        return time;
    }
}