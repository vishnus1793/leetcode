class Solution {
    public List<Integer> grayCode(int n) {
        int s = 1<<n;
        List<Integer> l = new ArrayList<>(s);
        for(int i=0;i<s;i++){
            l.add(i^(i>>1));
        }
        return l;
    }
}