class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        k=""
        for i in s:
            if i.isalnum():
                k+=i
        if k==k[::-1]:
            return True
        return False
