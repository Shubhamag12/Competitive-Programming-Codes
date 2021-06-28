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
        int n = Reader.nextInt();
        double[] l = new double[n];
        double[] r = new double[n];
        for (int i = 0; i < n; i++) {
            int t = Reader.nextInt();
            l[i] = Reader.nextInt();
            r[i] = Reader.nextInt();
            if (t == 2) {
                r[i] -= 0.5;
            } else if (t == 3) {
                l[i] += 0.5;
            } else if (t == 4) {
                r[i] -= 0.5;
                l[i] += 0.5;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.max(l[i], l[j]) <= Math.min(r[i], r[j])) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}