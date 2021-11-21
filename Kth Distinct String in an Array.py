def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    """
    Runtime : 56 ms
    Memory : 14.6 MB
    """

    def kthDistinct(self, arr, k):

        d = {}

        for ele in arr:

            if ele in d:

                d[ele] += 1

            else:

                d[ele] = 1

        for ele in d:

            if d[ele] == 1:

                k -= 1

            if k == 0:

                return ele

        return ""


arr = list(input().split())

k = int_input()

sol = Solution()

print(sol.kthDistinct(arr, k))