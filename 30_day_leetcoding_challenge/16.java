class Solution {
    public boolean checkValidString(String s) {
       int min = 0;
       int max = 0;
       for (char c: s.toCharArray()) {
           min += c == '(' ? 1 : -1;
           max += c != ')' ? 1 : -1;
           if (max < 0) break;
           min = Math.max(min, 0);
       }
       return min == 0;
    }
}
