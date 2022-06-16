def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def removePalindromeSub(self, s):

        n = len(s)

        if n == 0:

            return 0

        elif n == 1:

            return 1

        else:

            if s == s[::-1]:

                return 1

            else:

                return 2


sol = Solution()

print(sol.removePalindromeSub(s=input()))