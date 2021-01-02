// https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int sum = 0;
        int count = 0;
        int[] a = new int[s.length()];
        for(int i = 0; i < a.length; i++){
            if(s.charAt(i) == 'R'){
                a[i] = 1;
            }
            else{
                a[i] = -1;
            }
        }
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if(sum == 0){
                count++;
            }
        }
        return count;
    }
}
