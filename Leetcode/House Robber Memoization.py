# TC - O(n)
# SC - O(n) [DP Array] + O(n) [AUX Stack]
class Solution:

    def solve(self, nums, i, dp):

        if i < 0:

            return 0

        if i == 0:

            return nums[i]

        if dp[i] != -1:

            return dp[i]

        pick = nums[i] + self.solve(nums, i-2, dp)

        not_pick = self.solve(nums, i-1, dp)

        dp[i] = max(pick, not_pick)

        return dp[i]

    def rob(self, nums: List[int]) -> int:

        n = len(nums)

        dp = [-1 for i in range(n)]

        return self.solve(nums, n-1, dp)
        
