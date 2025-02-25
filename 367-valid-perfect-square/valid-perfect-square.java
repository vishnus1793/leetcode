class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<=0) return false;
        int s = (int) Math.sqrt(num);
        return s*s==num;
    }
}