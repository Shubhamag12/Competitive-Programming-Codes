// https://leetcode.com/problems/count-sorted-vowel-strings/

class Solution {
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        Arrays.fill(dp, 1);
        if(n == 1){
            return 5;
        }
        for(int i = 2; i <= n; i++){
            for(int j = 3; j >= 0; j--){
                dp[j] += dp[j + 1];
            }
        }
        int sum = 0;
        for(int x : dp){
            sum += x;
        }
        return sum;
    }
}

