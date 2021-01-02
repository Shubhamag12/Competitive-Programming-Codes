# https://leetcode.com/problems/invert-binary-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:

        if (root == None):

            return

        else:

            temp = root

            # call mirror of left subtree
            self.invertTree(root.left)

            # call mirror of right subtree
            self.invertTree(root.right)

            # swap left and right subtree
            temp = root.left

            root.left = root.right

            root.right = temp

        return root
