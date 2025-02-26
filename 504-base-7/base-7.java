class Solution {
    public String convertToBase7(int n) {
        Boolean i = n<0;
        n = Math.abs(n);
        String s = "";
        do{
            char d = (char) (n%7+'0');
            s = d + s;
            n/=7;
        }while(n>0);
        if(i){
            s="-"+s;
        }
        return s;
    }
}