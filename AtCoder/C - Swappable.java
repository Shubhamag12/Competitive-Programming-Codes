import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        long[] arr = new long[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s.nextLong();
        }

        HashMap<Long, Long> freq = new HashMap<>();
        for(long a : arr){
            if(freq.containsKey(a)){
                freq.put(a, freq.get(a) + 1);
            }
            else{
                freq.put(a, (long)1);
            }
        }        

        long count = 0;

        for(int i = 0; i < n; i++){
            if(freq.get(arr[i]) == 1){
                count += (n - (i + 1));
            }
            else{
                count += (n - (i + 1) - (freq.get(arr[i]) - 1));
            }
            freq.put(arr[i] , freq.get(arr[i]) - 1);
        }

        System.out.println(count); 
    }
}
