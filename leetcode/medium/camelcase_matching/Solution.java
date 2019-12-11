class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        
        outter:
        for (String word: queries) {
            int p = 0;
            for (char c: word.toCharArray()) {
                if (c >= 'A' && c <= 'Z') { // not Character.isUpperCase(c) because it is slower
                    if (p >= pattern.length() || c != pattern.charAt(p)) {
                        ans.add(false);
                        continue outter;
                    } 
                    p++;
                } else if (p < pattern.length() && c == pattern.charAt(p)) {
                    p++;
                }
            }
            ans.add(p == pattern.length());
        }
        
        return ans;
    }
}