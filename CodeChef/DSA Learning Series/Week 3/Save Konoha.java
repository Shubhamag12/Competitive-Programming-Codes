import java.io.*;
import java.util.*;

class a {
    public static void main(String[] args) throws IOException{
        Reader.init(System.in);
		int t = Reader.nextInt();
        // while(t-- > 0) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        do{
            // int n, z;
            q.clear();
            int n = Reader.nextInt();
            int z = Reader.nextInt();
            int ans = 0;
            for(int i = 0; i < n; i++){
                q.add(Reader.nextInt());
            }
            while(!q.isEmpty() && z > 0){
                int highest = q.remove();
                z -= highest;
                ans++;
                highest = highest >> 1;
                if(highest != 0){
                    q.add(highest);
                }
            }
            if(z > 0){
                System.out.println("Evacuate");
            }
            else{
                System.out.println(ans);
            }
                                
        }while(--t > 0);
    }
}

class Reader {
	static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }

    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
}
