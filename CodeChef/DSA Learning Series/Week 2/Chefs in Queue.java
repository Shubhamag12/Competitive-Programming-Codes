import java.io.*;
import java.util.*;

class a {

	private static class Pair{
		int first, second;
		public Pair(int a, int b){
			this.first = a;
			this.second = b;
		}
	}
    public static void main(String[] args) throws IOException{
        Reader.init(System.in);
        int n, k;
        n = Reader.nextInt();
        k = Reader.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
        	arr[i] = Reader.nextInt(); 
        }
		long ans = 1;
		int mod = 1000000007;
		Stack<Pair> st = new Stack<>();
		for(int i = 0; i < n; i++){
			while(!st.isEmpty() && st.peek().first > arr[i]){
				Pair element = st.peek();
				int temp = i - element.second + 1;
				ans *= temp;
				ans %= mod;
				st.pop();
			}
			st.push(new Pair(arr[i], i));
		}
		System.out.println(ans);
    }
}

class Reader {
	static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
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