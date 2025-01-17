class MinStack(object):

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = []

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        if len(self.stack) != 0:
            self.stack.append((x, min(x, self.stack[len(self.stack) - 1][1])))
        else:
            self.stack.append((x, x))

    def pop(self):
        """
        :rtype: None
        """
        if len(self.stack) != 0:
            self.stack.pop()

    def top(self):
        """
        :rtype: int
        """
        return self.stack[len(self.stack) - 1][0]

    def getMin(self):
        """
        :rtype: int
        """
        if len(self.stack) == 0:
            return 0
        return self.stack[len(self.stack) - 1][1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
