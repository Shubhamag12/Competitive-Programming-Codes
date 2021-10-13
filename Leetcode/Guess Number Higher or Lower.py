import sys


def int_input(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


"""

Using Binary Search approach

guess() function is already predefined on Leetcode (just for testing purpose here)

"""

def guess(num):

    if num < pick:

        return 1

    elif num > pick:

        return -1

    else:

        return 0

class Solution:

    def helper(self, left, right):

        if right >= left:

            mid = (left + right) // 2

            guess_num = guess(mid)

            if guess_num == 0:

                return mid

            elif guess_num == 1:

                return self.helper(mid + 1, right)

            else:

                return self.helper(left, mid - 1)

    def guessNumber(self, n):

        return self.helper(1, n)

n = int_input()

pick = int_input()

sol = Solution()

print(sol.guessNumber(n))