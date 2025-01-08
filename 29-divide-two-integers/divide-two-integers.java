import java.math.BigInteger;

class Solution {
    public int divide(int d, int k) {
        if(d==Integer.MIN_VALUE && k==-1){
            return Integer.MAX_VALUE;
        }

        BigInteger a = BigInteger.valueOf(d);
        BigInteger b = BigInteger.valueOf(k);
        BigInteger s = a.divide(b);
        return s.intValue();
    }
}
