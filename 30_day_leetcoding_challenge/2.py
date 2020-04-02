class Solution(object):

    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        t = compute(n)
        r = compute(t)
        if t == 1:
            return True
        
        while t != r and t != 1 and r != 1:
            t = compute(t)
            r = compute(compute(r))
    
        return t != r
    
def compute(n):
    next_n = 0
    while n > 0:
        next_n += (n % 10) ** 2
        n = n // 10
    return next_n
