class Solution:
    def flipAndInvertImage(self, A: List[List[int]]) -> List[List[int]]:
        for row in range(len(A)):
            for i in range(len(A[row]) // 2): 
                A[row][i], A[row][len(A[row]) - i - 1] = \
                        A[row][len(A[row]) - i - 1], A[row][i]
                A[row][i] ^= 1
                A[row][len(A[row]) - i - 1] ^= 1
            if len(A[row]) % 2 == 1:
                A[row][len(A[row]) // 2] ^= 1
                
        return A
                