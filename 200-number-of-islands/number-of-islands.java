class Solution {
    public int numIslands(char[][] m) {
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == '1') {
                    total += count(m, i, j);
                }
            }
        }
        return total;
    }

    public int count(char[][] m, int i, int j) {
        if (i < 0 || i >= m.length || j < 0 || j >= m[0].length || m[i][j] == '0') {
            return 0;
        }
        m[i][j] = '0';
        count(m, i + 1, j); 
        count(m, i - 1, j); 
        count(m, i, j + 1); 
        count(m, i, j - 1); 
        return 1;
    }
}
