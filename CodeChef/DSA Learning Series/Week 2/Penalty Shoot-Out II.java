/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t > 0){
	        int n = sc.nextInt();
	        String s = sc.next();
	        int i = 1, ans = 0, chances_a = n, chances_b = n, goal_a = 0, goal_b = 0;
	        for(char c : s.toCharArray()){
	            if(i%2 == 1){
	                if(c == '1'){
	                    goal_a++;
	                }
	                // System.out.println("1 " + c);
	                chances_a--;
	            }
	            else if(i%2 == 0){
	                if(c == '1'){
	                    goal_b++;
	                }
	                // System.out.println("2 " + c);
	                chances_b--;
	            }
                ans = i;
	            if(goal_a > goal_b + chances_b || goal_b > chances_a + goal_a){
	               // ans = i;
                   break;
	            }
	            i++;
	        }
            System.out.println(ans);
	        // System.out.println(ans);
	        t--;
	    }
	}
}
