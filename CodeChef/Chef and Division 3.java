// https://www.codechef.com/problems/DIVTHREE

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
        for(int i = 0; i < t; i++){
            int n = s.nextInt();
            int k = s.nextInt();
            int d = s.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int j = 0; j < n; j++){
                arr[j] = s.nextInt();
                sum += arr[j];
            }
            // System.out.println(sum);
            int days = 0;
            days = sum/k;
            if(days > d){
                days = d;
            }
            System.out.println(days);
        }
	}
}
