class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int s = 0;
        while(left < right){
            left >>=1;
            right >>=1;
            s++;
        }
        int r = left << s;
        return r;
    }
}