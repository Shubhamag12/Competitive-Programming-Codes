// https://leetcode.com/problems/reduce-array-size-to-the-half/

class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>(map.values());
        Collections.sort(list);
        int m = arr.length/2, ans = 0, track = 0;
        for(int i = list.size() - 1; i >= 0 ; i--){
            ans++;
            track += list.get(i);
            if(track >= m){
                return ans;
            }
        }
        
        return track;
    }
}
