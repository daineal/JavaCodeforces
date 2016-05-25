import java.io.BufferedReader;
import java.util.*;
import java.io.*;

import static java.lang.System.*;

/**
 * Created by molodec on 07.05.16.
 */
public class Random08_ExI {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]),
            m = Integer.parseInt(str[1]),
            res = 0,
            cnt = 0;
        int[] q = new int[n];
        str = reader.readLine().split(" ");
        for (int i=0; i < q.length; i++)
            q[i] = Integer.parseInt(str[i]);
        Arrays.sort(q);
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 1; !(m-i < 0); i++) {
            if (cnt < q.length && q[cnt] == i) {
                cnt++;
                continue;
            }
            //System.out.println("JABKAJABKAJABKA");
            m -= i;
            res++;
            r.add(i);
        }
        System.out.println(res);
        for (int i = 0; i < r.size(); i++)
            System.out.print(r.get(i) + " ");
    }
}
