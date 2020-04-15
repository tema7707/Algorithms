class Solution(object):
    def stringShift(self, s, shift):
        """
        :type s: str
        :type shift: List[List[int]]
        :rtype: str
        """
        start = 0
        for i in shift:
            sign = 1
            if i[0] != 0:
                sign = -1
            start += sign * i[1]
        
        ans = ""
        for i in range(len(s)):
            ans += s[(i + start) % len(s)]
            
        return ans
