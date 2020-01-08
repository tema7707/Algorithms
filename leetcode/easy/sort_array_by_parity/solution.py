class Solution:
    def sortArrayByParity(self, A: List[int]) -> List[int]:
        l = 0
        r = len(A) - 1
        while l < r:
            while l < len(A) and A[l] % 2 == 0:
                l += 1
            while r >= 0 and A[r] % 2 == 1:
                r -= 1
            if l < r and l < len(A) and r >= 0:
                A[r], A[l] = A[l], A[r]
                l += 1
                r -= 1
            else:
                break
        return A