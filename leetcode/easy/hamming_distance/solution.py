class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        diff = 0
        while x != 0 or y != 0:
            diff += 1 if x % 2 != y % 2 else 0
            x = x // 2
            y = y // 2
        return diff