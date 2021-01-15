// https://leetcode.com/problems/unique-paths-ii/

class Solution {
    public int uniquePathsWithObstacles(int[][] dp) {
        int m = dp.length;
        int n = dp[0].length;
        if(dp[0][0] == 1){
            return 0;
        }
        
        dp[0][0] = 1;
        
        for(int i = 1; i < m; i++){
            if(dp[i][0] == 0 && dp[i - 1][0] == 1){
                dp[i][0] = 1;
            }
            else{
                dp[i][0] = 0;
            }
        }
        
        for(int i = 1; i < n; i++){
            if(dp[0][i] == 0 && dp[0][i - 1] == 1){
                dp[0][i] = 1;
            }
            else{
                dp[0][i] = 0;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (dp[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        
        
        return dp[m - 1][n - 1];        
    }
}
