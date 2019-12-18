class Solution {
    
    public List<Integer> partitionLabels(String S) {
        char[] arr = S.toCharArray();
        int[] segment = new int[26];
        ArrayList<Integer> ans = new ArrayList();
        
        
        for (int i = 0; i < arr.length; i++) {
            segment[arr[i] - 'a'] = i;
        }
        
        int endOfPart = 0;
        int lastPart = -1;
        for (int i = 0; i < arr.length; i++) {
            endOfPart = Math.max(endOfPart, segment[arr[i] - 'a']);
            
            if (endOfPart <= i) {
                ans.add(Math.max(endOfPart - lastPart, 1));
                lastPart = endOfPart;
            }
        }
        
        return ans;
    }
}