class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // Yes, this is not the best way to change the input array,
        // but I don't want to waste memory to copy
        for (int i = 2; i < cost.length; i++) {
            cost[i] = Math.min(cost[i - 1], cost[i - 2]) + cost[i];
        }
        
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}