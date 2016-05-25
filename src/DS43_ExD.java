import java.io.*;
import java.util.*;

public class DS43_ExD {
    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)
        ) {
            solve(in, out);
        }
    }

    void solve(Scanner in, PrintWriter out) {
        long alp[] = new long[99999];
        long res = 0;
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            alp[(int) str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            res+=alp[(int) str.charAt(i)];
        }
        out.print(res);
        out.flush();
    }

    public static void main(String args[]) {
        new DS43_ExD().run();
    }
}
