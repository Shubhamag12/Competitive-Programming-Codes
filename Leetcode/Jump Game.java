// https://leetcode.com/problems/jump-game/ 

class Solution {
    public boolean canJump(int[] nums) {
        int j = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= j){
                j = i;
            }
        }      
        return j == 0;
    }
}
