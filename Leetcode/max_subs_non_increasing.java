// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
 
import java.util.Arrays;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum1 = 0;
        int n = nums.length;
        int sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1 += nums[i];
        }
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(sum2 > sum1){
                return list;
            }
            else{
                sum1 = sum1 - nums[n-i-1];
                sum2 += nums[n-i-1];
                list.add(nums[n-i-1]);
            }
        }
        return list;
    }
}
