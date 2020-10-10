# https://leetcode.com/problems/find-peak-element/

class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        right = len(nums) - 1
        left = 0
        
        while(left < right):
            mid1 = left + (right - left)/2
            mid = int(mid1)
            if(nums[mid] < nums[mid+1]):
                left = mid + 1
            else:
                right = mid
        return left
