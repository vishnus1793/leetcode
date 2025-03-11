class Solution {
    public int secondMinimum(int n, int[][] edges, int t, int c) {
        Map<Integer, Set<Integer>> g = new HashMap<>();
        for (int i = 1; i <= n; i++) g.put(i, new HashSet<>());
        for (int[] e : edges) {
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }
        int[][] vis = new int[n+1][2];
        for (int[] v : vis) {
            Arrays.fill(v, Integer.MAX_VALUE);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{1, 0});
        
        int min = Integer.MAX_VALUE, sMin = min;
        
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curNode = cur[0], curTime = cur[1];

            if (curNode == n) {
                if (curTime < min) {
                    sMin = min;
                    min = curTime;
                } else if (curTime != min && curTime < sMin) {
                    sMin = curTime;
                }
            }
            
            if ((curTime / c) % 2 == 1) {
                curTime += c - (curTime % c);
            }
            
            int nxtTime = curTime + t;
            
            for (int nxt : g.get(curNode)) {
                int nxtMin = vis[nxt][0], nxtSMin = vis[nxt][1];
                if (nxtTime < nxtMin) {
                    vis[nxt][1] = nxtMin;
                    vis[nxt][0] = nxtTime;
                    pq.offer(new int[]{nxt, nxtTime});
                } else if (nxtTime != nxtMin && nxtTime < nxtSMin) {
                    vis[nxt][1] = nxtTime;
                    pq.offer(new int[]{nxt, nxtTime});
                }
            }
        }
  
        return sMin;
    }
}
