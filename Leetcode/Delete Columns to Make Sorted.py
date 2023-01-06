def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def minDeletionSize(self, s):

        cols = []

        for i in range(len(s) - 1):

            for j in range(len(s[0])):

                if s[i][j] > s[i+1][j]:

                    cols.append(j)

        return len(set(cols))