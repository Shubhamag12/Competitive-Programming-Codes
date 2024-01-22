class Solution:

    def solve(self, nums):

        prev = nums[0]

        prev2 = 0

        for i in range(1, len(nums)):

            take = nums[i]

            if i > 1:

                take += prev2

            not_take = prev

            curr = max(take, not_take)

            prev2 = prev

            prev = curr

        return prev

    def rob(self, nums: List[int]) -> int:
        
        if len(nums) == 1:

            return nums[0]
        
        # without first element
        temp1 = nums[1:]

        # without last element
        temp2 = nums[:len(nums)-1]

        return max(self.solve(temp1), self.solve(temp2))
