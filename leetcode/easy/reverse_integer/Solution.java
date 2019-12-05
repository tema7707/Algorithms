class Solution {
    int reverse(int x) {
        return recReverse(x / 10, x  % 10);
    }
    
    int recReverse(int q, int cur){
        if (q == 0 ) return cur;
        if(cur > Integer.MAX_VALUE / 10) return 0;
        else if (cur < Integer.MIN_VALUE / 10) return 0;
        return recReverse(q / 10, cur * 10 + q % 10);
    }
}