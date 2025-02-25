import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> v = new ArrayList<>();
        
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                v.add(c);
            }
        }
                int k = v.size() - 1;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                chars[i] = v.get(k--);
            }
        }
        
        return new String(chars);
    }
}
