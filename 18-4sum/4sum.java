import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] n, int t) {
        List<List<Integer>> r = new ArrayList<>();
        Arrays.sort(n);
        int l = n.length;
        
        for (int i = 0; i < l - 3; i++) {
            if (i > 0 && n[i] == n[i - 1]) continue;
            for (int j = i + 1; j < l - 2; j++) {
                if (j > i + 1 && n[j] == n[j - 1]) continue;
                int k = j + 1, m = l - 1;
                while (k < m) {
                    long sum = (long) n[i] + n[j] + n[k] + n[m];
                    if (sum == t) {
                        r.add(Arrays.asList(n[i], n[j], n[k], n[m]));
                        while (k < m && n[k] == n[k + 1]) k++;
                        while (k < m && n[m] == n[m - 1]) m--;
                        k++;
                        m--;
                    } else if (sum < t) {
                        k++;
                    } else {
                        m--;
                    }
                }
            }
        }
        
        return r;
    }
}
