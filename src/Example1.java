import java.io.*;
import java.util.*;

public class Example1 {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int s = a + b;
        out.println(s);
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
        new Example1().run();
    }
}
