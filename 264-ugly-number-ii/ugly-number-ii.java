class Solution {
    public int nthUglyNumber(int n) {
        int[] primes = {2, 3, 5};
        PriorityQueue<Long> u = new PriorityQueue<>();
        HashSet<Long> v = new HashSet<>();
        
        u.add(1L);
        v.add(1L);
        
        long curr = 1L;
        for (int i = 0; i < n; i++) {
            curr = u.poll();
            for (int k : primes) {
                long new_ugly = curr * k;
                if (!v.contains(new_ugly)) {
                    u.add(new_ugly);
                    v.add(new_ugly);
                }
            }
        }
        return (int)curr;
    }
}