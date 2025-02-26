class Solution {
    public boolean detectCapitalUse(String w) {
        int c = 0;
        int l = w.length();
        for (int i = 0; i < l; i++) {
            if (Character.isUpperCase(w.charAt(i))) {
                c++;
            }
        }
        if (c == l || (c == 1 && Character.isUpperCase(w.charAt(0))) || c == 0) {
            return true;
        }
        
        return false;
    }
}
