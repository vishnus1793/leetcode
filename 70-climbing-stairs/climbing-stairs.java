class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> m = new HashMap<>();
        return climbstairs(n,m);
    }
    private int climbstairs(int n, Map<Integer,Integer> m){
        if(n==0||n==1){
            return 1;
        }
        if(!m.containsKey(n)){
            m.put(n,climbstairs(n-1,m)+climbstairs(n-2,m));
        }
        return m.get(n);
    }
}