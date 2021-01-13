// https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/square-sub-matrix-880321bd/

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++){
            int m = s.nextInt();
            int n = s.nextInt();
            int[][] arr = new int[m][n];
            for(int k = 0; k < m; k++){
                for(int j = 0; j < n; j++){
                    arr[k][j] = s.nextInt();
                }
            }
            int[][] ans = new int[m][n];
            for(int k = 0; k < m; k++){
                for(int j = 0; j < n; j++){
                    if(k == 0 || j == 0){
                        ans[k][j] = arr[k][j];
                    }
                    else{
                        if(arr[k][j] != 0){
                            ans[k][j] = Math.min( Math.min(ans[k - 1][j - 1], ans[k - 1][j]), ans[k][j - 1]) + 1;
                        }
                    }
                }
            }
            int max = ans[0][0];
            for(int k = 0; k < m; k++){
                for(int j = 0; j < n; j++){
                    if(max < ans[k][j]){
                        max = ans[k][j];
                    }
                }
            }
            System.out.println(max*max);    
        }
    }
}
