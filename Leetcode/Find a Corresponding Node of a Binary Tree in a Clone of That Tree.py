import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


# Definition for a binary tree node.
class TreeNode:

    def __init__(self, x):

        self.val = x
        self.left = None
        self.right = None

class Solution:
    def getTargetCopy(self, original, cloned, target):

        temp = [cloned]

        children = []

        while temp:

            for t in temp:

                if t.val == target.val:
                    return t

                if t.left:
                    children.append(t.left)

                if t.right:
                    children.append(t.right)

            temp, children = children, []

        return None