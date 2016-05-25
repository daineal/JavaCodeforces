import java.io.*;
import java.util.*;

public class Random05_ExC {
    void solve(Scanner in, PrintWriter out) {
        int n = 0,
            res = 0;
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str.startsWith("+") ) {
                n++;
            } else if (str.startsWith("-")) {
                n--;
            } else {
                res += n*str.substring(str.indexOf(':')+1).length();
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
        new Random05_ExC().run();
    }
}
