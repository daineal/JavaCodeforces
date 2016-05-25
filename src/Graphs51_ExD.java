import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Graphs51_ExD {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] w = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
            h[i] = in.nextInt();
        }
        int widthPhoto = IntStream.of(w).sum();
        int height = 0,
            width = 0;
        int[] sorted = Arrays.copyOf(h, n);
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            if (h[i] == sorted[n - 1]) {
                height = sorted[n - 2];
            } else {
                height = sorted[n - 1];
            }
            width = widthPhoto - w[i];
            out.print(height*width + " ");

        }
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)
        ) {
            solve(in, out);
        }
    }

    public static void main(String args[]) {
        new Graphs51_ExD().run();
    }
}
