class Solution {
    int[] ans;
    public int[] countBits(int num) {
        num++;
        ans = new int[num];
        ans[0] = 0;
        if (num == 1) {
            return ans;
        }
        ans[1] = 1;
        for (int i = 1; i < num; i++) {
            getCount(i);
        }
        return ans;
    }
    
    public int getCount(int dex) {
        if (ans[dex] != 0) {
            return ans[dex];
        }
        
        if (dex == 0) {
            return 0;
        }
        
        ans[dex] = getCount(dex / 2) + (dex % 2 == 1? 1 : 0);
        return ans[dex];
    }
}