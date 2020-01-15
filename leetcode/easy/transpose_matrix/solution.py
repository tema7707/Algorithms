class Solution:
    def transpose(self, A: List[List[int]]) -> List[List[int]]:
        if len(A) < 0:
            return None
        h, w = len(A), len(A[0])
        B = [[0] * h for i in range(w)]
        for i in range(h):
            for j in range(w):
                B[j][i] = A[i][j]
        return B