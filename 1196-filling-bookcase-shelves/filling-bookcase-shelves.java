class Solution {
    private Integer[] memo;

    public int minHeightShelves(int[][] books, int sw) {
        int n = books.length;
        memo = new Integer[n];
        return findMinHeight(books, sw, 0);
    }

    private int findMinHeight(int[][] books, int sw, int i) {
        if (i == books.length) {
            return 0;
        }
        
        if (memo[i] != null) {
            return memo[i];
        }
        
        int mh = Integer.MAX_VALUE;
        int w = 0;
        int h = 0;

        for (int j = i; j < books.length; j++) {
            w += books[j][0];

            if (w > sw) {
                break;
            }

            h = Math.max(h, books[j][1]);
            int ht = h + findMinHeight(books, sw, j + 1);
            mh = Math.min(mh, ht);
        }

        memo[i] = mh;
        return mh;
    }
}
