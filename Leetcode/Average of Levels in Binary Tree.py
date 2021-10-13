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

    def height(self, root):

        if root is None:

            return 0

        else:

            lh = self.height(root.left)

            rh = self.height(root.right)

            if lh > rh:

                return lh + 1

            else:

                return rh + 1

    def avgofLevel(self, root,l, nodes):

        if root is None:

            return 0

        if l == 1:

            nodes.append(root.val)

        else:

            self.avgofLevel(root.left, l-1, nodes)

            self.avgofLevel(root.right, l-1, nodes)



    def averageOfLevels(self, root):

        avg = []

        h = self.height(root)

        for i in range(1, h+1):

            nodes = []

            self.avgofLevel(root, i, nodes)

            avg.append(sum(nodes)/len(nodes))

        return avg

