import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


class Solution:
    def maxWidthOfVerticalArea(self, points):

        t = []

        for p in points:

            t.append(p[0])

        t.sort()

        max_diff = 0

        for i in range(len(t) - 1):

            if (t[i + 1] - t[i]) > max_diff:

                max_diff = t[i + 1] - t[i]

        return max_diff
