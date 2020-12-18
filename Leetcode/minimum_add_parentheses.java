// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

class Solution {
    public int minAddToMakeValid(String S) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < S.length()){
            if(S.charAt(i) == '('){
                st.push(S.charAt(i));
                count++;
                // System.out.println("After push " + count);
            }
            else if(!st.isEmpty() && S.charAt(i) == ')' && st.peek() == '('){
                st.pop();
                count--;
                // System.out.println("After pop " + count);
            }
            else{
                if(st.isEmpty() || st.peek() == ')' || S.charAt(i) == ')'){
                    st.push( S.charAt(i));
                    count++;
                    // System.out.println("After Extra " + count);
                }
            }
            i++;
            // System.out.println("Total " + count);
        }
        return count;
    }
}
