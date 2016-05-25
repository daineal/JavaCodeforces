import java.io.*;
import java.util.*;

public class DS42_ExC {
    int[] x = new int[9999];
    int[] y = new int[9999];
    int[] check = new int[9999];
    int n;

    void dfs(int a) {
        check[a] = 1;
        for (int i = 0; i < n; i++) {
            if (check[i] == 0) {
                if (x[a] == x[i] || y[a] == y[i]) {
                    dfs(i);
                }
            }
        }
    }

    void solve(Scanner in, PrintWriter out) {
        n = in.nextInt();
        int res = -1;
        for ( int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (check[i] == 0) {
                dfs(i);
                res++;
            }
        }
        out.print(res);
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
        new DS42_ExC().run();
    }
}
