import java.io.*;
import java.util.*;

public class String61_ExA {
    void solve(Scanner in, PrintWriter out) {
        int low = 0,
            high = 1000000000,
            mid = high/2;

       char c;
        out.print(mid);
       while((c=in.next().charAt(0)) != '=') {
            mid = (low + high) >>> 1;

            if ( c == '<') {
                low = mid + 1;
            }
            else  {
               high = mid - 1;
           }
        }
        out.print(mid);
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
        new String61_ExA().run();
    }
}
