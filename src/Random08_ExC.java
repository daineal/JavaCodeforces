import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by molodec on 08.05.16.
 */
public class Random08_ExC {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);
        String n = reader.readLine();
        long res = 0;
        for (int i = n.length()-1; i >= 0; i--) {
            if (Integer.parseInt(n.substring(i, i+1))%4 == 0) res++;
            if (i!=0 && Integer.parseInt(n.substring(i-1,i+1))%4==0) res+=i;
            //out.printf("i,i+1 %s \n",n.substring(i,i+1));
            //if(i!=0) out.printf("i-1,i+1 %s \n",n.substring(i-1,i+1));
        }
        out.printf("%d",res);
        out.flush();
    }
}
