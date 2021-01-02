// https://leetcode.com/problems/water-bottles/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int n = numBottles;
        int e = numExchange;
        int sum = 0;
        int r = 0;
        while(n > 0){
            System.out.println(n);
            sum += n;
            n += r;
            r = n%e;
            if(n >= e){
                n = n/e;
            }
            else{
                break;
            }
        }
        return sum;
    }
}
