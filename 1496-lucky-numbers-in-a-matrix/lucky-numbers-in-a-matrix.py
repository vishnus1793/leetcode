
class Solution:
    def luckyNumbers(self, mat: List[List[int]]) -> List[int]:
        res = []
        for r in mat:
            m = min(r)
            idx = r.index(m)
            if all(m >= mat[k][idx] for k in range(len(mat))):
                res.append(m)
        return res