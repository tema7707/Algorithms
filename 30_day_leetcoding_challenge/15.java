class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[0] = 1;
        
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
            right[i] = right[i - 1] * nums[nums.length - i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = left[i] * right[right.length - i - 1];   
        }
        
        return nums;
    }
}
