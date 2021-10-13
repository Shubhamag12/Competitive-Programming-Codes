import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def __init__(self):

        self.su = 0

    def height(self, node):

        if node is None:

            return 0

        else:

            lheight = self.height(node.left)

            rheight = self.height(node.right)

            if lheight > rheight:

                return lheight + 1

            else:

                return rheight + 1

    def sumOfDeepestLeaves(self, root, h):

        if root is None:

            return

        elif h == 1:

            self.su += root.val

        else:

            self.sumOfDeepestLeaves(root.left, h - 1)

            self.sumOfDeepestLeaves(root.right, h - 1)

    def deepestLeavesSum(self, root) -> int:

        h = self.height(root)

        self.sumOfDeepestLeaves(root, h)

        return self.su
