// https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                sum += 1;
            }
            else{
                sum += -1;
            }
            if(sum == 0){
                count++;
            }
        }
        return count;
    }
}
