import java.io.*;
import java.util.*;

public class Graphs51_ExA {

   // int[] x = new int[9999];
    //int[] y = new int[9999];
    //int[] check = new int[9999];
    int n;


    void solve(Scanner in, PrintWriter out) {
        n = in.nextInt();
        int[] res = new int[n];
        int prevX = in.nextInt();
        int prevY = in.nextInt();
        for (int i = 0; i < n-1; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (x == prevX || x == prevY) res[i] = x;
            if (y == prevY || y == prevX) res[i] = y;
            prevX = x;
            prevY = y;
            out.print(res[i]);
        }
        int x = in.nextInt();
        int y = in.nextInt();
        if (x == prevX || x == prevY) res[n-2] = x;
        if (y == prevY || y == prevX) res[n-2] = y;
        prevX = x;
        prevY = y;
        out.print(res[n-1]);
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
        new Graphs51_ExA().run();
    }
}
