// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] ans = new int[nums.length];
        int total_sum = 0;
        for(int i = 0; i < nums.length; i++){
            total_sum += nums[i];
        }
        int prefix_sum = 0;
        for(int i = 0; i < nums.length; i++){
            prefix_sum += nums[i];
            ans[i] = ((i+1)*nums[i] - prefix_sum) + (total_sum - prefix_sum) - (nums.length - i - 1)*nums[i];
        }
        return ans;
    }
}
