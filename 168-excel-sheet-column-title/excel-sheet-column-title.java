class Solution {
    public String convertToTitle(int c) {
        StringBuffer a=new StringBuffer();
        while(c>0){
            c--;
            a.append((char)('A'+(c%26)));
            c/=26;
        }
        return a.reverse().toString();
    }
}
