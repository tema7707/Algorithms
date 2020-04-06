class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        ans = {}
        for i in strs:
            code = [0 for _ in range(26)]
            for c in i:
                code[ord(c) - ord('a')] += 1
            s = ''
            for c in range(len(code)):
                if code[c] != 0:
                    s += chr(c + ord('a')) + str(code[c])
                    
            if s in ans.keys():
                ans[s].append(i)
            else:
                ans[s] = [i]
                
        return ans.values()
            
        
