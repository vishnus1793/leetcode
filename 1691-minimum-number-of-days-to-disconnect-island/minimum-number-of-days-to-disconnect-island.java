class Solution {
    private int[] X = {-1, 0, 1, 0};
    private int[] Y = {0, 1, 0, -1};

    private boolean b(int i, int j, int n, int m) {
        return i >= 0 && j >= 0 && i < n && j < m;
    }

    private void d(int i, int j, int[][] g, boolean[][] v) {
        v[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int ii = i + X[k];
            int jj = j + Y[k];
            if (b(ii, jj, g.length, g[0].length) 
                && g[ii][jj] == 1 && !v[ii][jj]) {
                d(ii, jj, g, v);
            }
        }
    }

    private int c(int[][] g) {
        int n = g.length, m = g[0].length, knt = 0;
        boolean[][] v = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 1 && !v[i][j]) {
                    knt++;
                    d(i, j, g, v);
                }
            }
        }
        return knt;
    }

    public int minDays(int[][] g) {
        if (c(g) != 1) return 0;

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                if (g[i][j] == 1) {
                    g[i][j] = 0;
                    if (c(g) != 1) return 1;
                    g[i][j] = 1;
                }
            }
        }
        return 2;
    }
}
