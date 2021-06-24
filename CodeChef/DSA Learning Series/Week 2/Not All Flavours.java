import java.io.*;
import java.util.*;

class a {
    public static void main(String[] args) throws IOException{
        Reader.init(System.in);
		StringBuilder sb = new StringBuilder("");
		int t = Reader.nextInt();
        while(t-- > 0) {
            int n, k;
            n = Reader.nextInt();
            k = Reader.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = Reader.nextInt(); 
            }
            int[] freq = new int[k+1];
            int l = 0, r = 0;
            freq[arr[0]] = 1;
            int maxRange = 1;
            int distinctFlav = 1;
            while(true) {
                while(++r < n && distinctFlav < k) {
                    if(freq[arr[r]] == 0) distinctFlav++;
                    freq[arr[r]]++;
                    if(distinctFlav < k) maxRange = Math.max(maxRange, r - l + 1);
                }
                if(r == n) break;
                r--;
                while(l <= r && distinctFlav == k) {
                    if(freq[arr[l]] == 1) distinctFlav--;
                    freq[arr[l]]--;
                    l++;
                }
            }
            sb.append(maxRange);
            sb.append("\n");
        }
        System.out.println(sb);
        
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