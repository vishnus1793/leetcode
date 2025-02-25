from itertools import combinations as c
class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        l=[]
        for i in range(n):
            l.append(i+1)
        w=c(l,k)
        t=[]
        for i in w:
            t.append(i)
        return t