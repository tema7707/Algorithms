class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int r = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                r++;
            else if (s.charAt(i) == 'L') {
                l++;    
            }
            
            if (r == l && r != 0) {
                r = 0;
                l = 0;
                ans++;
            }
        }
        
        
        return ans;
    }
}