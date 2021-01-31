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
            int[] a = new int[n];
            int even_count = 0;
            int odd_count = 0;
            for(int j = 0; j < n; j++){
                a[j] = s.nextInt();
                if(a[j]%2 == 0){
                    even_count++;
                }
                else{
                    odd_count++;
                }
            }
            System.out.println(Math.min(even_count, odd_count));
        }
	}
}
