class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        s = s.split()

        n = len(pattern)

        m = len(s)

        if n != m:

            return False

        d = {}

        for i,j in zip(pattern, s):
            
            if i in d.keys() and j != d[i]:
                
                return False

            d[i] = j    

            if len(set(d.values())) != len(set(d.keys())):

                return False
        return True
