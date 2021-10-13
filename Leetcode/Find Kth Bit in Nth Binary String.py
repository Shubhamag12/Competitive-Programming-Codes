import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


class Solution:

    def inverse(self, s):

        return ''.join(['1' if i == '0' else '0' for i in s])

    def reverse(self, s):

        return s[::-1]

    def findKthBit(self, n, k):

        if n == 1:

            return '0'

        s_prev = "0"

        s_new = ""

        for i in range(2, n+1):

            s_new = s_prev + "1" + self.reverse(self.inverse(s_prev))

            s_prev = s_new

        return s_new[k-1]

