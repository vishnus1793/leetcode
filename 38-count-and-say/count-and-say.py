class Solution:
    def countAndSay(self, n: int) -> str:
        def next_number(s):
            k = ''
            i = 0
            while i < len(s):
                count = 1
                while i + 1 < len(s) and s[i] == s[i + 1]:
                    i += 1
                    count += 1
                k += str(count) + s[i]
                i += 1
            return k
        
        current = "1"
        for _ in range(n - 1):
            current = next_number(current)
        
        return current
