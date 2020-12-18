// https://leetcode.com/problems/make-the-string-great/

class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        st.push(s.charAt(i));
        while(i+1 < s.length()){
            if(st.isEmpty()){
                st.push(s.charAt(i+1));
            } 
            else if(sameChar(s.charAt(i+1), st.peek())){
                st.pop();
            }
            else{
                st.push(s.charAt(i+1));
            }
            i++;
        }
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
    
    private boolean sameChar(Character a, Character b){
        return Math.abs((a - 'a') - (b - 'a')) == 32;
    }
}
