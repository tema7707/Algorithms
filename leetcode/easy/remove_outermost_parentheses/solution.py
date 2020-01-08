class Solution:
    def removeOuterParentheses(self, S: str) -> str:
        brackets = 0
        parent = ''
        for i in S:
            if i == '(':
                if brackets != 0:
                    parent += '('
                brackets += 1
            else:
                brackets -= 1
                if brackets != 0:
                    parent += ')'
        
        return parent