https://leetcode.com/problems/contains-duplicate/

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        i = 0
        while(i < len(nums) - 1):
            if nums[i] ^ nums[i+1] != 0:
                i += 1
            else:
                return True
        
        if i == len(nums) - 1:
            return False
