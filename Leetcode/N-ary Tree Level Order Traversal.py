"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
 
    def levelOrder(self, root: 'Node') -> List[List[int]]:
        
        if root is None:
            
            return []
        
        res = []
        
        q = deque([root])
        
        while q:
            
            level = []
            
            for i in range(len(q)):
                
                node = q.popleft()
                
                level.append(node.val)
                
                for i in node.children:
                    
                    q.append(i)
                    
            res.append(level)
            
        return res
                
                
