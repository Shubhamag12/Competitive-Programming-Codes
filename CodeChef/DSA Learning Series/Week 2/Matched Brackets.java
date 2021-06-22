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
        String[] arr;
        str = input.nextLine();
        int n = Integer.parseInt(str);
        arr = input.nextLine().split(" ");
        
        int i = 0, max_nested = 0, nested_pos = 0, max_length = -1, length_pos = 0;
        Stack<String> st = new Stack<>();
        
        while(i < n){
            st.push(arr[i]);
            int start = i;
            i++;
            while(!st.isEmpty()){
                if(arr[i].equals("1")){
                    st.push(arr[i]);
                }
                else{
                    int current_nested = st.size();
                    if(current_nested > max_nested){
                        max_nested = current_nested;
                        nested_pos = i;
                    }
                    st.pop();
                }
                i++;
            }
            
            int len = i - start;
            if(len >  max_length){
                max_length = len;
                length_pos = start + 1;
            }
        }
        System.out.println(max_nested + " " + nested_pos + " " + max_length + " " + length_pos);
	}
}
