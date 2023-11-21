class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        
        nums.sort()

        i = max_sum = 0

        j = len(nums) - 1

        while i < j:

            s = nums[i] + nums[j]

            if s > max_sum:

                max_sum = s

            i += 1

            j -= 1

        return max_sum
