def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def singleNonDuplicate(self, nums):
        """
        Solution 1 - Runtime : 72 ms , Memory : 16.5 MB
        """
        i = 0

        if len(nums) == 1:

            return nums[0]

        while i < len(nums) - 1:

            if nums[i] ^ nums[i+1] == 0:

                i += 2

            elif nums[i] ^ nums[i+1] != 0:

                return nums[i]

        return nums[i]


nums = list_input()
sol = Solution()

print(sol.singleNonDuplicate(nums))

"""
Solution 2 - Runtime : 60 ms, Memory : 16.3 MB
"""
print((2*sum(set(nums)) - sum(nums)))

