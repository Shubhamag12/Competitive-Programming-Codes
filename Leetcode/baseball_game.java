// https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("C")){
                ans = ans - st.pop();
            }
            else if(ops[i].equals("D")){
                int elem = st.get(st.size() - 1);
                elem *= 2;
                ans += elem;
                st.push(elem);
            }
            else if(ops[i].equals("+")){
                int elem1 = st.get(st.size() - 1);
                int elem2 = st.get(st.size() - 2);
                ans += elem1 + elem2;
                st.push(elem1 + elem2);
            }
            else{
                int elem = Integer.parseInt(ops[i]);
                st.push(elem);
                ans += elem;
            }
        }
        // System.out.println(ops);
        return ans;
    }
}
