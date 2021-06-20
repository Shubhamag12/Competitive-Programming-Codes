import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double ans = Math.floor(n*1.08);
        if(ans < 206){
            System.out.println("Yay!"); 
        }
        else if(ans == 206){
            System.out.println("so-so"); 
        }
        else{
            System.out.println(":("); 
        }

    }
}
