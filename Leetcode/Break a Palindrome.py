import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


class Solution:

    def breakPalindrome(self, palindrome):

        l = list(palindrome)

        bol = False

        if len(l) == 1:

            return ""

        i = 0

        j = len(l) - 1

        while i < j:

            if l[i] == l[j] and l[i] != 'a':

                l[i] = 'a'

                bol = True

                break

            i += 1

            j -= 1

        if bol:

            return ''.join(l)

        else:

            l[len(l) - 1] = 'b'

            return ''.join(l)


sol = Solution()

print(sol.breakPalindrome(palindrome=input()))