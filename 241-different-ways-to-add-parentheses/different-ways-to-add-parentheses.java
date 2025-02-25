import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    HashMap<String, List<Integer>> mp = new HashMap<>();
    
    public List<Integer> diffWaysToCompute(String s) {
        if (mp.containsKey(s)) return mp.get(s);
        
        List<Integer> an = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> lf = diffWaysToCompute(s.substring(0, i));
                List<Integer> rt = diffWaysToCompute(s.substring(i + 1));
                
                for (int l : lf) {
                    for (int r : rt) {
                        if (c == '+') an.add(l + r);
                        else if (c == '-') an.add(l - r);
                        else an.add(l * r);
                    }
                }
            }
        }
        if (an.isEmpty()) an.add(Integer.parseInt(s));
        mp.put(s, an);
        return an;
    }
    
    public List<Integer> dc(String expression) {
        return diffWaysToCompute(expression);
    }
}
