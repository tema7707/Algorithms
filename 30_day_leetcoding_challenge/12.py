class Solution(object):
    def findTwoMaximums(self):
        first = 0
        second = 0
        first_i = 0
        second_i = 0
        for index, i in enumerate(self.stones):
            if first < i:
                first, second = i, first
                first_i, second_i = index, first_i
            elif second < i:
                second = i
                second_i = index
                
        return self.stones.pop(first_i), self.stones.pop(second_i if second_i < first_i else second_i - 1)
    
    def lastStoneWeight(self, stones):
        """
        :type stones: List[int]
        :rtype: int
        """
        self.stones = stones
        while len(stones) > 1:
            first, second = self.findTwoMaximums()
            first -= second
            if first > 0:
                stones.append(first)
        
        return stones.pop() if len(stones) > 0 else 0
            
