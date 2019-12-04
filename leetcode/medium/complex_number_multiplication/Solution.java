class Solution {
    public String complexNumberMultiply(String a, String b) {
        int num_a=0, num_b=0, com_a=0, com_b=0;
        
        String part = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '+') {
                num_a = Integer.parseInt(part);
                part = "";
                continue;
            }
            if (a.charAt(i) == 'i') {
                com_a = Integer.parseInt(part);
                part = "";
                break;
            }
            part += a.charAt(i);
        }
        
        part = "";
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '+') {
                num_b = Integer.parseInt(part);
                part = "";
                continue;
            }
            if (b.charAt(i) == 'i') {
                com_b = Integer.parseInt(part);
                part = "";
                break;
            }
            part += b.charAt(i);
        }
        
        int num_ans = num_a*num_b - com_a*com_b;
        int com_ans = num_a*com_b + com_a*num_b;
        
        return "" + num_ans + "+" + com_ans + "i";
    }
}