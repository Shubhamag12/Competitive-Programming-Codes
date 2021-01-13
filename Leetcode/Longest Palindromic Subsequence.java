// https://leetcode.com/problems/longest-palindromic-subsequence/

class Solution {
    public int longestPalindromeSubseq(String s) {
        String rev = new String();
        for(int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);                
        }
        // System.out.println(rev);
        int m = s.length();
        int[][] dp = new int[m + 1][m + 1];
        for(int i = 1; i <= m; i++){
           for(int j = 1; j <= m; j++){
               if(s.charAt(i - 1) == rev.charAt(j - 1)){
                   dp[i][j] = 1 + dp[i - 1][j - 1];
               }
               else{
                   dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
               }
           } 
        }    
        
        return dp[m][m];
    }
}
