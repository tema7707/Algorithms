class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        summ = 0
        prod = 1
        for i in str(n):
            digit = int(i)
            summ += digit
            prod *= digit
        
        return prod - summ