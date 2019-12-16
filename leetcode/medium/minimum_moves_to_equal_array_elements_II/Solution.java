class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = (nums[(n - 1) / 2] + nums[n / 2]) / 2;
        
        int ans = 0;
        for (int num : nums) {
            ans += Math.abs(median - num);
        }
        return ans;
    }
}