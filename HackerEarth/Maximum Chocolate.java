// https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/maximum-chocolate-3/description/


import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] dp = new int[n][n];
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = s.nextInt();
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){ 
                if(j == 0){
                    dp[i][j] += Math.max(dp[i - 1][j], dp[i - 1][j + 1]);
                }
                else if(j == n - 1){
                    dp[i][j] += Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
                }
                else{
                    dp[i][j] += Math.max( Math.max(dp[i - 1][j], dp[i - 1][j - 1]), dp[i - 1][j + 1]);
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){ 
                if(dp[i][j] > max){
                    max = dp[i][j];
                }
            }
        }
        System.out.println(max);    
    }
}
