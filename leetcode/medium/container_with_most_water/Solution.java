class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int l = 0, r = height.length - 1;
        
        while (l < r) {
            int mn = Math.min(height[l], height[r]);
            int cur = (r - l) * mn;
            if (cur > water)
                water = cur;
            
            if (height[l] < height[r])
                l++;
            else 
                r--;
        }
        
        return water;
    }
}