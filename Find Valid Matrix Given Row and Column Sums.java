//https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] ans = new int[rowSum.length][colSum.length];
        int i = 0, j = 0;
        while(i < rowSum.length && j < colSum.length){
            int x = Math.min(rowSum[i], colSum[j]);
            ans[i][j] = x;
            rowSum[i] -= x;
            colSum[j] -= x;
            if(rowSum[i] == 0){
                i++;
            }
            if(colSum[j] == 0){
                j++;
            }
        }
        return ans;
    }
}
