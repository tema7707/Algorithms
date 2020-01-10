class Solution:
    def judgeCircle(self, moves: str) -> bool:
        diffx = 0
        diffy = 0
        
        for i in moves:
            if i == 'U': diffy -= 1
            elif i == 'D': diffy += 1
            elif i == 'L': diffx -= 1
            elif i == 'R': diffx += 1
        
        return diffx == 0 and diffy == 0
