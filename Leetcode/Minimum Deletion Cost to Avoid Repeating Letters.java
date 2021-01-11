// https://leetcode.com/problems/minimum-deletion-cost-to-avoid-repeating-letters/

class Solution {
    public int minCost(String s, int[] cost) {
        int min_cost = 0;
        for(int i = 0; i < s.length();){
            int max = cost[i];
            int same_cost = cost[i];
            int j = i + 1;
            while(j < s.length() && s.charAt(i) == s.charAt(j)){
                max = Math.max(max, cost[j]);
                same_cost += cost[j];
                j++;
            }
            i = j;
            min_cost += same_cost - max;
        }
        return min_cost;
    }
}
