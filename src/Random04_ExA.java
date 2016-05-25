import java.io.*;
import java.util.*;

public class Random04_ExA {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int q[] = new int[n];
        //int sorted[] = new int[n];
        for(int i = 0; i < n; i++) {
            q[i] = in.nextInt();
            int[] noSorted = Arrays.copyOf(q, i+2);
            int[] sorted = Arrays.copyOf(noSorted, i+2);
            Arrays.sort(sorted);
                out.println(sorted[i / 2]);
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
        new Random04_ExA().run();
    }
}
