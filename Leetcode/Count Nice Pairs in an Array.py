def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def reverse(self, n):

        rev = 0

        while n:
            rem = n % 10

            rev = rev * 10 + rem

            n = n // 10

        return rev

    def countNicePairs(self, nums) -> int:

        d = {}

        cnt = 0

        M = 10 ** 9 + 7

        for i in range(len(nums)):

            nums[i] = nums[i] - self.reverse(nums[i])

            cnt += d.get(nums[i], 0)

            d[nums[i]] = d.get(nums[i], 0) + 1

        return cnt % M

sol = Solution()

print(sol.countNicePairs(nums=list_input()))