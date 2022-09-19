import heapq

class Solution:
  
    def maxPerformance(self, n: int, speed: List[int], efficiency: List[int], k: int) -> int:
        
        res = 0
        
        ss = 0
        
        heap = []
        
        d = zip(efficiency, speed)
        
        sd = sorted(d, key=lambda x:x[0], reverse = True)
        
        for e, s in sd:
            
            heapq.heappush(heap, s)
            
            ss += s
            
            if len(heap) > k:
                
                ss -= heapq.heappop(heap)
                
            res = max(res, ss * e)
            
        return res % (10**9+7)
      
