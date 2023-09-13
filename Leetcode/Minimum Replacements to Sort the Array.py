def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:
    def minimumReplacement(self, nums: List[int]) -> int:

        n = len(nums)

        last = nums[n - 1]

        res = 0

        for i in range(n - 2, -1, -1):

            if nums[i] > last:

                temp = nums[i] // last

                if nums[i] % last:
                    temp += 1

                last = nums[i] // temp

                res += (temp - 1)

            else:

                last = nums[i]

        return res

sol = Solution()

print(sol.minimumReplacement(nums=list_input()))