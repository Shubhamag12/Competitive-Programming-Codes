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
        long a = Reader.nextInt(), b = Reader.nextInt(), c = Reader.nextInt(), d = Reader.nextInt();
        System.out.println((c * d - b > 0) ? (int) Math.ceil(a * 1.00 / (c * d - b)) : -1);
    }
}