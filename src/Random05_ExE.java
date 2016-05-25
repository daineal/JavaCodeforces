import java.io.*;
import java.util.*;

public class Random05_ExE {
    void solve(Scanner in, PrintWriter out) {
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String res;
        char[] q = str1.toCharArray();

        for (int i = q.length - 1; i > -1; i--) {
            if (q[i] == 'z') {
                q[i] = 'a';
                continue;
            }
                q[i] = (char) ((int) q[i] + 1);
                break;

        }
        res = new String(q);
        if (!(res.equals(str2))) {
            out.print(res);
        } else {
            out.print("No such string");
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
        new Random05_ExE().run();
    }
}
