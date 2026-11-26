package DAY2.Session1;

public class Prg6LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        if (strs == null || strs.length == 0) return "";
        
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (j == strs[i].length() || strs[i].charAt(j) != word.charAt(j)) {
                    word = word.substring(0, j); 
                    break;
                }
            }
            
            if (word.isEmpty()) return "";
        }
        return word;
    }

    public static void main(String[] args) {
        Prg6LongestCommonPrefix lcp = new Prg6LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        String result = lcp.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
} 
    

