// https://leetcode.com/problems/insert-interval/

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> output = new ArrayList();
        
        for(int[] interval : intervals) {
            if(interval[1] < newInterval[0]) {
                output.add(interval);
            }
            else if(newInterval[1] < interval[0]){
                output.add(newInterval);
                newInterval = interval;
            }
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
                
        }
        
        output.add(newInterval);
        return output.toArray(new int[output.size()][]);
    
    }
}
