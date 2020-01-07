class Solution:
    def oddCells(self, n: int, m: int, indices: List[List[int]]) -> int:
        horizontal = [0] * n
        vertical = [0] * m
        for i in indices:
            vertical[i[1]] += 1
            horizontal[i[0]] += 1
        
        ans = 0
        for i in range(n):
            for j in range(m):
                if (horizontal[i] + vertical[j]) % 2 == 1:
                    ans += 1
                
        return ans