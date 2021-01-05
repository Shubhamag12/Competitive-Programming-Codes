// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

class Solution {
    public int minCostToMoveChips(int[] position) {
        int pile_0 = 0;
        int pile_1 = 0;
        for(int i : position){
            if(i%2 == 0){
                pile_0++;
            }
            else{
                pile_1++;
            }
        }
        return Math.min(pile_0, pile_1);
    }
}
