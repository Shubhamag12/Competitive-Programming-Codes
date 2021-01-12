// https://leetcode.com/problems/partition-equal-subset-sum/

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        if(sum%2 == 0){
            int[] arr = new int[sum + 1];
            Arrays.fill(arr, 0);
            arr[0] = 1;
            for(int i = 0; i < nums.length; i++){
                for(int j = sum - nums[i]; j >= 0; j--){
                    if(arr[j] != 0){
                        arr[j + nums[i]] = 1;
                    }
                }
            }
            if(arr[sum/2] == 1){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
