// https://www.hackerearth.com/problem/algorithm/question-1-241/

import java.util.*;

class Practice {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int max = -Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int k = 0; k < t; k++){
            int n = s.nextInt();
            int l = 0, r = 0;
            for(int m = 0; m < n; m++){
                char c = s.next().charAt(0);
                int h = s.nextInt();
                if(n == 1 && c == 'L'){
                    System.out.println(h - 1);
                    break;
                }
                else if(c == 'L'){
                    if(min > h){
                        min = h;
                    }
                    l++;
                }
                else if(c == 'R'){
                    if(max < h){
                        max = h;
                    }
                    r++;
                }
            }
            
            if((l == 0 || r ==0 || min <= max + 1) && n != 1){
                System.out.println(-1);
            }        
            else if( n != 1){
                System.out.println(min - max - 1);
            }            

        }
    }
}
