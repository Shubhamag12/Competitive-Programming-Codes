/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static class FastReader{
        BufferedReader br;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main (String[] args) throws java.lang.Exception{
        FastReader input = new FastReader();
        String str = "";
        str = input.nextLine();
        int t = Integer.parseInt(str);
        while(t > 0){
            int n = Integer.parseInt(input.nextLine());
            String str2 = input.nextLine();
            StringBuilder sb = new StringBuilder();
            Stack<Character> st = new Stack<>();
            for(char c : str2.toCharArray()){
                if(c == '('){
                    st.push(c);
                    continue;
                }
                if(c >= 'A' && c <= 'Z'){
                    sb.append(c);
                }
                else if(c == ')'){
                    char temp = st.pop();
                    while(temp != '('){
                        sb.append(temp);
                        temp = st.pop();
                    }
                }
                else{
                    while(!st.isEmpty() && priority(st.peek()) >= priority(c)){
                        sb.append(st.pop());    
                    }
                    st.push(c);
                }
            }
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            System.out.println(sb.toString());
            t--;            
        }
	}

    static int priority(char c){
        if(c == '('){
            return 0;
        }
        else if(c == '+' || c == '-'){
            return 1;
        }
        else if(c == '*' || c == '/'){
            return 2;
        }
        else if(c == '^'){
            return 3;
        }
        return -1;
    }
}
