import java.io.*;
import java.util.*;

class a {
    public static void main(String[] args) throws IOException{
        Reader.init(System.in);
        int n, m;
        n = Reader.nextInt();
        m = Reader.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = Reader.nextInt(); 
        }
        int[] b = new int[m];
        for(int i = 0; i < m; i++) {
            b[i] = Reader.nextInt(); 
        }
        StringBuilder sb = new StringBuilder();
        int min = a[0], max = b[0], minIndex = 0, maxIndex = 0;
        for(int i = 1; i < n; i++){
            if(a[i] < min){
                min = a[i];
                minIndex = i;
            }
        }
        for(int i = 1; i < m; i++){
            if(b[i] > max){
                max = b[i];
                maxIndex = i;
            }
        }
        for(int i = 0; i < m; i++){
            sb.append(minIndex + " " + i + "\n");
        }
        for(int i = 0; i < n; i++){
            if(i != minIndex){
                sb.append(i + " " + maxIndex + "\n");
            }
        }
        System.out.println(sb.toString());
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
