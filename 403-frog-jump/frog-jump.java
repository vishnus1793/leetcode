import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean canCross(int[] s) {
        Map<Integer, Set<Integer>> dp = new HashMap<>();
        dp.put(s[0], new HashSet<>());
        dp.get(s[0]).add(0);

        for (int i = 0; i < s.length; i++) {
            int st = s[i];
            if (!dp.containsKey(st)) continue;
            
            for (int j : dp.get(st)) {
                for (int nj = j - 1; nj <= j + 1; nj++) {
                    if (nj > 0) {
                        int ns = st + nj;
                        if (contains(s, ns)) {
                            if (ns == s[s.length - 1]) {
                                return true;
                            }
                            dp.computeIfAbsent(ns, k -> new HashSet<>()).add(nj);
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private boolean contains(int[] s, int x) {
        for (int v : s) {
            if (v == x) return true;
        }
        return false;
    }
}

