// https://leetcode.com/problems/validate-stack-sequences/

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = popped.length;
        int j = 0;
        Stack<Integer> st = new Stack<>();
        for(int x : pushed){
            st.push(x);
            while(!st.isEmpty() && st.peek() == popped[j] && j < n){
                st.pop();
                j++;
            }
        }
        return j == n;
    }
}
