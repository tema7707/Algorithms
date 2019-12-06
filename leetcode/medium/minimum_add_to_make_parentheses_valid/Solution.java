class Solution {
    public int minAddToMakeValid(String S) {
        int left = 0;
        int right = 0;
        if (S == null) return 0;
        
        for (int i = 0; i< S.length(); i++) {
            if (S.charAt(i) == '(') {
                left++;
            } else {
                left--;
                if (left == -1) {
                    left++;
                    right++;
                }
            }
            
        }
        
        return left + right;
    }
}