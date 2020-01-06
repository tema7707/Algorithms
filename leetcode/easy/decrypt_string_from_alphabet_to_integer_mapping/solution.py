class Solution:
    def freqAlphabets(self, s: str) -> str:
        i = 0
        ans = ''
        
        while i < len(s):
            if i + 2 < len(s) and s[i + 2] == '#':
                ans += chr(ord('a') + int(s[i]) * 10 + int(s[i+1]) - 1)
                i += 3
            else:
                ans += chr(ord('a') + int(s[i]) - 1)
                i += 1
            
        return ans

