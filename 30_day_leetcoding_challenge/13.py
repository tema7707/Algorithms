class Solution(object):    
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d = {0: -1}
        max_len = 0
        s = 0
        for i in range(len(nums)):
            s += 1 if nums[i] == 1 else -1
            if d.get(s, 3.3) != 3.3:
                max_len = max(max_len, i - d[s])
            else:
                d[s] = i
            
        return max_len
