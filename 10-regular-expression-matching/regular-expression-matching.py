import re
class Solution(object):
    def isMatch(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: bool
        """
        x = p.replace("***","*")
            
        if(re.fullmatch(x,s)):
            return True
        else:
            return False
        
obj = Solution()
obj.isMatch("abc","a***abc")