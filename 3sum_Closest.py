# https://leetcode.com/problems/3sum-closest/

class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        if len(nums) < 3:
            return 0
        nums.sort()
        min_diff = nums[0] + nums[1] + nums[2]
        for i in range(len(nums) - 2):
            if (nums[i] == nums[i-1]) and (i > 0) :
                continue
            left = i + 1
            right = len(nums) - 1
            # print('min_diff ',min_diff)
            while(left < right):
                sums = nums[i] + nums[left] + nums[right]
                # print('sum ',sums)
                if (abs(sums - target) < abs(min_diff - target)) :
                    min_diff = sums
                if sums == target :
                    return sums
                elif sums < target :
                    left += 1
                else:
                    right -= 1
        return min_diff
