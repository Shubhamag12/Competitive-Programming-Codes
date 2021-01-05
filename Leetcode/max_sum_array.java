// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/

import java.util.Arrays;
class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        int sum = 0;
        int i = 0;
        while(i < K){
            Arrays.sort(A);
            A[0] *= -1;
            i++;
        }
        
        for(int x : A){
            sum += x;
        }
        
        return sum;
    }
}
