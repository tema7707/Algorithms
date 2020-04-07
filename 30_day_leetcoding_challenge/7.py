class Solution(object):
    def countElements(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        d = {}
        for i in arr:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        
        ans = 0
        for v in d.keys():
            if v + 1 in d:
                ans += d[v]
            
        return ans
