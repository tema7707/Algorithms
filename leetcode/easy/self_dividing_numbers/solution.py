class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        ans = []
        for i in range(left, right + 1):
            x = i
            while x != 0:
                if x % 10 == 0 or i % (x % 10) != 0:
                    break
                x = x // 10
            if x == 0:
                ans.append(i)
        return ans