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
        int t  = s.nextInt();
        while(t > 0){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] a = new int[n];
            int num_ones = 0;
            int num_zeros = 0;
            int num_negOnes = 0;
            int tt = 0;
            int flag = 0;
            for(int i = 0; i < n; i++){
                a[i] = s.nextInt();
                if(a[i] == 1){
                    num_ones++;
                }
                if(a[i] == 0){
                    num_zeros++;
                }
                if(a[i] > 0){
                    tt += a[i];
                }
                if(a[i] == -1){
                    num_negOnes++;
                }
                if(a[i] > k){
                    flag = 1;
                }
            }
            if(num_negOnes > n/2){
                System.out.println("Rejected");
            }
            else if(flag == 1){
                System.out.println("Too Slow");
            }
            else if(num_ones + num_zeros == n){
                System.out.println("Bot");
            }
            else{
                System.out.println("Accepted");
            }
            t--;
        }
	}
}
