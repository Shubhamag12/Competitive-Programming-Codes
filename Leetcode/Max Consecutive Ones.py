import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


class Solution:

    def findMaxConsecutiveOnes(self, nums):

        max_ones = 0

        one_count = 0

        for i in nums:

            if i == 1:

                one_count += 1

            else:

                if one_count > max_ones:
                    max_ones = one_count

                one_count = 0

        if one_count > max_ones:
            max_ones = one_count

        return max_ones


nums = listInput()

sol = Solution()

print(sol.findMaxConsecutiveOnes(nums))