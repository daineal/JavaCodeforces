import java.io.*;
import java.util.*;

public class DS43_ExC {
    void solve(Scanner in, PrintWriter out) {
        int[] q =  new int[9999];
        Arrays.fill(q,0);
        String str1 = in.nextLine(),
                str2 = in.nextLine();

        for (int  i : str1.toCharArray()) {
            if (i != ' ') {
                q[i]++;
            }
        }
        for (int i : str2.toCharArray()) {
            if (i != ' ') {
                q[i]--;
                if (q[i] < 0) {
                    out.print("NO");
                    return;
                }
            }
        }
        out.print("YES");
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
        new DS43_ExC().run();
    }
}
