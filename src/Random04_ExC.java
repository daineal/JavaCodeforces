import java.io.*;
import java.util.*;

public class Random04_ExC {
    void solve(Scanner in, PrintWriter out) {
       //int res  = -1;
        int res = 0;
        while (in.hasNext()) {
           int n = in.nextInt(),
               prev = 0;
            in.nextLine();
           char[] q = in.nextLine().toCharArray();

           boolean cnt = false;
           boolean begin = false;

           for ( int i = 0; i < n; i++) {
               if (q[i] == 'R') {
                   cnt = true;
                   begin = true;
               } else if (q[i] == 'L') {
                   if(!begin) {
                       res -= i;
                   }
                   begin = true;

                   if (prev % 2 == 1) {
                       res++;
                   }
                   prev = 0;
                   cnt = false;
               } else if (cnt) {
                   prev++;
               } else {
                   res++;
               }

           }

       }
        //out.print(res + cnt);//+i);
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
        new Random04_ExC().run();
    }
}
