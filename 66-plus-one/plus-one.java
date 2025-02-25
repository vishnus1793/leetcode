import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();
        for (int i : digits) {
            s.append(i);
        }
        BigInteger n = new BigInteger(s.toString());
        n = n.add(BigInteger.ONE);
        String r = n.toString();
        int[] res = new int[r.length()];
        for (int i = 0; i < r.length(); i++) {
            res[i] = Character.getNumericValue(r.charAt(i));
        }
        return res;
    }
}
