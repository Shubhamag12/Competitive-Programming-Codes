// https://leetcode.com/problems/edit-distance/

class Solution {
    public int minDistance(String word1, String word2) {
        int[][] min_num = new int[word1.length() + 1][word2.length() + 1];
        for(int i = 0; i <= word1.length(); i++){
            for(int j = 0; j <= word2.length(); j++){
                if(i == 0){
                    min_num[i][j] = j;
                }
                else if(j == 0){
                    min_num[i][j] = i;                    
                }
                else{
                    if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                        min_num[i][j] = min_num[i - 1][j - 1];
                    }
                    else{
                        min_num[i][j] = 1 + Math.min(Math.min(min_num[i - 1][j - 1], min_num[i - 1][j]), min_num[i][j - 1]);
                    }
                }
            }
        }
        return min_num[word1.length()][word2.length()];
    }
}
