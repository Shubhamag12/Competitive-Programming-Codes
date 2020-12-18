// https://leetcode.com/problems/daily-temperatures/

class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> st = new Stack<>();
        int len = T.length;
        int[] result = new int[len];
        for(int i = len - 1; i >= 0; i--){
            while(!st.isEmpty() && T[st.peek()] <= T[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                result[i] = st.peek() - i;
            }
            st.push(i);
        }
        return result;        
    }
}
