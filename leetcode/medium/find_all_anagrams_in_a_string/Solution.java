class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (s == null || s.length() < p.length())
            return new ArrayList();
        
        int LEN = 'z' - 'a' + 1;
        int[] smap = new int[LEN];
        int[] pmap = new int[LEN];
        int count = 0;
        List<Integer> ans = new ArrayList();
        
        for (int i = 0; i < p.length(); i++) {
            smap[s.charAt(i) - 'a']++;
            pmap[p.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < LEN; i++) {
            if (smap[i] == pmap[i])
                count++;
        }
        
        if (count == LEN)
            ans.add(0);
        
        for (int i = 0; i < s.length() - p.length(); i++) {
            if (s.charAt(i) != s.charAt(i+p.length())) {
                smap[s.charAt(i) - 'a']--;
                smap[s.charAt(i+p.length()) - 'a']++;
                if (smap[s.charAt(i)-'a'] == pmap[s.charAt(i)-'a']) {
                    count++;
                } else if (smap[s.charAt(i)-'a']+1 == pmap[s.charAt(i)-'a']) {
                    count--;
                }
                
                if (smap[s.charAt(i + p.length())-'a'] == pmap[s.charAt(i + p.length())-'a']) {
                    count++;
                } else if (smap[s.charAt(i + p.length())-'a']-1 ==
                           pmap[s.charAt(i + p.length())-'a']) {
                    count--;
                }
                
            }
            
            if (count == LEN)
                ans.add(i+1);
        }
        
        return ans;
    }
}