class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int r=-1;
        if(s.length()==1) return 1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                r=i;
                break;
            }
        }
        if(r==-1) return s.length();
        String r1=s.substring(r,s.length()-1);
        return r1.length();
    }
}