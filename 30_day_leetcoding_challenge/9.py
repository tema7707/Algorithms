class Solution(object):
    def backspaceCompare(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: bool
        """
        first = ""
        skip = 0
        for i in range(len(S)):
            if S[len(S) - 1 - i] == '#':
                skip += 1
                continue
            if skip > 0:
                skip -= 1
                continue
            first += S[len(S) - 1 - i]
        
        second = ""
        skip = 0
        for i in range(len(T)):
            if T[len(T) - 1 - i] == '#':
                skip += 1
                continue
            if skip > 0:
                skip -= 1
                continue
            second += T[len(T) - 1 - i]
        
        return first == second
