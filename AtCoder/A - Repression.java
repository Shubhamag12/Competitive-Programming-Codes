import java.io.*;
import java.util.*;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Reader.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[2] + arr[1]);
    }
}