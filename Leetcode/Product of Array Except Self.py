def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def productExceptSelf(self, nums):

        """
        TLE Solution
        :param nums:
        :return:
        """
        """
        res = []

        k = 0

        while k < len(nums):

            i = 0

            j = len(nums) - 1

            prod = 1

            while i < k:

                prod = prod * nums[i]

                i += 1

            while j > k:

                prod = prod * nums[j]

                j -= 1

            res.append(prod)

            k += 1

        return res
        """

        prod = 1

        res = []

        for i in range(len(nums)):

            res.append(prod)

            prod = prod * nums[i]

        prod = 1

        for i in range(len(nums) - 1, -1, -1):

            res[i] = res[i] * prod

            prod = prod * nums[i]

        return res


sol = Solution()

print(sol.productExceptSelf(nums=list_input()))
