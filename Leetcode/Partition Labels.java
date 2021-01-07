//https://leetcode.com/problems/partition-labels/

class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList();
        int[] get_last_index = new int[26];
        int n = S.length();
        for(int i = 0; i < n; i++){
            get_last_index[S.charAt(i) - 'a'] = i;
        }
        int start = 0, end = 0;
        for(int i = 0; i < n; i++){
            end = Math.max(get_last_index[S.charAt(i) - 'a'], end);
            if(end == i){
                ans.add(end - start + 1);
                start = end + 1;
            }
        }
        return ans;
    }
}
