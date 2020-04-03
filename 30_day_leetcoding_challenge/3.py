class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return nums[0]
        
        min_arg = 0
        comulative_sum = 0
        ans = nums[0]
        
        for i in nums:
            comulative_sum += i
            if comulative_sum - min_arg > ans:
                ans = comulative_sum - min_arg
            if min_arg > comulative_sum:
                min_arg = comulative_sum
        
        return ans
        
