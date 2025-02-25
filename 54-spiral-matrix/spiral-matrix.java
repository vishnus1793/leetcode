import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<>();

        int r = matrix.length;
        int c = matrix[0].length;
        int i = 0, j = -1, k = 1;
        List<Integer> res = new ArrayList<>();
        
        while (r > 0 && c > 0) {
            for (int a = 0; a < c; a++) {
                j += k;
                res.add(matrix[i][j]);
            }
            r--;
            for (int a = 0; a < r; a++) {
                i += k;
                res.add(matrix[i][j]);
            }
            c--;
            k *= -1;
        }
        return res;
    }
}
