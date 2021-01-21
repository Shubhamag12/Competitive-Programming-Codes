// https://www.codechef.com/LRNDSA07/problems/CDQU5

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
	    int mod = 1000000009;
        int[] dp = new int[1000001];
	    dp[0] = dp[1] = 0;
	    dp[2] = dp[3] = 1;
	    for(int i = 4; i < 1000001; i++){
	        dp[i] = (dp[i - 2] + dp[i - 3])%mod;
	    }

	    while(t > 0){
	        int n = s.nextInt();
	        System.out.println(dp[n]);
	        t--;
	    }
	}
}
