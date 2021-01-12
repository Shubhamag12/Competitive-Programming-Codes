// https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] count = new int[nums.length];
        Arrays.fill(count, 1);
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    count[i] = Math.max(count[i], 1 + count[j]);
                }
            }
        }
        Arrays.sort(count);
        return count[count.length - 1];
    }
}
