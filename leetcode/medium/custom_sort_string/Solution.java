class Solution {
    public String customSortString(String S, String T) {
        if (T == null)
            return "";
        if (S == null)
            return T;
        
        StringBuilder ans = new StringBuilder();
        int[] tmap = new int[26];
        for (int i = 0; i < T.length(); i++) {
            tmap[T.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < tmap[S.charAt(i) - 'a']; j++)
                ans.append(S.charAt(i));
            tmap[S.charAt(i) - 'a'] = 0;
        }
        
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < tmap[i]; j++) 
                ans.append((char)('a' + i));
        }
        
        return ans.toString();
    }
}