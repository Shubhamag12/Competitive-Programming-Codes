// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/586/week-3-february-15th-february-21st/3641/

class Solution {
    public int findOnes(int[] row){
        int low = 0;
        int high = row.length;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(row[mid] == 1){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[mat.length];
        for(int i = 0; i < mat.length; i++){
            int currentSum = findOnes(mat[i]);
            ans[i] = currentSum * mat.length + i;
        }
        Arrays.sort(ans);
        for(int i = 0; i < ans.length; i++){
            ans[i] = ans[i] % mat.length;
        }
        return Arrays.copyOfRange(ans, 0, k);
    }
}
