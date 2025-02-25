class Solution {
    public void solve(int[] cd, int t,int idx, List<Integer> temp, List<List<Integer>> res, int sum) {
        if (idx > cd.length || sum > t) {
            return;
        }
        if(sum == t) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int j = idx; j < cd.length; j++) {
            if (j > idx && cd[j] == cd[j-1]) continue;
            temp.add(cd[j]);
            solve(cd, t, j+1, temp, res, sum+cd[j]);
            temp.remove(temp.size()-1);
        }

        return;
    }
    public List<List<Integer>> combinationSum2(int[] cd, int t) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(cd);
        solve(cd, t, 0, new ArrayList<>(), res, 0);
        return res;
    }
}