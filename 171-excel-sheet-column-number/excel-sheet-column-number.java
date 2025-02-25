class Solution {
    public int titleToNumber(String t) {
        int r=0;
        int l =t.length();
        for(int i=0;i<l;i++){
            int v = t.charAt(i)-'A'+1;
            r=r*26+v;
        }
        return r;
    }
}