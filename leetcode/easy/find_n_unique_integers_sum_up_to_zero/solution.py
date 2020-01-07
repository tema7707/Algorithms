class Solution:
    def sumZero(self, n: int) -> List[int]:
        ans = [0] * n
        for i in range(n // 2):
            ans[i] = i + 1
        
        j = n // 2
        if n % 2 == 1:
            ans[j] = 0
            
        for i in range(n // 2):
            ans[j+i] = -i - 1
        
        return ans