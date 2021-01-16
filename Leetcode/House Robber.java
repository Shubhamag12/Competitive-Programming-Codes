// https://leetcode.com/problems/house-robber/

class Solution {
    public int rob(int[] a) {
        int[] dp = new int[a.length];
        if(a.length == 0){
            return 0;
        }
        if(a.length == 1){
            return a[0];
        }
        if(a.length == 2){
            return Math.max(a[0], a[1]);
        }
        dp[0] = a[0];
        dp[1] = Math.max(a[0], a[1]);
        for(int i = 2; i < a.length; i++){
            dp[i] = Math.max(a[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[a.length - 1];
    }
}
