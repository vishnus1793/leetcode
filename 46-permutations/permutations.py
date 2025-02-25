from itertools import permutations as p
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        return tuple(p(nums))