class Solution:
    def reverse(self, x: int) -> int:
        if x >= 0:
            r_str = str(x)[::-1]
            r_int = int(r_str)
        else:
            r_str = str(x)[1:][::-1]
            r_int = -int(r_str)
        
        if r_int < -2**31 or r_int > 2**31 - 1:
            return 0
        
        return r_int
