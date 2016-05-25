import java.io.*;
import java.util.*;

public class Graphs51_ExC {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();

        Map<String, Integer> repostMap = new HashMap<>();
        repostMap.put("polycarp", 1);

        int maxLength = 1;
        for (int i = 0; i<n; i++) {
            String reposted = in.next().toLowerCase();
            in.next();
            String from = in.next().toLowerCase();
            int prevLength = repostMap.get(from);
            repostMap.put(reposted, ++prevLength);
            if (prevLength > maxLength)
                maxLength = prevLength;
        }

        System.out.println(maxLength);
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
        new Graphs51_ExC().run();
    }
}
