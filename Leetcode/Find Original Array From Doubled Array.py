from collections import Counter

class Solution:
  
    def findOriginalArray(self, changed: List[int]) -> List[int]:
        
        d = Counter(changed)
        
        if len(changed) % 2 != 0:
            
            return []
        
        res = []
        
        for x in sorted(d):
            
            if d[x] > d[x * 2]:
                
                return []
            
            if x == 0:
                
                if d[x] % 2 != 0:
                    
                    return []
                
                else:
                    
                    res += [0] * (d[x] // 2)
                    
            else:
                
                res += [x] * d[x]
                
            d[2 * x] -= d[x]
            
            d[x] = 0
            
        return res
        
