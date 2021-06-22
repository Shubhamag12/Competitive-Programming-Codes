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
	        int n = s.nextInt();
	        int[][] arr = new int[n][3];
	        for(int i = 0; i < n; i++){
	            for(int j = 0; j < 3; j++){
	                arr[i][j] = s.nextInt();
	            }
	        }
	        int max_profit = 0;
	        for(int[] a : arr){
	            int temp = (int)(Math.floor(a[1]/(a[0] + 1)));
	            temp *= a[2];
	           // System.out.println(temp);
	            if(temp > max_profit){
	                max_profit = temp;
	            }
	        }
	        System.out.println(max_profit);
	        t--;
	    }
	}
}
