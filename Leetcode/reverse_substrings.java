// https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/


class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ')'){
                String temp = "";
                while(st.peek() != '('){
                    temp += st.pop();
                    // System.out.println(temp);
                }
                st.pop();
                int j = 0;
                while(j < temp.length()){
                    st.push(temp.charAt(j));
                    j++;
                }
            }
            else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        return ans;
    }
}
