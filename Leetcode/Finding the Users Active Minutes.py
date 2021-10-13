import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


from collections import defaultdict


class Solution:

    def findingUsersActiveMinutes(self, logs, k: int):

        d = defaultdict(set)

        for log in logs:

            d[log[0]].add(log[1])

        res = [0] * k

        for item in d.keys():

            res[len(d[item]) - 1] += 1

        return res