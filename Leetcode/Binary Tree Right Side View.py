# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def rightSideViewUtil(self, root, level, max_level, res):

        if root is None:
            return

        if max_level[0] < level:
            res.append(root.val)

            max_level[0] = level

        self.rightSideViewUtil(root.right, level + 1, max_level, res)

        self.rightSideViewUtil(root.left, level + 1, max_level, res)

    def rightSideView(self, root: TreeNode) -> List[int]:

        max_level = [0]

        res = []

        self.rightSideViewUtil(root, 1, max_level, res)

        return res


