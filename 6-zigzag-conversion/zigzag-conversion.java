class Solution {
    public String convert(String s, int numRows) {
        String[] a = new String[numRows];
        for(int i=0;i<numRows;i++){
            a[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int j=0;j<numRows &&i<s.length();j++){
                a[j]+=s.charAt(i++);
            }
            for(int j=numRows-2;j>0 && i<s.length();j--){
                a[j]+=s.charAt(i++);
            }

        }
        String k="";
        for(String e:a){
            k+=e;
        }
        return k;
    }
}