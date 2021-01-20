// https://www.codechef.com/LRNDSA07/problems/SUBINC

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
        for(int k = 0; k < t; k++){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                a[j] =  s.nextInt();
            }
            int[] dp = new int[n];
            Stack<Integer> st = new Stack<>();
            dp[0] = 1;
            st.push(a[0]);
            for(int i = 1; i < n; i++){
                if(!st.isEmpty() && st.peek() <= a[i]){
                    st.push(a[i]);
                    // System.out.println("Size: " + st.size());
                    dp[i] = dp[i - 1] + st.size();
                    // System.out.println(dp[i]);
                }
                else{
                    while(!st.isEmpty()){
                        st.pop();
                    }
                    st.push(a[i]);
                    dp[i] = dp[i - 1] + st.size();
                    // System.out.println(dp[i]);
                }
            }
            System.out.println(dp[n - 1]);
        }
	}
}
