**# [Jump Game](https://leetcode.com/problems/jump-game/)**

class Solution:
    def canJump(self, nums: List[int]) -> bool:
        l = len(nums) - 1
        for i in reversed(range(len(nums))):
            if(i + nums[i] >= l):
                l = i
        return l == 0        
