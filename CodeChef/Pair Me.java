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
	        int x = s.nextInt();
	        int y = s.nextInt();
	        int z = s.nextInt();
	        int[] a = new int[3];
	        a[0] = x;
	        a[1] = y;
	        a[2] = z;
	        Arrays.sort(a);
	        if(a[0] + a[1] != a[2]){
	            System.out.println("NO");
	        }
	        else{
    	        System.out.println("YES");
	        }
	    }
	}
}
