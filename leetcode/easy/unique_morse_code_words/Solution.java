class Solution {
    static final String[] alphabet = new String[] {
        ".-","-...","-.-.","-..",".","..-.",
        "--.","....","..",".---","-.-",".-..",
        "--","-.","---",".--.","--.-",".-.","...","-",
        "..-","...-",".--","-..-","-.--","--.." }; // sorry :)
    
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<String>();
        
        for (String word : words) {
            set.add(translate(word));
        }
        
        return set.size();
    }
    
    static String translate(String word)  {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            code.append(alphabet[word.charAt(i) - 'a']);
        }
        
        return code.toString();
    }
}