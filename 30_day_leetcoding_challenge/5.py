class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) == 0:
            return 0
        prev = prices[0]
        buy_price = 0
        profit = 0
        hold = False
        for i in prices:
            if prev > i and hold:
                hold = False
                profit += prev - buy_price
            if prev < i and not hold:
                hold = True
                buy_price = prev
            prev = i
            
        if hold:
            profit += prev - buy_price
            
        return profit
                
                
