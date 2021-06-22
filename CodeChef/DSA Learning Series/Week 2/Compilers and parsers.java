/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t > 0){
	        String str = s.next();
	        int count = 0;
	        int max_ans = 0;
	        Stack<Character> st = new Stack<>();
	        for(char c : str.toCharArray()){
	            if(c == '<'){
	                st.push(c);
	                count++;
	            }
	            else{   
	                if(st.isEmpty()){
                        break;	                    
	                }
	                else{
    	                count++;
    	                st.pop();
	                }
	            }
	            if(st.isEmpty()){
	                max_ans = count;
	            }
	           // System.out.println("Count: " + count);
	        }
	        System.out.println(max_ans);
	       // System.out.println("========");
	        t--;
	    }
	}
}
