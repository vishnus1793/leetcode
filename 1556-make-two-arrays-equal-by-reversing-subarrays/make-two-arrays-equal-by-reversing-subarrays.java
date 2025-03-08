class Solution {
    public boolean canBeEqual(int[] t, int[] a) {
        if(t.length!=a.length){
            return false;
        }
        Arrays.sort(t);
        Arrays.sort(a);
        for(int i=0;i<t.length;i++){
            if(t[i]!=a[i]){
                return false;
            }
        }
        return true;

    }
}