//https://leetcode.com/problems/gas-station/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0, tank = 0, total_fuel = 0;
        for(int i = 0; i < gas.length; i++){
            int diff = gas[i] - cost[i];
            tank += diff;
            if(tank < 0){
                index = i + 1;
                tank = 0;
            }
            total_fuel += diff;
        }
        if(total_fuel < 0){
            return -1;
        }
        else{
            return index;
        }
    }
}
