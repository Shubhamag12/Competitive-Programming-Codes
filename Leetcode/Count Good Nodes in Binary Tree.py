# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def countgoodnodes(self, root, max_val):

        if root is None:
            return 0

        if root.val >= max_val:

            count = 1
        else:

            count = 0

        max_val = max(root.val, max_val)

        count += self.countgoodnodes(root.left, max_val)

        count += self.countgoodnodes(root.right, max_val)

        return count

    def goodNodes(self, root: TreeNode) -> int:

        return self.countgoodnodes(root, root.val)

        
