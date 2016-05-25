// a vdyg bez flush bistrey
// posle hasnext ne znay 4to gdat`
import java.io.*;
import java.util.*;

public class Random06_ExA {
    void solve(Scanner in, PrintWriter out) {
        while ( in.hasNextInt() ) {
            int n = in.nextInt(),
                    first = 0,
                    last = n / 2,
                    res = 0;

            int[] q = new int[n];
            for (int i = 0; i < n; ++i) {
                q[i] = in.nextInt();
            }
            Arrays.sort(q);
            while (first < n / 2 && last < n) {
                if (q[first] * 2 <= q[last]) {
                    first++;
                    last++;
                    res++;
                } else {
                    last++;
                }
            }
            out.print(n - res);
          //  out.flush();
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
        new Random06_ExA().run();
    }
}
