import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0;
        int i = 1;
        while(ans < n){
            ans += i;
            i++;
        }
        System.out.println(i - 1);
    }
}
