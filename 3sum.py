# https://leetcode.com/problems/3sum/

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        if len(nums) < 3:
            return result
        nums.sort()
        for i in range(len(nums) - 2):
            if (nums[i] == nums[i-1]) and (i > 0) :
                continue
            left = i + 1
            right = len(nums) - 1
            sums = 0 - nums[i]
            while left < right:
                if (sums == nums[left] + nums[right]):
                    result.append([nums[i], nums[left], nums[right]])
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1
                    left += 1
                    right -= 1
                elif (sums > (nums[left] + nums[right])) :
                    left += 1
                else:
                    right -= 1
        return result
