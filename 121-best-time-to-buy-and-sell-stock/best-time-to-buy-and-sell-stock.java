class Solution {
    public int maxProfit(int[] prices) {
        int lsf = prices[0], op = 0, pist;

        for (int price : prices) {
            lsf = Math.min(lsf, price);
            pist = price - lsf;
            op = Math.max(op, pist);
        }

        return op;
    }
}
