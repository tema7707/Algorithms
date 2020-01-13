class Solution:
    def climbStairs(self, n: int) -> int:
        vars = [0] * (n + 2)
        vars[0] = 1
        for i in range(len(vars)-2):
            vars[i + 1] += vars[i]
            vars[i + 2] += vars[i]
        return vars[n]