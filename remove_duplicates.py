# https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if( len(nums) == 0 or len(nums) == 1):
            return(len(nums))
        else:
            prev = nums[0]
            i = 1
            while( i < len(nums) ):
                cur = nums[i]
                if cur == prev :
                    nums.pop(i)
                else:
                    prev = cur
                    i += 1
        return(len(nums))
