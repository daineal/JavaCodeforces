import java.io.*;
import java.util.*;

public class DS43_ExE {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        char[] str = new char[n];
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = (char)('a'+cnt);
            cnt++;
            cnt%=4;
        }
        System.out.println(new String(str));
       // out.flush();
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
        new DS43_ExE().run();
    }
}
