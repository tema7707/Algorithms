class Solution:
    def toLowerCase(self, input: str) -> str:
        ans = ''
        for i in input:
            ans += chr(ord(i) + 32) if ord(i) < 97 and ord(i) >= 65 else i
        return ans 