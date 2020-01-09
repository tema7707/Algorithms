class Solution:
    def diStringMatch(self, S: str) -> List[int]:
        bot = 0
        top = len(S)
        ans = [0] * (len(S) + 1)
        for i, ch in enumerate(S):
            if ch == 'I':
                ans[i] = bot
                bot += 1
            else:
                ans[i] = top
                top -= 1
        
        ans[len(S)] = top
        return ans